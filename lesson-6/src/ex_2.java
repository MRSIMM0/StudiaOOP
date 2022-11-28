interface Number{
    double doubleValue();
}

class Logarithm implements Number {

    private final double base, argument;

    private void validateBase(double base){
        if(base == 1.0){
            throw new IllegalArgumentException("Base should not be equal to 1");
        }

        if(base <=0.0){
            throw new IllegalArgumentException("Base should be greater than 0");
        }
    }

    private void validateArgument(double argument){
        if(argument <=0){
            throw new IllegalArgumentException("Argument should be greater than 0");
        }
    }


    @Override
    public double doubleValue() throws IllegalArgumentException {

        validateBase(base);
        validateArgument(argument);

        return Math.log(this.argument)/Math.log(this.base);

    }

    public Logarithm(double base, double argument) {
        this.base = base;
        this.argument = argument;
    }
}

public class ex_2 {
    public static void main(String[] args) {
        try {
            double value = new Logarithm(10, 10).doubleValue();
            System.out.println(value);
        }catch (IllegalArgumentException e){
            System.out.println(String.format("IllegalArgumentException: %s",e.getMessage()));
        }
    }

}
