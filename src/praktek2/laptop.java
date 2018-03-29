package praktek2;

public class laptop {
    Integer jumlahbarang;
    Integer harga;

    public laptop() {
        jumlahbarang=10;
        harga=9000000;
    }

    public laptop(Integer jumlahbarang, Integer harga) {
        this.jumlahbarang = jumlahbarang;
        this.harga = harga;
    }
    
    void cetakInfo (){
        System.out.println("============================");
        System.out.println("jumlahbarang" +jumlahbarang);
        System.out.println("harga" +harga);
        System.out.println("============================");
    }    
     Integer liat(){
        Integer totalbayar;
        totalbayar = jumlahbarang*harga;
        return totalbayar;    
    }
     void cetak(){
        System.out.println("Harga barang: "+liat());
     }
}
