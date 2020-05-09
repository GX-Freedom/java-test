
public class String_Test {

	public static void main(String[] args) {
		String[] name = {"jin", "young"};

		System.out.println("Hell World");//String "문자열"
		System.out.println('H');//Character '문자'
		System.out.println("Hell\nWorld");
		System.out.println("Hell \"World\"");
		System.out.println("Hell \"World\"".length());
		for(var i = 0; i < name.length; i++) {
			System.out.println("Hello name and bye bye".replace("name", name[i]));
		}
		
	}

}
