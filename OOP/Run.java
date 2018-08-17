package OOP;


public class Run {
    public static void main(String[] args) {

        BMW x6 = new BMW();
        Audi A5 = new Audi();

        x6.setCol("Black");
        A5.setCol("White");

        x6.setModel("X6");
        A5.setModel("A5");

        x6.print(x6);
        A5.print(A5);


    }
}
