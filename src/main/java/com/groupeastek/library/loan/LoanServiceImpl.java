package com.groupeastek.library.loan;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service("loanService")
@Transactional
public class LoanServiceImpl implements ILoanService{

    @Autowired
    private ILoanDao loanDao;

    @Override
    public List<Loan> findAllLoanByEndDateBefore(LocalDate maxEndDate) {
        return this.loanDao.findByEndDateBefore(maxEndDate);
    }

    @Override
    public List<Loan> getAllOpenLoanOfThisCustomer(String email, LoanStatus status) {
        return this.loanDao.getAllOpenLoansOfThisCustomer(email, status);
    }

    @Override
    public Loan getOpenedLoan(SimpleLoanDTO loanDTO) {
        return this.loanDao.getLoanByCriteria(loanDTO.getBookId(), loanDTO.getCustomerId(), LoanStatus.OPEN);
    }

    @Override
    public boolean checkIfLoanExists(SimpleLoanDTO loanDTO) {
        this.loanDao.getLoanByCriteria(loanDTO.getBookId(), loanDTO.getCustomerId(), LoanStatus.OPEN);

        if (loanDTO != null)
            return true;
        return false;
    }

    @Override
    public Loan saveLoan(Loan loan) {
        return this.loanDao.save(loan);
    }

    @Override
    public void closeLoan(Loan loan) {
        this.loanDao.save(loan);
    }
}
