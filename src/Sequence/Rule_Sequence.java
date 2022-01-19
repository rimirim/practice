package Sequence;

public class Rule_Sequence {

    int [] rule;
    int [] initArr;
    int length;

    public Rule_Sequence (int [] arr){

        this.initArr = arr.clone();
        length = arr.length;

    }

    public void getData (int count){

        rule = new int [count];
        initArr();

        for (int i = length; i < count; i++){

            rule[i] = rule[i-3] + rule[i-1];
            System.out.println(rule[i]);
        }
    }

    public void initArr(){
        for (int i = 0; i < length; i++){
            rule[i] = initArr[i];
        }
    }
}
