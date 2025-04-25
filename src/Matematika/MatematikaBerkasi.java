package Matematika;

public class MatematikaBerkasi {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        
        // Pertambahan
        int hasilTambah = mtk.pertambahan(20, 20);
        System.out.println("Pertambahan: 20 + 20 = " + hasilTambah);
        
        // Pengurangan
        int hasilKurang = mtk.pengurangan(10, 5);
        System.out.println("Pengurangan: 10-5 = " + hasilKurang);
        
        // Perkalian
        int hasilKali = mtk.perkalian(10, 20);
        System.out.println("Perkalian: 10*20 = " + hasilKali);
        
        // Pembagian
        int hasilBagi = mtk.pembagian(21, 2);
        System.out.println("Pembagian: 21/2 = " + hasilBagi);
    }
}
