package tset_6;

public class Mythread extends Thread{
    @Override
    public  void  run(){
        for(int i = 0;i<100;i++){
            System.out.println("hello world");
        }
    }
}
