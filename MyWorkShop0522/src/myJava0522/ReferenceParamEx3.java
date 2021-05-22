package myJava0522;

public class ReferenceParamEx3 {
	
	static void sortArr(int[] arr) {// 베열을 오름차순으로 정렬
		for(int i= 0; i<arr.length-1;i++) {
			for(int j = 0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	static void printArr(int[] arr) {
		System.out.print("[");
		for(int i: arr) {
			System.out.print(i);
		}
		System.out.print("]");
	}
	static int sumArr(int[] arr) {//배열의 모든 요소의 합을 반환
		int sum = 0;
		for(int i =0; i<arr.length;i++) {
			sum += arr[i];
		}return sum;
	}
	
	
	public static void main(String[] args) {
		int [] arr= new int[] {3,2,1,6,5,4};
		printArr(arr);
		System.out.println();
		System.out.println(sumArr(arr));
		sortArr(arr);
		printArr(arr);
		
	}

}
