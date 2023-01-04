import java.util.Scanner;
class Akarley{
    public static void main(String args[]){
        Scanner bokka = new Scanner(System.in);
        int n = bokka.nextInt();
        if(n%2==0){
            System.out.print("Even");
        }else{
            System.out.print("Odd");
        }
    }
}