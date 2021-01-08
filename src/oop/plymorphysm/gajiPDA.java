package oop.plymorphysm;

public class gajiPDA {
    //programer
    public void Hitung(int gTetap, int komisi){
        System.out.println("Gaji Programer adalah: " + (gTetap+komisi));
    }

    //designer
    public void Hitung(int gTetap, int komisi, int transportasi){
        System.out.println("Gaji Designer adalah: " + (gTetap + komisi + transportasi));
    }

    //akuntan
    public void Hitung(int gTetap, int komisi, int transportasi, int tKeluarga) {
        System.out.println("Gaji Akuntan adalah: " + (gTetap + komisi + transportasi + tKeluarga));
    }

    public static void main(String[] args) {
        gajiPDA gaji = new gajiPDA();

        int tetap = 2_000_000;
        int komisi = 300_000;
        int transport = 50_000;
        int keluarga = 400_000;

        gaji.Hitung(tetap, komisi);
        gaji.Hitung(tetap, komisi, transport);
        gaji.Hitung(tetap, komisi, transport, keluarga);
    }
}
