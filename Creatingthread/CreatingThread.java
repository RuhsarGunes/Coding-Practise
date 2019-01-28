/*
 How to run a thread?
 */
package creatingthread;

/*
 Thread: a program path of execution. e.g. typing hello world in MSWord is executed by a thread.
 Process: a program in execution. There could be 1 or more threads in a process. e.g. opening up MSWord 
 There are two ways to create a thread:
        1- extending Thread class
        2- implementing the runnable interface
 */
public class CreatingThread {

    public static void main(String[] args) {
       
        MyThread mt = new MyThread();
        mt.start();
        
        MyThread2 mt2 = new MyThread2();
        Thread t = new Thread(mt2);
        t.start();
    }  
}
