package AbstractsInterfaces.charsequence;

public class Main {
    public static void main(String[] args) {
        Gnirts gnirts = new Gnirts("yesorno");
        System.out.println(gnirts.charAt(1));

        System.out.println(gnirts.subSequence(0, 7));

        ShiftedCharSequence shiftseq = new ShiftedCharSequence("example", 2);
        System.out.println(shiftseq.subSequence(3, 5));
    }
}
