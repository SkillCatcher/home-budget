package pl.skill.homebudget.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

//@Entity
public class Expense {

//    @Id
//    @GeneratedValue
    private Long id;

    private BigDecimal expenseAmount;

    //@Column(nullable = false)
    private String title;

    private String expansePlace;
    private ExpenseCategory expenseCategory;
    private boolean isDeleted;
    private LocalDate expenseDate;
    private LocalDateTime creationDateTime;
    private PaymentMethod paymentMethod;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(BigDecimal expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExpansePlace() {
        return expansePlace;
    }

    public void setExpansePlace(String expansePlace) {
        this.expansePlace = expansePlace;
    }

    public ExpenseCategory getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(ExpenseCategory expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public LocalDate getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(LocalDate expenseDate) {
        this.expenseDate = expenseDate;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Expense() {
    }

    public Expense(BigDecimal expenseAmount, String title, String expansePlace,
                   ExpenseCategory expenseCategory, boolean isDeleted, LocalDate expenseDate,
                   LocalDateTime creationDateTime, PaymentMethod paymentMethod) {
        this.expenseAmount = expenseAmount;
        this.title = title;
        this.expansePlace = expansePlace;
        this.expenseCategory = expenseCategory;
        this.isDeleted = isDeleted;
        this.expenseDate = expenseDate;
        this.creationDateTime = creationDateTime;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", expenseAmount=" + expenseAmount +
                ", title='" + title + '\'' +
                ", expansePlace='" + expansePlace + '\'' +
                ", expenseCategory=" + expenseCategory +
                ", isDeleted=" + isDeleted +
                ", expenseDate=" + expenseDate +
                ", creationDateTime=" + creationDateTime +
                ", paymentMethod=" + paymentMethod +
                '}';
    }
}
