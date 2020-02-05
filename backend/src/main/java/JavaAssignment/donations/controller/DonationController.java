package JavaAssignment.donations.controller;

import JavaAssignment.donations.model.donation;
import JavaAssignment.donations.repository.DonationRepository;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DonationController {
    @Autowired
    private DonationRepository donationRepository;

    private EntityManager entityManager;

    @GetMapping("/donations")
    public List<donation> getAllDonations() {
        return donationRepository.findAll();
    }

    @PostMapping("/donate")
    public void insertDonations(@ModelAttribute donation newDonation) {
        donationRepository.insertdonation(newDonation.getName(),newDonation.getSurname(),newDonation.getAmount(),newDonation.getCurrency());
    }
}
