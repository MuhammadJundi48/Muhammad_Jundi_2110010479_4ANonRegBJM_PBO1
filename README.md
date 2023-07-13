# Muhammad_Jundi_2110010479_4ANonRegBJM_PBO1

# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan kode mobil dan memberikan output berupa informasi detail dari kode tersebut seperti tahun produksi dan negara produksi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mobil`, `MobilDetail`, dan `MobilBeraksi` adalah contoh dari class.

```bash
public class Mobil {
    ...
}

public class MobilDetail extends Mobil {
    ...
}

public class MobilBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `mbl[i] = new MobilDetail(nama1, kode1);` adalah contoh pembuatan object.

```bash
mbl[i] = new MobilDetail(nama1, kode1);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `kode` adalah contoh atribut.

```bash
private String nama;
private String kode;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mobil`.

```bash
public Mobil(String nama, String kode) {
        this.nama = nama;
        this.kode = kode;
    }

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setKode` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getkode`, `getTahunProduksi`, dan `getNegaraProduksi` adalah contoh method accessor.

```bash
 public String getNama() {
        return nama;
    }
    public String getKode() {
        return kode;
    }
    
    public String displayInfo(){
        return "Nama: "+getNama()+"\nKode: "+getKode();
    }

public int getTahunProduksi(){
        return Integer.parseInt(getKode().substring(0, 2)) + 2000;
    }
    
    public String getNegaraProduksi(){
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `kode` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
    private String kode;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MobilDetail` mewarisi `Mobil` dengan sintaks `extends`.

```bash
public class MobilDetail extends Mobil {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String warna)` di `Mobil` merupakan overloading method `displayInfo` dan `displayInfo` di `MobilDetail` merupakan override dari method `displayInfo` di `Mobil`.

```bash
public String displayInfo(String warna){
        return displayInfo() + "\nWarna: "+warna;
    }

public MobilDetail(String nama, String kode) {
        super(nama, kode);
    }

@Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nTahun Produksi: "+getTahunProduksi()+
                "\nNegara Produksi: "+getNegaraProduksi();
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getNegaraProduksi`.

```bash
if(kodeNegaraProduksi.equals("1")){
            return "Jepang";
        } else {
            return "Negara lain";
        }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<mbl.length; i++){
        System.out.print("Masukkan nama mobil "+(i+1)+": ");
        String nama1 = scanner.nextLine();
        System.out.print("Masukkan kode mobil "+(i+1)+": ");
        String kode1 = scanner.nextLine();

for(MobilDetail data: mbl){
        System.out.println("===================");
        System.out.println("Data Mobil: ");
        System.out.println(data.displayInfo());
        }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MobilDetail[] mbl = new MobilDetail[2];` adalah contoh penggunaan array.

```bash
MobilDetail[] mbl = new MobilDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try{
    } catch (Exception e) {
    System.out.println("Kesalahan umum: "+e.getMessage());
    }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Jundi
NPM: 2110010479
