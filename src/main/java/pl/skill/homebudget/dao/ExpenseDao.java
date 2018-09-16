package pl.skill.homebudget.dao;

import org.springframework.data.repository.CrudRepository;
import pl.skill.homebudget.domain.Expense;

public interface ExpenseDao extends CrudRepository<Expense, Long> {
}
