package Interview;

import com.linkedlist.samples.Node;

public class CheckForBinaryTree2 {
	public static void main(String[] args) {

		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(5);

		root.left.left = new Node(1);
		root.left.right = new Node(3);

		System.out.println("-------------------");
		System.out.println("Answer  :" + isBST(root));

	}

	private static boolean isBST(Node root) {

		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean isBSTUtil(Node root, int min, int max) {

		if (root == null) {
			return true;
		}

		if (root.getIntdata() < min || root.getIntdata() > max) {
			System.out.println(" Root :" + root.getIntdata());
			return false;
		}
		return isBSTUtil(root.left, min, root.getIntdata()) && isBSTUtil(root.right, root.getIntdata(), max);
	}

}
