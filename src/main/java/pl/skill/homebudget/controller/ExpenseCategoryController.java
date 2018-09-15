package pl.skill.homebudget.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.skill.homebudget.domain.ExpenseCategory;

import java.util.Collections;
import java.util.List;

@Controller
public class ExpenseCategoryController {

    @GetMapping("/category/all")
    public String allCategories(Model categories) {

        List<ExpenseCategory> expenseCategories = Collections.emptyList();
        categories.addAttribute("categories", expenseCategories);

        return "category/all";
    }


    @GetMapping("/category/add")
    public String addCategory(@ModelAttribute ExpenseCategory expenseCategory) {
        //TODO: MP save category
        return "redirect:/category/all";
    }


}
