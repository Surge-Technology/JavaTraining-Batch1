public class NormPriority extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
        NormPriority t1=new NormPriority();    
        // print the normal priority of this thread  
        t1.setPriority(Thread.NORM_PRIORITY);    
        // starting the thread   
        t1.start();    
    }    
}  