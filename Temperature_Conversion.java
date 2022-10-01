import java.util.Scanner;
class Conversion{
    public static void main(String args[]){
        float c;
        float f;
        Scanner sc = new Scanner(System.in);
        c = sc.nextFl();
        f = (c * 9 / 5) + 32;
        System.out.printf("%.2f",f);
        sc.close();
    }
}