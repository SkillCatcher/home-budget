package pl.skill.homebudget.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pl.skill.homebudget.dao.IncomeSourceDao;
import pl.skill.homebudget.domain.IncomeSource;
import pl.skill.homebudget.service.IncomeSourceService;

import java.util.List;
import java.util.Optional;

public class IncomeSourceServiceImpl implements IncomeSourceService {

    private static Logger logger = LoggerFactory.getLogger(IncomeSourceServiceImpl.class);
    private IncomeSourceDao incomeSourceDao;

    @Autowired
    public IncomeSourceServiceImpl(IncomeSourceDao incomeSourceDao) {
        this.incomeSourceDao = incomeSourceDao;
    }

    @Override
    public List<IncomeSource> findAllIncomeSources() {
        logger.info("findAllIncomeSources()");
        return (List<IncomeSource>) incomeSourceDao.findAll();
    }

    @Override
    public Optional<IncomeSource> findIncomeSourceById(Long id) {
        logger.info("findIncomeSourceById, id: {}", id);
        return incomeSourceDao.findById(id);
    }

    @Override
    public void saveIncomeSource(IncomeSource incomeSource) {
        logger.info("saveIncomeSource(), incomeSource: {}", incomeSource);
        incomeSourceDao.save(incomeSource);
    }

    @Override
    public void deleteIncomeSource(long id) {
        logger.info("deleteIncomeSource(), id: {}", id);
        incomeSourceDao.deleteById(id);
    }
}
