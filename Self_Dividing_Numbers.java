import java.util.*;
class SelfDividing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=a; i<=b; i++){
            int n = i;
            int num = i;
            int l=0;
            int c=0;
            while(n!=0){
                l++;
                n/=10;
            }
            int temp = num;
            while(temp!=0){
                int rem = temp%10;
                if(rem==0){
                    break;
                }
                if(num%rem==0){
                    c++;
                }
                temp /= 10;
            }
            if(c==l){
                System.out.printf("%d ",i);
            }
        }
    }
}