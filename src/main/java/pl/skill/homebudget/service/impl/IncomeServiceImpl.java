package pl.skill.homebudget.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pl.skill.homebudget.dao.IncomeDao;
import pl.skill.homebudget.domain.Income;
import pl.skill.homebudget.service.IncomeService;

import java.util.List;
import java.util.Optional;

public class IncomeServiceImpl implements IncomeService {

    private static Logger logger = LoggerFactory.getLogger(IncomeServiceImpl.class);
    private IncomeDao incomeDao;

    @Autowired
    public IncomeServiceImpl(IncomeDao incomeDao) {
        this.incomeDao = incomeDao;
    }

    @Override
    public List<Income> findAllIncomes() {
        logger.info("findAllIncomes()");
        return (List<Income>) incomeDao.findAll();
    }

    @Override
    public Optional<Income> findIncomeById(Long id) {
        logger.info("findIncomeById, id: {}", id);
        return incomeDao.findById(id);
    }

    @Override
    public void saveIncome(Income income) {
        logger.info("saveIncome(), income: {}", income);
        incomeDao.save(income);
    }

    @Override
    public void deleteIncome(long id) {
        logger.info("deleteIncome(), id: {}", id);
        incomeDao.deleteById(id);
    }
}
