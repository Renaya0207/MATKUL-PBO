package model;

public class Layanan {
    protected String namaLayanan;
    protected int harga;

    public Layanan(String namaLayanan, int harga) {
        this.namaLayanan = namaLayanan;
        this.harga = harga;
    }

    public int hitungHarga(int durasi) {
        return harga * durasi;
    }

    public String getNamaLayanan() {
        return namaLayanan;
    }
}