package Bus;

public class Start {

	
	public static void  main(String[] args) {
		BusinessType myBus = new BusinessType("Frimpong Opoku", "Biibisoft","xdiyrehefksyeCCGHD","https://image.jpeg");	
		System.out.println("First time ------------------------------");
		System.out.println(myBus.getMY_BUSINESS_LABEL());
		System.out.println(myBus.getMY_FOLDER_LIMIT());
		System.out.println(myBus.getMY_PIC_UPLOAD_ALLOWANCE());
		
		//Now Testing my Business 
		System.out.println("After change --------------------------------");
		myBus.changeLevel(LevelConstants.TYPE_A);
		System.out.println(myBus.getMY_BUSINESS_LABEL());
		System.out.println(myBus.getMY_FOLDER_LIMIT());
		System.out.println(myBus.getMY_PIC_UPLOAD_ALLOWANCE());

		
		
		
		
	}
}
