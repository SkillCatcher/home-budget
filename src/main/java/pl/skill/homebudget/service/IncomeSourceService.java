package pl.skill.homebudget.service;

import pl.skill.homebudget.domain.IncomeSource;

import java.util.List;
import java.util.Optional;

public interface IncomeSourceService {
    List<IncomeSource> findAllIncomeSources();
    Optional<IncomeSource> findIncomeSourceById(Long id);
    void saveIncomeSource(IncomeSource incomeSource);
    void deleteIncomeSource(long id);
}
