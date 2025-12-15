package edu.teis.appmonedas.service;

import edu.teis.appmonedas.storage.CurrencyStorage;

public class ExchangeService {

    private final CurrencyStorage currencyStorage = new CurrencyStorage();

    public Double exchangeRate(Double value, String baseCurrency, String exchangedCurrency) {
        Double rate = currencyStorage.GetExchangeRate(baseCurrency, exchangedCurrency);
        return value * rate;
    }
}
