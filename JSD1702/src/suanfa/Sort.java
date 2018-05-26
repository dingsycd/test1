package suanfa;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {2,23,12,5,11,15,1,3,5,16};
        int a =0;
        for(int i=0;i<arr.length;i++){
            int min =arr[i];
            for(int j =i;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;

                }
                a++;
                System.out.print("\n第"+a+"次:"+ Arrays.toString(arr));
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
