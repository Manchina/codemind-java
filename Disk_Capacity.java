import java.util.Scanner;
class Capacity{
    public static void main(String args[]){
        int t,s,b;
        long capacity;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        s = sc.nextInt();
        b = sc.nextInt();
        capacity = 2*t*s*b*512;
        System.out.printf("%d",capacity);
        sc.close();
    }
}