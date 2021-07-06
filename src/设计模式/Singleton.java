package 设计模式;

public class Singleton {

    private static volatile Singleton singleton;

    /**
     * 双重校验锁
     *
     * @return
     */
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized(singleton) {
                if (singleton == null) {
                    return new Singleton();
                }
            }
        }
        return singleton;
    }

    /**
     * 静态内部类
     *
     * @return
     */
    public Singleton getInstance1() {
        return Helper.SINGLETON;
    }

    private static class Helper {
        private static final Singleton SINGLETON = new Singleton();
    }
}
