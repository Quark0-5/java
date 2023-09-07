//import java.util.Scanner;
import java.lang.Math;
public class prime_less{
    public static void main(String[] args){
        int x=1;
        int count=1;
        while(check(x, count)){
            count++;
            if(count==10){
                x++;
                count=1;
            }
        }
        double result = Math.pow(10.0, (double) x);
        int output = (int)result*count + 9;
        System.out.print((int) result*count + " to "+ output) ;
    }
    public static boolean check(int x, int y){
        int[] data = {1, 3, 7, 9};
        double p = Math.pow(10.0, (double) x);
        int prime = (int) p;
        prime*=y;
        for(int i=0;i<4;i++){
            int new_prime = prime;
            new_prime+=data[i];
            if(prime_num(new_prime)){
                return true;
            }
        }
        return false;
    }
    public static boolean prime_num(int x){
        if(x%2==0){
            return false;
        }else{
            int limit = (int) Math.sqrt(x);
            for(int i=3;i<=limit;i+=2){
                if(x%i==0){
                    return false;
                }
            }
            return true;
        }
    }

}