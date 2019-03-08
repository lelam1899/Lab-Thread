
public class MyThread extends Thread {
    public void run(){
        int n = 0;
        for (int i=2;n<10;i++){
            if(checkSNT(i)){
                System.out.println("SNT: "+i);
                n++;
                try {
                    Thread.sleep(1500);
                }catch (InterruptedException e){}
            }
        }
    }

    public static boolean checkSNT(int n){
        for (int i=2;i<=n/2;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}


