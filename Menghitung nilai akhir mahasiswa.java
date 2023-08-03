// Menghitung nilai akhir mahasiswa



import java.util.Scanner;
public class TugasM2{
    static void akhir (double tugas, double uts, double uas){
        double nilai;
        nilai=tugas*0.30;
        double nilaiuts;
        nilaiuts=uts*0.30;
        double nilaiuas;
        nilaiuas=uas*0.40;
        double nilaiakhir;
        nilaiakhir=nilai+nilaiuts+nilaiuas;
        System.out.print("Nilai Akhir Mahasiswa : "+nilaiakhir);
    }

    public static void main(String[] args) {
        String nama,prodi,fakultas;
        double tugas,uts,uas;
        Scanner input=new Scanner(System.in);
        System.out.println("==========INPUT DATA==========");
        System.out.println("Nama : ");
        nama=input.nextLine();
        System.out.println("Prodi : ");
        prodi=input.nextLine();
        System.out.println("Fakultas : ");
        fakultas=input.nextLine();
        System.out.println("Nilai Prak/Tugas : ");
        tugas=input.nextDouble();
        System.out.println("Nilai UTS : ");
        uts=input.nextDouble();
        System.out.println("Nilai UAS : ");
        uas=input.nextDouble();

        System.out.println("==========CETAK DATa==========");
        System.out.println("Nama : "+nama);
        System.out.println("Prodi : "+prodi);
        System.out.println("Fakultas : "+fakultas);
        System.out.println("Nilai Prak/Tugas : "+tugas);
        System.out.println("Nilai UTS : "+uts);
        System.out.println("Nilai UAS : "+uas);

        System.out.println("==========NILAI AKHIR==========");
        TugasM2.akhir(tugas,uts,uas);
    }
}