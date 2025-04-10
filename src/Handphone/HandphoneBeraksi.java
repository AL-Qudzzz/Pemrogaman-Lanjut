package Handphone;

public class HandphoneBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class Handphone
        Handphone hp = new Handphone();

        // Memanggil method-method dari class Handphone
        hp.hidupkan();
        hp.lakukanPanggilan();
        hp.kirimSMS();
        hp.matikan();
    }
}