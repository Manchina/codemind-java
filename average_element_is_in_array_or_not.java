import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        int avg = sum/n;
        int flag=0;
        
        for(int i=0; i<n; i++){
            if(arr[i]==avg){
                flag++;
                break;
            }
        }
        
        if(flag!=0){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}