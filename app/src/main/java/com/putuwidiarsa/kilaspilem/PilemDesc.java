package com.putuwidiarsa.kilaspilem;

import android.os.Parcel;
import android.os.Parcelable;

public class PilemDesc implements Parcelable {
    private String judulPilem;
    private String kilasPilem;
    private String nilaiPilem;
    private String kruPilem;

    public String getJudulPilem() {
        return judulPilem;
    }

    public void setJudulPilem(String judulPilem) {
        this.judulPilem = judulPilem;
    }

    public String getKilasPilem() {
        return kilasPilem;
    }

    public void setKilasPilem(String kilasPilem) {
        this.kilasPilem = kilasPilem;
    }

    public String getNilaiPilem() {
        return nilaiPilem;
    }

    public void setNilaiPilem(String nilaiPilem) {
        this.nilaiPilem = nilaiPilem;
    }

    public String getKruPilem() {
        return kruPilem;
    }

    public void setKruPilem(String kruPilem) {
        this.kruPilem = kruPilem;
    }

    public String getTahunPilem() {
        return tahunPilem;
    }

    public void setTahunPilem(String tahunPilem) {
        this.tahunPilem = tahunPilem;
    }

    private String tahunPilem;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judulPilem);
        dest.writeString(this.kilasPilem);
        dest.writeString(this.nilaiPilem);
        dest.writeString(this.kruPilem);
        dest.writeString(this.tahunPilem);
    }

    public PilemDesc() {
    }

    protected PilemDesc(Parcel in) {
        this.judulPilem = in.readString();
        this.kilasPilem = in.readString();
        this.nilaiPilem = in.readString();
        this.kruPilem = in.readString();
        this.tahunPilem = in.readString();
    }

    public static final Parcelable.Creator<PilemDesc> CREATOR = new Parcelable.Creator<PilemDesc>() {
        @Override
        public PilemDesc createFromParcel(Parcel source) {
            return new PilemDesc(source);
        }

        @Override
        public PilemDesc[] newArray(int size) {
            return new PilemDesc[size];
        }
    };
}
