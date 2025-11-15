package data_access;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryExchangeRateDataAccess implements ExchangeRateDataAccess {

    private final Map<String, Double> sampleRates = Map.of(
            "CADUSD", 0.75,
            "CADEUR", 0.69,
            "CADJPY", 111.20,
            "CADGBP", 0.58
    );

    @Override
    public Map<String, Double> getMultipleRates(String base, List<String> targets) {
        Map<String, Double> result = new HashMap<>();
        for (String t : targets) {
            String key = base + t;
            if (sampleRates.containsKey(key)) {
                result.put(t, sampleRates.get(key));
            }
        }
        return result;
    }
}
