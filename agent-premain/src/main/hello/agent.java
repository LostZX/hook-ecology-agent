package main.hello;

import java.lang.instrument.Instrumentation;

public class agent {
    public static void premain(String options, Instrumentation instrumentation){
        ClassDumperTransformer dumper = ClassDumperTransformer.instance();
        instrumentation.addTransformer(dumper);
        Helper helper = new Helper();
        helper.prepare();
    }

}
