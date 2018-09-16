package pl.skill.homebudget.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.skill.homebudget.domain.ExpenseCategory;

public interface ExpenseCategoryController {

    String allCategories(Model categories);
    String addCategory(@ModelAttribute ExpenseCategory expenseCategory);
}
