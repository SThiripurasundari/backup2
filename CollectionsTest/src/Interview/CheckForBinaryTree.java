package Interview;

import com.linkedlist.samples.Node;

public class CheckForBinaryTree {// Not working fine 

	public static void main(String[] args) {
		//Node root = new Node(10);

		/*
		 * Node left1 = new Node(8); Node left1Left = new Node(6); Node left1Right = new
		 * Node(9);
		 * 
		 * left1.setLeft(left1Left); left1.setRight(left1Right); root.setLeft(left1);
		 * 
		 * Node right1 = new Node(12); Node right1Right = new Node(113); Node right1Left
		 * = new Node(14);
		 * 
		 * right1.setLeft(right1Left); right1.setRight(right1Right);
		 * root.setRight(right1);
		 */
		Node root = new Node(3);
		root.left = new Node(2);
		root.right = new Node(5);

		root.left.left = new Node(1);
		root.left.right = new Node(4);
		boolean b = checkforBinary(root);

		System.out.println("-------------------");
		System.out.println("Answer  :" + b);

	}

	private static boolean checkforBinary(Node root) {

		if (root == null) {
			return true;
		}

		int rootData = root.getIntdata();

		if (root.getRight() != null) {
			if (rootData > root.getRight().getIntdata()) {
				System.out.println("Its true in right ");
				return false;
			}
		}
		if (root.getLeft() != null) {
			if (rootData < root.getLeft().getIntdata()) {
				System.out.println("Its true in right ");
				return false;
			}
		}

		return checkforBinary(root.getLeft() )
				&& checkforBinary(root.getRight());
	}
}

// get root node and get left and right node and check if the left node value is
// lesser than root node and
// right node is greater than root node

/*
 * if (root.getRight() != null) { //checkforBinary(root.getRight()); rightData =
 * root.getRight().getIntdata();
 * 
 * System.out.println("---- Right Side ---"); System.out.println("rootData :" +
 * rootData); System.out.println("Right data :" + rightData);
 * 
 * if (rootData < rightData) { System.out.println("Its true in right "); return
 * true; } else { System.out.println("Its false in right "); return false; } }
 * 
 * if (root.getLeft() != null) { //checkforBinary(root.getLeft()); leftData =
 * root.getLeft().getIntdata();
 * 
 * System.out.println("rootData :" + rootData); System.out.println("Left data :"
 * + leftData);
 * 
 * if (rootData > leftData) { System.out.println("Its true in left "); return
 * true; } else { System.out.println("Its false in left "); return false; } }
 */
