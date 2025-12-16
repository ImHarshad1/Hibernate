package OOPs;

public class Employee {
	private String name;
	private int id;
	private double sal;
	
	public Employee(String name,int id,double sal) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public double getsal() {
		return sal;
	}
	public void setsal(double sal) {
		this.sal=sal;
	}	
}