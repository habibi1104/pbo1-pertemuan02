import koneksi.Database;
import Model.Dosen;
import Model.Mahasiswa;

public class Main{
 public static void main (String [] args){
  System.out.println("Ini program main");
  Database.hubungkan();
  Dosen.tampilanInfo();
  Mahasiswa.tampilanInfo();
  }
 }