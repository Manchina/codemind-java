import java.util.Scanner;

class CountingPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int c = 0;

        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++){
            if(check(array[i]) == true){
                c++;
            }
        }

        System.out.println(c);


    }
    public static boolean check(int num){
        int temp = num;
        int rem;
        int rev = 0;
        while(temp != 0){
            rev = rev * 10;
            rev = rev + temp % 10;
            temp = temp / 10;
        }
        if(num == rev){
            return true;
        }
        return false;
    }
}
