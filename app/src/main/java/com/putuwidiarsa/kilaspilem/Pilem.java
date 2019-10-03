package com.putuwidiarsa.kilaspilem;

import android.os.Parcel;
import android.os.Parcelable;

public class Pilem implements Parcelable {
    private String judul;
    private String sinopsis;
    private String rating;
    private String kru;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getKru() {
        return kru;
    }

    public void setKru(String kru) {
        this.kru = kru;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    private String tahun;
    private String tanggal;
    private int poster;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judul);
        dest.writeString(this.sinopsis);
        dest.writeString(this.rating);
        dest.writeString(this.kru);
        dest.writeString(this.tahun);
        dest.writeString(this.tanggal);
        dest.writeInt(this.poster);
    }

    public Pilem() {
    }

    protected Pilem(Parcel in) {
        this.judul = in.readString();
        this.sinopsis = in.readString();
        this.rating = in.readString();
        this.kru = in.readString();
        this.tahun = in.readString();
        this.tanggal = in.readString();
        this.poster = in.readInt();
    }

    public static final Parcelable.Creator<Pilem> CREATOR = new Parcelable.Creator<Pilem>() {
        @Override
        public Pilem createFromParcel(Parcel source) {
            return new Pilem(source);
        }

        @Override
        public Pilem[] newArray(int size) {
            return new Pilem[size];
        }
    };
}
