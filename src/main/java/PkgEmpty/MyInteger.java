package PkgEmpty;

public class MyInteger {

//Attribute iValue
	int iValue;

// Constructor that creates a myInteger object for the specified iValue
	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}
// return iValue
	public int getiValue() {
		return iValue;
	}

	
// ************** is even, odd, prime methods****
	// isEven
	public boolean isEven() {
		if (iValue % 2 == 0){ 
			return true;
		}
		else{
			return false;
		}

	}
	
	// isOdd
	public boolean isOdd() {
		if (iValue % 2 == 1){ 
			return true;
		}
		else{
			return false;
		}
	}

	// isPrime
	public boolean isPrime(){
	    for(int divisor=2; divisor<=(int)Math.sqrt(iValue)+1;divisor++){ 
	      if(iValue % divisor==0){
	        return(false);
	      }
	    }
	    return(true);
	  }
	
// *****Static Methods is even is odd is prime with int
	//•	Static methods isEven(int), isOdd(int), and isPrime(int) that return true if the specified value is even, odd, or prime, respectively.

	public static boolean isEven(int a) {
		if (a % 2 == 0){ 
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isOdd(int a) {
		if (a % 2 == 1){ 
			return true;
		}
		else{
			return false;
		}		
	}

	public static boolean isPrime(int a) {

		    for(int divisor=2; divisor<=(int)Math.sqrt(a)+1;divisor++){ 
		      if(a % divisor==0){
		        return(false);
		      }
		    }
		    return(true);		}
	
	public boolean equals(int a) {
		if (iValue == a) {
			return true;
		}
		else {
			return false;
		}
	}
// *******
	
	public static boolean isEven(MyInteger a) {
		   return isEven(a.getiValue());
		}
	public static boolean isOdd(MyInteger a) {
		   return isOdd(a.getiValue());
		}
	public static boolean isPrime(MyInteger a) {
		   return isPrime(a.getiValue());
		}
	
	public boolean equals(MyInteger a) {
		return equals(a.getiValue());
	}
//****** Equal int and equals iValue
	


	//

}
