package pack1;

public class Jamesencap {
	private String name,emp;
	private int age;
	public String getName()
	{
		return name;
	}
	public String getEmp() {
		return emp;
	}
	public int getAge() {
		return age;
	}
	public  void setName(String newName) {
		this.name=newName;
	}
	public  void setAge(int newAge) {
		this.age=newAge;
	}
	public static void main(String[] args) {
		Jamesencap n=new Jamesencap();
		n.age=20;
		n.name="james";
		System.out.println("name is "+n.name);
		System.out.println("Age is "+n.age);
		

	}

}
