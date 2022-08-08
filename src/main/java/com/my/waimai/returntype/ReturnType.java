package com.my.waimai.returntype;

import java.util.List;

public class ReturnType {
    private int total;
    private List records;

    public ReturnType() {
    }

    public ReturnType(int total, List records) {
        this.total = total;
        this.records = records;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List getRecords() {
        return records;
    }

    public void setRecords(List records) {
        this.records = records;
    }
}
