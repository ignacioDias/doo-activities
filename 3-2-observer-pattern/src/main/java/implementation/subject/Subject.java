package implementation.subject;

import implementation.observers.Observer;

public interface Subject {
    public void notifyObservers();
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);

}
