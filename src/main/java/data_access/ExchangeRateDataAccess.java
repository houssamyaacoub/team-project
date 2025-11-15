package data_access;

import java.util.List;
import java.util.Map;

public interface ExchangeRateDataAccess {
    Map<String, Double> getMultipleRates(String base, List<String> targets);
}
