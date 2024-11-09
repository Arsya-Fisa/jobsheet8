import java.util.Scanner;

public class politeknik{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Jumlah Politeknik yang mendaftar: ");
       int jumlahPoliteknik = sc.nextInt();
        sc.nextLine();
      
        for(int i=1; i<=jumlahPoliteknik; i++ ){
            System.out.print("\nData politeknik yang ke-"+ i + ":");
        System.out.println();
        for(int j = 1; j<=4; j++){
            System.out.print("\nCabang olahrga ");
            if (j==1) {
                System.out.println("badminton");
            }else if (j==2) {
                System.out.println("Tenis meja");
            }else if (j==3) {
                System.out.println("Basket");
            }else if (j==4) {
                System.out.println("Voli");
            }
            for (int k=1;k<=5; k++){
            System.out.print("Masukan nama atlet ke-" + k+ ":");
            String namaAtlet = sc.nextLine();
            System.out.println("Atlet ke " + k + " politeknik ke " + i +": " + namaAtlet);
                
        }
        }
        }
    System.out.println();
    }
}
