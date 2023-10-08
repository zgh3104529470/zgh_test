package tset_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\aaa\\ccc\\test.txt");
        byte[] bytes = new byte[9];
        int len1 = fis.read(bytes);
        String str = new String(bytes,0,len1);
        System.out.println(str);
        fis.close();
    }
}
