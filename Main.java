import koneksi.Database;
import Model.Dosen;
import Model.Biodata;
import Model.Matakuliah;

public class Main{
 public static void main (String [] args){
  System.out.println("Ini program main");
  Database.hubungkan();
  Dosen.tampilanInfo();
  Biodata.tampilanInfo();
  Matakuliah.tampilanInfo();
  }
 }