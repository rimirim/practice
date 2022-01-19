package Sequence;

import Sequence.Fibo_Sequence;
import Sequence.Rule_Sequence;

public class MySequenceTest {
        public static void main(String[] args) {

            int [] fiboArr = {1,1};
            Fibo_Sequence fibo = new Fibo_Sequence (fiboArr);

            fibo.getData(20);

            int [] ruleArr = {1, 1, 1};
            Rule_Sequence rule = new Rule_Sequence(ruleArr);

            rule.getData(25);

        }
    }

