import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int li=0;
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2!=0){
                li = i;
            }
        }
        
        System.out.printf("%d",li);
    }
}