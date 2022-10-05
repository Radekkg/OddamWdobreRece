package pl.coderslab.charity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.repository.DonationRepository;

import java.util.List;

@Service
public class DonationService {

    DonationRepository donationRepository;

    public DonationService(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    public Integer getAllDonationBag() {
        return donationRepository.quantityOfBags();
    }

    public Integer getAllDonation() {
        return donationRepository.quantityOfDonation();
    }

    public void save(Donation donation) {
        donationRepository.save(donation);
    }
}
