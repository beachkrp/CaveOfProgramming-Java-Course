
public class Polymorphism {
	public static void main(String[] args) {
		//Create objects 
		Plant plant = new Plant();
		Tree tree = new Tree();
		
		// Create a second reference to the same object
		Plant plant2 = tree;
		// use methods
		plant2.grow();
		tree.shedLeaves();
		//error
		//plant2.shedLeaves();
		
		//Using the defined method
		goGrow(tree);
		goGrow(plant);
		goGrow(plant2);
		
		
	}


public static void goGrow(Plant plant) {
	plant.grow();
	
}

}