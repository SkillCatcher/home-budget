package pl.skill.homebudget.dao;

import org.springframework.data.repository.CrudRepository;
import pl.skill.homebudget.domain.ExpenseCategory;

public interface ExpenseCategoryDao extends CrudRepository<ExpenseCategory, Long> {
}
