package pl.skill.homebudget.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "Expense_Category")
public class ExpenseCategory {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime creationDateTime;

    private String categoryName;

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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public ExpenseCategory() {
    }

    public ExpenseCategory(LocalDateTime creationDateTime, String categoryName, boolean isDeleted) {
        this.creationDateTime = creationDateTime;
        this.categoryName = categoryName;
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "ExpenseCategory{" +
                "id=" + id +
                ", creationDateTime=" + creationDateTime +
                ", categoryName='" + categoryName + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
