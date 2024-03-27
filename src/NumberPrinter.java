public class NumberPrinter implements Runnable{
    int i;
    public NumberPrinter(int i)
    {
        this.i=i;
    }

    public NumberPrinter() {

    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
