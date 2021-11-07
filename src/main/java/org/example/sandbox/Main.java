package org.example.sandbox;

public class Main {
    //    private static final DecimalFormat df = new DecimalFormat("0.00");
//
//    public static void main(String[] args) {
//        double[][] a = {
//                {1, 2, 0},
//                {2, 2, 3},
//                {0, 3, 2}
//        };
//
//        double[][] d = new double[a.length][a[0].length];
//        double[][] s = new double[a.length][a[0].length];
//
//        for (int i = 0; i < a.length; i++) {
//            double sum = 0;
//            for (int p = 0; p < i; p++) {
//                sum += s[p][i] * s[p][i] * d[p][p];
//            }
//            d[i][i] = Math.signum(a[i][i] - sum);
//            s[i][i] = Math.sqrt(Math.abs(a[i][i] - sum));
//            for (int j = i + 1; j < a[0].length; j++) {
//                double sum2 = 0;
//                for (int p = 0; p < i; p++) {
//                    sum += s[p][i] * d[p][p] * s[p][j];
//                }
//                s[i][j] = (a[i][j] - sum2) / (d[i][i] * s[i][i]);
//            }
//        }
//
//        print(a);
//        System.out.println();
//        print(s);
//        System.out.println();
//        print(d);
//        System.out.println();
//
//
//        double[][] e = {
//                {1, 0, 0},
//                {0, 1, 0},
//                {0, 0, 1}
//        };
//
//        double[][] doubles = new Matrix(e)
//                .multiplyBy(new Matrix(s).getTranspose())
//                .multiplyBy(d)
//                .getValue();
//        print(doubles);
//    }
//
//    private static void print(double[][] doubles) {
//        for (double[] line : doubles) {
//            for (double v : line) {
//                System.out.print(df.format(v) + "\t");
//            }
//            System.out.println();
//        }
//    }
    public static Cats[] catArr = new Cats[6];
    public static int[] years = {5, 13, 4, 2, 1, 8};
    public static String[] note = {"Tom", "Fluffy", "Chris", "Angel", "Snow", "Shadow"};

    public static void main(String[] args) {
        for (int i = 0; i < catArr.length; i++) {
            catArr[i] = new Cats(years[i], note[i]);
        }
        arraySort(catArr);
        printCat(catArr);
    }

    public static void arraySort(Cats[] cat) {
        for (int i = 1; i < cat.length; i++) {
            int place = i;
            Cats current = cat[i];
            for (int a = i - 1; a >= 0; a--) {
                if (cat[i].age < cat[a].age) {
                    place = a;
                }
            }

            for (int b = i; b > place; b--) {
                cat[b] = cat[b - 1];
            }
            cat[place] = current;
        }
    }

    public static void printCat(Cats[] cat) {
        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i].name + " " + cat[i].age);
        }
    }

    public static class Cats {
        public int age;
        public String name;

        public Cats(int year, String note) {
            age = year;
            name = note;
        }

    }
}
