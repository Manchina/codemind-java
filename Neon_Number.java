import java.util.*;
class Neon{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = n*n;
        int sum = 0;
        while(p!=0){
            int rem = p % 10;
            sum += rem;
            p /= 10;
        }

        if(sum == n){
            System.out.print("Neon Number");
        }else{
            System.out.print("Not Neon Number");
        }
    }
}