import java.awt.AWTException;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Driver {
	
	private Robot robot;
	private int delay;
	String[] strArr = {"ONE","TWO"};
	ArrayList masterList = new ArrayList();
	String str1 = strArr[0];
	String str2 = strArr[1];
	
	public Driver() {
		
		try {
			robot = new Robot();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		delay = generateNumber(0, 551);
		
	}
	
  public void clickMouse(int button) {
	  
	  try {
		 
		  robot.mousePress(button);
		  robot.delay(generateNumber(200,250));
		  robot.mouseRelease(button);
		  int delay2 = generateNumber(168, 551);
		  robot.delay(delay2);
		  System.out.println(delay2);
		  
	  } catch (Exception e) {
		  e.printStackTrace();
	  }
	  
	  
  }
public void clickMouseTwo(int button) {
	  
	  try {
		  robot.mouseMove(generateNumber(1240,1280),generateNumber(960,997));
		  robot.mousePress(button);
		  robot.delay(generateNumber(200,250));
		  robot.mouseRelease(button);
		  int delay2 = generateNumber(168, 551);
		  robot.delay(delay2);
		  System.out.println(delay2);
		  
	  } catch (Exception e) {
		  e.printStackTrace();
	  }
	  
	  
  }
  
public void clickMouseTargetBMMacro(int button) {
	  
	  try {
		  robot.mouseMove(generateNumber(1818,1852),generateNumber(718,753)); //mouse mouse to button
		  robot.mousePress(button);
		  robot.delay(generateNumber(200,250));
		  robot.mouseRelease(button);
		  int delay2 = generateNumber(168, 551);
		  robot.delay(delay2);
		  System.out.println(delay2);
		  
		  robot.delay(generateNumber(150,250));
			robot.keyPress(KeyEvent.VK_F8);
				robot.delay(generateNumber(10,32));
				robot.keyRelease(KeyEvent.VK_F8);
		  
	  } catch (Exception e) {
		  e.printStackTrace();
	  }
	  
	  
  }

public void moveCharacter() throws HeadlessException, AWTException, InterruptedException  {
	if(!bgStart()) {
		System.out.println("bg not started");
	}
	if(bgStart()) {
		System.out.println("bg HAS!!! started");
	}
	System.out.println("starting movement");

		if (corpse()  && !dead()) {
			releaseCorpse();
			
		miniSleep();
		return;
	}

	robot.delay(generateNumber(243,325));
	robot.delay(generateNumber(243,325));
	robot.delay(generateNumber(243,325));
	robot.delay(generateNumber(243,325));
	robot.delay(generateNumber(243,325));
	robot.delay(generateNumber(243,325));
	robot.delay(generateNumber(243,325));
	robot.delay(generateNumber(243,325));
	robot.delay(generateNumber(243,325));
	robot.delay(generateNumber(243,325));
	
	
	if (isCat() && !corpse()) {
		System.out.println("already in cat");
	}
	
	if (!isCat() && !corpse()) {
		
		System.out.println("not in cat, going cat.");
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.delay(generateNumber(10,32));
		robot.keyPress(KeyEvent.VK_R);
		robot.delay(generateNumber(10,32));
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.delay(generateNumber(10,32));
		robot.keyRelease(KeyEvent.VK_R);
		robot.delay(generateNumber(10,32));
	   miniSleep();	
	   miniSleep();	
	   miniSleep();	
	}
	miniSleep();	
	
		
		
	if (isStealth()) {
		System.out.println("already in stealth");
	}
		if (!isStealth()) {
			System.out.println("not in stealth, going stealth.");
			robot.keyPress(KeyEvent.VK_2);
			robot.delay(generateNumber(10,32));
			robot.keyRelease(KeyEvent.VK_2);
			robot.keyPress(KeyEvent.VK_2);
			robot.delay(generateNumber(10,32));
			robot.keyRelease(KeyEvent.VK_2);
			robot.keyPress(KeyEvent.VK_2);
			robot.delay(generateNumber(10,32));
			robot.keyRelease(KeyEvent.VK_2);
			robot.keyPress(KeyEvent.VK_2);
			robot.delay(generateNumber(10,32));
			robot.keyRelease(KeyEvent.VK_2);}
	
	
	if(inBG() && !dead() && !corpse()) {
		robot.keyPress(KeyEvent.VK_W);}
	for(int z =0;z<5;z++) {
	
		
		if(inBG() && !dead()) {
		robot.delay(generateNumber(24,32));
		if(!inBG()){
			robot.keyRelease(KeyEvent.VK_W);
			break;}
		}
		
		robot.delay(generateNumber(5,7));
		
	
	
	}
    if(!inBG()){
	robot.keyRelease(KeyEvent.VK_W);}
	
	
	
	
    if (corpse()  && !dead()) {
		releaseCorpse();
		
	miniSleep(); 
	return;
}
	int key = 0;
	if(generateNumber(1,2)==2) {
	key = KeyEvent.VK_F6;}
	else {
	key = KeyEvent.VK_F7;}
	if(inBG() && !dead() && !corpse()) {
	robot.keyPress(key);
	robot.delay(generateNumber(10,32));
	if(!inBG()){
		robot.keyRelease(key);}
	}	
	robot.delay(generateNumber(197,212));
	randomJump();
	miniSleep();
	if (corpse()  && !dead()) {
		releaseCorpse();
		
	miniSleep();
	return;
}
	if(generateNumber(1,2)==2) {
		key = KeyEvent.VK_F6;}
		else {
		key = KeyEvent.VK_F7;}
		robot.keyPress(key);
		
	//robot.delay(generateNumber(1978,2123));
	robot.keyRelease(key);
	robot.keyRelease(KeyEvent.VK_F7);
	robot.keyRelease(KeyEvent.VK_F6);
	robot.delay(generateNumber(120,140));
	randomJump();
	robot.delay(generateNumber(120,140));
	robot.delay(generateNumber(10,32));

	robot.delay(generateNumber(50,100));
	robot.delay(generateNumber(50,100));
	robot.keyRelease(KeyEvent.VK_W);
	
}

public void moveRightATad() {
	robot.keyPress(KeyEvent.VK_D);
	robot.delay(generateNumber(55,60));
	robot.keyRelease(KeyEvent.VK_D);
}

public void leaveCave() throws HeadlessException, AWTException, InterruptedException {
	int mouseMoveX = generateNumber(955, 975);
	int mouseMoveY = generateNumber(228,303);
	
	
	robot.mouseMove(mouseMoveX,mouseMoveY);
	if(inBG() && !dead()) {
	robot.keyPress(KeyEvent.VK_W);
	robot.delay(generateNumber(760,780));
	robot.keyRelease(KeyEvent.VK_W);}
	if(inBG() && !dead()) {
	robot.keyPress(KeyEvent.VK_W);
	robot.delay(generateNumber(760,780));
	robot.keyRelease(KeyEvent.VK_W);}
	if(inBG() && !dead()) {
	robot.keyPress(KeyEvent.VK_W);
	robot.delay(generateNumber(760,780));
	robot.keyRelease(KeyEvent.VK_W);}
	moveRightATad();
	turnSleep();
	moveRightATad();
	turnSleep();
	moveRightATad();
	turnSleep();
	moveRightATad();
	turnSleep();
	moveRightATad();
	turnSleep();
	if(inBG() && !dead()) {
		robot.keyPress(KeyEvent.VK_W);}
	for(int z =0;z<1000;z++) {
	
		//robot.keyPress(KeyEvent.VK_W);
		if(inBG() && !dead()) {
		//robot.delay(generateNumber(760,780));
		robot.delay(generateNumber(76,78));
		if(generateNumber(1,7)==7) {
		randomJump();}
		}
		if (!inBG() || dead()) {
			break;
		}
		//robot.keyRelease(KeyEvent.VK_W);
		robot.delay(generateNumber(10,30));
		
	
	
	}
	robot.keyRelease(KeyEvent.VK_W);
	robot.mouseMove(generateNumber(1830, 1860),generateNumber(810, 830));
	randomClick(InputEvent.BUTTON3_MASK);
	Thread.sleep(3200);
	while(!bgStart()) {
		Thread.sleep(100);
	}
	
	
}

public void entrySequence() throws HeadlessException, AWTException {
	//int mouseMoveX = generateNumber(955, 975);
	//int mouseMoveY = generateNumber(228,303);
	if (isCat()) {
		System.out.println("not in cat, going cat.");
		robot.keyPress(KeyEvent.VK_Q);
		robot.delay(generateNumber(10,32));
		robot.keyRelease(KeyEvent.VK_Q);
	   miniSleep();	
	}
	
		if (isStealth()) {
			System.out.println("not in stealth, going stealth.");
			robot.keyPress(KeyEvent.VK_2);
			robot.delay(generateNumber(10,32));
			robot.keyRelease(KeyEvent.VK_2);}
		
		
	

	if(inBG() && !dead()) {
	robot.keyPress(KeyEvent.VK_W);
	robot.delay(generateNumber(760,780));
	robot.keyRelease(KeyEvent.VK_W);}
	if(inBG() && !dead()) {
		robot.keyPress(KeyEvent.VK_W);
		robot.delay(generateNumber(760,780));
		robot.keyRelease(KeyEvent.VK_W);}
	if(inBG() && !dead()) {
		robot.keyPress(KeyEvent.VK_W);
		robot.delay(generateNumber(760,780));
		robot.keyRelease(KeyEvent.VK_W);}
	
	
	moveRightATad();
	turnSleep();
	moveRightATad();
	turnSleep();
	moveRightATad();
	turnSleep();
	
	
	if(inBG() && !dead()) {
		robot.keyPress(KeyEvent.VK_W);}
	for(int z =0;z<1000;z++) {
	
	
		if(inBG() && !dead()) {

		robot.delay(generateNumber(76,78));
		if(generateNumber(1,7)==7) {
		randomJump();}
		}
		if (!inBG() || dead()) {
			break;
		}

		robot.delay(generateNumber(10,30));
		
	
	
	}
	robot.keyRelease(KeyEvent.VK_W);
}


public void leaveCaveTBC() throws HeadlessException, AWTException, InterruptedException {
	int mouseMoveX = generateNumber(955, 975);
	int mouseMoveY = generateNumber(228,303);
	
	
	robot.mouseMove(mouseMoveX,mouseMoveY);
	if(inBG() && !dead()) {
		robot.delay(generateNumber(766,766));
		robot.keyRelease(KeyEvent.VK_W);
		robot.delay(generateNumber(50,100));
	robot.keyPress(KeyEvent.VK_W);
	robot.delay(generateNumber(102,112));
	robot.keyRelease(KeyEvent.VK_W);}
	
	
	robot.keyPress(KeyEvent.VK_A);
	robot.delay(generateNumber(260,260));
	robot.keyRelease(KeyEvent.VK_A);
	miniSleep();
	miniSleep();
	robot.keyPress(KeyEvent.VK_W);
	robot.delay(generateNumber(2220,2230));
	robot.keyRelease(KeyEvent.VK_W);
	miniSleep();
	miniSleep();
	robot.keyPress(KeyEvent.VK_D);
	robot.delay(generateNumber(320,320));
	robot.keyRelease(KeyEvent.VK_D);
	if(inBG() && !dead()) {
		robot.keyPress(KeyEvent.VK_W);}
	for(int z =0;z<83;z++) {
	
		//robot.keyPress(KeyEvent.VK_W);
		if(inBG() && !dead()) {
		//robot.delay(generateNumber(760,780));
		robot.delay(generateNumber(77,77));
		if(generateNumber(1,7)==7) {
		randomJump();}
		}
		if (!inBG() || dead()) {
			break;
		}
		//robot.keyRelease(KeyEvent.VK_W);
		robot.delay(generateNumber(27,27));
		
	
	
	}
	robot.keyRelease(KeyEvent.VK_W);
	
	while(!bgStart()) {
		Thread.sleep(100);
	}
	robot.keyPress(KeyEvent.VK_W);
	robot.delay(generateNumber(3877,3877));
	robot.keyRelease(KeyEvent.VK_W);
	robot.delay(generateNumber(327,337));
	robot.mouseMove(generateNumber(1830, 1860),generateNumber(825, 850));
	randomClick(InputEvent.BUTTON3_MASK);
	Thread.sleep(3200);
	TbcAvEntryPath();
}

public void moveCharacterClick(int button2) {
	int mouseMoveX = generateNumber(975,1075);
	int mouseMoveY = generateNumber(228,303);
	int mouseMoveXleft = generateNumber(880,960);
	int mouseMoveYleft = generateNumber(228,303);
	robot.mouseMove(mouseMoveX,mouseMoveY);
	robot.delay(generateNumber(30,72));
	robot.mousePress(button2);  //press down RMB
	robot.delay(generateNumber(30,50));
	robot.mouseRelease(button2);
	robot.delay(generateNumber(243,325));
	robot.delay(generateNumber(2578,3023));
	robot.mouseMove(mouseMoveXleft,mouseMoveYleft);
	robot.delay(generateNumber(10,32));
	robot.mousePress(button2);  //press down RMB
	robot.delay(generateNumber(30,50));
	robot.mouseRelease(button2);
	robot.delay(generateNumber(243,325));
	robot.delay(generateNumber(243,325));
	robot.delay(generateNumber(10,32));
	robot.delay(generateNumber(30,50));
	
	
}

public void rightClickBM(int button) {
	robot.mouseMove(generateNumber(650,1252),generateNumber(278,753));
	randomClick(button);
}

public void goToBgButton(int button) {
	robot.mouseMove(generateNumber(30,300),generateNumber(325,330));
	randomClick(button);
	miniSleep();
	robot.mouseMove(generateNumber(50,355),generateNumber(380,382));
	randomClick(button);
}

public void joinBattle(int button) {
	robot.mouseMove(generateNumber(199,247),generateNumber(659,669));
	randomClick(button);
}
public void joinQueue(int button, int button2) {
System.out.println("joining q.");
robot.mouseMove(generateNumber(1748,1764),generateNumber(190,210));
	randomClick(button2);
	sleep();
	robot.mouseMove(generateNumber(1774,1850),generateNumber(273,280));
	miniSleep();
	miniSleep();
	miniSleep();
	randomClick(button);
}
public void joinQueueTBC(int button, int button2) {

	System.out.println("joining q.");
	robot.mouseMove(generateNumber(1748,1764),generateNumber(190,210));
		randomClick(button2);
		randomClick(button2);
		randomClick(button2);
		miniSleep();
		robot.mouseMove(generateNumber(1774,1820),generateNumber(277,280));
		miniSleep();
		miniSleep();
		
		randomClick(button);
}

public void leaveBG(int button) {
	robot.mouseMove(generateNumber(940,980),generateNumber(748,762));
	randomClick(button);
}

public void interactNPC() {
	
	robot.mouseMove(generateNumber(700,1100),generateNumber(200,400));	
	robot.mousePress(InputEvent.BUTTON3_MASK);
	robot.delay(generateNumber(10,32));
	robot.mouseRelease(InputEvent.BUTTON3_MASK);
	
	
}
	
public void randomClick(int button) {
	robot.mousePress(button);
	robot.delay(generateNumber(10,32));
	robot.mouseRelease(button);
}

public static int generateNumber(int min, int max){
    int x = (int) (Math.random()*((max-min)+1))+min;
    return x;
}

public void setDelay(int ms) {
	this.delay = ms;
}
  
public void sleep() {
	try {
		Thread.sleep(generateNumber(2000,3000));
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void miniSleep() {
	try {
		Thread.sleep(generateNumber(300,454));
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void releaseCorpse() throws HeadlessException, AWTException, InterruptedException {
	System.out.println("Releasing corpse.");
	robot.mouseMove(generateNumber(902,1023),generateNumber(237,245));
	randomClick(InputEvent.BUTTON1_MASK);
	robot.keyRelease(KeyEvent.VK_W);
	robot.keyRelease(KeyEvent.VK_F6);
	robot.keyRelease(KeyEvent.VK_F7);
	customDelay(200);
	robot.mouseMove(generateNumber(0,0),generateNumber(10,10));
}
public void queueSleep() {
	try {
		Thread.sleep(generateNumber(15555,20657));
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void displayColorXY(int x, int y) throws HeadlessException, AWTException {
	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	int color = image.getRGB(x, y);
	Color c = new Color(color, true);
	System.out.println("Color values:" + " " + c.getRed() + " " + c.getGreen() + " " + c.getBlue()+ " ");
}

public boolean dead() throws HeadlessException, AWTException {
	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

	int color = image.getRGB(1691, 142);  
	int color2 = image.getRGB(14, 1069);  
	int color3 = image.getRGB(67, 1072);  
	int color4 = image.getRGB(982, 249);  
	int color5 = image.getRGB(824, 193); 
	int color6 = image.getRGB(1122, 176);  

	Color c = new Color(color, true);  
	Color c2 = new Color(color2, true);
	Color c3 = new Color(color3, true);
	Color c4 = new Color(color4, true);
	Color c5 = new Color(color5, true);
	Color c6 = new Color(color6, true);

	Color b = new Color(132, 182, 198);
	Color b2 = new Color(0, 0, 0);
	Color b3 = new Color(0, 0, 0);
	Color b4 = new Color(241, 195, 0);
	Color b5 = new Color(255, 255, 255);
	Color b6 = new Color(133, 127, 125);

	

	if (  sameColor(c2, b2) && sameColor(c3, b3)     ) {
       System.out.println("dead rn. (ghost)");
        return true;
	}
	else {
		System.out.println("not dead");
		return false;
	}
}

public boolean corpse() throws HeadlessException, AWTException {
	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

	
	int color4 = image.getRGB(982, 249);  
	int color5 = image.getRGB(824, 193);  
	int color6 = image.getRGB(1122, 176);  

	
	Color c4 = new Color(color4, true);
	Color c5 = new Color(color5, true);
	Color c6 = new Color(color6, true);
	System.out.println(" r:" + c5.getRed() + "g"  + c5.getGreen() + "b" +  c5.getBlue());
	System.out.println(" r:" + c4.getRed() + "g"  + c4.getGreen() + "b" +  c4.getBlue());
	System.out.println(" r:" + c6.getRed() + "g"  + c6.getGreen() + "b" +  c6.getBlue());
	
	Color b4 = new Color(48, 80, 105);
	Color b5 = new Color(6, 14, 20);
	Color b6 = new Color(16, 21, 20);


	if (  (sameColor(c4, b4) && sameColor(c5, b5) && sameColor(c6, b6) )   ) {
       System.out.println("corpse rn.");
        return true;
	}
	else {
		System.out.println("NOT a corpse rn.");
		return false;
		 
	}
}

public boolean inCave() throws HeadlessException, AWTException {
	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	int color = image.getRGB(1847, 119);  //SHOULD BE 101, 0, 0
	int color2 = image.getRGB(1819, 145);  //SHOULD BE 75, 82, 91
	Color c = new Color(color, true);  //get the color on screen
	Color c2 = new Color(color2, true);
	System.out.println(" r:" + c.getRed() + "g"  + c.getGreen() + "b" +  c.getBlue());
	System.out.println(" r:" + c2.getRed() + "g"  + c2.getGreen() + "b" +  c2.getBlue());
	Color b = new Color(0, 0, 0);
	Color b2 = new Color(64, 59, 58);
	

	if (c.getRed() == b.getRed() && c.getBlue() == b.getBlue() && c.getGreen() == b.getGreen()) 

	{System.out.println(color);}

	if (  (sameColor(c, b) && sameColor(c2, b2)  )    ) {
       System.out.println("in Cave rn.");
        return true;
	}
	else {
		return false;
	}
}

public boolean inQueue() throws HeadlessException, AWTException {
	
	if(inBG()) {
		return false;
	}
	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	int color = image.getRGB(1751, 200);  //SHOULD BE 141, 141, 141
	Color c = new Color(color, true);  //get the color on screen
	Color b = new Color(151, 34, 17);
	
	if (   (sameColor(c, b)   ) ) {  //if onscreen is the same as key color, we know we're in BG
		
		System.out.println("in q");
        return true;  //therefore return true
	}
	else {
		System.out.println("not in q");
		return false;
		
	}
	
}

public boolean inBG() throws HeadlessException, AWTException {

	
	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	int color = image.getRGB(138, 1018); 
	int color2 = image.getRGB(179, 994);  
	int color5 = image.getRGB(211, 1014); 
	int color3 = image.getRGB(908, 50); 
	int color4 = image.getRGB(907, 54);  
	

	Color c = new Color(color, true);  //get the color on screen
	Color c2 = new Color(color2, true);
	Color c3 = new Color(color3, true);
	Color c4 = new Color(color4, true);
	Color c5 = new Color(color5, true);
	Color b = new Color(0, 0, 0);
	Color b2 = new Color(127, 89, 39);
	Color b3 = new Color(29, 69, 83);
	Color b4 = new Color(219, 176, 2);
	Color b5 = new Color(117, 100, 78);
	

		if (  (sameColor(c, b)) && (sameColor(c2, b)) && (sameColor(c5, b))  ) {  //if onscreen is the same as key color, we know we're in BG
				
		System.out.println("in bg");
        return true;  //therefore return true
	}
	else {
		System.out.println("not in bg");
		return false;
		
	}
	
	
}

public boolean queuePop() throws HeadlessException, AWTException {
	
	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	int color = image.getRGB(1028, 242);  //SHOULD BE 141, 141, 141
	int color2 = image.getRGB(1034, 242);  //SHOULD BE 173, 173, 173
	Color c = new Color(color, true);  //get the color on screen
	Color c2 = new Color(color2, true);
	Color b = new Color(255, 209, 0);
	Color b2 = new Color(255, 209, 0);


		if (   (sameColor(c, b) && sameColor(c2, b2) )      ) {  //if onscreen is the same as key color, we know we're in BG
				
		System.out.println("q popped");
        return true;  //therefore return true
	}
	else {
		System.out.println("queue hasn't popped");
		return false;
		
	}
	
	
}



public boolean inWSG() throws HeadlessException, AWTException {
	
	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	int color = image.getRGB(1620, 788);  //SHOULD BE 141, 141, 141
	int color2 = image.getRGB(1640, 772);  //SHOULD BE 173, 173, 173
	int color5 = image.getRGB(1679, 790);  //SHOULD BE 141, 141, 141
	Color c = new Color(color, true);  //get the color on screen
	Color c2 = new Color(color2, true);
	Color c5 = new Color(color5, true);
	Color b = new Color(97, 92, 60);
	Color b2 = new Color(141, 120, 67);
	Color b5 = new Color(107, 107, 47);


	if (   (sameColor(c, b) && sameColor(c2, b2) && sameColor(c5, b5))  )       {  //if onscreen is the same as key color, we know we're in BG
		
		System.out.println("in bg");
        return true;  //therefore return true
	}
	else {
		System.out.println("not in bg");
		return false;
		
	}
	
	
}

public boolean bgStart() throws HeadlessException, AWTException {

	
	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	int color4 = image.getRGB(891, 60); //red > 150
	int color3 = image.getRGB(889, 37); //blue >100 889,37
	Color c3 = new Color(color3, true);
	Color c4 = new Color(color4, true);
	Color b3 = new Color(0, 0, 0);
	Color b4 = new Color(199, 165, 15);
	

	if (  (c3.getBlue() > 100)  && (c4.getRed() > 150)    ) {  //if onscreen is the same as key color, we know we're in BG
		
		System.out.println("bg has started");
        return true;  //therefore return true
	}
	else {
		
		System.out.println("bg hasn't started yet.");
		return false;
		
	}
	
	
}

public void jump() throws HeadlessException, AWTException {
	robot.keyRelease(KeyEvent.VK_W);
	robot.keyRelease(KeyEvent.VK_F6);
	robot.keyRelease(KeyEvent.VK_F7);
	for (int i = 0; i<generateNumber(8, 12);i++) {
	sleep();
	if (dead() && inBG()) {
	randomJump();}
	if (!dead()) {
		return;
	}
	
	}
	
}

public void randomJump() {
	
	if (generateNumber(1,3) == 3) {
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.delay(generateNumber(10,32));
		robot.keyRelease(KeyEvent.VK_SPACE);
	}
}

public boolean sameColor(Color color1, Color color2) {

    if (color1.getRed() == color2.getRed() && color1.getBlue() == color2.getBlue() && color1.getGreen() == color2.getGreen()) {return true;}

    return false; }

public boolean isCat() throws HeadlessException, AWTException {

	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	int color = image.getRGB(349, 992);  //SHOULD BE 0, 200, 220
	Color c5 = new Color(color, true);
	System.out.println(" r:" + c5.getRed() + "g"  + c5.getGreen() + "b" +  c5.getBlue());
	Color b5 = new Color(0, 251, 255);
	
	if (   sameColor(c5, b5)    ) {  
		
		
        return false;  //therefore return true
	}
	else {
		System.out.println(" r:" + c5.getRed() + "g"  + c5.getGreen() + "b" +  c5.getBlue());
		return true;
		
	}
	
}

public boolean isStealth() throws HeadlessException, AWTException {
	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	int color = image.getRGB(392, 1042);  //SHOULD BE 33,8, 57
	Color c5 = new Color(color, true);
	Color b5 = new Color(100, 75, 57);
	
	if (   sameColor(c5, b5)    ) {  
		
		
        return true;  //therefore return true
	}
	else {
		
		return false;
		
	}
}


public void turnSleep() {
	
	try {
		Thread.sleep(generateNumber(300,755));
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
}

public void wsgMovementSequence() throws InterruptedException, HeadlessException, AWTException {

	System.out.println("movement sequence:");
	
	robot.mouseMove(generateNumber(1830, 1860),generateNumber(810, 830));
	randomClick(InputEvent.BUTTON3_MASK);
	Thread.sleep(3200);
	
	if(!dead()) {
	robot.keyPress(KeyEvent.VK_W);}
	for(int x=0; x<100;x++) {
		if(!dead() && inBG() && !corpse()) {
			customDelay(generateNumber(55,56));
		}
		if(dead() || !inBG() || corpse()) {
			return;
		}
	}
	if(!dead() && inBG() && !corpse()) {
	robot.keyPress(KeyEvent.VK_F6);}
	for(int x=0; x<100;x++) {
		if(!dead()) {
			customDelay(generateNumber(8,9));
		}
		if(dead() || !inBG() || corpse()) {
			return;
		}
	}
	
	robot.keyRelease(KeyEvent.VK_F6);
	for(int x=0; x<100;x++) {
		if(!dead() && inBG() && !corpse()) {
			customDelay(generateNumber(10,13));
		}
		if(dead() || !inBG() || corpse()) {
			return;
		}
	}
	robot.mouseMove(generateNumber(1830, 1860),generateNumber(810, 830));
	randomClick(InputEvent.BUTTON3_MASK);
	
	
	if(!dead() && inBG() && !corpse()) {
	robot.keyPress(KeyEvent.VK_W);}
	if(dead() || !inBG() || corpse()) {
		return;
	}
	customDelay(generateNumber(1000,2200));
	if(dead() || !inBG() || corpse()) {
		return;
	}
	robot.keyPress(KeyEvent.VK_F5);        
	customDelay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_F5);
	customDelay(generateNumber(10,32));	
	if(dead() || !inBG() || corpse()) {
		return;
	}
	customDelay(generateNumber(400,500));
	if(dead() || !inBG() || corpse()) {
		return;
	}
	
	robot.keyPress(KeyEvent.VK_3);
	customDelay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_3);
	strafeDelay();
	robot.keyPress(KeyEvent.VK_3);   
	customDelay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_3);
	strafeDelay();
	
	
	robot.keyPress(KeyEvent.VK_F5);       
	customDelay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_F5);
	customDelay(generateNumber(10,32));	
	
	customDelay(generateNumber(400,500));
	
	robot.keyPress(KeyEvent.VK_3);
	customDelay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_3);
	strafeDelay();
	robot.keyPress(KeyEvent.VK_3);    
	customDelay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_3);
	customDelay(generateNumber(100,200));
	robot.keyPress(KeyEvent.VK_3);     
	customDelay(generateNumber(20,25));
	robot.keyRelease(KeyEvent.VK_3);
	strafeDelay();
	
	
	robot.keyPress(KeyEvent.VK_TAB);         
	customDelay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_TAB);
	customDelay(generateNumber(400,500));
	
	
	robot.keyPress(KeyEvent.VK_E);
	customDelay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_E);
	strafeDelay();
	
	robot.keyPress(KeyEvent.VK_E);    
	customDelay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_E);
	customDelay(generateNumber(10,32));
	
	robot.keyPress(KeyEvent.VK_SHIFT);     
	customDelay(generateNumber(10,32));
	robot.keyPress(KeyEvent.VK_C);
	customDelay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_C);
	customDelay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_SHIFT);
	customDelay(generateNumber(10,32));
	
	customDelay(generateNumber(2000,2500));
	robot.keyRelease(KeyEvent.VK_W);
	
	if (generateNumber(1,2) == 2) {
		
		robot.keyPress(KeyEvent.VK_A);
		customDelay(generateNumber(1000,1010));
		robot.keyRelease(KeyEvent.VK_A);
	}
	
	
	
	
}

void wsgEntrySequence() throws HeadlessException, AWTException, InterruptedException {
	System.out.println("entry sequence");
	
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	moveRightATad();
	customDelay(generateNumber(200,210));
	robot.keyPress(KeyEvent.VK_W);
	customDelay(generateNumber(20,30));
	robot.keyPress(KeyEvent.VK_F7);
	customDelay(generateNumber(20,30));
	customDelay(generateNumber(2800,2900));
	robot.keyRelease(KeyEvent.VK_W);
	customDelay(generateNumber(20,30));
	robot.keyRelease(KeyEvent.VK_F7);
	customDelay(generateNumber(20,30));
	strafeDelay();	
	robot.keyRelease(KeyEvent.VK_W);
	customDelay(generateNumber(10000,10100));
	
	customDelay(generateNumber(10000,10100));
	
	customDelay(generateNumber(10000,10100));
	customDelay(generateNumber(10000,10100));
	strafeDelay();	
	robot.keyRelease(KeyEvent.VK_W);
	customDelay(generateNumber(10000,10100));
	customDelay(generateNumber(10000,10100));
	
	
	robot.keyPress(KeyEvent.VK_W);
	customDelay(generateNumber(6500,6550));
	robot.keyRelease(KeyEvent.VK_W);
	customDelay(generateNumber(20,30));
	robot.mouseMove(generateNumber(1830, 1860),generateNumber(810, 830));  //mount
	randomClick(InputEvent.BUTTON3_MASK);
	customDelay(generateNumber(3170,3200));
	robot.keyPress(KeyEvent.VK_W);
	customDelay(generateNumber(20,30));
	robot.keyPress(KeyEvent.VK_F7);
	customDelay(generateNumber(20,30));
	customDelay(generateNumber(3500,3600));
	
	robot.keyRelease(KeyEvent.VK_W);
	customDelay(generateNumber(20,30));
	robot.keyRelease(KeyEvent.VK_F7);
	customDelay(generateNumber(20,30));
	robot.keyPress(KeyEvent.VK_W);
	customDelay(generateNumber(3400,3500));
	robot.keyPress(KeyEvent.VK_F7);
	customDelay(generateNumber(20,30));
	customDelay(generateNumber(1200,1300));
	robot.keyRelease(KeyEvent.VK_W);
	customDelay(generateNumber(20,30));
	robot.keyRelease(KeyEvent.VK_F7);
	customDelay(generateNumber(20,30));
	
}

void strafeDelay() throws HeadlessException, AWTException, InterruptedException {
	System.out.println("strafing now.");
	
	robot.keyRelease(KeyEvent.VK_W);
	
	customDelay(generateNumber(20,30));
	if(!dead()) {
	robot.keyPress(KeyEvent.VK_F6);  }   
	
	customDelay(generateNumber(300,400));
	
	robot.keyRelease(KeyEvent.VK_F6);
	customDelay(generateNumber(20,30));
	if(!dead() && inBG() && !corpse()) {
	robot.keyPress(KeyEvent.VK_F7);}
	customDelay(generateNumber(400,500));
	robot.keyRelease(KeyEvent.VK_F7);
	customDelay(generateNumber(20,30));
	if(!dead() && inBG() && !corpse()) {
	robot.keyPress(KeyEvent.VK_F6);   }  
	customDelay(generateNumber(300,400));
	robot.keyRelease(KeyEvent.VK_F6);
	customDelay(generateNumber(20,30));
	if(!dead() && inBG() && !corpse()) {
	robot.keyPress(KeyEvent.VK_F7);}
	customDelay(generateNumber(400,500));
	robot.keyRelease(KeyEvent.VK_F7);
	customDelay(generateNumber(20,30));
	if(!dead() && inBG() && !corpse()) {
	robot.keyPress(KeyEvent.VK_W);}


}

void strafeDelayEntry() throws HeadlessException, AWTException, InterruptedException {
	System.out.println("strafing now.");
	
	robot.keyRelease(KeyEvent.VK_W);
	
	customDelay(generateNumber(20,30));
	if(!dead()) {
	robot.keyPress(KeyEvent.VK_F6);  }   
	
	customDelay(generateNumber(300,400));
	
	robot.keyRelease(KeyEvent.VK_F6);
	customDelay(generateNumber(20,30));
	if(!dead() && inBG() && !corpse()) {
	robot.keyPress(KeyEvent.VK_F7);}
	customDelay(generateNumber(400,500));
	robot.keyRelease(KeyEvent.VK_F7);
	customDelay(generateNumber(20,30));
	if(!dead() && inBG() && !corpse()) {
	robot.keyPress(KeyEvent.VK_F6);   }  
	customDelay(generateNumber(300,400));
	robot.keyRelease(KeyEvent.VK_F6);
	customDelay(generateNumber(20,30));
	if(!dead() && inBG() && !corpse()) {
	robot.keyPress(KeyEvent.VK_F7);}
	customDelay(generateNumber(400,500));
	robot.keyRelease(KeyEvent.VK_F7);
	customDelay(generateNumber(20,30));
	


}

boolean inWSGPrepRoom() throws HeadlessException, AWTException {
	
	BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	int color3 = image.getRGB(1838, 160);  
	int color4 = image.getRGB(1783, 162); 
	Color c3 = new Color(color3, true);
	Color c4 = new Color(color4, true);
	Color b3 = new Color(171, 96, 49);
	Color b4 = new Color(159, 104, 52);
		
	if (    (sameColor(c3, b3) && sameColor(c4, b4))      ) {  //if onscreen is the same as key color, we know we're in BG
		
		System.out.println("in prep room.");
        return true;  //therefore return true
	}
	else {
		System.out.println("not in prep room.");
		return false;
		
	}
	
}


boolean bgEnd() throws HeadlessException, AWTException {
	
	
BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

	
	int color4 = image.getRGB(800, 753);  //SHOULD BE 241, 195, 0
	int color5 = image.getRGB(1100, 753);  //SHOULD BE 255, 255, 255
	int color6 = image.getRGB(1380, 753);  //SHOULD BE 133, 127, 125

	
	Color c4 = new Color(color4, true);
	Color c5 = new Color(color5, true);
	Color c6 = new Color(color6, true);
	System.out.println(" r:" + c5.getRed() + "g"  + c5.getGreen() + "b" +  c5.getBlue());
	System.out.println(" r:" + c4.getRed() + "g"  + c4.getGreen() + "b" +  c4.getBlue());
	System.out.println(" r:" + c6.getRed() + "g"  + c6.getGreen() + "b" +  c6.getBlue());
	
	Color b5 = new Color(0, 0, 0);
	Color b4 = new Color(0, 0, 0);
	Color b6 = new Color(0,0,0);
	System.out.println(" r:" + b5.getRed() + "g"  + b5.getGreen() + "b" +  b5.getBlue());
	System.out.println(" r:" + b4.getRed() + "g"  + b4.getGreen() + "b" +  b4.getBlue());
	System.out.println(" r:" + b6.getRed() + "g"  + b6.getGreen() + "b" +  b6.getBlue());
	/*if (c.getRed() == b.getRed() && c.getBlue() == b.getBlue() && c.getGreen() == b.getGreen()) 

	{System.out.println(color);} */

	if (  (sameColor(c4, b4) && sameColor(c5, b5) && sameColor(c6, b6) )   ) {
       System.out.println("bg over.");
        return true;
	}
	else {
		System.out.println("bg not over.");
		return false;
	}
	
	
}
void customDelay(int range) throws HeadlessException, AWTException, InterruptedException {
	int count = 0;
	robot.delay(range);
		
	while(count<range && !dead()) {
	Thread.sleep(range/10);
	count = count+(range/10);
	} 
	
}

void TbcAvEntryPath() throws HeadlessException, AWTException, InterruptedException {
	robot.keyPress(KeyEvent.VK_W);
	robot.delay(generateNumber(350,355));
	//robot.keyRelease(KeyEvent.VK_W);
	//robot.delay(generateNumber(30,45));
	robot.keyPress(KeyEvent.VK_D);
	robot.delay(generateNumber(355,355));
	robot.keyRelease(KeyEvent.VK_D);
	robot.delay(generateNumber(2900,2910));
	robot.keyPress(KeyEvent.VK_F6);
	robot.delay(generateNumber(500,510));
	robot.keyRelease(KeyEvent.VK_F6);
	robot.delay(generateNumber(1300,1310));
	robot.keyPress(KeyEvent.VK_F6);
	robot.delay(generateNumber(700,710));
	robot.keyRelease(KeyEvent.VK_F6);
	robot.delay(generateNumber(7000,7010));
	robot.keyPress(KeyEvent.VK_F6);
	robot.delay(generateNumber(500,510));
	//robot.keyRelease(KeyEvent.VK_F6);
	//robot.delay(generateNumber(200,210));
	//robot.keyPress(KeyEvent.VK_F6);
	//robot.delay(generateNumber(300,310));
	robot.keyRelease(KeyEvent.VK_F6);
	robot.delay(generateNumber(5000,5010));
	robot.keyPress(KeyEvent.VK_F6);
	robot.delay(generateNumber(100,110));
	robot.keyRelease(KeyEvent.VK_F6);
	robot.delay(generateNumber(9500,9510));
	
	for(int j=0;j<20;j++) {
	robot.keyPress(KeyEvent.VK_SPACE);
	robot.delay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_SPACE);
	
	robot.delay(generateNumber(500,510));}
	
	robot.keyPress(KeyEvent.VK_A);
	robot.delay(generateNumber(300,310));
	robot.keyRelease(KeyEvent.VK_A);
	robot.delay(generateNumber(2000,2010));
	robot.delay(generateNumber(4000,4010));
	robot.keyPress(KeyEvent.VK_F7);
	robot.delay(generateNumber(1000,1010));
	robot.keyRelease(KeyEvent.VK_F7);
	robot.delay(generateNumber(3000,3010));
	robot.keyPress(KeyEvent.VK_F6);
	robot.delay(generateNumber(1000,1010));
	robot.keyRelease(KeyEvent.VK_F6);
	robot.delay(generateNumber(200,205));
	
	
	//DG:
	robot.keyPress(KeyEvent.VK_SHIFT);
	robot.delay(generateNumber(10,32));
	robot.keyPress(KeyEvent.VK_R);
	robot.delay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_SHIFT);
	robot.delay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_R);
	robot.delay(generateNumber(10,32));
	robot.delay(generateNumber(1600,1650));
	robot.keyPress(KeyEvent.VK_2);
	robot.delay(generateNumber(10,32));
	robot.keyRelease(KeyEvent.VK_2);
	robot.delay(generateNumber(10,32));
	robot.keyPress(KeyEvent.VK_A);
	robot.delay(generateNumber(570,580));
	robot.keyRelease(KeyEvent.VK_A);
	robot.delay(generateNumber(10,32));
	robot.keyPress(KeyEvent.VK_W);
	robot.delay(generateNumber(2000,2010));
	robot.keyRelease(KeyEvent.VK_W);
	
	
	while (!corpse() && inBG() && !bgEnd()) {
		robot.delay(generateNumber(700,710));
		randomJump();
		if (generateNumber(1,25) == 10)
		{
		strafeDelayEntry();}
	}
	/*
	robot.delay(generateNumber(4500,4510));
	robot.keyPress(KeyEvent.VK_D);
	robot.delay(generateNumber(400,410));
	robot.keyRelease(KeyEvent.VK_D);
	robot.delay(generateNumber(3500,3510));
	robot.keyPress(KeyEvent.VK_A);
	robot.delay(generateNumber(300,310));
	robot.keyRelease(KeyEvent.VK_A);
	robot.delay(generateNumber(3500,3510));
	robot.keyPress(KeyEvent.VK_F7);
	robot.delay(generateNumber(1000,1010));
	robot.keyRelease(KeyEvent.VK_F7);
	robot.delay(generateNumber(30000,30010));
	robot.keyPress(KeyEvent.VK_D);
	robot.delay(generateNumber(400,410));
	robot.keyRelease(KeyEvent.VK_D);
	robot.delay(generateNumber(1000,1010));
	robot.keyPress(KeyEvent.VK_A);
	robot.delay(generateNumber(400,410));
	robot.keyRelease(KeyEvent.VK_A);
	*/
	
	return;
}















}
	

