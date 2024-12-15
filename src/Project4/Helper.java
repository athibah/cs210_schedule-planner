package Project4;
/**
 * Import all necessary implementations
 */
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
public class Helper {


/**
 * 
 * @throws IOException
 */
public static void start() throws IOException {
BST<ClassSection> list = new BST<ClassSection>();

create(list);
display(list);

}
/**
 * 
 * @param List
 * @throws IOException
 */
   public static void create( BST<ClassSection> List) throws IOException {
   
try {
Scanner scan = new Scanner(new File("./src/Project4/schedule.txt"));
     String line;
     
       while(scan.hasNext()) {
     /**
      * Setting StringTokenizer
      */
           line = scan.next();
StringTokenizer st = new StringTokenizer(line,"|");
int classNum = Integer.parseInt(st.nextToken());
String courseSub = st.nextToken();
int catalogNum = Integer.parseInt(st.nextToken());
String  classT = st.nextToken();
String level= st.nextToken();
/**
 * Inserting class number, course Sub, catalog Number, class T, and lvl. 
 */
List.insert(new ClassSection(classNum, courseSub, catalogNum, classT, level));
line = scan.next();
}
       scan.close();

      }

catch(FileNotFoundException e) {
System.out.println("This file doesn't exist");
}
 
   }
   /**
    * 
    * @param list
    */
 
   public static void display( BST<ClassSection> list) {
 
	   Stack<TreeNode<ClassSection>> list2 = list.iterator();
   
 
   while(!list2.isEmpty()) {

 System.out.println(list2.pop().toString());
 }
 }
   }

