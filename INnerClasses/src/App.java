	
public  class App {

	public static void main(String[] args) {
		
		Robot robot = new Robot(34);
		robot.start();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}

}
