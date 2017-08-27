import java.util.*;

public class 2DArraysSort {
    public static void main(String[] args) {
        Integer[][] myarr = {{0, 10}, {10, 9}, {2, 9}, {3, 9}, {4, 15}, {5, 10}, {6, 4}};

        for (Integer[] i : myarr) {
            System.out.print(i[0] + "," + i[1]);
        }

        Arrays.sort(myarr, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] int1, Integer[] int2) {
                Integer numOfKeys1 = int1[1]; //column 1
                Integer numOfKeys2 = int2[1];
                return numOfKeys1.compareTo(numOfKeys2);
            }
        });

        for (Integer[] i : myarr) {
            System.out.println(i[0] + "," + i[1]);
        }
    }
}
