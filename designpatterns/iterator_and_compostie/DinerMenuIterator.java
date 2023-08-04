package designpatterns.iterator_and_compostie;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    private MenuItem[] items;
    private int position = 0;

    DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return (items[position + 2] != null);
    }

    @Override
    public Object next() {
        position = position + 2;
        return items[position];
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
