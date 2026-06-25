package javaproject.sample;

import java.util.Scanner;

public class ExpectionProgram {

	public static  int checkAge(int age) throws ArithmeticException {
		if(age >= 18) {
			System.out.println("Age is valid");
			return age;
		}else {
			throw new ArithmeticException("Age is not valid");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
}
