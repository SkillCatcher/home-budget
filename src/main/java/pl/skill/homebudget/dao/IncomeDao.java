package pl.skill.homebudget.dao;

import org.springframework.data.repository.CrudRepository;
import pl.skill.homebudget.domain.Income;

public interface IncomeDao extends CrudRepository<Income, Long> {
}
