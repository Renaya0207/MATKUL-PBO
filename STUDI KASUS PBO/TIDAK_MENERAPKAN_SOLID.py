# =====================================================
# PROGRAM PYTHON TIDAK MENERAPKAN SOLID
# Studi Kasus : Sistem Pemesanan Makanan Online
# =====================================================


# =====================================================
# CLASS PEMESANAN
# =====================================================
class Pemesanan:

    def checkout(self, metode_pembayaran,
                 food_name, amount):


        # Proses pembayaran
        if metode_pembayaran == "ewallet":

            print(f"Pembayaran Rp {amount} menggunakan E-Wallet")


        elif metode_pembayaran == "qris":

            print(f"Pembayaran Rp {amount} menggunakan QRIS")


        elif metode_pembayaran == "transfer":

            print(f"Pembayaran Rp {amount} menggunakan Transfer Bank")


        # Cetak struk
        print("\n===== STRUK PEMBAYARAN =====")
        print(f"Menu        : {food_name}")
        print(f"Total Bayar : Rp {amount}")
        print("============================")


        # Kirim notifikasi
        print("Notifikasi pesanan berhasil dikirim")


        # Simpan data
        print("Data pesanan berhasil disimpan")


# =====================================================
# MAIN PROGRAM
# =====================================================

# Membuat objek pemesanan
order = Pemesanan()

# Menjalankan checkout
order.checkout("qris", "Mie Ayam", 15000)