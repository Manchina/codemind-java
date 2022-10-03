import java.util.Scanner;
class Area{
    public static void main(String args[]){
        double s,area,a,b,c;
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        s = (a+b+c) / 2;
        area = Math.sqrt(s * (s -a) * (s - b) * (s - c));
        System.out.printf("%.2f",area);
        sc.close();
    }
}