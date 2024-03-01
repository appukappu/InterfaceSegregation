//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConvertionService convertionService = new ConvertionService();
        convertionService.currencyConvert(300,"USD","EUR");
        SBIBankExchange sbiBankExchange = new SBIBankExchange();
        sbiBankExchange.SBITax(convertionService,"USD");
        }
    }
