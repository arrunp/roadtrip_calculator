package cas2xb3_A2_patkunasingam_AP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import cas2xb3_A2_patkunasingam_AP.Graph;
import cas2xb3_A2_patkunasingam_AP.DepthFirstDirectedPaths;

public class Main {
	
	public static void main(String[] args) throws IOException{
		//building graph to create BFS
		//using graph ADT from princeton
		Graph graph = new Graph("connectedCities.txt", ", ");
		//using PathFinder/ BFS ADT from princeton
		PathFinder citiesPath = new PathFinder(graph, "Minneapolis");
		String bfs_output = "BFS: " + citiesPath.pathTo("Boston") + "\n";
		
		//building graph to create DFS
		//DepthFirstDirectedPaths.listofcities is a helper function used to return a list of the city objects
		List<NumbCity> cityobject = DepthFirstDirectedPaths.listofcities();
		//using digraph ADT from princeton
		Digraph numdigraph = new Digraph(cityobject.size());
		for (String cities:graph.vertices()) {
			for (int i = 0; i < cityobject.size(); i++) {
				String x = cities.toLowerCase().trim();
				String y = cityobject.get(i).getcityName().toLowerCase().trim();
				if (x.equals(y)) {
					for(String adjacent : graph.adjacentTo(cities)) {
						for (int j = 0; j < cityobject.size(); j++) {
							String w = adjacent.toLowerCase().trim();
							String z = cityobject.get(j).getcityName().toLowerCase().trim();
							if(w.equals(z)) {
								numdigraph.addEdge(cityobject.get(i).getcityNum(), cityobject.get(j).getcityNum());
							}
						}
					} 
				}
				
			}
		}
		
		//using DepthFirstDirectedPaths ADT from princeton
		DepthFirstDirectedPaths newdfs = new DepthFirstDirectedPaths(numdigraph, 0);
		String dfs_output = "DFS: " + cityobject.get(0).getcityName() + " " + newdfs.pathTo(21);
		
		//writing bfs and dfs information to output file 
		BufferedWriter writer = new BufferedWriter(new FileWriter("a2_out.txt"));
		writer.write(bfs_output);
		writer.write(dfs_output);
		
		//sorting through the restaurant files to get their longtitue, latitude, restaurant name and city name
		String[] filenames = {"mcdonalds.csv", "burgerking.csv", "wendys.csv"};
		
		String[] restinfosplit;
		float rlatitude;
		float rlongtitude;
		List<Restaurant> restaurants = new ArrayList();
		
		for(String file : filenames) {
			Scanner f = new Scanner(new FileReader(file));
			String restinfo = f.nextLine();
			
			while(f.hasNext()) {
				restinfo = f.nextLine();
				restinfosplit = restinfo.split(",");
				//change the strings
				//see if you can split the restaurant name based on the dash and the last substring
				String x = restinfosplit[2].replaceAll("\"", "");
				String[] y = x.split("-");
				String[] rcityname = y[1].split(",");
				Restaurant store = new Restaurant(Float.parseFloat(restinfosplit[0]), Float.parseFloat(restinfosplit[1]), y[0], rcityname[0]);
				restaurants.add(store);
			}
		}
		
		Restaurant visitingrest = null;
		
		//reading in city file information in depth first direction
		for(NumbCity city: cityobject) {
			double citylat = city.getclatitude();
			double citylong = city.getclongtitude();
			for(Restaurant restaurant : restaurants) {
				double restlat = restaurant.getrlatitude();
				double restlong = restaurant.getrlongtitude();
				if ((city.getcityName().toUpperCase().trim()).equals((restaurant.getrestCity().toUpperCase().trim()))) {
					if ((((Math.abs(citylat - restlat)) < 0.5) && ((Math.abs(citylong - restlong)) < 0.5))) {
						if (restaurant.getrestName().equals("McDonalds")) {
							visitingrest = restaurant; 
						}
					}
				}
			} 
		}
	
		//reading in menu file 
		BufferedReader f = new BufferedReader(new FileReader("menu.csv"));
		String fooditem = f.readLine();
		String[] menuInfo;
		List<Food> allfooditem = new ArrayList<Food>();
		
		for (int i = 0; i < 32; i++) {
			fooditem = f.readLine(); 
			menuInfo = fooditem.split(",");
			Food food = new Food(menuInfo[0], menuInfo[1], Double.parseDouble(menuInfo[2].replaceAll("\"", "").substring(1)));
			allfooditem.add(food);
		}
		
		f.close();
		
		//using edgeweighteddigraph ADT from princeton
		EdgeWeightedDigraph ewd = new EdgeWeightedDigraph(cityobject.size());
		
		for(String cities: graph.vertices()) {
			for (NumbCity city : cityobject) {
				if (cities.toUpperCase().equals(city.getcityName().toUpperCase())) {
					for (String adjcity : graph.adjacentTo(cities)) {
						for(NumbCity othercity: cityobject) {
							if(othercity.getcityName().toUpperCase().equals(adjcity.toUpperCase())){
								float latdiff = city.getclatitude() - othercity.getclatitude();
								float longdiff = city.getclongtitude() - othercity.getclongtitude();
								double distanceweight = Math.sqrt(Math.pow(latdiff, 2) + Math.pow(longdiff, 2));
								//using directededge ADT from princeton 
								DirectedEdge de = new DirectedEdge(city.getcityNum(), othercity.getcityNum(), distanceweight);
								ewd.addEdge(de);
							}
						}
					}
				}
			}
		}
	
		//using DijkstraSP ADT from princeton 
		DijkstraSP dijsp = new DijkstraSP(ewd, 0);
	
		String[] foodoptions = {"McChicken - Meal", "Double Cheeseburger - Meal"};
		float[] prices = {3.79F, 4.38F};
		
		int i = 0;
		writer.write("\nCity\t\t\t\tMeal Choice\t\t\t\t\t\tCost of Meal \n");
		writer.write(cityobject.get(0).getcityName() + "\t\t\t\t" + foodoptions[i] + "\t\t\t\t" + prices[i] +"\n");
		for(DirectedEdge x : dijsp.pathTo(21)) {
			if (i == 1) {
				i = 0;
			}
			else if(i == 0) {
				i = 1;
			}
			writer.write(cityobject.get(x.to()).getcityName() + "\t\t\t\t" + foodoptions[i] + "\t\t\t\t" + prices[i] +  "\n");	
		}
		
		writer.close();
			
	}
}
