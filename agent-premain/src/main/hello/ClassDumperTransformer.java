package main.hello;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;
import java.util.HashMap;

public class ClassDumperTransformer implements ClassFileTransformer {

    HashMap<String, byte[]>  classByteMap = new HashMap<>();

    private static ClassDumperTransformer instance = null;

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        if (loader.getClass().getName().equals("com.regexlab.j2e.Jar2ExeClassLoader")){
            // 将hook到的每一个class都放入map，后面写入
            classByteMap.put(className, classfileBuffer);
        }
        return classfileBuffer;
    }

    public HashMap<String, byte[]> getMap(){
        return classByteMap;
    }

    private ClassDumperTransformer(){}

    public static ClassDumperTransformer instance(){
        if (instance == null){
            instance = new ClassDumperTransformer();
        }
        return instance;
    }
}
