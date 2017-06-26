import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main  {

	
	
    static List<Student> studentList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());

	     studentList = new ArrayList<Student>();
	      while(testCases>0){
	         int id = in.nextInt();
	         String name = in.next();
	         double cgpa = in.nextDouble();


	         Student st = new Student(id, name, cgpa);
	         studentList.add(st);

	         testCases--;
	      
	      }
	         
	         Collections.sort(studentList, new xyz());
	         for(Student st: studentList){  
	        	 System.out.println(st.getId()+" "+st.getname()+" "+st.getcgpa()); 
	        	 
	        	 }
	}
}

	  

	
	
	
	



	


