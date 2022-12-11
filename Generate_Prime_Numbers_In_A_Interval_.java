import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int i=a; i<b; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
    
    public static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        int c = 0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                c++;
            }
        }
        
        if(c<2){
            return true;
        }
        
        return false;
    }
}