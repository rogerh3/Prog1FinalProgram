//Project: Final Project
//Author: Roger H Hayden III
//Desc: Using everything required for final
//Version: 1.0
//Last update: 11/29

import java.io.*;
import java.util.Scanner; 
import java.util.Random; 

public class FinalProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//initializing keyboard and random number generator
		Scanner keyboard = new Scanner(System.in); 
		Random randomNumbers = new Random();


		FileWriter fw = new FileWriter("/Users/rogerhaydeniii/Desktop/grading.txt", false
				);
		PrintWriter outputFile = new PrintWriter(fw); 
		
		//Introducing the program
		System.out.println("Hello, welcome to the grading program"); 
		System.out.println(); 
		
		//asking for users first name
		System.out.println("Please enter your students first name"); 
		String firstName = keyboard.next();  
		
		//printing user/student first name to the file
		outputFile.println("\n\nThe students first name is " + firstName);
		
		//asking for the user/student last name
		System.out.println("Hello " + firstName + " Please enter your students last name");
		String lastName = keyboard.next();
		
		//printing the users last name to the file
		outputFile.println("The students last name is " + lastName); 
		
		//thanking the user/student for giving their first and last name
		System.out.println("Thank you " + firstName + " " + lastName);
		
		//asking what the users education level is
		System.out.println("What education level are you in?");
		System.out.println("1) High School");
		System.out.println("2) Undergraduate");
		System.out.println("3) Graduate"); 
		
		//asking for a number to tell the program what level the student is
		int number = keyboard.nextInt(); 
		
		//while loop for if the user enters numbers not in the range
		while (number < 1 || number > 3) {
			System.out.println("The number you entered is invalid, please enter a number listed: 1, 2, or 3");
			number = keyboard.nextInt(); 
			
		//programming what to do for each entry
		}
		
		if (number == 1) {
			System.out.println("You put that the student is in High School.");
			System.out.println("What is your GPA in number format on a 4.00 scale?");
			double GPA = keyboard.nextDouble(); 
			//telling the user how well the student is doing and outputting the GPA to the file for every entry
			while (GPA < 0 || GPA > 4.00) {
				System.out.println("You entered an invalid GPA, please enter a valid one.");
				GPA = keyboard.nextDouble();
			}
				if (GPA > 3.49) {
					System.out.println("This student is doing an amazing job, tell them to keep up the hard work!"); 
					outputFile.println("This student has above a 3.49"); 
				}
				else if (GPA > 2.99 || GPA < 3.5) {
					System.out.println("This student is still doing well, but there is room for improvement. Tell them to keep working hard!");
					outputFile.println("This student has a GPA above 2.99 but below 3.5"); 
				}
				else if (GPA > 2.49 || GPA < 3.00) {
					System.out.println("It seems you are struggling some, is there any way you can help this student improve?");
					outputFile.println("This student has a GPA greater than 2.49 but below 3.0"); 
				}
				else {
					System.out.println ("uh oh... this student is really struggling"); 
					outputFile.println("This student has a GPA less than 2.5"); 
				}
			
		}
		else if (number == 2) {
			System.out.println("You put that the student is in Undergraduate school");
			System.out.println("What is your GPA in number format on a 4.00 scale?");
			double GPA = keyboard.nextDouble(); 
			
			while (GPA < 0 || GPA > 4.00) {
				System.out.println("You entered an invalid GPA, please enter a valid one.");
				GPA = keyboard.nextDouble();
			}
				if (GPA > 3.49) {
					System.out.println("This student is doing an amazing job, tell them to keep up the hard work!"); 
					outputFile.println("This student has above a 3.49");  
				}
				else if (GPA > 2.99 || GPA < 2.50) {
					System.out.println("This student is still doing well, but there is room for improvement. Tell them to keep working hard!");
					outputFile.println("This student has a GPA above 2.99 but below 3.5");  
				}
				else if (GPA > 2.49 || GPA < 3.00) {
					System.out.println("It seems you are struggling some, is there any way you can help this student improve?");
					outputFile.println("This student has a GPA greater than 2.49 but below 3.0"); 

				}
				else {
					System.out.println ("uh oh... this student is really struggling");
					outputFile.println("This student has a GPA less than 2.5"); 
				}
			
		}
		else {
			System.out.println("you put that the student is in Graduate school");
			System.out.println("What is your GPA in number format on a 4.00 scale?");
			double GPA = keyboard.nextDouble(); 
			
			while (GPA < 0 || GPA > 4.00) {
				System.out.println("You entered an invalid GPA, please enter a valid one.");
				GPA = keyboard.nextDouble();
			}
				if (GPA > 3.49) {
					System.out.println("This student is doing an amazing job, tell them to keep up the hard work!"); 
					outputFile.println("This student has above a 3.49"); 
				}
				else if (GPA > 2.99 || GPA < 2.50) {
					System.out.println("This student is still doing well, but there is room for improvement. Tell them to keep working hard!");
					outputFile.println("This student has a GPA above 2.99 but below 3.5"); 
				}
				else if (GPA > 2.49 || GPA < 3.00) {
					System.out.println("It seems you are struggling some, is there any way you can help this student improve?");
					outputFile.println("This student has a GPA greater than 2.49 but below 3.0"); 
				}
				else {
					System.out.println ("uh oh... this student is really struggling"); 
					outputFile.println("This student has a GPA less than 2.5"); 
				}
		}
		//using arrays to randomize what the students test scores will be on the tests they have left
		int arraySize = 0;
		System.out.println("\n\nHow many tests do you have left to take?");
		arraySize = keyboard.nextInt();
		int[] myNumbers = new int[arraySize]; 
			
		for(int i=0; i<arraySize; i++) {
			myNumbers[i] = randomNumbers.nextInt(110) + 1; 
			System.out.println("Your score for test " + (i+1) + " is: " + myNumbers[i] + "."); 
		}
	
		//closing output file
		outputFile.close();
		
			//Open a file to read from
		File fileReader = new File("/Users/rogerhaydeniii/Desktop/grading.txt");  
		Scanner inputFile = new Scanner(fileReader); 
			
		while(inputFile.hasNext()) {
				String contents = inputFile.nextLine();
				System.out.println(contents); 
		}
		//closing input file
		inputFile.close(); 
			
			
	

}
}