package tset_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\aaa\\ccc\\test.txt");
        FileOutputStream fos =new FileOutputStream("F:\\aaa\\ccc\\test1.txt");
        int b;
        while((b = fis.read()) != -1){
            System.out.print((char)b);
            fos.write(b);
        }
        fis.close();
    }
}
