package pl.skill.homebudget.service;

import pl.skill.homebudget.domain.ExpenseCategory;

import java.util.List;
import java.util.Optional;

public interface ExpenseCategoryService {
    List<ExpenseCategory> findAllExpenseCategories();
    Optional<ExpenseCategory> findExpenseCategoryById(Long id);
    void saveExpenseCategory(ExpenseCategory expenseCategory);
    void deleteExpenseCategory(long id);
}
