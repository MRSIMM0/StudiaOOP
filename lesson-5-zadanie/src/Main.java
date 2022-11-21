public class Main {
  public static void main(String[] args) {

    FakeCantor fakeCantor = new FakeCantor();
    Euro euro = new Euro(100,fakeCantor.euroToRates());

    System.out.println(euro.balance());

    euro = euro.addedCurrency(10,"USD");

    System.out.println(euro.balance());

    euro = euro.subtractedCurrency(1000,"GBP");


    System.out.println(euro.balance());

    System.out.println( euro.abbreviation());

    System.out.println(euro.symbol());

    System.out.println(euro.toDollarExchangeRate());



  // TODO: showcase example of usage
  }
}