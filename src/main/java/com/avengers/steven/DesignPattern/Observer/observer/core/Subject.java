package com.avengers.steven.DesignPattern.Observer.observer.core;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
