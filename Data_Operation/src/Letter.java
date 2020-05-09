
public class Letter {

	public static void main(String[] args) {
		int age = 30;
		String name = "kim";
		String newAge = Integer.toString(age);
		int b = Integer.parseInt(newAge);
		System.out.println("Hi name and bye bye name".replace("name", name));
		System.out.println("Your age is age".replace("age", String.valueOf(age)));
		System.out.println(b);
	}
}
