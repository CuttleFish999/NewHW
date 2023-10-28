package HomeWork05;

public class MyRectangle {
	double width , depth;
	public static void main(String[] args) {
		
		MyRectangle R = new MyRectangle(); 
		R.setDepth(10);
		R.setWidth(20);
		System.out.println("Answer1: " + R.getArea());
		
		MyRectangle R2 = new MyRectangle(10,20);
		System.out.println("Answer2: " + R2.getArea());
	}
	
	public MyRectangle() {
		
	}

	public MyRectangle( double width , double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getArea() {
		return width * depth;
	}
}
