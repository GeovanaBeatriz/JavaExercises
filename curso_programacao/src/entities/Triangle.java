package entities;

public class Triangle {
	
	public double height;
	public double width;
	
	public double CalculeArea() {
		return height * width;
	}
	
	public double CalculePerimeter() {
		return (height + width) * 2;
	}
	
	public double CalculeDiagonal() {
		return Math.sqrt(width * width + height * height);
	}
	
	/*public String toString() {
		return "AREA: " +
				CalculeArea() +
				"  PERIMETER: " +
				CalculePerimeter()+
				"  DIAGONAL: "+
				CalculeDiagonal();
	}
*/
}
