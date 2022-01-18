public class MyCustomDataTypeTest {
    public static void main(String[] args) {

        MyCustomDataType mcdt = new MyCustomDataType (1,2,3);
        MyCustomDataType mcdt2 = new MyCustomDataType (2,2,2);

        System.out.println();

        mcdt.allocRandom();
        System.out.println(mcdt);

        mcdt2.allocRandom();
        System.out.println(mcdt2);


    }

}
