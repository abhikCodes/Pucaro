package com.example.abhik.ssoapplication;

/**
 * Created by abhik on 11/02/18.
 */

public class Post {
    public String TaxID;
    public String TaxYear;
    public String TotalMoney;

    public Post(String taxID, String taxYear, String totalMoney) {
        this.TaxID = taxID;
        this.TaxYear = taxYear;
        this.TotalMoney = totalMoney;
    }
}
