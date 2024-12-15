package Project4;

/**
 * 
 * @author Athina Halkiadakis 
 *
 */
	public class ClassSection implements Comparable<ClassSection>{

		/**
		 * Setting private integer numClass
		 */
		private int numClass;
		/**
		 * Setting private string subCourse
		 */
		private String subCourse;
		/**
		 * Setting private integer CatalogNumber
		 */
		private int CatalogNumber;
		/**
		 * Setting private string classTitle
		 */
		private String  classTitle;
		/**
		 * Setting private string level
		 */
		private String lvl;



		public ClassSection() {
		this(0,null,0,null,null);
		}
		public ClassSection(int numClass,  String subCourse,int CatalogNumber, String classTitle, String lvl) {
		this.numClass = numClass ;
		this.subCourse = subCourse;
		this.CatalogNumber = CatalogNumber;  
		this.classTitle = classTitle; 
		this.lvl = lvl;
		}
		 /**
		  * parameters numClass
		  * @param numClass
		  * 
		  */
		public void setnumClass(int numClass ) {
		this.numClass = numClass;
		}
		/**
		 * parameters subCourse
		 * @param subCourse
		 */
		public void setsubCourse(String subCourse) {
		this.subCourse = subCourse;
		}
		/**
		 * parameters CatalogNumber
		 * @param CatalogNumber
		 */
		public void setCatalogNumber(int CatalogNumber) {
		
		this.CatalogNumber = CatalogNumber;
		}
		/**
		 * parameters classTitle
		 * @param classTitle
		 */
		public void setclassTitle(String  classTitle ) {
		this. classTitle=  classTitle;
		}
		/**
		 * parameters level
		 * @param lvl
		 */
		public void setlvl(String lvl) {
		this.lvl = lvl;
		}
		/**
		 * 
		 * @return numClass
		 */
		public int getnumClass() {
		return this.numClass;
		}
		/**
		 * @return subCourse
		 */
		public String getsubCourse() {
		return this.subCourse;
		}
		/**
		 * 
		 * @return CatalogNumber
		 */
		public int getCatalogNumber() {
		return this.CatalogNumber;
		}
		/**
		 * 
		 * @return classTitle
		 */
		public String getclassTitle() {
		return this.classTitle;
		}
		/**
		 *
		 * @return level
		 */
		public String getlvl() {
		return this.lvl;
		}
		@Override
		public int compareTo(ClassSection o) {
			// TODO Auto-generated method stub
			return 0;
		}
}
