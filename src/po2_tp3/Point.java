package po2_tp3;

public class Point {
	private int x;
	private int y;
	
	
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public void MoverA (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point SumarseA(Point punto) {
		return new Point(this.x + punto.getX(), this.y + punto.getY());
		
	}
}
