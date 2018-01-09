package abstractClass_interface_test;

public class InterfaceTest implements Animal_Interface{

	@Override
	public void screen() {
		// TODO Auto-generated method stub
		
	}
	
	public void fork(){
		
	}
	
	public static void main(String[] args) {
		System.out.println(Animal_Interface.str1);
		Animal_Interface.run_public_static_interface();
		Animal_Interface.run_static_interface();
		System.out.println("+++++++++++++++++");
		InterfaceTest ift = new InterfaceTest();
		ift.run_default_interface();
		ift.run_public_default_interface();
	}


}
