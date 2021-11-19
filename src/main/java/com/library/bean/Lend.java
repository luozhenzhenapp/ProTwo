package com.library.bean;

import java.io.Serializable;
import java.util.Date;

public class Lend implements Serializable {

    private long ser_num;
    private long book_id;
    private String name;
    private long reader_id;
    private String username;
    private Date lend_date;
    private Date back_date;
    private double overdueamount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public double getOverdueamount() {
        return overdueamount;
    }

    public void setOverdueamount(double overdueamount) {
        this.overdueamount = overdueamount;
    }

    public long getReaderId() {
        return reader_id;
    }

    public void setReaderId(long reader_id) {
        this.reader_id = reader_id;
    }

    public long getBookId() {
        return book_id;
    }

    public void setBookId(long book_id) {
        this.book_id = book_id;
    }

    public void setSer_num(long ser_num) {
        this.ser_num = ser_num;
    }

    public Date getBackDate() {
        return back_date;
    }

    public void setBackDate(Date back_date) {
        this.back_date = back_date;
    }

    public Date getLendDate() {
        return lend_date;
    }

    public void setLendDate(Date lend_date) {
        this.lend_date = lend_date;
    }

    public long getSer_num() {
        return ser_num;
    }
}
