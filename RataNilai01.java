import java.util.Scanner;
public class RataNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j;
        float totalNilai,rataNilai,nilaiMhs;
            i=1;
            while (i<=5) {
            System.out.print("Masukan nilai mahasiswa ke: " + i );
             
            System.out.println();
            totalNilai=0;
            
            for(j=1; j<=5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs= sc.nextInt();
                totalNilai+=nilaiMhs;
            }
        
            rataNilai=totalNilai/5;
            System.out.println("Total Nilai dari Siswa ke " +  i + " adalah : " + rataNilai);
            i++;
            }
            
        }
    
}
