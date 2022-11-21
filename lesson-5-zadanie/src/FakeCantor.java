import java.util.HashMap;

public class FakeCantor {
  private final HashMap<String, Float> rates = new HashMap<>() {{
    put("USD", 1.0366f);
    put("GBP", 0.87063f);
    put("CHF", 0.9881f);
    put("JPY", 145.12f);
  }};

  public HashMap<String, Float> euroToRates() {
    return this.rates;
  }
  public FakeCantor() {
  }

}
