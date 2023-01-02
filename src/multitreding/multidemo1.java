package multitreding;

public class multidemo1 extends Thread
{
    @Override
    public void run() {
       for (int i=1;i<=4;i++)
       {
           try {
               sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println("tushar");
       }
    }

    public static void main(String[] args)
    {
        multidemo1 ref=new multidemo1();

        for (int i=1;i<=4;i++)
        {
            System.out.println("Bhosale");
        }

        Thread thread=new Thread(ref);
        thread.start();


    }
}
