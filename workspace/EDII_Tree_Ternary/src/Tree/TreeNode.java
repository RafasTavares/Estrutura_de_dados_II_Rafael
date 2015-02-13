package Tree;

public class TreeNode<T extends Comparable<T>> {
	
    // VARIAVEIS
	TreeNode esquerdaNode;
	int info;
	TreeNode direitaNode; 
	
	//CONSTRUTOR
	public TreeNode(int nodeInfo) {
		info = nodeInfo;
		esquerdaNode = direitaNode = null;
	}

	// INSERE NO
	public void insereNode(int insertValue) {
		if (insertValue < info) {
			//
			if (esquerdaNode == null)
				esquerdaNode = new TreeNode(insertValue);
			//
			else
				esquerdaNode.insereNode(insertValue);
			//
		} else if (insertValue > info) {
			//
			if (direitaNode == null)
				direitaNode = new TreeNode(insertValue);
			//
			else
				direitaNode.insereNode(insertValue);
		}
	}
}
