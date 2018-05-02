package id.ac.polban.jtk.kel2.models;

import java.net.URI;

public class DetailTempatWisata
{
    private Integer id_tempat;
    private String nama_tempat;
    private String alamat;
    private String harga;
    private String jam_kunjungan;
    private String deskripsi;
    private String kontak;
    private String fasilitas;
    private String latitude;
    private String longitude;
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

    public void setNama_tempat(String nama_tempat)
    {
        this.nama_tempat = nama_tempat;
    }

    public String getAlamat()
    {
        return alamat;
    }

    public void setAlamat(String alamat)
    {
        this.alamat = alamat;
    }

    public String getHarga()
    {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJam_kunjungan()
    {
        return jam_kunjungan;
    }

    public void setJam_kunjungan(String jam_kunjungan)
    {
        this.jam_kunjungan = jam_kunjungan;
    }

    public String getDeskripsi()
    {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi)
    {
        this.deskripsi = deskripsi;
    }

    public String getKontak()
    {
        return kontak;
    }

    public void setKontak(String kontak)
    {
        this.kontak = kontak;
    }

    public String getFasilitas()
    {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas)
    {
        this.fasilitas = fasilitas;
    }

    public String getLatitude()
    {
        return latitude;
    }

    public void setLatitude(String latitude)
    {
        this.latitude = latitude;
    }

    public String getLongitude()
    {
        return longitude;
    }

    public void setLongitude(String longitude)
    {
        this.longitude = longitude;
    }

    public URI getUrl_photo()
    {
        return url_photo;
    }

    public void setUrl_photo(URI url_photo)
    {
        this.url_photo = url_photo;
    }

}