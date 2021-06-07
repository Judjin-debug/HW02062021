package com.company;

public class Ex31 {

    public static void main(String[] args) {
        benchMark(100000);
    };

    private static void benchMark (int reps) {

        long t, t1=0, t2=0;

        t = System.currentTimeMillis();
        stringConcat(reps);
        t1 += System.currentTimeMillis() - t;

        t = System.currentTimeMillis();
        stringBuilderConcat(reps);
        t2 += System.currentTimeMillis() - t;

        System.out.println("The string concat method took " + t1 + " ms, the string builder concat method took " + t2 + " ms");

    };

    private static void stringConcat (int reps) {
        String s = "";

        for (int i = 0; i < reps; i++) {
            s += "aaabbbccc";
        }
    };

    private static void stringBuilderConcat (int reps) {
      StringBuilder s = new StringBuilder("");
        for (int i = 0; i < reps; i++) {
            s.append("aaabbbccc");
        }
    };

}
