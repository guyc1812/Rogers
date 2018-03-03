package com.avengers.Rogers.designPattern.Observer.core;

public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();

}
