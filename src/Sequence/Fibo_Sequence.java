package Sequence;

public class Fibo_Sequence {

    int [] fibo;
    int [] initArr;
    int length;

    public Fibo_Sequence (int[] arr){

        this.initArr = arr.clone();
        length = arr.length;

    }

    public void getData (int count){

        fibo = new int [count];
        initArr();

        for (int i = length; i < count; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
            System.out.println(fibo[i]);
        }

    }

    public void initArr () {
        for (int i = 0; i < length ; i++) {
            fibo[i] = initArr[i];
        }
    }

}
