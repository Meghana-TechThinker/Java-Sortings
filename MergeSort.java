import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int arr[]={3,27,38};
        int brr[]={9,10,82,48,95};
        int n=arr.length;
        int m=brr.length;
        int c[]=new int[n+m];
        int k=0,i=0,j=0;
        while(i<n && j<m){
            if(arr[i]<brr[j]){
                c[k]=arr[i];
                i++;
            }
            else{
                c[k]=brr[j];
                j++;
            }
            k++;
        }
        if(i>=n){
            while(j<m){
                c[k]=brr[j];
                j++;
                k++;
            }
        }
        if(j>=m){
            while(i<n){
                c[k]=arr[i];
                i++;
                k++;
            }
        }
        System.out.print(Arrays.toString(c));
    }
}
