package com.groupeastek.library.loan;

import java.time.LocalDate;
import java.util.List;

public interface ILoanService {

    public List<Loan> findAllLoanByEndDateBefore(LocalDate maxEndDate);

    public List<Loan> getAllOpenLoanOfThisCustomer(String email, LoanStatus status);

    public Loan getOpenedLoan(SimpleLoanDTO loanDTO);

    public boolean checkIfLoanExists(SimpleLoanDTO loanDTO);

    public Loan saveLoan(Loan loan);

    public void closeLoan(Loan loan);
}
