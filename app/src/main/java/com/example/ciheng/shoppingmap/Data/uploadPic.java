package com.example.ciheng.shoppingmap.Data;

public class uploadPic {
    private String mName;
    private String mImageUrl;

    public uploadPic(){}
    public uploadPic(String name, String imageUrl){
        if(name.trim().equals("")){
            name="No name";
        }
        mName=name;
        mImageUrl=imageUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }
}
