package tset_4;

import java.io.File;
import java.io.IOException;

public class Filetest1 {
    public static void main(String[] args) throws IOException {
        File file = new File("Projec= new File(t\\a.txt");
        file.mkdirs();
        File src = new File(file,"a.txt");
        boolean b = src.createNewFile();
        if(b){
            System.out.println("创建成功");
        }else{
            System.out.println("创建失败");
        }
        File f1 = new File("F:\\aaa");
        Havetxt(f1);
        File fx = new File("F:\\aaa");
        delete(fx);
    }
    public static void Havetxt(File file){
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 :files) {
                File f = file1;
                if(f.isFile() && f.getName().endsWith(".txt")){
                    System.out.println(f);
                } else if (f.isDirectory()) {
                    Havetxt(f);
                }
            }
        }
    }
    public static void delete(File scr){
        File[] files = scr.listFiles();
        for (File file : files) {
            if(file.isFile()){
                file.delete();
            }else{
                delete(file);
            }
        }
        scr.delete();
    }
}
