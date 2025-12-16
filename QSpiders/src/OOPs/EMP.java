package OOPs;

//Encapuslation HW 

public class EMP {
	private String name;
	private int empid;
	private double sal;
	 
	public EMP(String name, int empid, double sal){
		this.name=name;
		this.empid=empid;
		this.sal=sal;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getempid() {
		return empid;
	}
	public void setempid(int empid) {
		this.empid=empid;
	}
}