package model;

public class DeepCleaning extends Layanan {

    public DeepCleaning() {
        super("Deep Cleaning", 100000);
    }

    @Override
    public int hitungHarga(int durasi) {
        return super.hitungHarga(durasi) + 50000;
    }
}