package cas2xb3_A2_patkunasingam_AP;

import static org.junit.Assert.*;

import org.junit.Test;

public class testMain {

	//testing graph ADT
	@Test
	public void testGraph() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		assert(cities.hasVertex("Boston")); 
	}
	
	@Test
	public void testGraph2() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		assert(cities.hasVertex("Minneapolis")); 
	}
	
	@Test
	public void testGraph3() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		assert(cities.hasVertex("Dallas")); 
	}
	
	@Test
	public void testGraph4() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		assert(cities.hasEdge("Boston", "New York City")); 
	}
	
	@Test
	public void testGraph5() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		assert(cities.hasEdge("Jacksonville", "Miami"));
	}
	
	@Test
	public void testPathFinder() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Boston");
		assert(pf.distanceTo("New York City") == 1);
	}
	
	@Test
	public void testPathFinder1() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Boston");
		assert(pf.hasPathTo("Minneapolis"));
	}
	
	@Test
	public void testPathFinder2() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Boston");
		assert(pf.hasPathTo("Dallas"));
	}

	@Test
	public void testPathFinder3() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Boston");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder4() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "New York City");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder5() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Philadelphia");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder6() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Baltimore");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder7() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Washington");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder8() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Charlotte");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder9() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Atlanta");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder10() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Pittsburgh");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder11() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Columbus");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder12() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Indianapolis");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder13() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "St. Louis");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder14() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Kansas City");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder15() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Denver");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder16() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Oklahoma City");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder17() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Dallas");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder18() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Houston");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder19() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "New Orleans");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder20() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Memphis");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder21() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Jacksonville");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder22() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Nashville");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder23() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Chicago");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder24() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Minneapolis");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder25() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Salt Lake City");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder26() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Las Vegas");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder27() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Los Angeles");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder28() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "San Francisco");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder29() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Portland");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder30() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Seattle");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder31() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Phoenix");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}

	@Test
	public void testPathFinder32() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Albuquerque");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}

	@Test
	public void testPathFinder33() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "San Antonio");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
	@Test
	public void testPathFinder34() {
		Graph cities = new Graph ("connectedCities.txt", ", ");
		PathFinder pf = new PathFinder(cities, "Miami");
		Iterable<String> x = cities.vertices();
		for (String s : x) {
			assert(pf.hasPathTo(s));
		}
	}
	
}
