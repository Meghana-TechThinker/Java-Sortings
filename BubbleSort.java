import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[]={25,10,20,5,15};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                int temp=arr[j];
                if (arr[j+1]<arr[j]){
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
