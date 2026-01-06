
import java.util.Scanner;

class Rectangle{
	private int length;
	private int breadth;
	private int area;
	private int peri;
	void read(){
	  System.out.println("Enter length and breadth: ");
		Scanner sc = new Scanner(System.in);
		this.length = sc.nextInt();
		this.breadth = sc.nextInt();
		sc.close();
	}

	void calculate(){
		this.area = length * breadth;
		this.peri = 2 * (length + breadth);
	}

	void display(){
		System.out.println("Area is: " + area);
		System.out.println("Perimeter is: " + peri);
	}
}



public class RectangleMain{
	public static void main(String[] args){
		Rectangle rec = new Rectangle();
		rec.read();
		rec.calculate();
		rec.display();
	}
}
