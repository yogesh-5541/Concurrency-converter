import javax.crypto.DecapsulateException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;
public class Main {

public static double getExchageRate(String fromCurrency, String toCurrency){
    double exchangeRate =0.0;
    switch (fromCurrency + " to "+ toCurrency){
        case "USD to INR":
            exchangeRate=83.2;
            break;
        case "INR to USD":
            exchangeRate=0.012;
            break;
        case "EUR to USD":
            exchangeRate=1.05;
            break;
        case "USD to EUR":
            exchangeRate=0.95;
            break;
        case "EUR to INR":
            exchangeRate=88.2;
            break;
        case "INR to EUR":
            exchangeRate=0.011;
            break;
        default:
            System.out.println("Conversion rate is not available");
    }
    return exchangeRate;
}
public static void main(String[]args){
    Scanner num = new Scanner(System.in);
    System.out.println("Welcome to the concurrency convertere");
    System.out.println("Enter the amount you want to convert");
    int amt= num.nextInt();
    System.out.println("Enter the currency you are converting from(USD/INR/EUR)");
    String frCon=num.next();
    System.out.println("Enter the currency you are converting to(USD/INR/EUR)");
    String toCon=num.next();
    double exchangeRate= getExchageRate(frCon,toCon);
    if(exchangeRate!=0){
        double convertedAmount = amt*exchangeRate;
        System.out.println(convertedAmount);
    }
    num.close();


}


}