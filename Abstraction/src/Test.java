
abstract class College{
	
	abstract void department(String nameDepartment);
	
	 void college(String nameCollege) {
		 System.out.println("The Name of the College is: " + nameCollege);
		 }
}

class Department extends College{

	@Override
	void department(String nameDepartment) {
		// TODO Auto-generated method stub
		System.out.println("The Name of the Department is: " + nameDepartment);
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department();
		obj.college("Computer Science and Information Systems");
		obj.department("Information Systems");
	}

}
