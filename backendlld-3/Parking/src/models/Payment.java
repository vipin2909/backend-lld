package models;

import enums.PaymentMode;
import enums.PaymentStatus;

import java.util.Date;

public class Payment extends BaseModel {
    // payment should have method to calculate payment
    // or this function should be maintained in services or controllers
    // other than that payment should have ticketNumber, Bill, PaymentMode, PaymentStatus
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private int amount;
    private String referenceNumber;
    private Date time;

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
