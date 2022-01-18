package AllDiceGame;

public class Dice {

    final int MAX = 6;
    final int MIN = 1;
    int range;

    // 기본 생성자
    public Dice ( ) {range = MAX - MIN + 1;}

    // 값을 돌려줄때는 return값을 쓴다.
    public int rollDice () { return (int)(Math.random() * range + MIN); }

}
