package Project4;
/**
 * Importing all necessary implementations
 */
import java.util.LinkedList;
import java.util.Stack;

import Project4.BST;
import Project4.BSTException;
import Project4.ClassSection;

public class ClassSectionDatabase implements Comparable<ClassSection> {


private BST<ClassSection> list;
private ClassSection section;
private int size =0;
private ClassSection[] Arr;
private Stack<ClassSection> list2;

/**
 * Class constructor that initializes the database
 */
ClassSectionDatabase(){
this.list = new  BST<ClassSection>();
}
/**
 * 
 * @param numClass
 * @param subCourse
 * @param catalogNum
 * @param classT
 * @param level
 */
public void add(int numClass,  String subCourse,int catalogNum, String classT, String levele) {
this.section = new ClassSection(numClass,subCourse,catalogNum,classT,levele);
this.list.insert(this.section);
size++;


}
/**
 * 
 * @param Expection
 * @throws BSTException
 */
public void delete(ClassSection ection) throws BSTException {
if(isEmpty()) {
new BSTException("This tree is empty.");
}else {
this.list.delete(new TreeNode<ClassSection>(),this.section);
}
}
public ClassSection find(ClassSection section) {
return this.list.search(section);
}
public boolean isEmpty() {
return this.list.isEmpty();
}
public void makeEmpty() {
this.list.MakeEmpty();
}
public void sort() {

	Stack<TreeNode<ClassSection>> list2 = list.iterator();
}
public int size() {
return this.size;
}

@Override
public int compareTo(ClassSection o) {
	// TODO Auto-generated method stub
	return 0;
}
}
    
