package hello;

import java.io.*;
import java.util.Base64;

public class hello {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ding0x0\\Desktop\\tests\\agent-tests\\target\\classes\\hello\\hello.class");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        fileInputStream.read(bytes);
        fileInputStream.close();

        String b = Base64.getEncoder().encodeToString(bytes);
        System.out.println(b);
    }
}
