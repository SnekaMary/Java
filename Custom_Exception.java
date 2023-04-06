package java_1;
import java.util.Scanner;

class NotEligible extends Throwable {

	String msg = "Your Age Is Not Matching";

	@Override
	public String getMessage() {

		return msg;
	}

}
public class Custom_Exception {

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Your Age....");
		try {
			eligibility(s.nextInt());
		} catch (NotEligible e) {
			e.printStackTrace();
		}
	}
	public static void eligibility(int age) throws NotEligible {
		if (age>=25 && age<=40) {
			System.out.println("Congrats Welcome To Matrimony Site...");
		} else {
			throw new NotEligible();
		}
	}
}