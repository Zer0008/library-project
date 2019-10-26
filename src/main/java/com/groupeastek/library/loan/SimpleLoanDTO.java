package com.groupeastek.library.loan;

import java.time.LocalDate;

public class SimpleLoanDTO {

    private int bookId;

    private int customerId;

    private LocalDate beginDate;

    private LocalDate endDate;

    public SimpleLoanDTO(){
        super();
    }

    public SimpleLoanDTO(int bookId, int customerId, LocalDate beginDate, LocalDate endDate) {
        this.bookId = bookId;
        this.customerId = customerId;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
