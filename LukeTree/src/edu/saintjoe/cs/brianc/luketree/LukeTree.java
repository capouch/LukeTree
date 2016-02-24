package edu.saintjoe.cs.brianc.luketree;

public class LukeTree {
	
	// Here are our data members
	// Store tree's height measured in feet
	public int height;
	
	// Store tree's age measured in parsecs
	private int age;
	

	public String species;
	
	public static void main(String[] args) {
		LukeTree zachBobos;
		LukeTree treeTwo;
		LukeTree treeThree;
		
		zachBobos = new LukeTree();
		treeTwo = new LukeTree();
		treeThree = treeTwo;
		treeTwo = new LukeTree();
		
		// Directly access the data member "height" of object referred to by "treeOne"
		zachBobos.setHeight(14);
		
		// Invoke the method named "setHeight" on the object referred to by "treeTwo"
		treeTwo.setHeight(80);
		
		// Directly access the data member "species" of the objects referred to by "treeOne" and "treeTwo"
		treeTwo.species = "Elm";
		zachBobos.species = "Oak";
		
		zachBobos.setAge(20);
		treeTwo.setAge(50);
		treeThree.setAge(25);
		
		System.out.println("Tree treeOne height is " + zachBobos.getHeight() + " TreeOne age is " + zachBobos.age);
		System.out.println("Tree treeOne name is " + zachBobos.species + " Treetwo name is " + treeTwo.species + " tree one age is " + zachBobos.age);
	}
	
	// Here are our methods
	public int getHeight () {
		return height;
	}
	
	public void setHeight(int newHeight) {
		height = newHeight;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}

}
