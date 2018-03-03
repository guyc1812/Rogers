package com.avengers.Rogers.DesignPattern.Observer.core;

public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

}
