package designpatterns.abstractfactory;

// Declares an interface for operations that create abstract product objects (Abstract Factory)
public interface WidgetFactory {
    ScrollBar createScrollBar();
    Window createWindow();
}
