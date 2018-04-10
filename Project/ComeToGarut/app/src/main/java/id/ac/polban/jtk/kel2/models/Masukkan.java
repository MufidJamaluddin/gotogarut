package id.ac.polban.jtk.kel2.models;

public class Masukkan
{
    private int id_tempat;
    private int id_masukkan;
    private String nama_pengguna;
    private String email_pengguna;
    private String deskripsi_pengguna;
    private String deskripsi_masukkan;

    public int getId_tempat() {
        return id_tempat;
    }

    public void setId_tempat(int id_tempat) {
        this.id_tempat = id_tempat;
    }

    public int getId_masukkan() {
        return id_masukkan;
    }

    public void setId_masukkan(int id_masukkan) {
        this.id_masukkan = id_masukkan;
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

    public String getDeskripsi_masukkan() {
        return deskripsi_masukkan;
    }

    public void setDeskripsi_masukkan(String deskripsi_masukkan) {
        this.deskripsi_masukkan = deskripsi_masukkan;
    }
}
