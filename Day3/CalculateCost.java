/*
1.Aim of the program : A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement it in Java to calculate the cost of plastic as per the dimensions given by the user 	where 3D inherits from 2D.
Input:	Enter  dimensions
Output: 	Display the cost of plastic
*/

import java.util.Scanner;

class _2d{
  int length;
  int breadth;
  int area;
  _2d(int l, int b){
    this.length = l;
    this.breadth = b;
    this.area = l * b;
  }
}

class _3d extends _2d{
  int height;
  int area;
  _3d(int l, int b, int h){
    super(l, b);
    this.height = h;
    this.area = 2 * (super.length*super.breadth + super.length*this.height + super.breadth*this.height);
  }
}

public class CalculateCost{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter dimensions of 2D sheet: ");
    int l = sc.nextInt();
    int b = sc.nextInt();
    _2d sheet = new _2d(l, b);
    System.out.print("Enter dimensions of 3D box: ");
    l = sc.nextInt();
    b = sc.nextInt();
    int h = sc.nextInt();
    
    _3d box = new _3d(l, b, h);
    
    int total_cost = sheet.area * 40 + box.area * 60;
    
    System.out.println("Total cost is: " + total_cost);
  }
}
