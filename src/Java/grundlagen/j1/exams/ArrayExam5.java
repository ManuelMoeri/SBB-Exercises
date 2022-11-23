package Java.grundlagen.j1.exams;

import java.util.Arrays;

public class ArrayExam5 {

    public static void DirectNeighbour(int[] numbers) {
        int[] myarray = new int[numbers.length];

        int repeat = numbers.length - 1;
        int repeat2 = numbers.length - 1;

        int repeats = 0;
        int count = 0;
        int IntermediateResult0 = 0;
        int IntermediateResult1 = 0;
        int IntermediateResult2 = 0;
        int IntermediateResult3 = 0;

        while (repeats <= repeat) {
            if (repeats == 0) {
                IntermediateResult0 = numbers[repeats] - numbers[repeats + 1];
                if (IntermediateResult0 < 0) {
                    IntermediateResult0 = IntermediateResult0 * -1;
                }
                if (IntermediateResult0 < 6 && IntermediateResult0 > -1) {

                    myarray[count] = numbers[repeats];

                    repeats++;
                    count++;
                    IntermediateResult0 = 0;
                } else {
                    repeats++;
                    IntermediateResult0 = 0;
                }
            } else if (repeats > 0 && repeats < repeat2) {
                IntermediateResult1 = numbers[repeat] - numbers[repeats + 1];
                IntermediateResult2 = numbers[repeat] - numbers[repeats - 1];
                if (IntermediateResult1 < 0) {
                    IntermediateResult1 = IntermediateResult1 * -1;
                }
                if (IntermediateResult2 < 0) {
                    IntermediateResult2 = IntermediateResult2 * -1;
                }
                if (IntermediateResult1 < 6 && IntermediateResult1 > -1 && IntermediateResult2 < 6 && IntermediateResult2 > -1) {

                    myarray[count] = numbers[repeats];

                    repeats++;
                    count++;
                    IntermediateResult1 = 0;
                    IntermediateResult2 = 0;
                } else {
                    repeats++;
                    IntermediateResult1 = 0;
                    IntermediateResult2 = 0;
                }
            } else if (repeats == repeat2) {
                IntermediateResult3 = numbers[repeats] - numbers[repeats - 1];
                if (IntermediateResult3 < 0) {
                    IntermediateResult3 = IntermediateResult3 * -1;
                }
                if (IntermediateResult3 < 6 && IntermediateResult3 > -1) {

                    myarray[count] = numbers[repeats];

                    repeats++;
                    count++;
                    IntermediateResult3 = 0;
                } else {
                    repeats++;
                }
            } else {
                repeats++;
            }
        }
        myarray = Arrays.copyOf(myarray, count);
        System.out.println(Arrays.toString(myarray));
    }



    public static void main(String[] args) {
        int[] numbers = {
                -8, 0, 13, 0, -8, 23, -22, 18, -6, -1,
                -21, -1, 2, 20, -24, 21, 25, -16, -10, -2,
                -20, 15, -15, 0, -16, -19, 13, 24, -3, 7,
                21, -15, 21, -11, 4, -17, 3, 11, 22, 12,
                11, 12, 6, -4, -21, -20, -24, -3, -25, -13,
                17, 19, 19, 20, 22, 9, -10, 12, 16, -1,
                21, -24, 12, 19, -7, 15, 5, -22, 23, 12,
                6, 2, -14, 12, 17, -13, 3, -4, -16, 8,
                16, 6, -23, 0, 3, -16, -6, -14, 8, 25,
                -22, 2, 7, 8, -6, 20, 3, -5, -19, -15};

        DirectNeighbour(numbers);
    }
}
