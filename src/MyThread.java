import java.math.BigInteger;

public class MyThread implements Runnable{
    private long namberForFactorial;

    public MyThread(long namberForFactorial) {
        this.namberForFactorial = namberForFactorial;
    }

    public MyThread() {

    }

    public long getNamberForFactorial() {
        return namberForFactorial;
    }

    private BigInteger calculeteFactorial(long namber) {

        BigInteger bigInteger =new BigInteger("1");
        for (int i = 1; i <= namber; i++) {
            bigInteger = bigInteger.multiply(new BigInteger(""+i));
        }
        return bigInteger;
    }
    @Override
    public void run() {
        Thread thread= Thread.currentThread();
        System.out.println(thread.getName()+" "+ namberForFactorial+" = "+calculeteFactorial(namberForFactorial));

    }
}
