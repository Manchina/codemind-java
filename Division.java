import java.util.Scanner;
class Divison{
    public static void main(String args[]){
        double a,b;
        int c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c =(int) (a / b);
        System.out.printf("%d",c);
        sc.close();
        
        
    }
}