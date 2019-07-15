package bank.strategy;

public class AccountCheckingStrategyImpl implements AccountStrategy {


    @Override
    public double addInterest(double balance) {
        if ( balance < 1000 )
        {
            return  (balance * 1.5/100) ;
        }
        return  (balance * 2.5/100) ;
    }
}
