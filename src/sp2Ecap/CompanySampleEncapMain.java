package sp2Ecap;

// Below whole program is Encapsulation 
class Employee{
	private int empid; //Data Hiding 
	

	public void setEmpID(int eid) { //Seterr 
		empid = eid;
	}
	public int getEmpID() {   // Getter 
		return empid;
	}
	
}



public class CompanySampleEncapMain {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpID(101);
		System.out.println(e.getEmpID());

	}

}
