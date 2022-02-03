package StudentReport;

import java.util.Scanner;

public class Score {

    final int TOTALSUB = 10;

    int [] score;
    String [] scoreName;

    int cnt;

    float sum;
    float variance;
    float stdDev;

    Scanner scan;

    public void initScore (){
        scan = new Scanner(System.in);
        cnt = 0;

        addSubject();
        addScore();
        printScore();
        System.out.println();
        getAverage();
        getstandardDeviation();

    }

    public void addSubject (){

        String [] backup = new String [TOTALSUB];
        System.out.print("다루고 싶은 과목을 입력하세요 : ");

        do {
            backup[cnt++] = scan.nextLine();
        } while(CheckContinue());
        // 일단 한번 실행은 무조건 일어나므로 do while을 쓴다

        scoreName =  new String [cnt];

        for (int i = 0; i < cnt; i++){
            scoreName[i] = backup[i];

        }

    }

    public boolean CheckContinue (){
        System.out.println("계속 입력하시겠습니까? (y/n)");

        while (true){
            String yOrN = scan.nextLine();

            if (yOrN.equals("n")){
                return false;
            } else if (yOrN.equals("y")){
                System.out.println("계속 입력하세요");
                return true;
            } else if (!scan.hasNextLine()){
                System.out.println("다시 입력하세요 (y/n)");
            }
            else {
                System.out.println("다시 입력하세요 (y/n)");
            }
        }
    }

    public void addScore () {
        score = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            System.out.printf("%s의 점수를 입력하세요 !", scoreName[i]);
            score[i] = scan.nextInt();
            if (score[i] < 0 || score[i] > 100) {
                System.out.println("다시 입력하세요");
                i = i-1;
            }
        }
    }

    public void printScore (){

        for (int i = 0; i < cnt; i++){
            System.out.printf("%4s의 점수 %d\n", scoreName[i], score[i]);
        }
    }

    public void getAverage (){
        sum = 0;

        for(int i = 0; i < cnt; i++){
            sum += score[i];
        }
        System.out.println("평균 : \n" + sum/cnt);
    }

    public void getstandardDeviation (){
        variance = 0;

        for(int i = 0; i < cnt; i++){
            variance += Math.pow(sum - score[i],2);
        }

        variance /= cnt;
        stdDev = (float)Math.sqrt(variance);
        System.out.println("표준편차 : " + stdDev);
    }

}
