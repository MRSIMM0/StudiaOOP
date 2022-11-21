import java.util.HashMap;

public class Euro implements Currency {

    private final float balance;

    private final HashMap<String, Float> rates;

    public Euro(float balance, HashMap rates) {
        this.balance = balance;
        this.rates = rates;
    }

    @Override
    public Euro addedCurrency(float value, String currency) {
        try{
            return new Euro(this.balance +  (rates.get(currency) * value),this.rates);
        }catch (NullPointerException e){
            System.out.println("No such currency");
            return this;
        }
    }

    @Override
    public Euro subtractedCurrency(float value, String currency) {
    float subtraction = 0;

        try {
            subtraction =  this.balance  - (value * rates.get(currency));
            if (subtraction < 0) {
                System.out.println("Operation cannot be executed ");
                return this;
            }
            return new Euro(subtraction, this.rates);


        } catch (NullPointerException e) {
            return this;
        }
    }
    @Override
    public String abbreviation() {
        return "EUR";
    }

    @Override
    public String symbol() {
        return "€";
    }

    @Override
    public String balance() {
        return String.format("%f",this.balance);
    }

    @Override
    public float toDollarExchangeRate() {
        return rates.get("USD") * this.balance;
    }
}
