package hello;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class hi {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\ding0x0\\Desktop\\test\\agent-test\\target\\classes\\hello\\hi.class");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        fileInputStream.read(bytes);
        fileInputStream.close();

        String b = Base64.getEncoder().encodeToString(bytes);
        System.out.println(b);
    }
}
