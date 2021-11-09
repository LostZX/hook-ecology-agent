package hello;


public class tests {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> clazz = myClassLoader.loadClass("hello.hello");
        Class<?> clazzz = myClassLoader.loadClass("hello.hi");
    }
}
