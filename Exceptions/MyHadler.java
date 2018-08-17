package Exceptions;

/**
 * Created by Home on 4/8/2017.
 */
public class MyHadler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Thread " + t.getName() + " throw" + t.getClass());

    }
}
