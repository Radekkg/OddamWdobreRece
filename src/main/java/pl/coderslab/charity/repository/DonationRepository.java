package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.coderslab.charity.model.Donation;

public interface DonationRepository extends CrudRepository<Donation, Integer> {

    @Query("SELECT SUM(do.quantity) FROM Donation do")
    Integer quantityOfBags();

    @Query("SELECT COUNT(do.quantity) FROM Donation do")
    Integer quantityOfDonation();
}
