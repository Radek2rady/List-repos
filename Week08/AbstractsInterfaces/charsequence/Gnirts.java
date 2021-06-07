package AbstractsInterfaces.charsequence;

public class Gnirts implements CharSequence {
    private String sequence;
    CharSequence reversedSequence;

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public Gnirts(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public int length() {
        return sequence.length();
    }

    @Override
    public char charAt(int index) {
        return this.sequence.charAt(sequence.length() - index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder sub =
                new StringBuilder(sequence.subSequence(0, sequence.length()));
        return sub.reverse();
    }
}