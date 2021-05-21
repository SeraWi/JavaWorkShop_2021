package myjava0516;

import java.util.*;

public class Score {
	public static float getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Float.parseFloat(inputString);
	}
	public static void main(String[] args) {
		
		Float computer,java,math,opera,badminton,average;
		
		System.out.print("Please input your Computer Science score :");
		computer = getUserInput();
		System.out.print("Please input your Java Programming score :");
		java = getUserInput();
		System.out.print("Please input your Math score :");
		math = getUserInput();
		System.out.print("Please input your Understanding of Opera score:");
		opera = getUserInput();
		System.out.print("Please input your Badminton score:");
		badminton = getUserInput();
		System.out.println("==============================");
		
		average = (computer+java+math+opera+badminton)/5;
		
		System.out.printf("Your average is %f. \n",average);
		
		if((average >= 3.7) 
				&& (computer >= 2.5) &&(java >= 2.5)&&(math >= 2.5) &&(opera >= 2.5) &&(badminton >= 2.5)) {
			System.out.println("You are eligible for schorlarship in next semester");
		}
		
	}
}
