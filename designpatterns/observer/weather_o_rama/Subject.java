package designpatterns.observer.weather_o_rama;

// Pass Observer in Generic Field
public interface Subject<T>{
    void registerObserver(T newObserver);
    void removeObserver(T oldObserver);
    void notifyObserver();
}
