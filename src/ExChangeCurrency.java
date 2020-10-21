import java.util.InputMismatchException;
import java.util.Scanner;

public class ExChangeCurrency {
    public static void main(String[] args) {

        ExchangeAPI obj = new ExchangeAPI();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("### Currency Exchange System ###");
            System.out.print("Please, Enter your current currency:");
            String currentCurrency = scanner.nextLine();
            if (obj.getConnection(currentCurrency) == false)
                System.out.println("Sorry, we can't find this currency rate");
            else {
                System.out.print("Amount: ");
                double amount = Double.parseDouble(scanner.nextLine());

                System.out.print("Enter new currency: ");
                String newCurrency = scanner.nextLine();

                double rate = obj.getEachRate(newCurrency);

                System.out.println("\nExchange"+currentCurrency+" to "+newCurrency);
                System.out.println("\t"+currentCurrency+": "+amount);
                System.out.println("\t"+newCurrency+": "+(amount*rate));

            }
        }catch (InputMismatchException e ){
            e.printStackTrace();
        }


    }//main

}//class
