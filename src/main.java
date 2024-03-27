public class main {
    public static void main(String[] args) {
       Printer printer=new Printer(10);

       Thread t1= new Thread(() ->
        {
            printer.printEven();
        });

       Thread t2 = new Thread(() ->
       {
           printer.printOdd();
       });
       t1.start();;
       t2.start();


//        even.join();
//        odd.join();




    }
}
