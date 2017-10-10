package day05;

import java.util.Arrays;

public class Four {

	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.print("数组中的数据为： [");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("最小值为：" + min);
//		int[] arr1 = Arrays.copyOf(arr, arr.length + 1);
//		System.out.print("新数组的数据为： [");
//		System.arraycopy(arr, 0, arr1, 1, arr.length);
//		arr1[0] = min;
//		for (int i = 0; i < arr1.length; i++) {
//			if (i == arr1.length - 1) {
//				System.out.println(arr1[i] + "]");
//			} else {
//				System.out.print(arr1[i] + ", ");
//			}
//		}
	}

}
