import java.util.Scanner;

class Box{
	 private int length;
	 private int width;
	 private int height;
	 Box(int length, int width, int height){
	 	this.length = length;
	 	this.width = width;
	 	this.height = height;
	}

	void volume(){
		System.out.println("Volume is: " + length*width*height);
	}
}
public class BoxMain{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		int l = sc.nextInt();
		System.out.print("Enter width: ");
		int w = sc.nextInt();
		System.out.print("Enter height: ");
		int h = sc.nextInt();

		Box box1 = new Box(l, w, h);
		box1.volume();
	}
}