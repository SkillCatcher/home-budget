package pl.skill.homebudget.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pl.skill.homebudget.dao.ExpenseCategoryDao;
import pl.skill.homebudget.domain.ExpenseCategory;
import pl.skill.homebudget.service.ExpenseCategoryService;

import java.util.List;
import java.util.Optional;

public class ExpenseCategoryServiceImpl implements ExpenseCategoryService {

    private static Logger logger = LoggerFactory.getLogger(ExpenseCategoryServiceImpl.class);
    private ExpenseCategoryDao expenseCategoryDao;

    @Autowired
    public ExpenseCategoryServiceImpl(ExpenseCategoryDao expenseCategoryDao) {
        this.expenseCategoryDao = expenseCategoryDao;
    }

    @Override
    public List<ExpenseCategory> findAllExpenseCategories() {
        logger.info("findAllExpenseCategories()");
        return (List<ExpenseCategory>) expenseCategoryDao.findAll();
    }

    @Override
    public Optional<ExpenseCategory> findExpenseCategoryById(Long id) {
        logger.info("findExpenseCategoryById, id: {}", id);
        return expenseCategoryDao.findById(id);
    }

    @Override
    public void saveExpenseCategory(ExpenseCategory expenseCategory) {
        logger.info("saveExpenseCategory(), expenseCategory: {}", expenseCategory);
        expenseCategoryDao.save(expenseCategory);
    }

    @Override
    public void deleteExpenseCategory(long id) {
        logger.info("deleteExpenseCategory(), id: {}", id);
        expenseCategoryDao.deleteById(id);
    }
}
