package main.hello;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

public class Helper {
    public void prepare() {
        Runtime.getRuntime().addShutdownHook(new ShutdownHook());
    }


    public static final class ShutdownHook extends Thread {
        public void run() {
            HashMap<String, byte[]> map = Helper.finish();
            try {
                JarOutputStream jarOutputStream = createJarStream();
                for (String name :
                        map.keySet()) {
                    byte[] data = map.get(name);
                    fullJar(jarOutputStream, name, data);
                }
                jarOutputStream.flush();
                jarOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static HashMap<String, byte[]> finish() {
        ClassDumperTransformer classDumperTransformer = ClassDumperTransformer.instance();
        return classDumperTransformer.getMap();
    }

    public static void fullJar(JarOutputStream out, String name, byte[] data) throws IOException {
        JarEntry jarEntry = new JarEntry(name + ".class");
        out.putNextEntry(jarEntry);
        out.write(data);
        out.closeEntry();
    }

    public static JarOutputStream createJarStream() throws IOException {
        String jarName = "e2j" + UUID.randomUUID().toString() + ".jar";
        File file = new File(jarName);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        return new JarOutputStream(fileOutputStream);
    }
}
