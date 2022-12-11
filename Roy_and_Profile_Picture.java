import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        int w;
        int h;
        
        for(int i=0; i<n; i++){
            w = sc.nextInt();
            h = sc.nextInt();
            if(w<l || h<l){
                System.out.print("UPLOAD ANOTHER
");
            }else if(w>=l && h>=l){
                if(w==h){
                    System.out.print("ACCEPTED
");
                }else{
                    System.out.print("CROP IT
");
                }
            }else{
                System.out.print("UPLOAD ANOTHER");
            }
        }
        
    }
}