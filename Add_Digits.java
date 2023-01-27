import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%d",sumup(n));
    }
    public static int sumup(int n){
        if(n==0)
        { 
            return 0;
        }
        else if(n%9==0)
        { 
            return 9;
        }
        else
        {
            return n%9;
        }
    }
}