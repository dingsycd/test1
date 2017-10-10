package programming;

public class FindMaxOrMin {
	public static void main(String[] args) {
		find(1);
	}
	 static int[] arr() {
		int[] arr =new  int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int) (Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		return arr;
	}
	public static  void find(int num){
		int[] arr = arr();
		if(num==0){
			int max= arr[0];
			for(int i=1;i<arr.length;i++){
				if(arr[i]>max){
					max=arr[i];
				}
			}
			System.out.println("\r最大数为："+max);	
		}	
		if(num==1){
			int min = arr[0];
			for(int i=1;i<arr.length;i++){
				if(arr[i]<min){
					min=arr[i];
				}
			}
			System.out.println("\r最小数为："+min);
		}
	}	
}
