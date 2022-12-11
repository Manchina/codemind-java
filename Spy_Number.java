import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pro = 1;
        int sum = 0;
        
        while(n!=0){
            int rem = n % 10;
            pro *= rem;
            sum += rem;
            n = n/10;
        }
        
        if(pro == sum){
            System.out.print("Spy Number");
        }else{
            System.out.print("Not Spy Number");
        }
    }
}