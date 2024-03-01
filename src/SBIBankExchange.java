public class SBIBankExchange extends ConvertionService{


    public  double SBITax(ConvertionService convertionService,String fromCurrency) {

            if ("USD".equals(fromCurrency)) {
                convertedAmount = convertedAmount - 20;
                System.out.println(convertedAmount);
            }
            if ("EUR".equals(fromCurrency)) {
                convertedAmount = convertedAmount - 40;
                System.out.println(convertedAmount);
            }
            if ("GBP".equals(fromCurrency)) {
                convertedAmount = convertedAmount - 30;
                System.out.println(convertedAmount);
            }

        return convertedAmount;
    }


}
