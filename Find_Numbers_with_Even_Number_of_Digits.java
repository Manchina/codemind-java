import java.util.*;
class Solotion{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(check(arr[i])){
                count++;
            }
        }
        System.out.printf("%d",count);
    }
    public static boolean check(int n){
        int c=0;
        while(n != 0){
            n /= 10;
            c++;
        }
        if(c % 2 == 0){
            return true;
        }
        return false;
    }
    
}