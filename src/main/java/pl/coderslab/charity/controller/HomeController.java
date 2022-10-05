package pl.coderslab.charity.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.services.CategoryService;
import pl.coderslab.charity.services.DonationService;
import pl.coderslab.charity.services.InstitutionService;

import java.util.List;

@AllArgsConstructor
@Controller
public class HomeController {
    InstitutionService institutionService;
    DonationService donationService;

    CategoryService categoryService;



    @RequestMapping("/")
    public String homeAction(Model model){
        List<Institution> institutions = institutionService.getAllInstitutions();
        model.addAttribute("institutions", institutions);

        Integer allBags = donationService.getAllDonationBag();
        model.addAttribute("allBags",allBags);

        Integer allDonation = donationService.getAllDonation();
        model.addAttribute("allDonations",allDonation);
        return "index";
    }
    @GetMapping("/form")
    public String getItemsList(Model model){
        List<Category> categories = categoryService.getAllCategory();
        model.addAttribute("categories",categories);

        List<Institution> institutions = institutionService.getAllInstitutions();
        model.addAttribute("institutions", institutions);
        return "form";
    }
}
