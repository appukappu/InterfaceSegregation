public interface Convertion extends CurrenceyExchange{

      double USD_TO_EUR_RATE = 0.85;
      double USD_TO_GBP_RATE = 0.72;
      double EUR_TO_USD_RATE = 1.18;

    double convertToEUR(double amount);
    double convertToUSD(double amount);
    double convertToGBP(double amount);
}
