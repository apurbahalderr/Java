class OddEven{
	public static void main(String[] arr){

	if(arr.length < 10){
	  System.out.println("Enter minimum 10 numbers");
	  return;
	  }

	int even = 0, odd = 0;
		  for(String n : arr){
		    int num = Integer.parseInt(n);
		    if(num % 2 == 0) even++;
		    else odd++;
		  }

		  System.out.println("Odd Number: " + odd);
		  System.out.println("Even Number: " + even);
		}
		}
