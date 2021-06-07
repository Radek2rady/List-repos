package gymnocercusJadeFoundationNormalExam.TrickyAverage;

public class TrickyAverage {
    public static void main(String[] args) {
        int[] example1 = new int[]{3, 4, 5, 6};
        int[] example2 = new int[]{5, 2, 8, -1};
        int[] example3 = new int[]{5, 7, 9, 11};

        System.out.println(getTrickyAvg(example1));
        System.out.println(getTrickyAvg(example2));
        System.out.println(getTrickyAvg(example3));
    }

    public static double getTrickyAvg(int[] example) {
        double smallestOdd = Integer.MAX_VALUE;
        double largestEven = Integer.MIN_VALUE;
        double avg = 0;
        int nrOdd = 0;
        int nrEven = 0;
        for (int i = 0; i < example.length; i++) {
            if (Math.abs(example[i]) % 2 == 0) {
                nrEven++;
                if (Math.abs(example[i]) % 2 == 0 && example[i] > largestEven) {
                    largestEven = example[i];
                }
            } else if (Math.abs(example[i]) % 2 == 1) {
                nrOdd++;
                if (Math.abs(example[i]) % 2 == 1 && example[i] < smallestOdd) {
                    smallestOdd = example[i];
                }
            }
        }
        if (nrEven == 0) {
            largestEven = 0;
        } else if (nrOdd == 0) {
            smallestOdd = 0;
        }
        avg = (largestEven + smallestOdd) / 2;
        return avg;
    }
}
