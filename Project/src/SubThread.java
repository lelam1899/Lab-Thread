
public class SubThread extends Thread {
    public void run(){
        int count = 11;
        for (int i=count; i>0;i--) {
            try {
              System.out.println(": "+i);
                Thread.sleep(1000);
            }catch (InterruptedException ex){

            }
        }
        System.out.println("CHUC MUNG");
    }
}
