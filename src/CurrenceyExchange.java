public interface CurrenceyExchange {

    Boolean login(String userName, String password);
    double currencyConvert(int amount,String fromCurrency,String toCurrency);


}
