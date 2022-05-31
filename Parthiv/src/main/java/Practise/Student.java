package Practise;

/**
 * @author a14459
 *
 */
public class Student {
	
	private String name;
	private int id;
	private int age;

	
	public Student(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		this.name = string;
		this.id= i;
		this.age = j;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Name --"+name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
