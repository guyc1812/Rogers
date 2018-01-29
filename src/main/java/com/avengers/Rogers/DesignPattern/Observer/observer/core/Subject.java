package com.avengers.Rogers.DesignPattern.Observer.observer.core;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
