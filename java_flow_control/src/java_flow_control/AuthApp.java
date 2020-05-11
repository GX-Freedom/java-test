package java_flow_control;

public class AuthApp {

	public static void main(String[] args) {
		
		String id = "jin";
		String inputId = args[0];
		String password = "123";
		String inputpass = args[1];
		
		System.out.println("hi");
		if(inputId.equals(id) && inputpass.equals(password))
		{
			System.out.println("Master");
		}
//		else if(inputId != id && inputpass != password) {
//			System.out.println("retry");
//		}
		else {
			System.out.println("who are you");
		}
		
	}

}
