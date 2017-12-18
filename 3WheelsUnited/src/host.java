import java.util.Scanner;


public class host {

	/**
	 * @param args
	 */
	public static String name;
	public static String Email;
	public static String Date_of_birth;
	public static String Aadhar_Number;
	public static String Home_Area;
	public static int Home_Amount;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		name=in.next();
		Email=in.next();
		Date_of_birth=in.next();
		Aadhar_Number=in.next();
		Home_Amount=in.nextInt();
		Home_Area=in.next();
		

	}

}
