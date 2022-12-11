import java.util.*;
class StrongNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        
        while(temp!=0){
            int rem = temp % 10;
            sum += fact(rem);
            temp /= 10;
        }

        if(sum == n){
            System.out.println("The number " + n + " is a strong number");
        }else{
            System.out.println("The number " + n + " is not a strong number");
        }
    }

    public static int fact(int num){
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact *= i;
        }

        return fact;
    }
}