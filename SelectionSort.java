import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner obi=new Scanner(System.in);
        int arr[]={7,5,9,2,8};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.print(Arrays.toString(arr));
    }
    
}
