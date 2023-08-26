package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class votingBooth {

	
			public static void main(String[] args) {
				String president = "";
				String age = JOptionPane.showInputDialog("How old are you?");
				int ageAsInt = Integer.parseInt(age);
				if(ageAsInt >= 18) {
					JOptionPane.showMessageDialog(null, "Congratulations, you are old enough to vote!");
					 president = JOptionPane.showInputDialog("Who would you like to be president? Your options are Mojang, Microsoft, Epic Games, and Sony.");
					
				}else if(ageAsInt < 18) {
					JOptionPane.showMessageDialog(null, "Sorry you are to young to vote you little "+ age +" year old!");
				}
				
				if(president.equals("Mojang")) {
					JOptionPane.showMessageDialog(null, "Congrats the person you voted for won!");
				} else {
					JOptionPane.showMessageDialog(null, "Well too bad Mojang won because they are just better!");
				}
				
				
				
				
				
				
				
				
				
				
				
			}
}
