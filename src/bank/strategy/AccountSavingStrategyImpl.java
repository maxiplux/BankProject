package bank.strategy;

public class AccountSavingStrategyImpl implements AccountStrategy {


    @Override
    public double addInterest(double balance) {
        if ( balance > 1000 && balance < 5000)
        {
            return  (balance * 2.0/100) ;
        }

        if ( balance < 1000 )
        {
            return  (balance * 1.0/100) ;
        }

        return  (balance * 4.0/100) ;


    }
}
