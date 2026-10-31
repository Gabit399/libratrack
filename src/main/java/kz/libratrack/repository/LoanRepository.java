package kz.libratrack.repository;

import kz.libratrack.entity.Loan;
import kz.libratrack.entity.LoanStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository extends JpaRepository<Loan, Long> {

    List<Loan> findByUserIdOrderByReservedAtDesc(Long userId);

    long countByStatus(LoanStatus status);
}
