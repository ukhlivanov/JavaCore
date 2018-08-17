package hackerrank;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class App11 {
    public static void main(String[] args) throws ParseException {

            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();


            NumberFormat nfFrench = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            NumberFormat nfChinese = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat nfIndian = NumberFormat.getCurrencyInstance(Locale.US);

            String china = nfChinese.format(payment);
            String us = nfUS.format(payment);
            String france = nfFrench.format(payment);
            String india = nfIndian .format(payment);

            String replacedStr = india.replace('$', 'R');
            String replacedStr1 = replacedStr.replaceAll("R", "Rs.");



            System.out.println("US: " + us);
            System.out.println("India: " + replacedStr1);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
    }

