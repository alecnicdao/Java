package cs;
import java.awt.Color;
import robocode.*;
import robocode.HitRobotEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.DeathEvent;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * AlecsRobot - a robot by Alastair Nicdao
 */
public class AlecsRobot extends Robot
{
	/**
	 * run: AlecsRobot's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar
		setBodyColor(Color.red);
		setGunColor(Color.white);
		setRadarColor(Color.black);
		setScanColor(Color.red);
		setBulletColor(Color.yellow);
		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
			turnRight(700);
			back(500);
			turnLeft(700);
			ahead(500);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(5);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
		ahead(50);
		turnGunRight(360);
		ahead(200);
		turnGunLeft(300);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
		turnGunRight(400);
		back (200);
		turnRight(300);
		turnGunLeft(360);
	}	
	public void onHitRobot (HitRobotEvent e) {	
		back(500);
		turnGunRight(300);
		ahead(1000);
		fire(5);
		back(700);
		turnGunLeft(300);
		fire(10);
	}
	public void onWin (WinEvent e) {
		for (int i = 0; i < 14; i++) {
				turnLeft(50);
				turnRight(50);
		}
	}
	public void onDeath (DeathEvent e) {
		System.out.println("I lost");
		System.out.println("Better luck next time");	
	}
	public void onBulletMissed (BulletMissedEvent e) {
	fire (5);
	back(250);
	turnGunLeft(500);
	fire(10);
	turnGunRight(250);
	}
}
