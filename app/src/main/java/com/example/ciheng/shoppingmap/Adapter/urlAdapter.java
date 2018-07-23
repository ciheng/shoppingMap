package com.example.ciheng.shoppingmap.Adapter;

public class urlAdapter {
    private String mUrl;
    private final String firebaseURL = "gs://shoppingmap-209612";
    private final String serverURL = "http://api.a17-sd207.studev.groept.be";

    public urlAdapter() {
    }

    public String genAddProductUrl(String productName, String productPrice, String description, int pOwner) {
        mUrl = serverURL + "/add_product/" + productName + "/" + productPrice + "/" + description + "/" + pOwner;
        return mUrl;
    }

    public String genFindUser(String username_tbc) {
        String url = serverURL + "/findUser/" + username_tbc;
        return url;
    }

    public String genRegister(String email_tba, String pwd_tba, String username_tba, String addr_tba) {
        String url = serverURL + "/signIn/" + email_tba + "/" + pwd_tba + "/" + username_tba + "/" + addr_tba;
        return url;
    }

    public String getFirebaseURL() {
        return firebaseURL;
    }

    public String getServerURL() {
        return serverURL;
    }
}