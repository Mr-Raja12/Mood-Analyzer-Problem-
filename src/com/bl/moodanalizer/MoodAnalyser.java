package com.bl.moodanalizer;

import java.util.Scanner;

/**
 * 
 * @author Raja
 *
 */
public class MoodAnalyser {
	/**
	 * Displayed the Mood condition
	 */
	String message;

	/**
	 * Created a default and parameterized constructors
	 */
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public MoodAnalyser() {

	}

	public void moodAnalysis() throws MoodAnalyzerExceptiom {
		/**
		 * The method used to return the Mood condition
		 */
		try {
			if (message.length() == 0) {
				throw new MoodAnalyzerExceptiom("Enter a message");
			} else {
				boolean status = message.toLowerCase().contains("sad");
				if (status == true) {
					System.out.println("Sad");
				} else {
					System.out.println("Happy");
				}
			}
		} catch (Exception exception) {
			System.out.println("Happy.." + exception);
		}
	}

	public static void main(String[] args) throws MoodAnalyzerExceptiom {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter message : ");
		String message = input.nextLine();
		/**
		 * Printing the message through object
		 */
		MoodAnalyser moodAnalyser = new MoodAnalyser(message);
		moodAnalyser.moodAnalysis();
	}
}