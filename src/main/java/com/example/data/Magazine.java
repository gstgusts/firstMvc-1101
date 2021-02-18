package com.example.data;

import java.time.LocalDateTime;

public class Magazine extends ProductBase {
    public Magazine(int id, String name, double price, int issueNumber, LocalDateTime issueDate) {
        super(id, name, price);
        this.issueNumber = issueNumber;
        this.issueDate = issueDate;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    private int issueNumber;
    private LocalDateTime issueDate;

    @Override
    public String getFullInfo() {
        return issueNumber + " " + issueDate;
    }
}
