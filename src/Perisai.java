/*
    Perisai berfungsi untuk mengurangi efektifitas serangan lawan.
    Skor kesehatan akan lebih kecil berkurang jika diserang lawan.

 */
//nomor 5
public class Perisai extends Senjata {
    //construct
    public Perisai() {
        skorKekuatan = 20;          //besar kekuatan perisai adalah 20, sehingga bila robotAktif menyerang menggunakan SenjataPukulan dan robotPasif menggunakan Perisai, maka kesehatan hanya berkurang 5
                                    //jika robotAktif menyerang menggunakan SenjataKilat dan robotPasif menggunakan Perisai, maka kesehatan hanya berkurang 20
    }
}
