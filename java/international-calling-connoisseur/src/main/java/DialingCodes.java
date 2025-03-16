import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    private Map<Integer, String> dialingCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!dialingCodes.containsKey(code) && !dialingCodes.containsValue(country)) {
            dialingCodes.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> code : dialingCodes.entrySet()) {
            if (code.getValue().equals(country)) {
                return code.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (findDialingCode(country) != null)
        {
            dialingCodes.remove(findDialingCode(country));
            dialingCodes.put(code, country);
        }
    }
}
