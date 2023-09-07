import java.util.Scanner;
import java.lang.Math;
public class prime{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int check = scan.nextInt();
        if(prime_check(check)){
            System.out.println("prime!");
        }else{
            System.out.println("Not a prime!");
        }
        scan.close();
    }
    public static boolean prime_check(int check){
        if((check&1)==0){
            return false;
        }else{
            int limit = (int) Math.sqrt(check);
            for(int i=3;i<=limit;i++){
                if(check%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}