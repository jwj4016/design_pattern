package adapter_pattern;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    //Iterator의 remove() 메소드는 Enumeration에서 지원되지 않는다. 따라서 예외를 던진다.
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
