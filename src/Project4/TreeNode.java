
/**
 * Create a class TreeNode
 */
package Project4;
		/**
		 *Parameters <T>
		 * @param <T>
		 */
		public class TreeNode<T> {
		private T data;
		private TreeNode<T> left;
		private TreeNode<T> right;

		public TreeNode() {
		this(null, null, null);
}
		public TreeNode(T data) {
			this(data,null, null);
}
		public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
			/**
			 * Create variable data
			 * Create variable left
			 * Create variable right
			 */
			this.data = data;
			this.left = left;
			this.right = right;
}
		/**
		 * 
		 * @return data
		 */
		public T getData() {
			return data;
}
		/**
		 * @return right
		 */
		public TreeNode<T> getRight(){
			return this.right;
}
		/**
		 * @return left
		 */
		public TreeNode<T> getLeft(){
			return left;
}
		/**
		 * Parameters data
		 * @param data
		 */
		public void setData(T data) {
			this.data = data;
}
		/**
		 * Parameters right
		 * @param right
		 */
		public void setRight(TreeNode<T> right){
			this.right = right;
}
		public void setLeft(TreeNode<T> left){
			this.left = left;
}

}