package bank.generics;

public interface Observable {

    public void notifyAllObsesrver(String command,Object source);

    public void addObserver(Observer observer) ;

    public void removeObserver(Observer observer);

}

