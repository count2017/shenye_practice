package abstractClass_interface_test;


interface Animal_Interface {
	
	public final String str1="str1_PUBLIC_FINAL_STRING";
	final String str2="str2_FINAL_STRING";
	public static final String str3="str3_PUBLIC_static_FINAL_STRING";
	String str4 = "";
	
	void screen();
	
	static void run_static_interface() {
		System.out.println("run_static_interface");
	}
	
	default void run_default_interface(){
		System.out.println("run_default_interface");
	}
	
	public static void run_public_static_interface(){
		System.out.println("run_public_static_interface");
	}
	
	public default void run_public_default_interface(){
		System.out.println("run_public_default_interface");
	}
}
