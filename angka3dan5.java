import java.util.Scanner;

public class angka3dan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       System.out.print("Masukan nilai N: ");
       int N = sc.nextInt();
        if (N<3) {
            System.out.print("Nilai Salah minimal 3");
        }else{
       for(int i=1; i<=N; i++){
        for(int j=1; j<=N; j++){
            if (i==1 || i==N || j==1 || j==N){
                System.out.print(N+ " ");
            }else{
                System.out.print("  ");
            }          
            }
           System.out.println();
            }
        }   
    }
}