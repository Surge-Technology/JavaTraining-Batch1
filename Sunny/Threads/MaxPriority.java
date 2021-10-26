public class MaxPriority extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
    	MaxPriority t1=new MaxPriority();    
        // print the maximum priority of this thread  
        t1.setPriority(Thread.MAX_PRIORITY);    
        // call the run() method  
        t1.start();    
    }    
}  