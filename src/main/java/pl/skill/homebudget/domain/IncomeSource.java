package pl.skill.homebudget.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

//@Entity
//@Table(name = "Income_Source")
public class IncomeSource {

//    @Id
//    @GeneratedValue
    private Long id;

    private LocalDateTime creationDateTime;

    private String incomeSourceName;

    private boolean isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(LocalDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public String getIncomeSourceName() {
        return incomeSourceName;
    }

    public void setIncomeSourceName(String incomeSourceName) {
        this.incomeSourceName = incomeSourceName;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public IncomeSource() {
    }

    public IncomeSource(LocalDateTime creationDateTime, String incomeSourceName, boolean isDeleted) {
        this.creationDateTime = creationDateTime;
        this.incomeSourceName = incomeSourceName;
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "IncomeSource{" +
                "id=" + id +
                ", creationDateTime=" + creationDateTime +
                ", incomeSourceName='" + incomeSourceName + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
