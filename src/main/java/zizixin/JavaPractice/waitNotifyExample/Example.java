package zizixin.JavaPractice.waitNotifyExample;

public class Example { 
    public static void main(String[] args) {
        Object printACon = new Object();
        Object printBCon = new Object();
        new Thread(new PrintA(printACon, printBCon)).start();
        new Thread(new PrintB(printACon, printBCon)).start();
    }
}

class PrintA implements Runnable {
    private Object objectA = null;
    private Object objectB = null;

    PrintA(Object printACon, Object printBCon) {
        objectA = printACon;
        objectB = printBCon;
    }
    @Override
    public void run() {
        System.out.println("PrintA start......");
        for (int i = 1; i < 4; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("printA print " + i);
        }

        try {
            // A线程打印完了1、2、3后通知线程开始打印并且自身开始等待
            synchronized(objectA) {
                synchronized(objectB) {
                    objectB.notify();
                }
                objectA.wait();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("PrintA reStart......");
        for (int i = 7; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("printA print " + i);
        }
    }

}

class PrintB implements Runnable {
    private Object objectA = null;
    private Object objectB = null;

    PrintB(Object printACon, Object printBCon) {
        objectA = printACon;
        objectB = printBCon;
    }

    @Override
    public void run() {
        try {
            // 刚开始B线程等待A线程打印完1、2、3
            synchronized(objectB) {
                objectB.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PrintB start......");
        for (int i = 4; i < 7; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("printB print " + i);
        }

        // B线程打印完了4、5、6后就通知A线程继续打印
        synchronized(objectA) {
            objectA.notify();
        }       
    }   
}
