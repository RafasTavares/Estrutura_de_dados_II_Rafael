package test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.*;

import binary.tree.BinaryTree;
import static org.junit.Assert.*;

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