package RangeNumPick;

import RangeNumPick.RandomNum;

public class RandomPrintTest {
    public static void main(String[] args) {

        RandomNum rn = new RandomNum(1, 100);
        rn.allcArr();

        // 1 ~ 100까지 숫자중 짝수만 출력해보자.

        rn.iseven();
        System.out.println();
        // 1 ~ 100까지 숫자중 3의 배수만 출력해보자!
        // 1 ~ 100까지 숫자중 4의 배수를 더한 결과를 출력해보자!

        rn.multiplePrint (3);
        rn.multiplePrint (4);
        System.out.println();
        // 2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력해보도록 한다.

        rn.choiceRandNum (2, 10);
        System.out.println();
        // 2 ~ 10 사이의 랜덤한 숫자를 선택하고 이 숫자의 배수를 출력한다.
        // 다음 루프에서 다시 랜덤 숫자를 선택하고 해당 숫자의 배수를 출력한다.

        rn.loopChoiceRandNum (2, 10);
        System.out.println();
        // 이번에는 배수를 찾는게 아니라 랜덤한 숫자가 나온만큼만 이동하고
        // 이동했을때 나온 숫자들의 합을 계산하도록 만들어보자!

        rn.loopMoveRandNum (2, 10);
        System.out.println();

    }
}
