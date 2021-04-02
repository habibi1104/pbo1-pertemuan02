import java.util.Scanner;

public class InputOutput{
 public static void main (String [] args){
 Scanner scanner = new Scanner(System.in);
 String nama;
 int Jumlahsks;
 double IPK;
 double jumlah;
 
 System.out.print("Masukkan nama anda: ");
 nama = scanner.nextLine();
 System.out.println("Hai, "+nama);
 
 System.out.print("Masukkan Jumlah SKS yang sudah di tempuh: ");
 Jumlahsks = scanner.nextInt();
 
 System.out.print("Masukkan IPK Sementara: ");
 IPK = scanner.nextDouble();
 
 jumlah = IPK * Jumlahsks;
 System.out.print("Total Nilai = "+jumlah);
 
 }
}