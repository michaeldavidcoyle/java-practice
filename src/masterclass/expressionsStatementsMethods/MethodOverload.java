package masterclass.expressionsStatementsMethods;

public class MethodOverload {
    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters(feet * 12 + inches);
    }

    public static void main(String[] args) {
        int inchesA = 4;
        int inchesB = 9;
        int inchesC = 27;
        int inchesD = 38;
        int inchesE = 51;

        double centA = convertToCentimeters(inchesA);
        double centB = convertToCentimeters(inchesB);
        double centC = convertToCentimeters(inchesC);
        double centD = convertToCentimeters(inchesD);
        double centE = convertToCentimeters(inchesE);

        System.out.println(inchesA + " in = " + centA + " cm");
        System.out.println(inchesB + " in = " + centB + " cm");
        System.out.println(inchesC + " in = " + centC + " cm");
        System.out.println(inchesD + " in = " + centD + " cm");
        System.out.println(inchesE + " in = " + centE + " cm");

        int feetA = 2;
        int feetB = 3;
        int feetC = 4;
        int feetD = 5;
        int feetE = 7;

        int plusInchesA = 1;
        int plusInchesB = 3;
        int plusInchesC = 8;
        int plusInchesD = 10;
        int plusInchesE = 11;

        double cmA = convertToCentimeters(feetA, plusInchesA);
        double cmB = convertToCentimeters(feetB, plusInchesB);
        double cmC = convertToCentimeters(feetC, plusInchesC);
        double cmD = convertToCentimeters(feetD, plusInchesD);
        double cmE = convertToCentimeters(feetE, plusInchesE);

        System.out.println(feetA + " ft " + plusInchesA + " in = " + cmA + " cm");
        System.out.println(feetB + " ft " + plusInchesB + " in = " + cmB + " cm");
        System.out.println(feetC + " ft " + plusInchesC + " in = " + cmC + " cm");
        System.out.println(feetD + " ft " + plusInchesD + " in = " + cmD + " cm");
        System.out.println(feetE + " ft " + plusInchesE + " in = " + cmE + " cm");
    }
}
