package day05;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = new int[]{1,1,1,1,1,1,1,1,};
		int[] arr1 = { 2, 5, 8 };
		int[] arr2;
		arr2 = new int[] { 2, 5, 8 };
		int[] arr3=new int[3];
		//int len= arr.length;
		System.out.println(arr.length);
		arr3[0]=100;
		arr3[1]=200;
		//arr3[3]=300;//数组下标越界
		System.out.println(arr3[arr3.length-1]);
		int[] arr4={1,2,3};
		int[] arr5=new int[4];
		System.arraycopy(arr4,1,arr5,1,2);
		for(int i=0;i<arr5.length;i++){
			System.out.print(arr5[i]+" ");
		}
	}

}
