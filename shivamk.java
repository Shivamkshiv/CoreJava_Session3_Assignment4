
public class shivamk {

	
		
	    String name;
		int rollno;
		String overallMarksPercentage;
		String height;
		String weight;
		
		
		public shivamk(String name, int rollno, String overallMarksPercentage, String height, String weight) {
			this.name = name;
			this.rollno = rollno;
			this.overallMarksPercentage = overallMarksPercentage;
			this.height = height;
			this.weight = weight;
		}
		
		public void getStudentHeight(){
			System.out.println("The student height is " +height );
		}
		
		public void getStudentWeight(){
			System.out.println("The student weight is " +weight);
		}
		
		public static void main(String[] args) {
			
			shivamk studentDetails1 = new shivamk("Shivam",43,"82%","150 cm","51 kg");
			System.out.println("The student name is "+studentDetails1.name);
			System.out.println("The student Roll No is " +studentDetails1.rollno);
			System.out.println("The student overall marks pecentage is " +studentDetails1.overallMarksPercentage);
			studentDetails1.getStudentHeight();
			studentDetails1.getStudentWeight();
		    
			System.out.println("****************************************************");
			
			shivamk studentDetails2 = new shivamk("Ish",16,"86%","155cm","60 kg");
			System.out.println("the student name is " +studentDetails2.name);
			System.out.println("The student Roll No is " +studentDetails2.rollno);
			System.out.println("the student overall marks percentage is " +studentDetails2.overallMarksPercentage);
			studentDetails2.getStudentHeight();
			studentDetails2.getStudentWeight();
			
			System.out.println("****************************************************");
			
		    shivamk studentDetails3 = new shivamk("Pratham",60,"80%","160cm","62 kg");
		    System.out.println("The student name is "+studentDetails3.name);
		    System.out.println("The student Roll No is " +studentDetails3.rollno);
		    System.out.println("The student overall marks percentage is " +studentDetails3.overallMarksPercentage);
		    studentDetails3.getStudentHeight();
		    studentDetails3.getStudentWeight();
		    
			System.out.println("****************************************************");
			
			
		}
		
		
		
	

}
