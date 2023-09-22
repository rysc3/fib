import java.util.Scanner;

class fib {
  public static void main(String args[]){
  	// Create Scanner
		Scanner scan = new Scanner(System.in);
	
		// int test = scan.nextInt();
		int test = Integer.parseInt(args[0]);

		System.out.println("fib1: " + fib(test) + "\n");
		System.out.println("fib2: " + fib2(test) + "\n");	
	}	

	public static int fib(int input){

		if(input == 0){
			return 0;
		}else if(input == 1){
			return 1;
		}else if(input == 2){
			return 1;
		}else{
		  return (fib(input - 2) + fib(input - 1));	
		}
	}

	public static int fib2(int input){
		switch(input)
		{
			case 0:
				return 0;
			case 1:
				return 1;
			default: 
				return (fib2(input-2) + fib2(input-1));
		}
	}
}
