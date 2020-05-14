
public class PhoneNumberValidation {

	//loop through string input and 
    //add numbers as char to new String Formatted number
	//skip white space, ()parentheses, and dash
	
	public void phoneNumberValidation(String number){	
	String formattedNumber = "";
		
	for(int i = 0; i < number.length(); i++)
	{	
		if(number.charAt(i) == ' ' || 
		   number.charAt(i) == '('||
		   number.charAt(i) == ')' ||
		   number.charAt(i) == '-')
		{
			continue;
		}
		else {
			   formattedNumber += number.charAt(i);
		}

	}
	
	if (formattedNumber.contains("911"))
	{
		System.out.println("The number "
				+ "you entered contains 911, please try again.");
		driver.UserInput();

	}
	
	else if (formattedNumber.length() < 10 
			|| formattedNumber.length() > 10 )
	{
		System.out.println("not a valid input,"
				+ " please enter a valid 10 digit phone number.");
		driver.UserInput();

	}
	
	else
	{
		System.out.println("Number entered is valid");
	}
}

}	


