package javaproject.sample;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int arr[] = {10,30,90};
		
		int largetnumber = Integer.MIN_VALUE;
		int secondlargestnumber = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if(num > largetnumber ) {
				secondlargestnumber = largetnumber;
				largetnumber = num;
			}else {
				if(num > secondlargestnumber && num != largetnumber) {
					secondlargestnumber = num;
				}
			}
		}
		System.out.println(secondlargestnumber);
	} 

}
