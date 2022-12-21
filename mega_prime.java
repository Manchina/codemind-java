import java.util.Scanner;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int t = n;
        int l=0;
        while(t!=0){
            t /= 10;
            l++;
        }
        if(isPrime(n)){
            while(n!=0){
                int rem = n%10;
                if(isPrime(rem)){
                    count++;
                }
                n /= 10;
            }
        }
        if(l==count){
            System.out.print("Mega Prime");
        }else{
            System.out.print("Not Mega Prime");
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