package Module;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMethodRobotManager {
	private Map<Integer, Robot> robots;
	private int rows;
	private int cols;

	public MainMethodRobotManager(int rows, int cols) {
		this.robots = new HashMap<>();
		this.rows = rows;
		this.cols = cols;
	}

	public void addRobot(int id) {
		robots.put(id, new Robot(id, rows, cols));
	}

	public void moveRobot(int id, String direction) {
		Robot robot = robots.get(id);
		if (robot != null) {
			robot.move(direction);
		}
	}

	public String getRobotLocation(int id) {
		Robot robot = robots.get(id);
		if (robot != null) {
			return robot.getLocation();
		}
		return "Robot not found";
	}

	public static void main(String[] args) {
		MainMethodRobotManager manager = new MainMethodRobotManager(5, 5);
		Scanner scanner = new Scanner(System.in);
		int robotId = 1;

		while (true) {
			System.out.println("1. Add Robots");
			System.out.println("2. Move Robot");
			System.out.println("3. Get Robot Location");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				manager.addRobot(robotId++);
				System.out.println("Robot added successfully");
				break;
			case 2:
				System.out.print("Enter robot ID: ");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter direction (e.g., N4, E3, S1, W2): ");
				String direction = scanner.nextLine();
				manager.moveRobot(id, direction);
				System.out.println("Robot moved successfully");
				break;
			case 3:
				System.out.print("Enter robot ID: ");
				id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Robot location: " + manager.getRobotLocation(id));
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
