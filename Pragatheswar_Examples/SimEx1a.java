package praggy_sim_practise;

import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.Motor;
import ch.aplu.robotsim.MotorPort;
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.Tools;

public class SimEx1a {
	public static LegoRobot r1;
	public static Motor mot1 = new Motor(MotorPort.A);
	public static Motor mot2 = new Motor(MotorPort.B);

	public SimEx1a() {
		r1 = new LegoRobot();
		r1.addPart(mot1);
		r1.addPart(mot2);
		System.out.println("robot moves forward");
		mot1.forward();
		mot2.forward();
		Tools.delay(2000);
		System.out.println("robot moves right");
		mot2.forward();
		mot1.backward();
		Tools.delay(600);
		System.out.println("robot moves left");
		mot1.forward();
		mot2.backward();
		Tools.delay(675);
		r1.exit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimEx1a();

	}

	static {
		RobotContext.showStatusBar(30);
	}

}
