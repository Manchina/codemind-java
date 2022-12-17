import java.util.Scanner;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0;
        int even = 0;
        while(n!=0){
            int rem = n%10;
            if(rem%2==0){
                even++;
            }else{
                odd++;
            }
            
            n /= 10;
        }
        if(odd==0 && even>0){
            System.out.print("Even");
        }else if(odd>0 && even==0){
            System.out.print("Odd");
        }else{
            System.out.print("Mixed");
        }
    }
}