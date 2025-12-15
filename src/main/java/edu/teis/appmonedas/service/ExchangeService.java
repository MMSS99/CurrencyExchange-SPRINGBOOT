package edu.teis.appmonedas.service;

import edu.teis.appmonedas.storage.CurrencyStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeService {

    private final CurrencyStorage currencyStorage;

    @Autowired
    public ExchangeService(CurrencyStorage currencyStorage) {
        this.currencyStorage = currencyStorage;
    }

    public Double exchangeRate(Double value, String baseCurrency, String exchangedCurrency) {
        Double rate = currencyStorage.GetExchangeRate(baseCurrency, exchangedCurrency);
        return value * rate;
    }
}
