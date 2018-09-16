package pl.skill.homebudget.dao;

import org.springframework.data.repository.CrudRepository;
import pl.skill.homebudget.domain.IncomeSource;

public interface IncomeSourceDao extends CrudRepository<IncomeSource, Long> {
}
