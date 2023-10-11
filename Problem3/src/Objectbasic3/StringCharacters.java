package Objectbasic3;

/*
 * This is the main class
 * No input data required just press on the run button 
 */
public class StringCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This is the text that is required to extract data from
		String text = "To be or not to be, that is the question;" + "Whether `tis nobler in the mind to suffer"
				+ " the slings and arrows of outrageous fortune," + " or to take arms against a sea of troubles,"
				+ " and by opposing end them?";
		// This variable of type integer to store number of spaces in the text
		int spaces = 0;
		// This variable of type integer to store number of vowels in the text
		int vowels = 0;
		// This variable of type integer to store number of letters in the text
		int letters = 0;
// creating an object of class name String data that has has method to extract data from string
		String_Data data = new String_Data();
// Passing text required to extract data from using setter
		data.Set_String(text);
// storing number of spaces using method that count number of white spaces  
		spaces = data.Get_Number_Of_WhiteSpaces();

		// storing number of vowels using method that count vowels
		vowels = data.Get_Number_Of_Vowels();

		// storing number of letters using method that count number of white letters
		letters = data.Get_String_Length();
    /*
     * First , Printing number of vowels 
     * Then, printing consonants by subtracting letters from vowels so we get directly consonants
     * Finally , Printing number of white spaces 
     */
		System.out.println("The text contained vowels: " + vowels + "\n" + "consonants: " + (letters - vowels) + "\n"
				+ "spaces: " + spaces);

	}

}
