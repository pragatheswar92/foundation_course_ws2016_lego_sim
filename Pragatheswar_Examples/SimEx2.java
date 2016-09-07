package praggy_sim_practise;

import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.Tools;

public class SimEx2 {
	public static LegoRobot lr1;
	public static Gear g = new Gear();

	public SimEx2() {
		lr1 = new LegoRobot();
		lr1.addPart(g);
	}

	public static void robot_forward() {
		g.forward();
		Tools.delay(1500);
	}

	public static void robot_backward() {
		g.backward();
		Tools.delay(1500);

	}

	public static void robot_left() {
		g.left();
		Tools.delay(600);
	}

	public static void robot_right() {
		g.right();
		Tools.delay(600);
	}

	public static void robot_left_arc() {
		g.leftArc(0.1, 1350);
		Tools.delay(600);
	}

	public static void robot_right_arc() {
		g.rightArc(0);
		Tools.delay(600);
	}

	public static void robot_exit() {
		lr1.exit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimEx2();

		robot_forward();
		robot_left();
		robot_forward();
		robot_right();
		robot_forward();
		robot_backward();
		robot_right_arc();
		robot_forward();

		robot_left_arc();
		robot_exit();
	}

}
