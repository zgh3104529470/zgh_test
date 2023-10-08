package tset_5;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo1 {
    public static void main(String[] args) throws IOException {

        //true代表续写开关
        FileOutputStream fos = new FileOutputStream("F:\\aaa\\ccc\\test.txt",true);
        /*fos.write(97);
        fos.close();
        byte[] bytes = {97,98,99};
        fos.write(bytes);
        fos.close();*/
        byte[] bytes = {97,98,99};
        String str = "\r\n";
        byte[] bytes1 = str.getBytes();
        fos.write(bytes1);
        fos.write(bytes,0,1);
        fos.close();

    }
}
