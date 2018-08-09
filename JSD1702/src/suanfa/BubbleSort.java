package suanfa;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.print("排序前为：");
		int[] arr = new int[10];
		int a=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length  - i; j++) {
				if (arr[j-1] > arr[j]) {
					int t = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = t;
				}
				++a;
				System.out.print("\n第"+a+"次:"+Arrays.toString(arr));
			}
			//System.out.print("\n"+Arrays.toString(arr));
		}
		System.out.print("\n升序后为：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
