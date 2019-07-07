package bank.util;

import bank.domain.Account;
import bank.generics.Observer;

public class Logger implements Observer {


    @Override
    public void notify(String change, Object source) {
        System.out.println( String.format( "Running Logger >>> Command %S , Change on account %s " , change, (Account)source));
    }
}
