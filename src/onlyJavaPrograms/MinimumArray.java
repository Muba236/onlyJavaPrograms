package onlyJavaPrograms;

public class MinimumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinimumArray pass = new MinimumArray();

		int arr[] = {1, 2, 3, 4, 5, 5, 10 };
		
		pass.findMin(arr);
		
	}

	public static void findMin(int arr[]) {

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min < arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("Min no is : " + min);

	}

}
