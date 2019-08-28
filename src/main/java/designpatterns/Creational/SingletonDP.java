package designpatterns.Creational;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDP {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        DemoSingletonDesignPattern demoSingletonDesignPattern1= DemoSingletonDesignPattern.getInstance();
        System.out.println(demoSingletonDesignPattern1);

        // Reflection
        Constructor<DemoSingletonDesignPattern> constructor = DemoSingletonDesignPattern.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        DemoSingletonDesignPattern demoSingletonDesignPattern= constructor.newInstance();
        System.out.println( demoSingletonDesignPattern);


    }


}

class DemoSingletonDesignPattern {

    private static volatile DemoSingletonDesignPattern demoSingletonDesignPattern = null;

    private DemoSingletonDesignPattern() {
    }

    public static DemoSingletonDesignPattern getInstance() {
        if (demoSingletonDesignPattern == null) {

            synchronized (DemoSingletonDesignPattern.class) {
                if (demoSingletonDesignPattern == null) {
                    demoSingletonDesignPattern = new DemoSingletonDesignPattern();
                }
            }
        }
        return demoSingletonDesignPattern;
    }


}

enum Singleton{
    INSTANCE;
}