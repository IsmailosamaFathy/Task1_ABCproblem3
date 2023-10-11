package Objectbasic3;

public class String_Data 
{
	// Variable to store text & it is also private to not be manipulated by other developer
	private String str;
	// setter function to get required text 
	public void Set_String(String data) 
	{
		str=data;
	
	} 
	public int Get_Number_Of_WhiteSpaces() 
	{
		// variable of type integer to store count number of white spaces 
		int space=0;
		// Loop around all string
		for(int i=0; i<str.length(); i++){
			// extract each character  
			char ch=str.charAt(i);
			/* 
			 * check if it it is white space 
			 * If there is increment counter of white space*/
			if(ch==' ')
			{
			        space++;
			}
			}
		// after finishing return
		return space;
	}
	public int Get_String_Length() 
	{
		// variable of type integer to store number of character not including  "white space"
		int str_len=0;
		// This  a temporary variable of type String to store new text after converting all character to lower case 
		String newstr=str.toLowerCase();
		// This  a temporary variable of type String to store which will be extracted character 
		char chr;
		// looping around  text 
		for(int i=0;i<newstr.length();i++) 
		{
			// extract each character in order to prevent count of white space 
			chr=newstr.charAt(i);
			/* 
			 * Checking if character is not white space 
			 * Here I am checking on lower case only as I have converted all text to lower case so no need to check on High case
			 */
			if(chr>='a'&& chr<='z') 
			{
				str_len++;
			}
		}
		// return String length
		return str_len;
	}
	public int Get_Number_Of_Vowels() 
	{
		//variable of type integer to store number of character not including  "white space"
		int vowel_count=0;
		// This  a temporary variable of type String to store which will be extracted character 
		char chr;
		// This  a temporary variable of type String to store new text after converting all character to lower case 
		str=str.toLowerCase();
		// looping around  text 
		for(int i=0;i<str.length();i++) 
		{
			// extract each character in order to count vowels
			chr=str.charAt(i);
			/* 
			 * Checking only if is the character only vowel 
			 * Here I am checking on lower case only as I have converted all text to lower case so no need to check on High case
			 */
			if(chr=='a'|| chr=='e'||chr=='i'||chr=='o'||chr=='u') 
			{
				vowel_count++;
			}
			
		}
		// returning the number of vowels
		return vowel_count;
	}
	

}
