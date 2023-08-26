
package _99_extra;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

import game_tools.Sound;

/* NASA wants to shoot a rocket into orbit.
 * Somebody has to do the countdown or the rocket won't launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0.
 * 
 * (example for '11': 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
    public static void main(String[] args) throws InterruptedException {
    	boolean canPlaySounds = true;
        // 2. Use a pop-up to ask the user where to start counting from
        String start = JOptionPane.showInputDialog("Where to start counting from?");
        // 3. Change the countdown to use the new starting point
        int startAsInt = Integer.parseInt(start);
        // 1. Print a countdown from 10 to 0 on the console
    	for(int count = startAsInt; count > -1; count -= 1) {
            System.out.println(count);
            Sound.speak(String.valueOf(count));
    } 
    	Sound.speak("blastoff");
    	playNoise(llamaFile);
    	
    	
    
            // 4. Use the Sound.speak method to hear the countdown.
            
            // 6. Use the following code to make the program wait one second for each number: Thread.sleep(1000);
            
        // 5. when the counting is done, speak "blastoff!"
    }
    static String path = "src/_02_methods/_1_animal_farm/";
    static String llamaFile = "llama.wav";
    private static void playNoise(String soundFile) {
		if (true) {	
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		}
	}
}


