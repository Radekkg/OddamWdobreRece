package pl.coderslab.charity.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.services.CategoryService;
import pl.coderslab.charity.services.DonationService;
import pl.coderslab.charity.services.InstitutionService;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/donation")
public class DonationController {

    private final InstitutionService institutionService;
    private final DonationService donationService;
    private final CategoryService categoryService;



    @GetMapping("/add")
    public String addDonation(Model model){
        model.addAttribute("donation",new Donation());

        List<Category> categories = categoryService.getAllCategory();
        model.addAttribute("categories", categories);

        List<Institution> institutions = institutionService.getAllInstitutions();
        model.addAttribute("institutions",institutions);
        return "form";
    }

    @PostMapping("/add")
    public String saveDonation(@ModelAttribute("donation")@Valid Donation donation, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            //tutaj trzeba dołożyc forme z info o donacji
            return "form";
        }
        donation.setCategories(donation.getCategories());
        donationService.save(donation);
        return "form-confirmation";
    }
}
