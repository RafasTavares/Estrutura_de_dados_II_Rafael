package test;

import org.junit.Test;
import binary.tree.BinaryTree;

public class TreeTest {

	@Test
	public void TestInsert(){
		BinaryTree tree = new BinaryTree();
		tree.insertValue(1);
		tree.insertValue(2);
		tree.insertValue(4);
		tree.insertValue(3);
		System.out.println(tree.toString());
	}
}