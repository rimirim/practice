import java.util.Arrays;

public class MyCustomDataType {

    // int 1개 할당 float 2개 할당 double 3개 할당

    int [] intArr;
    float [] floatArr;
    double [] doubleArr;

    int intRange;
    float floatRange;

    final int INT_MAX = 100;
    final int INT_MIN = 10;

    final float FLOAT_MAX = 13.3f;
    final float FLOAT_MIN = -13.3f;
    final int BIAS = 100;


    public MyCustomDataType (int intNum, int floatNum, int doubleNum){

        intArr = new int [intNum];
        floatArr = new float [floatNum];
        doubleArr = new double[doubleNum];

        setRange();

    }
    // 배열에 할당값 넣고 ,, 랜덤값을 구해야함.

    public void intRange (){intRange = INT_MAX - INT_MIN + 1;}
    public void floatRange () {floatRange = FLOAT_MAX * BIAS - FLOAT_MIN * BIAS + 1;}

    public void setRange (){
        intRange();
        floatRange();
    }

    public void allocIntRandom (){
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = (int)(Math.random() * intRange + INT_MIN);
        }
    }
    public void allocFloatRandom (){
        for(int i = 0; i < floatArr.length; i++){
            float tmp = (float)(Math.random() * floatRange);

            tmp /= BIAS;

            floatArr[i] = tmp + FLOAT_MIN;
        }
    }
    public void allocDoubleRandom (){
        for (int i =0; i < doubleArr.length; i++){
            double tmp = (Math.random() * floatRange);

            tmp /= BIAS;

            doubleArr[i] = tmp + FLOAT_MIN;
        }
    }

    public void allocRandom (){

        allocIntRandom();
        allocFloatRandom();
        allocDoubleRandom();

    }

    @Override
    public String toString() {
        return "MyCustomDataType{" +
                "intArr=" + Arrays.toString(intArr) +
                ", floatArr=" + Arrays.toString(floatArr) +
                ", doubleArr=" + Arrays.toString(doubleArr) +
                '}';
    }
}


