public class ConvertionService implements Convertion {


    String localcardNumber = "12344";
    String localPin = "1234";

    double convertedAmount;

    @Override
    public Boolean login(String cardNumber, String pin) {
        if (localcardNumber.equals(cardNumber) && localPin.equals(pin)) {
            return true;

        }
        return false;
    }
    @Override
    public double convertToEUR(double amount) {
        return amount * USD_TO_EUR_RATE;
    }

    @Override
    public double convertToUSD(double amount) {
        return amount * EUR_TO_USD_RATE;

    }

    @Override
    public double convertToGBP(double amount) {
        return amount * USD_TO_GBP_RATE;

    }

    public double currencyConvert(int amount,String fromCurrency,String toCurrency) {
        if (fromCurrency.equals("USD")) {
            if (toCurrency.equals("EUR"))
                convertedAmount = convertToEUR(amount);
        } else if (fromCurrency.equals("EUR")) {
            if (toCurrency.equals("USD"))
                convertedAmount = convertToUSD(amount);
        } else if (fromCurrency.equals("GBP")) {
            if (toCurrency.equals("USD")) {
                convertedAmount = convertToGBP(amount);
            }
        }

        // Print result or error message
        if (convertedAmount != 0) {
            System.out.println(amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);
        } else {
            System.out.println("Conversion not supported for given currencies.");
        }

        return convertedAmount;
    }
}


