package AllDiceGame;

import java.util.Arrays;

public class DiceGameManager {

    int diceNum;
    Dice [] diceArr;
    int sum;

    public DiceGameManager (int diceNum){

        // sum 값을 0으로 초기화 하는 이유 : 오류가 날 수 있어서
        sum = 0;

        this.diceNum = diceNum;
        diceArr = new Dice [diceNum];

    }

    public void checkWin (int sum){
        if (sum % 2 == 0){
            System.out.println("당첨입니다");
        } else {
            System.out.println("손모가지를 내놓아라");
        }
    }

    public void playingGame (){
        int tmp;
        // tmp가 필요한 이유 : diceArr값을 저장할 곳이 필요하므로

        for (int i = 0; i < diceArr.length; i++){
            // diceArr에 Dice 기본 생성자(range값)를 적용시킴
            diceArr[i] = new Dice();

            tmp = diceArr[i].rollDice();
            System.out.printf("주사위 %d의 값은 %d\n", i+1, tmp);

            sum += tmp;
        }
        System.out.println("주사위 합계 : " + sum);

        checkWin(sum);
    }

}
