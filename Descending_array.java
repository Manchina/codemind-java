import java.util.Scanner;

class Descending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag = true;
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for(int i=1; i<n;i++){
                if(arr[i] > arr[i-1]){
                    flag = false;
                    break;
                }
        }
       if(flag == true){
           System.out.println("yes");
       }else{
           System.out.println("no");
       }

    }
}
