package Module;

public class Robot {
	private int id;
	private int x;
	private int y;
	private int[][] terrain;

	public Robot(int id, int rows, int cols) {
		this.id = id;
		this.x = 0;
		this.y = 0;
		this.terrain = new int[rows][cols];
	}

	public void move(String direction) {
		int steps = Integer.parseInt(direction.substring(1));
		char dir = direction.charAt(0);

		int newX = x;
		int newY = y;

		switch (dir) {
		case 'N':
			newY -= steps;
			break;
		case 'S':
			newY += steps;
			break;
		case 'E':
			newX += steps;
			break;
		case 'W':
			newX -= steps;
			break;
		}

		if (isValidMove(newX, newY)) {
			vacateCell();
			x = newX;
			y = newY;
			occupyCell();
		}
	}

	private boolean isValidMove(int newX, int newY) {
		return newX >= 0 && newX < terrain[0].length && newY >= 0 && newY < terrain.length && terrain[newY][newX] == 0;
	}
	private void occupyCell() {
		terrain[y][x] = id;
	}
	private void vacateCell() {
		terrain[y][x] = 0;
	}
	public String getLocation() {
		return "(" + x + ", " + y + ")";
	}
}
