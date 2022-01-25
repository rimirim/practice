package Sequence;
import java.math.BigInteger;

public class EqualRatio {

    // 등비수열 1, 2, 4, 8, 16, 32, 64 ...
    // BigInteger을 통해 50번째 항을 구해보자

    int ratio;

    public EqualRatio(final int ratio) {

        this.ratio = ratio;

    }

    public BigInteger getSeqData(final int count) {

        for (int i = 0; i < count; i++) {
            System.out.printf("%d^%d = %d\n", ratio, i,
                    BigInteger.valueOf(ratio).pow(i));
        }
        return BigInteger.valueOf(ratio).pow(count - 1);

    }
}
