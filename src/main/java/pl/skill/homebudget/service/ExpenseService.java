package pl.skill.homebudget.service;

import pl.skill.homebudget.domain.Expense;

import java.util.List;
import java.util.Optional;

public interface ExpenseService {
    List<Expense> findAllExpenses();
    Optional<Expense> findExpenseById(Long id);
    void saveExpense(Expense expense);
    void deleteExpense(long id);
}
