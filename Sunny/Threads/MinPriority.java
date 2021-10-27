public class MinPriority extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
        MinPriority t1=new MinPriority();    
        // print the minimum priority of this thread  
        t1.setPriority(Thread.MIN_PRIORITY);    
        // This will call the run() method  
        t1.start();    
    }    
}  