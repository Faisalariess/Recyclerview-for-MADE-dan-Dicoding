package com.kc.submissiondicoding;

import android.os.Parcel;
import android.os.Parcelable;

public class Club implements Parcelable {
    private String name, remark, photo, detail;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remark);
        dest.writeString(this.photo);
        dest.writeString(this.detail);


    }

    public Club() {
    }
    protected Club(Parcel in) {
        this.name = in.readString();
        this.remark = in.readString();
        this.photo = in.readString();
        this.detail = in.readString();


    }

    public static final Parcelable.Creator<Club> CREATOR = new Parcelable.Creator<Club>() {
        @Override
        public Club createFromParcel(Parcel source) {
            return new Club(source);
        }
        @Override
        public Club[] newArray(int size) {
            return new Club[size];
        }
    };


}
