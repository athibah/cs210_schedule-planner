package Project4;

import java.util.Iterator;
import java.util.Stack;
/**
 * 
 * Creating public class Binary Search Tree that extends Comparable <E> implements iterator
 *
 * @param <E>
 */
public class BST<E extends Comparable<E>> implements Iterator<E>{

	private TreeNode<E> root;
	private int size;
	Stack<TreeNode<E>> stack = new Stack<TreeNode<E>>();

	public BST(){

	this.root = null;
	this.size = 0;
	}
	/**
	 * Parameters data
	 * @param data
	 */
	public void insert(E data) {
		this.root = add(this.root,data);
		}
	/**
	 * Parameters root
	 * Parameters key
	 * @param root
	 * @param key
	 * @return
	 */
	private TreeNode<E> add(TreeNode<E> root, E key) {
		if(root == null) {
		this.size ++;
		root = new TreeNode<E>(key);
		return root;
		}

		if (key.compareTo(root.getData()) <0 ) {
			root.setLeft(add(root.getLeft(), key));}
			else {
			root.setRight(add(root.getRight(), key));}
			/**
			 * @return root
			 */
			return root;
			}
	/**
	 * Parameters root
	 * Parameters key
	 * @param root
	 * @param key
	 * @return root
	 */
	private TreeNode<E> find(TreeNode<E> root, E key){

		if (root==null || root.getData().compareTo(key)==0)
		return root;
		if (root.getData().compareTo(key) < 0)
		return find(root.getRight(), key);

		return find(root.getLeft(), key);
		}
	/**
	 * Parameters key
	 * @param key
	 * @return
	 */
	public E search(E key) {
		TreeNode<E> result = find(this.root, key);
		if(result != null) {
		return result.getData();
		} else {


		return null;
		}
		}
	/**
	 * Parameters root
	 *Parameters key
	 * @param root
	 * @param key
	 * @return
	 */
	TreeNode<E> delete(TreeNode<E> root, E key)
	{
		if (root == null){
		return root;
		}

		if (key.compareTo(root.getData()) < 0)
		root.setLeft(delete(root.getLeft(), key));
		else if (key.compareTo(root.getData()) > 0)
		root.setRight(delete(root.getRight(), key));
		else {
			/**
			 * Setting up if else statement
			 */
		this.size--;
		if (root.getLeft() == null)
		return root.getRight();
		else if (root.getRight() == null)
		return root.getLeft();
		root.setData(minValue(root.getRight()));
		root.setRight(delete(root.getRight(), root.getData()));
		}

		return root;
		}
	E minValue(TreeNode<E> root){
		E minVal = root.getData();
		while (root.getLeft() != null)
		{
		minVal = root.getLeft().getData();
		root = root.getLeft();
		}
		return minVal;
		}
	/**
	 * Setting public Stack <TreeNode<E> 
	 * @return
	 */
	public Stack<TreeNode<E>> iterator() {

		
		TreeNode<E> root = this.root;

		while(root != null) {
		stack.push(root);
		root = root.getLeft();
		}
		return stack;
	}
	public int getSize(){

		return this.size;
		}
		public TreeNode<E> getRoot(){
			/**
			 * @return root
			 */
			return this.root;
			}
			public void setRoot(TreeNode<E> root) {
			this.root = root;
			}
			public boolean isEmpty() {
			return (root.getData() == null);
			}
			public void MakeEmpty() {
			this.root = null;

			}
	public boolean hasNext() {
/**
 * Returning stack is Empty
 */
		 return !stack.isEmpty();
	}

	public E next() {

		TreeNode<E> node = stack.pop();
		TreeNode<E> result = node;
		if (node.getRight().getData() != null) {
		node = node.getRight();
		while (node != null) {
		stack.push(node);
		node = node.getLeft();
		}
		}
	
		return result.getData();
	}

}
