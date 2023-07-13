package pbo1uas;

//inheritance
public class MobilDetail extends Mobil {
    
    //polymorhism (overriding)
    public MobilDetail(String nama, String kode) {
        super(nama, kode);
    }
    
    public int getTahunProduksi(){
        return Integer.parseInt(getKode().substring(0, 2)) + 2000;
    }
    
    public String getNegaraProduksi(){
        String kodeNegaraProduksi = getKode().substring(2, 3);
        //seleksi if
        if(kodeNegaraProduksi.equals("1")){
            return "Jepang";
        } else {
            return "Negara lain";
        }
    }
    
    //polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nTahun Produksi: "+getTahunProduksi()+
                "\nNegara Produksi: "+getNegaraProduksi();
    }
    
}
