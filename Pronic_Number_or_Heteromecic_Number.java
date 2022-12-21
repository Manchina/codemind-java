import java.util.Scanner;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        for(int i=1; i<n; i++){
            if(i*(i+1)==n){
                f++;
                break;
            }
        }
        if(f==0){
            System.out.print("NO");
        }else{
            System.out.print("YES");
        }
    }
}