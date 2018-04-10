package id.ac.polban.jtk.kel2.models;

public class Review
{
    private int id_tempat;
    private int id_review;
    private String nama_pengguna;
    private String email_pengguna;
    private String deskripsi_pengguna;
    private int rate_kebersihan;
    private int rate_ketertiban;
    private int rate_keamanan;
    private int rate_fasilitas;

    public int getId_tempat() {
        return id_tempat;
    }

    public void setId_tempat(int id_tempat) {
        this.id_tempat = id_tempat;
    }

    public int getId_review() {
        return id_review;
    }

    public void setId_review(int id_review) {
        this.id_review = id_review;
    }

    public String getNama_pengguna() {
        return nama_pengguna;
    }

    public void setNama_pengguna(String nama_pengguna) {
        this.nama_pengguna = nama_pengguna;
    }

    public String getEmail_pengguna() {
        return email_pengguna;
    }

    public void setEmail_pengguna(String email_pengguna) {
        this.email_pengguna = email_pengguna;
    }

    public String getDeskripsi_pengguna() {
        return deskripsi_pengguna;
    }

    public void setDeskripsi_pengguna(String deskripsi_pengguna) {
        this.deskripsi_pengguna = deskripsi_pengguna;
    }

    public int getRate_kebersihan() {
        return rate_kebersihan;
    }

    public void setRate_kebersihan(int rate_kebersihan) {
        this.rate_kebersihan = rate_kebersihan;
    }

    public int getRate_ketertiban() {
        return rate_ketertiban;
    }

    public void setRate_ketertiban(int rate_ketertiban) {
        this.rate_ketertiban = rate_ketertiban;
    }

    public int getRate_keamanan() {
        return rate_keamanan;
    }

    public void setRate_keamanan(int rate_keamanan) {
        this.rate_keamanan = rate_keamanan;
    }

    public int getRate_fasilitas() {
        return rate_fasilitas;
    }

    public void setRate_fasilitas(int rate_fasilitas) {
        this.rate_fasilitas = rate_fasilitas;
    }
}
