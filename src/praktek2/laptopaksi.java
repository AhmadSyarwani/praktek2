package praktek2;

public class laptopaksi {
    public static void main(String[] args) {

        laptop adil =new laptop();
        adil.jumlahbarang = 9;
        adil.harga = 3000000;
        
        adil.cetakInfo();
        System.out.println("totalpembayaran = "+adil.liat());
        adil.cetak();
        
        laptop udin=new laptop();
        udin.cetakInfo();
        
        laptop didin = new laptop(5,7000000);
        didin.cetakInfo();
    }
}
