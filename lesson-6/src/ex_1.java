class IntegerPair  {

    private int a;

    private int b;

    public IntegerPair(int a,int b) {
        this.a = a;
        this.b = b;
    }

    public int max(){
        return this.a > this.b ? this.a : this.b;
    }

    public int min(){
        return this.a<this.b? this.a : this.b;
    }

    public double avg(){
        return  (double)(this.a + this.b) /2;
    }

}



public class ex_1 {
    public static void main(String[] args) {


        IntegerPair pair = new IntegerPair(4,-3);

        System.out.println(String.format("Max: %d, Min: %d AVG: %f",pair.min(),pair.max(),pair.avg()));



    }

    }