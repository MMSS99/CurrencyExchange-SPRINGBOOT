package edu.teis.appmonedas.storage;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.Map;

@Component
public class CurrencyStorage {

    public Double GetExchangeRate(String baseCurrency, String exchangedCurrency){
        ObjectMapper mapper = new ObjectMapper();
        String baseAPIUrl = "https://api.frankfurter.app/latest?from=%s&to=%s";
        String APIUrl = String.format(baseAPIUrl, baseCurrency, exchangedCurrency);

        Map<String, Object> response = null;
        Map<String, Object> rates = null;
        Double exchangeRate = null;

        try{
            response = mapper.readValue(new URL(APIUrl), new TypeReference<Map<String, Object>>(){});
            rates = mapper.convertValue(response.get("rates"), new TypeReference<Map<String, Object>>(){});
            exchangeRate = mapper.convertValue(rates.get(exchangedCurrency), Double.class);

        } catch (Exception e){
            e.printStackTrace();
        }

        return exchangeRate;
    }
}
