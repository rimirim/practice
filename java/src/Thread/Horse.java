import java.util.Random;

public class Horse implements Runnable {
    private String horseName;
    private int waitingTime;
    // Random을 만드는 또 다른 방법중 하나인 Random 클래스
    private final static Random generator = new Random();

    public Horse (String name) {
        horseName = name;
        waitingTime = generator.nextInt(7777) + 7777;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(waitingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(horseName + "가(이) 경주를 완료하였습니다!!!");
    }
}
