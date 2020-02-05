package JavaAssignment.donations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import JavaAssignment.donations.model.donation;

import java.util.List;

@Repository
public interface DonationRepository extends JpaRepository<donation, Long> {

    @Query(value = "insert into donations(name,surname,amount,currency) values (:name,:surname,:amount,:currency)",nativeQuery = true)
    List<donation> insertdonation(@Param("name") String name, @Param("surname") String surname, @Param("amount") int amount, @Param("currency") String currency);
}
