package DesignPattern.Behavioral.ObserverPattern;

public interface Subject {

    void registeryObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
