package pl.vistula.wyklady.wielowątkowość;

class MyThreadVer3 implements Runnable {
    Thread thread;

    MyThreadVer3(String name) {
        thread = new Thread(this, name);
    }

    public static MyThreadVer3 createAndStart(String name) {
        MyThreadVer3 myThreadVer3 = new MyThreadVer3(name);
        myThreadVer3.thread.start();
        return myThreadVer3;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " rozpoczyna dzialanie");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println(thread.getName() + " jest wykonywany, wartosc licznika: " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + " zostal przerwany");
        }
        System.out.println(thread.getName() + " konczy dzialanie");
    }

}

public class MoreThreads2 {
    public static void main(String[] args) {
        System.out.println("Glowny watek rozpoczyna dzialanie");
        MyThreadVer3 myThreadVer1 = MyThreadVer3.createAndStart("wątek potomny nr 1");
        MyThreadVer3 myThreadVer2 = MyThreadVer3.createAndStart("wątek potomny nr 2");
        MyThreadVer3 myThreadVer3 = MyThreadVer3.createAndStart("wątek potomny nr 3");
        try {
            Thread.sleep(100);
            myThreadVer1.thread.join();
            myThreadVer2.thread.join();
            myThreadVer3.thread.join();

        }catch (InterruptedException e){
            System.out.println("wątek glowny zostal przerwany");
        }
        System.out.println("wątek glowny konczy dzilanie");
    }
}
