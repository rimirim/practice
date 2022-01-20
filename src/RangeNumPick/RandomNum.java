package RangeNumPick;

public class RandomNum {

    final int start;
    final int end;
    int range;

    int num;
    int sum;
    int randNum;

    int[] numArr;

    public RandomNum(final int start, final int end) {

        this.start = start;
        this.end = end;

        range = end - start + 1;
        numArr = new int[range];
    }

    // 배열에 start값 부터 end값까지의 값을 할당해야함

    public void allcArr() {
        for (int i = start - 1; i < end; i++) {
            numArr[i] = start + i;
        }
    }

    public void iseven() {
        for (int i = start - 1; i < end; i++) {
            if (numArr[i] % 2 == 0) {
                System.out.println(numArr[i]);
            }
        }
    }

    public void multiplePrint(final int num) {
        this.num = num;
        sum = 0;
        System.out.printf("%d의 배수를 출력합니다\n", num);

        for (int i = start - 1; i < end; i++) {
            if (numArr[i] % num == 0) {
                sum += numArr[i];
                System.out.println(numArr[i]);
            }
        }
        System.out.printf("%d의 배수의 합계 : %d\n", num, sum);
    }

    public void choiceRandNum(final int randStart, final int randEnd) {
        range = randEnd - randStart + 1;
        randNum = (int) (Math.random() * range + randStart);

        System.out.printf("선택된 숫자는 %d입니다\n", randNum);
        for (int i = start - 1; i < end; i++) {
            if (numArr[i] % randNum == 0) {
                System.out.println(numArr[i]);
            }
        }
    }

    // ************
    // 찾는 난수의 근처 배수값까지의 차이
    public void loopChoiceRandNum(final int randStart, final int randEnd) {
        range = randEnd - randStart + 1;
        int tmp = 0;

        for (int i = start - 1; i < end; i++) {
            randNum = (int) (Math.random() * range + randStart);
            if (numArr[i] % randNum != 0) {
                tmp = (numArr[i] / randNum + 1) * randNum - numArr[i];
                // 현재 숫자 (numArr[i]의 값) 근처값 중, 난수로 나누어 떨어지는 수
                // (몫+1) * 난수
                i += tmp;
            }
            if (i < 100){
                System.out.printf("%d의 배수 %d\n", randNum, numArr[i]);
            }
        }
    }

    public void loopMoveRandNum(final int randStart, final int randEnd) {
        range = randEnd - randStart + 1;

        for (int i = start - 1; i < end ; i+=randNum ){
            randNum = (int)(Math.random() * range + randStart);
            System.out.printf("%d 이후 %d 만큼 이동\n", numArr[i], randNum);
            }
        }

    }
