public class Main {
  public static void main(String[] args) {

    FakeCantor fakeCantor = new FakeCantor();
    Euro euro = new Euro(10,fakeCantor.euroToRates());

    System.out.println(euro.balance());

    euro = euro.addedCurrency(10,"GBP");

    System.out.println(euro.balance());

    euro = euro.subtractedCurrency(2,"USD");

    System.out.println(euro.balance());

    System.out.println( euro.abbreviation());

    System.out.println(euro.symbol());

    System.out.println(euro.toDollarExchangeRate());


  // TODO: showcase example of usage
  }
}