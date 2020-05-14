import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 * optional REGEX Exercise

For this example, 
assume a valid telephone number is 10 digits long. 
However, it cannot have the number 911 in any part of the phone number. In your program, have the user enter a phone number and tell them if it is a valid phone number or not WITHOUT USING REGEX. See below for what counts as valid inputs. Remember to check for inputs with correctly formatted parenthesis and dashes.
no matches or patterns 
just string manipulation


Valid:
0123456789
(012) 345-6789
012-345-6789

Not valid:
000911000
(111) 911-2084
911-911-0000
009-110-0000
 * 
 * */


public class driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
// 		get string input and check chars 		
//		strip ' ', "(",  ")", "-" from String input 
//		check if input_num.length() == 10 and does not contain '911'
//      else return invalid number try again
			//set 
		
	try {
		UserInput();

		} catch (InputMismatchException e) {
		    System.out.println("Invalid input, try again");
			UserInput();
		}	
	 }
	
	
	public static void UserInput() {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter "
				+ "a number that is "
				+ "10 digits long "
				+ "and does not contain 911 in any part of the number"); 
		
	String in = scan.nextLine();
	
	PhoneNumberValidation PNV = new PhoneNumberValidation();
	PNV.phoneNumberValidation(in);
	scan.close();
		
	}
 } 


	

		
