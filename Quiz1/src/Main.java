
public class Main {

	public static void main(String[] args) {
		pet a = new pet();
		a.setType();
		a.setName();
		a.setAge();
		a.setGender();
		a.setColor();
		a.setWeight();
		
		
		System.out.println("Type: " + a.getType());
		System.out.println("Name: " + a.getName());
		System.out.println("Age: " + a.getAge() + "years old");
		System.out.println("Gender: " + a.getGender());
		System.out.println("Colour: " + a.getColor());
		System.out.println("Weight: " + a.getWeight() + "Kg");
		System.out.println();
		
		pet b = new pet();
		b.setType();
		b.setName();
		b.setAge();
		b.setGender();
		b.setColor();
		b.setWeight();
		
		System.out.println("Type: " + b.getType());
		System.out.println("Name: " + b.getName());
		System.out.println("Age: " + b.getAge());
		System.out.println("Gender: " + b.getGender());
		System.out.println("Colour: " + b.getColor());
		System.out.println("Weight: " + b.getWeight() + "Kg");
	}

}
