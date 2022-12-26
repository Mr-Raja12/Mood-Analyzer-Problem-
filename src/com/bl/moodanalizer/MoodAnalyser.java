package com.bl.moodanalizer;

import java.util.Scanner;

/**
 * 
 * @author Raja
 *
 */
public class MoodAnalyser {

	/**
	 * created a method called MoodAnalyzer to pass all the cases
	 */
	public String moodAnalysis(String message) {
		/**
		 * the method used to return SAD
		 */
		boolean status = message.toLowerCase().contains("sad");
		if (status == true) {
			return "Sad";
		} else {
			return "Happy";
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a message : ");
		String message = input.nextLine();
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.moodAnalysis(message);
		System.out.println(result);
	}
}
