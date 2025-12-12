package edu.teis.appmonedas.storage;

import tools.jackson.databind.ObjectMapper;

public class CurrencyStorage {

    public Float GetExchangeRate(String baseCurrency, String exchangedCurrency){
        ObjectMapper mapper = new ObjectMapper();
        String baseAPIUrl = "https://api.frankfurter.app/latest?from=%s&to=%s";
        String APIUrl = String.format(baseAPIUrl, baseCurrency, exchangedCurrency);

    }
}
