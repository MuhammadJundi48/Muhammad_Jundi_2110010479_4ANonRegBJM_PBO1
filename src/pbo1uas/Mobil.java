package pbo1uas;

//class
public class Mobil {
    //atribut & encapsulation
    private String nama;
    private String kode;
    
    //constructor
    public Mobil(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
    }
    
    //mutator
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    //accessor
    public String getNama() {
        return nama;
    }
    public String getKode() {
        return kode;
    }
    
    public String displayInfo(){
        return "Nama: "+getNama()+"\nKode: "+getKode();
    }
    
    //polymorphism (overloading)
    public String displayInfo(String warna){
        return displayInfo() + "\nWarna: "+warna;
    }
    
}
