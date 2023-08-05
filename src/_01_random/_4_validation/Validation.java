//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for (int compliment =0; compliment<10; compliment += 1){
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 0){
			JOptionPane.showMessageDialog(null,"You have nice eyes.");
		} else if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null,"I like your hat.");
		} else if (randomNumber == 2 ) {
			JOptionPane.showMessageDialog(null,"Your hair looks nice today.");
		} else if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null,"I like your shoes.");
		} else if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null,"I like your code.");
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
		}
	}
}
