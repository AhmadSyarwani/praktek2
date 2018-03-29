package praktek2;

public class laptop {
    Integer jumlahbarang;
    Integer harga;
    
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
}
