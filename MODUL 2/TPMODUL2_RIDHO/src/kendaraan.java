class Kendaraan {
    private String nomorIdentifikasi;
    private double kecepatanMaksimum;
    private int kapasitasPenumpang;

    public Kendaraan(String nomorIdentifikasi, double kecepatanMaksimum, int kapasitasPenumpang) {
        this.nomorIdentifikasi = nomorIdentifikasi;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String toString() {
        return "\n Nomor Identifikasi: " + nomorIdentifikasi +
               ",\n Kecepatan Maksimum: " + kecepatanMaksimum +
               ",\n Kapasitas Penumpang: " + kapasitasPenumpang;
    }

    public double hitungWaktuTempuh(double jarak) {
        // Contoh perhitungan waktu tempuh
        return jarak / kecepatanMaksimum;
    }
}