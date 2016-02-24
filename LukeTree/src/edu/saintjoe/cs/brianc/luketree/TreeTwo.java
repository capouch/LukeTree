package edu.saintjoe.cs.brianc.luketree;


public class TreeTwo {
	
	// This class was inspired by Zach Bobos's question Friday
	public static void main(String[] args) {
	LukeTree aTree;
	
	aTree = new LukeTree();
	
	// This is legal, because setHeight() is public
	aTree.setHeight(15);
	
	// This is not, because the height data member is private
	aTree.height = 22;
	
	// And again, now we can set it to 22 because the method is public
	aTree.setHeight(22);
	
	}
}
