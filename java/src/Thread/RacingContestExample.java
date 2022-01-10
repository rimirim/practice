public class RacingContestExample {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Horse("적토마"));
        Thread t2 = new Thread(new Horse("질풍마"));
        Thread t3 = new Thread(new Horse("뇌전마"));

        t1.start();
        t2.start();
        t3.start();
    }
}
