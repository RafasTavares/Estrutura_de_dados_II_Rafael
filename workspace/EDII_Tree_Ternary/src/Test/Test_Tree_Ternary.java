package Test;

import static org.junit.Assert.*;

import java.security.PublicKey;

import org.junit.Before;
import org.junit.Test;

import Tree.TernaryTree;

public class Test_Tree_Ternary {
	TernaryTree tree = new TernaryTree();
	
	@Before
	public void testContructor(){
		tree.insert(7);
		tree.insert(6);
		tree.insert(5);
		tree.insert(4);
		tree.insert(3);
		tree.insert(2);
		tree.insert(1);
		tree.insert(8);
		tree.insert(9);
		tree.insert(10);
		tree.insert(2);
	}
	
	@Test
	public void testPrint() {
		tree.traverseTree();
	}

	@Test
	public void testIsPresent() {
		System.out.println("Contem 7 na arvore: "
				+ tree.isPresent(tree.getRoot(), 7));
	}
	
	@Test
	public void testGetMaxValue() {
		System.out.println("Find Max: " + tree.findMax(tree.getRoot()).getData());
	}
	
	@Test
	public void testGetRoot() {
		System.out.println("Root: " + tree.getRoot().getData());
	}
}