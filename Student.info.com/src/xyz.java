import java.util.Comparator;

public class xyz implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getcgpa()!=o2.getcgpa()){
			return -1;
		}
		else{
		if((o1.getcgpa()==o2.getcgpa())&& o1.getname().compareToIgnoreCase(o2.getname())<0)
				{
			return -1;
			}
			else if(o1.getcgpa()==o2.getcgpa()&& o1.getname().compareToIgnoreCase(o2.getname())>0){
				return 1;
			}
				
				else if(o1.getcgpa()==o2.getcgpa()&& o1.getname().compareToIgnoreCase(o2.getname())==0&&o1.getId()!=o2.getId()){
					return -1;
				}
				
				}
		return 0;
				
			}
}
	
	
	
	


