import java.util.Scanner;
public class Star01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai N = ");
        int N  = sc.nextInt();

        for(int i=0; i<=N; i++){
            System.out.print("*");
            }
    }
}