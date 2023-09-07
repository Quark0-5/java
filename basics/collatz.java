import java.util.Scanner;
import java.lang.Math;
public class collatz{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input:");
        int x = scan.nextInt();
        System.out.print("Output:");
        compute(x);
        scan.close();
    }
    public static void compute(int x){
        while(x!=1){
            if(even(x)){
                x/=2;
            }else{
                if(prime(x)){
                    System.out.print(x+" ");
                }
                x=3*x+1;
            }
        }
        //System.out.println(1);
    }
    public static boolean even(int x){
        return (x&1)==0;
    }
    public static boolean prime(int p){
        int x=(int) Math.sqrt(p);
        for(int i=2;i<=x;i+=2)
        {
            if(p%i==0){
                return false;
            }
        }
        return true;
    }
}

