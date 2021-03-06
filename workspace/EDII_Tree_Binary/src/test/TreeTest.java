package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import binary.tree.BinaryTree;

public class TreeTest {
	BinaryTree tree = new BinaryTree();

	@Before
	public void BeforeTest() {
		tree.insertValue(1);
		tree.insertValue(2);
		tree.insertValue(4);
		tree.insertValue(3);
	}

	@Test
	public void TestInsert() {
		tree.insertValue(1);
		tree.insertValue(2);
		tree.insertValue(4);
		tree.insertValue(3);
		System.out.println(tree.toString());
	}

	@Test
	public void TestContains() {
		assertEquals(tree.containsValue(7), false);
		assertEquals(tree.containsValue(1), true);

	}
}