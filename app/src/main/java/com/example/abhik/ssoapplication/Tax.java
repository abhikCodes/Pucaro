package com.example.abhik.ssoapplication;

/**
 * Created by abhik on 11/02/18.
 */

public class Tax {

    String TaxID;
    String TaxYear;
    String Total;

    public Tax(String taxID, String taxYear, String total) {
        TaxID = taxID;
        TaxYear = taxYear;
        Total = total;
    }

    public String getTaxID() {
        return TaxID;
    }

    public void setTaxID(String taxID) {
        TaxID = taxID;
    }

    public String getTaxYear() {
        return TaxYear;
    }

    public void setTaxYear(String taxYear) {
        TaxYear = taxYear;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }
}
