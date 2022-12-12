import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int hurlFactor = sc.nextInt();
        int spinFactor = sc.nextInt();
        int speedFactor = sc.nextInt();
        
        if(hurlFactor>50 && spinFactor>60 && speedFactor>100){
            System.out.print("10");
        }else if(hurlFactor>50 && spinFactor>60){
            System.out.print("9");
        }else if(spinFactor>60 && speedFactor>100){
            System.out.print("8");
        }else if(hurlFactor>50 && speedFactor>100){
            System.out.print("7");
        }else if(hurlFactor>50 || spinFactor>60 || speedFactor>100){
            System.out.print("6");
        }else{
            System.out.print("5");
        }
    }
}