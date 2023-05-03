import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean v = true;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                if(v){
                   System.out.print("V");
                   v = false;
                }
            }else{
                if(i==0){
                    v = false;
                }
                if(!v){
                    System.out.print("C");
                    v = true;
                }
            }
        }
    }
}