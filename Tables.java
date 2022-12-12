import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mul = 0;
        
        for(int i=1; i<=m; i+=2){
        
            mul = n * i;
            System.out.println(n + " x " + i + " = " + mul);
        }
    }
}