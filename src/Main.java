public class Main {
    public static void main(String[] args) {
        Thread []arryThread = new Thread[100];
        for(int i=0;i<100;i++){
            arryThread[i]= new Thread(new MyThread(i));
        }
        for(int i=0;i<100;i++){
            arryThread[i].start();
        }
    }
}
