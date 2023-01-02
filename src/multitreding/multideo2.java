package multitreding;

public class multideo2 implements Runnable

{
    @Override
    public void run() {
        for (int i=1;i<=3;i++)
        {
            System.out.println("tush");
        }
    }

    public static void main(String[] args)
    {
multideo2 ref=new multideo2();
Thread tr=new Thread(ref);
Thread tr1=new Thread(ref);
tr.start();
tr1.start();
for (int i=1;i<=3;i++) {
    System.out.println("shar");
}
    }
}
