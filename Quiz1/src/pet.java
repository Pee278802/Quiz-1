import java.util.Scanner;

public class pet {
	private String type;
	private String name;
	private int age;
	private char gender;
	private String color;
	private double weight;

	Scanner s = new Scanner(System.in);	
	
	//Create Setter Method
	public void setType() {
		System.out.print("Enter the type of pet: ");
		this.type = s.next();
	}
	
	public void setName() {
		System.out.println("Enter the name: ");
		this.name = s.next();
	}
	
	public void setAge() {
		System.out.println("Enter the age: ");
		this.age = s.nextInt();
	}
	
	public void setGender() {
		System.out.println("Enter the gender (M/F): ");
		this.gender = s.next().charAt(0);
	}
	
	public void setColor() {
		System.out.println("Enter color: ");
		this.color = s.next(); 
	}
	
	public void setWeight() {
		System.out.println("Enter weight: ");
		this.weight = s.nextDouble();
	}
	
	//Create Getter Method
	public String getType() {
		return this.type;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public Character getGender() {
		return this.gender;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getWeight() {
		return this.weight;
	}
}
