package tset_4;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File f2 = new File("F:\\aaa");
        boolean b1 = f2.mkdir();
        System.out.println(b1);
        File f3 = new File("F:\\aaa\\ccc");
        boolean b2 = f3.mkdir();
        System.out.println(b2);
        File f1 = new File("F:\\aaa\\ccc\\test.txt");
        boolean b = f1.createNewFile();
        System.out.println(b);
        File f4 = new File("F:\\aaa");
        long x = getLen(f4);
        System.out.println(x);
        System.out.println(getCount(f4));

    }
    public static long getLen(File scr){
        long len = 0;
        File[] files = scr.listFiles();
        for (File file : files) {
            if(file.isFile()){
                len = len + file.length();
            }else{
                len = len + getLen(file);
            }
        }
        return len;
    }
    public static HashMap<String,Integer> getCount(File f){
        HashMap<String,Integer> hm = new HashMap<>();
        File[] files = f.listFiles();
        for (File file : files) {
            if(file.isFile()){
                String name  = file.getName();
                String[] arr = name.split("\\.");
                if (arr.length >= 2) {
                    String n = arr[arr.length - 1];
                    if (hm.containsKey(n)) {
                        int count = hm.get(n);
                        count++;
                        hm.put(name,count);
                    }else{
                        hm.put(n,1);
                    }
                }
            }else {
                HashMap<String,Integer> sonMap = getCount(file);
                Set<Map.Entry<String,Integer>> s = sonMap.entrySet();
                for (Map.Entry<String, Integer> stringIntegerEntry : s) {
                    String key = stringIntegerEntry.getKey();
                    int value = stringIntegerEntry.getValue();
                    if(hm.containsKey(key)){
                        int count = hm.get(key);
                        count = count + value;
                        hm.put(key,count);
                    }else {
                        hm.put(key,value);
                    }
                }

            }
        }
        return hm;
    }
}
