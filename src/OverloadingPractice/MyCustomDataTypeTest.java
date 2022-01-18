package OverloadingPractice;

public class MyCustomDataTypeTest {
    public static void main(String[] args) {

        MyCustomDataType mcdt0 = new MyCustomDataType();

        System.out.println();

        MyCustomDataType mcdt = new MyCustomDataType(1,2,3);
        MyCustomDataType mcdt2 = new MyCustomDataType(2,2,2);

        mcdt.allocRandom();
        System.out.println(mcdt);
        mcdt2.allocRandom();
        System.out.println(mcdt2);

        System.out.println();

        MyCustomDataType mcdt3 = new MyCustomDataType(2, MyCustomDataType.INT_CASE);
        mcdt3.allocIntRandom();
        System.out.println(mcdt3);

        MyCustomDataType mcdt4 = new MyCustomDataType(2, MyCustomDataType.FLOAT_CASE);
        mcdt4.allocFloatRandom();
        System.out.println(mcdt4);

        MyCustomDataType mcdt5 = new MyCustomDataType(2, MyCustomDataType.DOUBLE_CASE);
        mcdt5.allocDoubleRandom();
        System.out.println(mcdt5);


    }

}
