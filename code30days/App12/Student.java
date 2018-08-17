package code30days.App12;

public class Student extends Person {
    private int[] testScores;
    private char Letter;

    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public char calculate(){
        int avrScr = 0;
        for (int i=0; i<testScores.length; i++){
            avrScr = avrScr+testScores[i];
        }
       if (90<=avrScr/testScores.length && avrScr/testScores.length<=100){Letter = 'O';}
       if (80<=avrScr/testScores.length && avrScr/testScores.length< 90) {Letter = 'E';}
       if (70<=avrScr/testScores.length && avrScr/testScores.length< 80) {Letter = 'A';}
       if (55<=avrScr/testScores.length && avrScr/testScores.length< 70) {Letter = 'P';}
       if (40<=avrScr/testScores.length && avrScr/testScores.length< 55) {Letter = 'D';}
       if ( avrScr/testScores.length<40){Letter = 'T';}
       return Letter;
    }
}
