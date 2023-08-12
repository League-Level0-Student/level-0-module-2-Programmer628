package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotteryticket {

	public static void main(String[] args) {
		
	 int r1 = new Random(). nextInt(100);
	 int r2 = new Random(). nextInt(100);
	 int r3 = new Random(). nextInt(100);
	 int r4 = new Random(). nextInt(100);
	 int r5 = new Random(). nextInt(100);
	 int r6 = new Random(). nextInt(100);
	 
	 JOptionPane.showMessageDialog(null, r1+ " " +r2+ " " +r3+ " " +r4+ " " +r5+ " " +r6, "Lottery Ticket",JOptionPane.PLAIN_MESSAGE);
	
	}
}
