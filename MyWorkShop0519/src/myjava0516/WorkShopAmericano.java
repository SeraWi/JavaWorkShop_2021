package myjava0516;

import java.util.*;

public class WorkShopAmericano {

	public static int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Integer.parseInt(inputString);
	}
	
	public static void main(String[] args) {
		
		int Americano = 2000;
		int Latte = 3000;
		int Bagel = 1500;
		int Cheese = 500;
		int totalprice = 0;
		int point = 0;
		
		System.out.println("======MENU======");
		System.out.println("1. Americano 2000won");
		System.out.println("2. Cafe Latte 3000won");
		System.out.println("3. Bagel 1500won");
		System.out.println("4. Cream Cheese 500won");
		System.out.println("======ORDER======");
		System.out.print("Order Americano:");
		int numAmericano = getUserInput();
		System.out.print("Order Cafe Latte:");
		int numLatte = getUserInput();
		System.out.print("Order Bagel:");
		int numBagel = getUserInput();
		System.out.print("Oder Cream cheese:");
		int numCheese = getUserInput();
		
		System.out.println("======TOTAL AMOUNT=======");
		System.out.printf("Americano: %d won \n", numAmericano*Americano);
		System.out.printf("Cafe Latte: %d won \n",numLatte*Latte);
		System.out.printf("Bagel: %d won \n",numBagel*Bagel);
		System.out.printf("Cream Cheese: %d won \n",numCheese*Cheese);
		System.out.println("===================");
		
		totalprice = numAmericano*Americano+numLatte*Latte+numBagel*Bagel+numCheese*Cheese;
		if(totalprice >= 30000) {
			point += totalprice*0.02;
		}else if(totalprice >= 12000) {
			point += totalprice*0.01;
		}
		System.out.printf("Total Price: %dwon \n",totalprice);
		System.out.printf("Point: %d Á¡ ",point);
		
	}

}
