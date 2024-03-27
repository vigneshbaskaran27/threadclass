public class Printer {

    public int count;
    int number;
    public Printer(int count)
    {
        this.count=count;
        this.number=1;
    }

    public void printEven()
    {
        synchronized (this)
        {
            for(int i=number;i<count;i++)
            {
                if(i%2==0)
                {
                    System.out.println(i+" "+Thread.currentThread().getName());
                    notify();
                }
                else
                {
                   try{
                       wait();
                   }
                   catch (InterruptedException e)
                   {
                       e.printStackTrace();
                   }
                }
            }
        }
    }


    public void printOdd()
    {
        synchronized (this)
        {
            for(int i=number;i<count;i++)
            {
                if(i%2==1)
                {
                    System.out.println(i+" "+Thread.currentThread().getName());
                    notify();
                }
                else
                {
                    try{
                        wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
