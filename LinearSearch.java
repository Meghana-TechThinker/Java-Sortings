import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int arr[]={23,54,1,46,87,93};
        int n=arr.length;
        int t=obj.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if (arr[i]==t){
                flag=true;
            }
        }
        if(flag==true){
            System.out.println("found");
        }
        else{
            System.out.println("no");
        }
    }
    
}
