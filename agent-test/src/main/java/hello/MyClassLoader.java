package hello;

import java.util.Base64;
import java.util.HashMap;

public class MyClassLoader extends ClassLoader{

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        if (name.startsWith("java.lang")){
            return super.loadClass(name, resolve);
        }
        return findClass(name);
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        HashMap<String, String> classByteMap  = new HashMap<>();
        String hello = "yv66vgAAADQATwoADwAnBwAoCAApCgACACoHACsKAAUALAoAAgAtCgAFAC4KAAUALwoAMAAxCgAyADMJADQANQoANgA3BwA4BwA5AQAGPGluaXQ+AQADKClWAQAEQ29kZQEAD0xpbmVOdW1iZXJUYWJsZQEAEkxvY2FsVmFyaWFibGVUYWJsZQEABHRoaXMBAA1MaGVsbG8vaGVsbG87AQAEbWFpbgEAFihbTGphdmEvbGFuZy9TdHJpbmc7KVYBAARhcmdzAQATW0xqYXZhL2xhbmcvU3RyaW5nOwEABGZpbGUBAA5MamF2YS9pby9GaWxlOwEAD2ZpbGVJbnB1dFN0cmVhbQEAGUxqYXZhL2lvL0ZpbGVJbnB1dFN0cmVhbTsBAAVieXRlcwEAAltCAQABYgEAEkxqYXZhL2xhbmcvU3RyaW5nOwEACkV4Y2VwdGlvbnMHADoBAApTb3VyY2VGaWxlAQAKaGVsbG8uamF2YQwAEAARAQAMamF2YS9pby9GaWxlAQBJQzpcVXNlcnNcZGluZzB4MFxEZXNrdG9wXHRlc3RcYWdlbnQtdGVzdFx0YXJnZXRcY2xhc3Nlc1xoZWxsb1xoZWxsby5jbGFzcwwAEAA7AQAXamF2YS9pby9GaWxlSW5wdXRTdHJlYW0MABAAPAwAPQA+DAA/AEAMAEEAEQcAQgwAQwBGBwBHDABIAEkHAEoMAEsATAcATQwATgA7AQALaGVsbG8vaGVsbG8BABBqYXZhL2xhbmcvT2JqZWN0AQATamF2YS9pby9JT0V4Y2VwdGlvbgEAFShMamF2YS9sYW5nL1N0cmluZzspVgEAEShMamF2YS9pby9GaWxlOylWAQAGbGVuZ3RoAQADKClKAQAEcmVhZAEABShbQilJAQAFY2xvc2UBABBqYXZhL3V0aWwvQmFzZTY0AQAKZ2V0RW5jb2RlcgEAB0VuY29kZXIBAAxJbm5lckNsYXNzZXMBABwoKUxqYXZhL3V0aWwvQmFzZTY0JEVuY29kZXI7AQAYamF2YS91dGlsL0Jhc2U2NCRFbmNvZGVyAQAOZW5jb2RlVG9TdHJpbmcBABYoW0IpTGphdmEvbGFuZy9TdHJpbmc7AQAQamF2YS9sYW5nL1N5c3RlbQEAA291dAEAFUxqYXZhL2lvL1ByaW50U3RyZWFtOwEAE2phdmEvaW8vUHJpbnRTdHJlYW0BAAdwcmludGxuACEADgAPAAAAAAACAAEAEAARAAEAEgAAAC8AAQABAAAABSq3AAGxAAAAAgATAAAABgABAAAABgAUAAAADAABAAAABQAVABYAAAAJABcAGAACABIAAAClAAMABQAAADe7AAJZEgO3AARMuwAFWSu3AAZNK7YAB4i8CE4sLbYACFcstgAJuAAKLbYACzoEsgAMGQS2AA2xAAAAAgATAAAAIgAIAAAACAAKAAkAEwAKABsACwAhAAwAJQAOAC4ADwA2ABAAFAAAADQABQAAADcAGQAaAAAACgAtABsAHAABABMAJAAdAB4AAgAbABwAHwAgAAMALgAJACEAIgAEACMAAAAEAAEAJAACACUAAAACACYARQAAAAoAAQAyADAARAAJ";
        String hi = "yv66vgAAADQATwoADwAnBwAoCAApCgACACoHACsKAAUALAoAAgAtCgAFAC4KAAUALwoAMAAxCgAyADMJADQANQoANgA3BwA4BwA5AQAGPGluaXQ+AQADKClWAQAEQ29kZQEAD0xpbmVOdW1iZXJUYWJsZQEAEkxvY2FsVmFyaWFibGVUYWJsZQEABHRoaXMBAApMaGVsbG8vaGk7AQAEbWFpbgEAFihbTGphdmEvbGFuZy9TdHJpbmc7KVYBAARhcmdzAQATW0xqYXZhL2xhbmcvU3RyaW5nOwEABGZpbGUBAA5MamF2YS9pby9GaWxlOwEAD2ZpbGVJbnB1dFN0cmVhbQEAGUxqYXZhL2lvL0ZpbGVJbnB1dFN0cmVhbTsBAAVieXRlcwEAAltCAQABYgEAEkxqYXZhL2xhbmcvU3RyaW5nOwEACkV4Y2VwdGlvbnMHADoBAApTb3VyY2VGaWxlAQAHaGkuamF2YQwAEAARAQAMamF2YS9pby9GaWxlAQBGQzpcVXNlcnNcZGluZzB4MFxEZXNrdG9wXHRlc3RcYWdlbnQtdGVzdFx0YXJnZXRcY2xhc3Nlc1xoZWxsb1xoaS5jbGFzcwwAEAA7AQAXamF2YS9pby9GaWxlSW5wdXRTdHJlYW0MABAAPAwAPQA+DAA/AEAMAEEAEQcAQgwAQwBGBwBHDABIAEkHAEoMAEsATAcATQwATgA7AQAIaGVsbG8vaGkBABBqYXZhL2xhbmcvT2JqZWN0AQATamF2YS9pby9JT0V4Y2VwdGlvbgEAFShMamF2YS9sYW5nL1N0cmluZzspVgEAEShMamF2YS9pby9GaWxlOylWAQAGbGVuZ3RoAQADKClKAQAEcmVhZAEABShbQilJAQAFY2xvc2UBABBqYXZhL3V0aWwvQmFzZTY0AQAKZ2V0RW5jb2RlcgEAB0VuY29kZXIBAAxJbm5lckNsYXNzZXMBABwoKUxqYXZhL3V0aWwvQmFzZTY0JEVuY29kZXI7AQAYamF2YS91dGlsL0Jhc2U2NCRFbmNvZGVyAQAOZW5jb2RlVG9TdHJpbmcBABYoW0IpTGphdmEvbGFuZy9TdHJpbmc7AQAQamF2YS9sYW5nL1N5c3RlbQEAA291dAEAFUxqYXZhL2lvL1ByaW50U3RyZWFtOwEAE2phdmEvaW8vUHJpbnRTdHJlYW0BAAdwcmludGxuACEADgAPAAAAAAACAAEAEAARAAEAEgAAAC8AAQABAAAABSq3AAGxAAAAAgATAAAABgABAAAACAAUAAAADAABAAAABQAVABYAAAAJABcAGAACABIAAAClAAMABQAAADe7AAJZEgO3AARMuwAFWSu3AAZNK7YAB4i8CE4sLbYACFcstgAJuAAKLbYACzoEsgAMGQS2AA2xAAAAAgATAAAAIgAIAAAACgAKAAsAEwAMABsADQAhAA4AJQAQAC4AEQA2ABIAFAAAADQABQAAADcAGQAaAAAACgAtABsAHAABABMAJAAdAB4AAgAbABwAHwAgAAMALgAJACEAIgAEACMAAAAEAAEAJAACACUAAAACACYARQAAAAoAAQAyADAARAAJ";
        classByteMap.put("hello.hello", hello);
        classByteMap.put("hello.hi", hi);
        byte[] bytes = Base64.getDecoder().decode(classByteMap.get(name));
        return defineClass(name, bytes, 0, bytes.length);
    }
}
