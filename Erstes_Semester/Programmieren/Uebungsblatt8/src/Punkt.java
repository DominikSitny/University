import edu.princeton.cs.introcs.StdDraw;

public class Punkt {

	private double xPoint;
	private double yPoint;
	
	public Punkt(double x, double y) {
		
		setxPoint(x);
		setyPoint(y);
		StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(StdDraw.BLUE);
		draw();
	}

	public void addPoint(double x, double y) {
		StdDraw.point(getxPoint() + x, getyPoint() + y);
	}
	
	private void draw() {
        StdDraw.point(getxPoint(), getyPoint());
	}
	
	public String toString() {
		return getxPoint() + ", " + getyPoint();
	}
	
	public double getxPoint() {
		return xPoint;
	}

	public void setxPoint(double xPoint) {
		this.xPoint = xPoint;
	}

	public double getyPoint() {
		return yPoint;
	}

	public void setyPoint(double yPoint) {
		this.yPoint = yPoint;
	}

	
	
}
