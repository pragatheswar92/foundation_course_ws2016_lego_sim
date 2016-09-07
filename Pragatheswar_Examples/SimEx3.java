package praggy_sim_practise;

import ch.aplu.robotsim.Tools;
import ch.aplu.robotsim.TurtleRobot;

public class SimEx3 {
	public static TurtleRobot tr1;

	public SimEx3() {
		tr1 = new TurtleRobot();
	}

	public static void forward() {
		for (int i = 0; i < 4; i++) {
			tr1.forward(100);
			tr1.left(90);
			Tools.delay(1500);
		}
		tr1.exit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimEx3();
		forward();
	}

}
