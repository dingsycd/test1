package day01;


import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.print("排序前：");
//		int[] arr=new int[10];
//		for(int i=0;i<10;i++){
//			arr[i]=(int) (Math.random()*100);
//			System.out.print(arr[i]+" ");
//		}
		int[] arr = {15,2,12,25,45,23,28,18};

		System.out.print("\n从小到大为：");
		//Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int t = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
