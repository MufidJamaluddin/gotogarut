package id.ac.polban.jtk.kel2.models;

import java.net.URI;

public class TempatWisata
{
    private Integer id_tempat;
    private String nama_tempat;
    private String alamat;
    private String deskripsi;
    private URI url_photo;

    public Integer getId_tempat()
    {
        return id_tempat;
    }

    public void setId_tempat(Integer id_tempat)
    {
        this.id_tempat = id_tempat;
    }

    public String getNama_tempat()
    {
        return nama_tempat;
    }

    public void setNama_tempat(String nama_tempat) {
        this.nama_tempat = nama_tempat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public URI getUrl_photo() {
        return url_photo;
    }

    public void setUrl_photo(URI url_photo) {
        this.url_photo = url_photo;
    }
}
