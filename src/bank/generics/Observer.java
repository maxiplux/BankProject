package bank.generics;

import bank.domain.Account;

public interface Observer {
    public void notify(String change, Object source);
}
