import java.util.Scanner;

class PrimesInTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++){
            if(check(array[i]) == true){
                count++;
            }
        }

        System.out.println(count);

    }

    public static boolean check(int num){
        int c = 0;
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                c++;
            }
        }
        if(c == 2){
            return true;
        }else {
            return false;
        }
    }
}
