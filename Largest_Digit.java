import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        
        while(n!=0){
            int rem = n%10;
            if(rem>max){
                max = rem;
            }
            n /= 10;
        }
        
        System.out.printf("%d",max);
    }
}