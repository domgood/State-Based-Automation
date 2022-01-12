import java.awt.AWTException;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.lang.Thread;
import java.util.Scanner;

public class Automation {
/*
 * 
 * 
 * 
 * This program automates tasks in a virtual world given specific screen states.
 * 
 * 
 * 
 * 
 */
	public static void main(String[] args) throws HeadlessException, AWTException, InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("-----Automation by DG-----");
		System.out.println("Number of loops:");
		int clicks = scanner.nextInt();
		int counter1 = 0;
		System.out.println("Loop begins in 5 sec...");
		
		try {
			Thread.sleep(5000);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
		Driver instance = new Driver();
		Color b = new Color(162, 16, 180);
		
		while (counter1 < clicks) { //main loop
			
				while (!instance.inBG() && !instance.dead()){
					if(!instance.inQueue()) {
					instance.clickMouseTargetBMMacro(InputEvent.BUTTON1_MASK);}
					instance.sleep();
					instance.sleep();
					if(!instance.inQueue()) {
					instance.goToBgButton(InputEvent.BUTTON1_MASK);}
					instance.sleep();
					if(!instance.inBG() && !instance.inQueue()) {
					instance.joinBattle(InputEvent.BUTTON1_MASK);}
					instance.queueSleep();
					if(!instance.inBG() && instance.inQueue() && instance.queuePop()) {
					instance.joinQueueTBC(InputEvent.BUTTON1_MASK, InputEvent.BUTTON3_MASK);}
					instance.sleep();
					instance.sleep();}

			     //begin state-based logic
				 
				if (!instance.dead() && instance.inBG() && instance.inWSGPrepRoom() && !instance.bgEnd())
				{
				instance.wsgEntrySequence();
					

				}

				
				if (!instance.dead()  && instance.inCave() && !instance.bgEnd())
				{
				instance.leaveCaveTBC(); 
				}	

				if (!instance.dead() && instance.inBG() &&  !instance.inCave() && !instance.inWSGPrepRoom() && !instance.bgEnd()){
							if(instance.inWSG()) {
				instance.wsgMovementSequence(); }
							if(!instance.inWSG()) {
								
								while(!instance.dead() && !instance.corpse() && !instance.bgEnd()) {
									instance.customDelay(2000);
									if (instance.generateNumber(1, 3)==1) {
										instance.randomJump();}
									if (instance.generateNumber(1, 5)==5) {
								instance.moveCharacter();}
									
								}
							}

				}

				if (instance.inBG() && instance.corpse() ){
				instance.releaseCorpse();
				}

				if (instance.inBG() && instance.dead()){
					instance.jump();
				}

				if (instance.bgEnd() ){
					instance.leaveBG(InputEvent.BUTTON1_MASK);
					instance.miniSleep();
					instance.sleep();
					instance.sleep();
				}

				counter1++;
					}
			
			}
		
		
		
		
	
	
	




}

