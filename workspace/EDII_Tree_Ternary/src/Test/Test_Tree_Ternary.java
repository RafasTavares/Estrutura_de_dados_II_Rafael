package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Tree.TernaryTree;

public class Test_Tree_Ternary {


	
	@Test
	public void testPrint(){
		TernaryTree tree = new TernaryTree();
		tree.insert(5); //insert element 5 to the Tree -> this is the root of the tree
		tree.insert(4); //insert element 4 to the Tree
		tree.insert(9); //insert element 9 to the Tree
		tree.insert(5); //insert element 5 to the Tree
		tree.insert(7); //insert element 7 to the Tree
		tree.insert(2); //insert element 2 to the Tree
		tree.traverseTree();
		
		
	}

}