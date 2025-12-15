public class LargestNumber{
	public static void main(String[] args){
		int largest;
		int n1= Integer.parseInt(args[0]);
		int n2= Integer.parseInt(args[1]);
		int n3= Integer.parseInt(args[2]);
		largest = (n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
		System.out.print(largest);
}
}
