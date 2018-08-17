package code30days.App27;


import java.util.Random;

public class Testing1 {
    public static void main(String[] args) {

        int t = (randInt(1, 5));
        System.out.println(t);
        for (int i = 0; i < t; i++) {
            Lecture lecture = new Lecture ();
            System.out.println(lecture.countedStudents + " " + lecture.cancellationThreshold);
            System.out.println(lecture.arrivalTimeList);

        }
    }


    static int randInt(int min, int max) {
        Random rn = new Random();
        return rn.nextInt((max - min) + 1) + min;
    }

    public static class Lecture {
        int countedStudents = randInt(3, 200);
        int cancellationThreshold = randInt(1, countedStudents);

        String arrivalTimeList = generateString(countedStudents);

        private static String generateString (int cStudents) {
            StringBuilder resultString = new StringBuilder("");
            for (int i = 0;i < cStudents; i++){
                resultString.append(randInt(-1000, 1000)).append(" ");
            }
            return resultString.toString();
        }
    }
}
