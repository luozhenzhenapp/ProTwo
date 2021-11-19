package com.library.bean;

/**
 * Author: JieYuDa
 * Desc:
 * File created at 2019/11/19
 */
public class LendDate extends Lend {
    private String lendDateStr;
    private String backDateStr;
    private String actualDateStr;

    public String getActualDateStr() {
        return actualDateStr;
    }

    public void setActualDateStr(String actualDateStr) {
        this.actualDateStr = actualDateStr;
    }

    public String getLendDateStr() {
        return lendDateStr;
    }

    public void setLendDateStr(String lendDateStr) {
        this.lendDateStr = lendDateStr;
    }

    public String getBackDateStr() {
        return backDateStr;
    }

    public void setBackDateStr(String backDateStr) {
        this.backDateStr = backDateStr;
    }
}
