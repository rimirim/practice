package OverloadingPractice;

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

        final static int INT_CASE = 1;
        final static int FLOAT_CASE = 2;
        final static int DOUBLE_CASE = 3;

        public MyCustomDataType (){
            System.out.println("[지금부터 오버로딩과 생성자를 활용한 데이터 타입 랜덤 배정을 시작하겠습니다 !]");
        }
        public MyCustomDataType (int intNum, int floatNum, int doubleNum){

            intArr = new int [intNum];
            floatArr = new float [floatNum];
            doubleArr = new double[doubleNum];

            setRange();

        }
        // 배열에 할당값 넣고 ,, 랜덤값을 구해야함.

        // 오버로딩 (mcdt3 ~ 테스트)
        public MyCustomDataType (int intNum, final int CASE){

            switch (CASE){
                case INT_CASE:
                    intArr = new int [intNum];
                    setIntRange();
                    break;
                case FLOAT_CASE:
                    floatArr = new float [intNum];
                    setFloatRange();
                    break;
                case DOUBLE_CASE:
                    doubleArr = new double [intNum];
                    setFloatRange();
                    break;
            }

        }

        public void setIntRange (){intRange = INT_MAX - INT_MIN + 1;}
        public void setFloatRange () {floatRange = FLOAT_MAX * BIAS - FLOAT_MIN * BIAS + 1;}

        public void setRange (){
            setIntRange();
            setFloatRange();
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

