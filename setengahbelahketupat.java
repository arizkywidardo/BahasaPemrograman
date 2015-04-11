import java.util.Scanner;

public class setengahbelahketupat {

public static void main(String[]args){
        int atas ;
      
        int n ;
           Scanner input = new Scanner (System.in);
        System.out.println("Lebar Kesamping:");
        atas = input.nextInt();
        System.out.println("Panjang Ke Bawah :");
        n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=n;k>i;k--){
                System.out.print("*");
            }
            for(int j=1;j<=atas;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
		
        for(int i=(n-1);i>=1;i--){
            for(int k=i;k<=(n-1);k++){
                System.out.print("*");
            }
            for(int j=atas;j>=1;j--){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

}
