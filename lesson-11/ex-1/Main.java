interface Sequence{
    String printedSeq();
}

class Characters implements Sequence{

    String seq;

    public Characters(String seq) {
        this.seq = seq;
    }



    @Override
    public String printedSeq() {
        return seq;
    }
}



class LowerCased implements Sequence{

    private Sequence sequence;

    public LowerCased(Sequence sequence) {
        this.sequence = sequence;
    }


    @Override
    public String printedSeq() {
        return this.sequence.printedSeq().toLowerCase();
    }
}


class SubString implements Sequence{

    private Sequence sequence;
    private int substring;

    public SubString(Sequence sequence, int substring) {
        this.sequence = sequence;
        this.substring = substring;
    }

    @Override
    public String printedSeq() {
        return this.sequence.printedSeq().substring(substring);
    }
}

class Concatenation implements Sequence{
    Sequence sequence1;

    Sequence sequence2;

    public Concatenation(Sequence sequence1, Sequence sequence2) {
        this.sequence1 = sequence1;
        this.sequence2 = sequence2;
    }

    @Override
    public String printedSeq() {
        StringBuilder builder = new StringBuilder(this.sequence1.printedSeq());
        builder.append(this.sequence2.printedSeq());
        return builder.toString();
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println( new Concatenation(new SubString(new LowerCased(new Characters("Test")),1),new Characters("test2")).printedSeq());
    }
}