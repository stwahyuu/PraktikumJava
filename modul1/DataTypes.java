import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
 public static void main (String[] args){

 String namaDepan = "Septian";
 String namaTengah = "Tri";
 String namaBelakang = "Wahyudin";
 int usia = 19;
 int targetTahunKuliah = 4;
 double ipk = 3.9;
 char nilaiAbjad = 'A';
 boolean tampan = true;

 Scanner inputan = new Scanner(System.in);  

 System.out.println("============ Fase Input ============");
 System.out.print("Input nama depan : ");
 namaDepan   =   inputan.nextLine();
 System.out.print("Input usia : ");  
 usia   =   inputan.nextInt();  
 System.out.print("Input ipk : ");
 ipk   =   inputan.nextDouble();  
 System.out.print("Input nilaiAbjad : ");
 nilaiAbjad   =   inputan.next().charAt(0);
 System.out.print("Input tampan : ");  
 tampan   =   inputan.nextBoolean(); 

 
 System.out.println("============ Fase Output ============");
 System.out.println("Nama depan : " + namaDepan);
 System.out.println("Nama tengah : " + namaTengah);
 System.out.println("Nama belakang : " + namaBelakang);
 System.out.println("Usia : " + usia);
 System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
 System.out.println("IPK : " + ipk);
 System.out.println("Nilai PBO : " + nilaiAbjad);
 System.out.println("Tampan : " + tampan);
 JOptionPane.showMessageDialog(null,"Hai, " + namaDepan + namaTengah + namaBelakang);
 }
}