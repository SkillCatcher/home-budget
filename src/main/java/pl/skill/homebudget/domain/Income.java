package pl.skill.homebudget.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

//@Entity
public class Income {

//    @Id
//    @GeneratedValue
    private Long id;

    private IncomeSource incomeSource;
    private BigDecimal incomeAmount;
    private LocalDateTime creationDateTime;
    private LocalDate incomeDate;
    private boolean isDeleted;
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IncomeSource getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(IncomeSource incomeSource) {
        this.incomeSource = incomeSource;
    }

    public BigDecimal getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(BigDecimal incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public LocalDate getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(LocalDate incomeDate) {
        this.incomeDate = incomeDate;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Income() {
    }

    public Income(IncomeSource incomeSource, BigDecimal incomeAmount, LocalDateTime creationDateTime,
                  LocalDate incomeDate, boolean isDeleted, String title) {
        this.incomeSource = incomeSource;
        this.incomeAmount = incomeAmount;
        this.creationDateTime = creationDateTime;
        this.incomeDate = incomeDate;
        this.isDeleted = isDeleted;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Income{" +
                "id=" + id +
                ", incomeSource=" + incomeSource +
                ", incomeAmount=" + incomeAmount +
                ", creationDateTime=" + creationDateTime +
                ", incomeDate=" + incomeDate +
                ", isDeleted=" + isDeleted +
                ", title='" + title + '\'' +
                '}';
    }
}
