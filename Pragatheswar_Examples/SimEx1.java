package praggy_sim_practise;

import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.Motor;
import ch.aplu.robotsim.MotorPort;
import ch.aplu.robotsim.Tools;

public class SimEx1 {
	public static LegoRobot r1;
	public static Motor mot1 = new Motor(MotorPort.A);
	public static Motor mot2 = new Motor(MotorPort.B);

	public SimEx1() {
		r1 = new LegoRobot();
		r1.addPart(mot1);
		r1.addPart(mot2);
	}

	public static void move_forward() {
		mot1.forward();
		mot2.forward();
		Tools.delay(2000);
	}

	public static void move_left() {
		mot1.forward();
		mot2.backward();
		Tools.delay(675);
	}

	public static void move_right() {
		// mot1.forward();
		mot2.forward();
		mot1.backward();
		Tools.delay(675);
	}

	public static void move_backward() {
		mot1.backward();
		mot2.backward();
		Tools.delay(2000);
	}

	public static void robot_stop() {
		r1.exit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimEx1();
		move_forward();
		move_left();
		move_forward();
		move_left();
		move_forward();
		move_left();
		move_forward();
		robot_stop();
	}
}
