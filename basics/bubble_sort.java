import java.util.Scanner;
public class bubble_sort{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input:");
        int num = scan.nextInt();
        int[] data = new int[num];
        for(int i=0;i<num;i++){
            data[i]=scan.nextInt();
        }
        for(int i=0;i<num-1;i++){
            for(int j=0;j<num-i-1;j++){
                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1]=temp;
                }
            }
        }
        for(int i:data){
            System.out.print(i+" ");
        }
        scan.close();
    }
}