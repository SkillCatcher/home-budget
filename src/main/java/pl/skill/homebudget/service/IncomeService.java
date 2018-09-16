package pl.skill.homebudget.service;

import pl.skill.homebudget.domain.Income;

import java.util.List;
import java.util.Optional;

public interface IncomeService {
    List<Income> findAllIncomes();
    Optional<Income> findIncomeById(Long id);
    void saveIncome(Income income);
    void deleteIncome(long id);
}
