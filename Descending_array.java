import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int f = 0;
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(i==0){
                continue;
            }
            if(arr[i]>arr[i-1]){
                f++;
                break;
            }
        }
        
        if(f!=0){
            System.out.print("no");
        }
        else{
            System.out.print("yes");
        }
    }
}