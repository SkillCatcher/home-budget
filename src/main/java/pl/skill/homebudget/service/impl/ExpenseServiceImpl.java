package pl.skill.homebudget.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pl.skill.homebudget.dao.ExpenseDao;
import pl.skill.homebudget.domain.Expense;
import pl.skill.homebudget.service.ExpenseService;

import java.util.List;
import java.util.Optional;

public class ExpenseServiceImpl implements ExpenseService {

    private static Logger logger = LoggerFactory.getLogger(ExpenseServiceImpl.class);
    private ExpenseDao expenseDao;

    @Autowired
    public ExpenseServiceImpl(ExpenseDao expenseDao) {
        this.expenseDao = expenseDao;
    }

    @Override
    public List<Expense> findAllExpenses() {
        logger.info("findAllExpenses()");
        return (List<Expense>) expenseDao.findAll();
    }

    @Override
    public Optional<Expense> findExpenseById(Long id) {
        logger.info("findExpenseById, id: {}", id);
        return expenseDao.findById(id);
    }

    @Override
    public void saveExpense(Expense expense) {
        logger.info("saveExpense(), expense: {}", expense);
        expenseDao.save(expense);
    }

    @Override
    public void deleteExpense(long id) {
        logger.info("deleteExpense(), id: {}", id);
        expenseDao.deleteById(id);
    }
}
