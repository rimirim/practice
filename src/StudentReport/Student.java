package StudentReport;

import StudentReport.Score;

public class Student {

    String name;
    int age;
    String major;


    public void info (String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;

        System.out.printf("[%s, %d, %s]\n", name, age, major);
    }

    public void achievement (){
        Score score = new Score();

        score.initScore();
    }
}
