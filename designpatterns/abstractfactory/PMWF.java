package designpatterns.abstractfactory;

// implements the operations to create concrete product objects
public class PMWF implements WidgetFactory {
    @Override
    public ScrollBar createScrollBar() {
        return new PMScrollBar();
    }

    @Override
    public Window createWindow() {
        return new PMWindow();
    }
}
