public class RandomNum {

    final int start;
    final int end;
    int range;
    int num;
    int sum;

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

}
