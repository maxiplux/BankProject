package bank.generics;



import java.util.ArrayList;
import java.util.List;


public class AbstractObservable implements Observable {

   private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer)
    {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        this.observers.remove(observer);
    }


    public void notifyAllObsesrver(String command,Object source)
    {
       this.observers.forEach(observer ->  {
           observer.notify(command,source);
       });
    }


}
