package myJava0524;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		int [] arr = {0,1,2,3,4};
		int [][] arr2D = {{11,12,13},{21,22,23}};
		
		System.out.println(Arrays.toString(arr));//[0, 1, 2, 3, 4]
		System.out.println(Arrays.deepToString(arr2D));//[[11, 12, 13], [21, 22, 23]]
		
		int [] arr2 = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));//[0, 1, 2, 3, 4]
		int [] arr3 = Arrays.copyOf(arr,3);
		System.out.println(Arrays.toString(arr3));//[0, 1, 2]
		int [] arr4 = Arrays.copyOf(arr, 7);
		System.out.println(Arrays.toString(arr4));//[0, 1, 2, 3, 4, 0, 0]
		int[] arr5 = Arrays.copyOfRange(arr, 2 , 4);
		System.out.println(Arrays.toString(arr5));//[2, 3]
		int [] arr6 = Arrays.copyOfRange(arr, 0, 7);
		System.out.println(Arrays.toString(arr6));//[0, 1, 2, 3, 4, 0, 0]
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		System.out.println(Arrays.toString(arr7));//[9, 9, 9, 9, 9]
		
		char[] chArr = {'A','E','B','D','C','F'};
		Arrays.sort(chArr);//정렬
		System.out.println(Arrays.toString(chArr));//[A, B, C, D, E, F]
	}
}
