package Week_05.RATIONAL_NUMBERS;

public class Main {
    public static void main(String[] args) {

        RationalNumber r1 = new RationalNumber(); // null
        RationalNumber r2 = new RationalNumber(9, 15); // parametrized ---> 9/15 =3/5 (using gd)
        RationalNumber r3 = new RationalNumber(r2); // copy

        System.out.println(r1.toString());
        System.out.println(r1); // same thing as above but BETTER PRACTICE

        System.out.println(r2);
        System.out.println(r3);

    }
}
