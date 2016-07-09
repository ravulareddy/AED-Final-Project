/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.common;

/**
 *
 * @author tejageetla
 */
public class Donation {
    
    private String amount;
    private String donationDate;
    private String accntNumber;
    private String accntName;
    public static String toAccountNumber = "2340987123";
    
    private static int count = 0;
    private int donationId;
    
    public Donation()
    {
     count++;
     donationId = count;
    }
    

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    @Override
    public String toString() {
        return String.valueOf(donationId);
    }

    public String getAccntNumber() {
        return accntNumber;
    }

    public void setAccntNumber(String accntNumber) {
        this.accntNumber = accntNumber;
    }

    public String getAccntName() {
        return accntName;
    }

    public void setAccntName(String accntName) {
        this.accntName = accntName;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }
    
    
    
    
}
