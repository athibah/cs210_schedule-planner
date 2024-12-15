package Project4;

public interface DatabaseInterface<E> {
	 public void add(E node);
	 public void delete(E node)throws BSTException;
	 public boolean find(E node);
	 public boolean isEmpty();
	 public void makeEmpty();
	 public void sort();
	 public int size();
	 public E[] ArrayType();
}
