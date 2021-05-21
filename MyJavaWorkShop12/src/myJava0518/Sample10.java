package myJava0518;
/*
 * bubble sort
 */
public class Sample10 {
	public static void main(String[] args) {
		int[] arr = {2,3,60,47,56,3,1,89};

		int temp;
		boolean sorted = false;

		while(!sorted) {
			sorted = true;
			for(int inx = 0; inx < arr.length-1; inx++) {
				if(arr[inx] > arr[inx+1]) {
					temp = arr[inx];
					arr[inx+1] = arr[inx];
					arr[inx]= temp;
					sorted  = false;
				}
			}
		}
		for(int a : arr) {
			System.out.println(a);
		}
	}
}