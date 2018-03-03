# Observer Pattern

## Introduce

Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, <br>
its dependent objects are to be notified automatically. <br>
Observer pattern falls under behavioral pattern category. 

## In JDK

* java.util.Observer/java.util.Observable
* All implementations of java.util.EventListener (practically all over Swing thus)
* javax.servlet.http.HttpSessionBindingListener
* javax.servlet.http.HttpSessionAttributeListener
* javax.faces.event.PhaseListener

## Demo

* Subject - interface

    ```java
    public interface Subject {
        
        public void registerObserver(Observer o);
    
        public void removeObserver(Observer o);
    
        public void notifyObservers();
        
    }
    ```

* Subject - implementation

    ```java
    public class WeatherData implements Subject {
    
        private ArrayList observers;
    
        private float temperature;
        private float humidity;
        private float pressure;
    
        public WeatherData() {
            observers = new ArrayList();
        }
    
        public void registerObserver(Observer o) {
            observers.add(o);
        }
    
        public void removeObserver(Observer o) {
            int i = observers.indexOf(o);
            if (i >= 0) {
                observers.remove(i);
            }
        }
    
        public void notifyObservers() {
            for (int i = 0; i < observers.size(); i++) {
                Observer observer = (Observer) observers.get(i);
                observer.update(temperature, humidity, pressure);
            }
        }
    
        public void measurementsChanged() {
            notifyObservers();
        }
    
        public void setMeasurements(float temperature, float humidity, float pressure) {
            this.temperature = temperature;
            this.humidity = humidity;
            this.pressure = pressure;
            measurementsChanged();
        }
    
        public float getTemperature() {
            return temperature;
        }
    
        public float getHumidity() {
            return humidity;
        }
    
        public float getPressure() {
            return pressure;
        }
    }
    ```
    
* Observer - interface

    ```java
    public interface Observer {
        void update(float temp, float humidity, float pressure);
    }
    ```

* Observer - implementation

    ```java
    public class WeatherDisplay implements Observer {
    
        private float temperature;
        private float humidity;
        private float pressure;
        private String name;
    
        public WeatherDisplay(String name, Subject weatherData) {
            this.name = name;
            weatherData.registerObserver(this);
        }
    
        public void update(float temperature, float humidity, float pressure) {
            this.temperature = temperature;
            this.humidity = humidity;
            this.pressure = pressure;
            display();
        }
    
        public void display() {
            System.out.println(
                "[" + name + "] Current conditions: " +
                temperature + "F degrees " +
                humidity + "% humidity and " +
                pressure + " presure");
        }
    }
    ```
    
* WeatherStation.java

    ```java
    public class WeatherStation {
    
        public static void main(String[] args) {
    
            WeatherData weatherData = new WeatherData();
    
            WeatherDisplay weatherDisplay1 = new WeatherDisplay("display1",weatherData);
            WeatherDisplay weatherDisplay2 = new WeatherDisplay("display2",weatherData);
    
            weatherData.setMeasurements(80, 65, 30.4f);
            weatherData.setMeasurements(81, 70, 29.2f);
            weatherData.setMeasurements(78, 90, 29.2f);
    
            // [display1] Current conditions: 80.0F degrees 65.0% humidity and 30.4 presure
            // [display1] Current conditions: 81.0F degrees 70.0% humidity and 29.2 presure
            // [display1] Current conditions: 78.0F degrees 90.0% humidity and 29.2 presure
    
            // [display2] Current conditions: 80.0F degrees 65.0% humidity and 30.4 presure
            // [display2] Current conditions: 81.0F degrees 70.0% humidity and 29.2 presure
            // [display2] Current conditions: 78.0F degrees 90.0% humidity and 29.2 presure
        }
    }
    ```