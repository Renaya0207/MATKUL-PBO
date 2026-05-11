## Studi Kasus: Sistem Pemesanan Makanan Online

# Tujuan Pembelajaran

* Menjelaskan lima prinsip SOLID dan pentingnya dalam desain OOP
* Menerapkan Single Responsibility Principle untuk memisahkan tanggung jawab class
* Menerapkan Open/Closed Principle menggunakan inheritance dan abstraction
* Memahami Liskov Substitution Principle pada class turunan
* Menerapkan Interface Segregation Principle dengan interface sederhana
* Menerapkan Dependency Inversion Principle menggunakan dependency injection
* Mengenali code yang melanggar SOLID dan melakukan refactor
* Membandingkan program SOLID dan non-SOLID pada studi kasus pemesanan makanan online

# Ringkasan 

| Topik                           | Deskripsi                                              |
| ------------------------------- | ------------------------------------------------------ |
| Single Responsibility Principle | Setiap class hanya memiliki satu tanggung jawab        |
| Open/Closed Principle           | Program dapat dikembangkan tanpa mengubah kode lama    |
| Liskov Substitution Principle   | Subclass dapat menggantikan parent class tanpa error   |
| Interface Segregation Principle | Interface dibuat kecil dan spesifik                    |
| Dependency Inversion Principle  | Bergantung pada abstraksi, bukan implementasi langsung |
| Anti-Pattern Recognition        | Mengenali dan memperbaiki code yang tidak SOLID        |


# File Kode 

| File           | Topik                                                           |
| -------------- | --------------------------------------------------------------- |
| `solid.py`     | Implementasi sistem pemesanan makanan menggunakan prinsip SOLID |
| `non_solid.py` | Contoh sistem yang tidak menerapkan prinsip SOLID               |
| `README.md`    | Penjelasan materi, prinsip SOLID, dan dokumentasi program       |


# Penjelasan Prinsip SOLID pada Program

## 1. Single Responsibility Principle (SRP)

Satu class hanya memiliki satu tanggung jawab.

Contoh:

* `ReceiptPrinter` hanya mencetak struk
* `NotificationService` hanya mengirim notifikasi
* `OrderService` hanya mengatur proses checkout

Manfaat:

* Mudah diperbaiki
* Mudah diuji
* Mudah digunakan kembali



## 2. Open/Closed Principle (OCP)

Class terbuka untuk pengembangan tetapi tertutup untuk modifikasi.

Contoh:
Jika ingin menambahkan metode pembayaran baru seperti `COD`, cukup membuat class baru tanpa mengubah `OrderService`.

```python id="h35bzz"
class COD(PaymentMethod):

    def pay(self, amount):
        print(f"Pembayaran Rp {amount} menggunakan COD")
```


## 3. Liskov Substitution Principle (LSP)

Subclass harus dapat menggantikan parent class tanpa merusak program.

Contoh:

* `EWallet`
* `QRIS`
* `BankTransfer`

Semua dapat digunakan sebagai `PaymentMethod`.



## 4. Interface Segregation Principle (ISP)

Interface dibuat sederhana dan spesifik.

Contoh:
`PaymentMethod` hanya memiliki method:

```python id="uqtkj4"
def pay(self, amount):
```

Tidak ada method yang tidak diperlukan.



## 5. Dependency Inversion Principle (DIP)

Class tingkat tinggi tidak bergantung pada class konkret.

Contoh:
`OrderService` menerima objek `PaymentMethod`.

```python id="b8d3jv"
class OrderService:

    def __init__(self, payment_method):
        self.payment_method = payment_method
```



# Perbandingan Program SOLID dan Non-SOLID

| Aspek         | Program SOLID        | Program Non-SOLID      |
| ------------- | -------------------- | ---------------------- |
| Struktur      | Terpisah dan modular | Semua dalam satu class |
| Pengembangan  | Mudah ditambah fitur | Sulit dikembangkan     |
| Maintenance   | Mudah dirawat        | Sulit diperbaiki       |
| Reusability   | Tinggi               | Rendah                 |
| Fleksibilitas | Tinggi               | Rendah                 |



# Contoh Output

```text id="z4x5ki"
Pembayaran Rp 15000 menggunakan QRIS

===== STRUK PEMBAYARAN =====
Menu        : Mie Ayam
Total Bayar : Rp 15000
============================

Notifikasi pesanan berhasil dikirim
```


# Anggota Kelompok

| NIM        | Nama               |
| ---------- | ------------------ |
| 2409106002 | Renaya Putri Alika |
| 2409106007 | Dewi Astuti        |
| 2409106021 | Rusdiana           |
| 2409106022 | Ayu Azzahra Alwi   |
| 2409106024 | Angelina Agustin   |



# Kesimpulan

Penerapan prinsip SOLID membuat program menjadi lebih:

* Terstruktur
* Fleksibel
* Mudah dikembangkan
* Mudah dipelihara

Sedangkan program yang tidak menerapkan SOLID cenderung memiliki banyak tanggung jawab dalam satu class sehingga sulit dikembangkan dan dirawat ketika sistem semakin besar.
