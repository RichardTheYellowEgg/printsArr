package factorials;

public class erdtfyguhijokqo {

	public static void main(String[] args) {// void =no return
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}
	
	public static int factorial (int x) {
		if(x==1) { //4!= 4*3*2*1
			return 1;
		}
		else {
			return x*factorial(x-1);// => 5*factorial(5-1)= 5*factorial(4) =5
		}
	}

}
