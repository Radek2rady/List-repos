package AbstractsInterfaces.charsequence;

public class ShiftedCharSequence implements CharSequence {
    private String sequence;
    private int numCharToShift;

    public ShiftedCharSequence(String sequence, int numCharToShift) {
        this.sequence = sequence;
        this.numCharToShift = numCharToShift;
    }

    @Override
    public int length() {
        return this.length() * 2;
    }

    @Override
    public char charAt(int index) {
        if ((index + numCharToShift) > sequence.length()) {
            return this.sequence.charAt((index + numCharToShift) - sequence.length());
        } else {
            return this.sequence.charAt(index + numCharToShift);
        }
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder sub = new StringBuilder();
        if ((start + numCharToShift) < sequence.length()) {
            StringBuilder sub1 =
                    new StringBuilder(sequence.subSequence(start + numCharToShift, sequence.length()));
            StringBuilder sub2 =
                    new StringBuilder(sequence.subSequence(0, start + numCharToShift));
            sub.append(sub1);
            sub.append(sub2);
        } else {
            StringBuilder sub1 =
                    new StringBuilder(sequence.subSequence(start + numCharToShift - sequence.length(), sequence.length()));
            StringBuilder sub2 =
                    new StringBuilder(sequence.subSequence(0, start + numCharToShift - sequence.length()));
            sub.append(sub1);
            sub.append(sub2);
        }
        return sub.toString();
    }
}
