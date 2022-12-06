import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        int avg;
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        avg = sum/n;
        int count=0;
        
        for(int i=0; i<n; i++){
            if(arr[i]>=avg){
                count++;
            }
        }
        
        System.out.printf("%d",count);
    }
}