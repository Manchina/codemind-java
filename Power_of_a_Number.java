import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int m = sc.nextInt();
        
        
        
        System.out.print((int)(Math.pow(x,y))%m);
    }
}