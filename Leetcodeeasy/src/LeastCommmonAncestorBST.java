
public class LeastCommmonAncestorBST {

	public static void main(String[] args) {

	}

}

class Node {
	int data;
	Node left;
	Node right;

	public static Node lowestCommonAncestor(Node root, int p, int q) {

		if (root == null)
			return null;
		if (root.data == p || root.data == q) {
			return root;
		}
		Node left = lowestCommonAncestor(root.left, p, q);

		Node right = lowestCommonAncestor(root.right, p, q);

		if (left != null && right != null)
			return root;

		return (left != null ? left : root);

	}
}