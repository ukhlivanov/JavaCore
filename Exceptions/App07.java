package Exceptions;


public class App07 {
    public static void main(String[] args) {
        try(FailClose x = new FailClose("X")){
            try(FailClose y = new FailClose("Y")){

                throw new Error("E");
            }

        }

    }
}
