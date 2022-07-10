package com.moop.daftarpenjualanbaranguas;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class DataModel implements Parcelable {
    private String nama, harga, deskripsi, tanggal, kuantiti;
    private Uri imageLoc ;
    public DataModel(){

    }

    public DataModel(String nama, String harga, String deskripsi, String tanggal, String kuantiti, Uri imageLoc) {
        this.nama = nama;
        this.harga = harga;
        this.tanggal = tanggal;
        this.deskripsi = deskripsi;
        this.kuantiti = kuantiti ;
        this.imageLoc = imageLoc ;
    }

    protected DataModel(Parcel in) {
        nama = in.readString();
        harga = in.readString();
        deskripsi = in.readString();
        tanggal = in.readString();
        kuantiti = in.readString();
        imageLoc = in.readParcelable(Uri.class.getClassLoader());
    }

    public static final Creator<DataModel> CREATOR = new Creator<DataModel>() {
        @Override
        public DataModel createFromParcel(Parcel in) {
            return new DataModel(in);
        }

        @Override
        public DataModel[] newArray(int size) {
            return new DataModel[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getKuantiti() {
        return kuantiti;
    }

    public void setKuantiti(String kuantiti) {
        this.kuantiti = kuantiti;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Uri getImageLoc() {
        return imageLoc;
    }

    public void setImageLoc(Uri imageLoc) {
        this.imageLoc = imageLoc;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeString(harga);
        parcel.writeString(deskripsi);
        parcel.writeString(tanggal);
        parcel.writeString(kuantiti);
        parcel.writeParcelable(imageLoc, i);
    }
}
