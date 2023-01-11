package co.pragra.learning.firstspringproject.business;

import co.pragra.learning.firstspringproject.domain.IRateOfInterest;
import co.pragra.learning.firstspringproject.domain.RateType;

public class PaymentCalculator
{
    private double loanAmount;
    private int tenure;

    private IRateOfInterest interestProvider;
    public PaymentCalculator(double loanAmount, int tenure,IRateOfInterest rateProvider) {
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.interestProvider=rateProvider;
    }

    public double calculatePayment()
    {
         interestProvider=new RateProvider();
         return loanAmount+loanAmount*interestProvider.getInterestRate(RateType.FIXED)*tenure/100;

    }

}
