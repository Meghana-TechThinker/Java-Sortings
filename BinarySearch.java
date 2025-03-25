import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[]={23,54,1,46,34,87,93};
        int n =arr.length;
        int t=obj.nextInt();
        Arrays.sort(arr);
        //int m=(arr[0]+arr[n-1])/2;
        int l=0,h=arr.length-1;
        boolean flag=false;
        while(l<h){
            int m=(l+h)/2;
            if(arr[m]==t){
                //System.out.println("found");
                flag=true;
                break;
            }
            else if(arr[m]<t) {
                l=m+1;

            }
             else if(arr[m]>t){
                h=m-1;
            }
            /*else{
                System.out.println("Not found");
            }*/

        }
        System.out.print((flag)?"Found":"Not found");
        
    }
}
