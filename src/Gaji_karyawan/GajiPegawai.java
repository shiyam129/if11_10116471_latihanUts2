/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gaji_karyawan;

/**
 *
 * @author thosiba c55-b5101
 */
public class GajiPegawai {
  private String Nama;
  private  String Alamat;
  private  int UangTransport;
  private  int UangTunjangan;
  private  int GajiPokok;
  private  int TotalGaji;
  

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public int getUangTransport() {
        return UangTransport;
    }

    public void setUangTransport(int UangTransport) {
        this.UangTransport = UangTransport;
    }

    public int getUangTunjangan() {
        return UangTunjangan;
    }

    public void setUangTunjangan(int UangTunjangan) {
        this.UangTunjangan = UangTunjangan;
    }

    public int getGajiPokok() {
        return GajiPokok;
    }

    public void setGajiPokok(int GajiPokok) {
        this.GajiPokok = GajiPokok;
    }

    public int totalGaji(int uangTransport,int uangTunjangan,int gajiPokok){
        int totalGaji=uangTransport+uangTunjangan+gajiPokok;
        return totalGaji;
    
    }

   
}
