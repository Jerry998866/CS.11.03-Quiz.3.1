public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade){
        if (grade>=90){
            return 'A';
        }
        else if (grade>=80 && grade<=89){
            return 'B';
        }
        else if (grade>=70 && grade<=79){
            return 'C';
        }
        else if (grade>=60 && grade<=69){
            return 'D';
        }
        else if (grade>=50 && grade<=59){
            return 'E';
        }
        return 'F';
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzbuzz";
        }
        if (num % 3 == 0) {
            return "fizz";
        } else if (num % 5 == 0) {
            return "buzz";
        }
        return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String str) {
        if ((str.length()) < 2) {
            return str;
        }
        String firstTwoChar = str.substring(0, 2);
        return firstTwoChar + str + firstTwoChar;
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int num1, int num2, int num3){
        return num1+num2 == num3 || num2+num3 == num1 || num1+num3 == num2;
    }

    // Question 5 - endUp
    public static String endUp(String str){
        if (str.length()<3){
            return str.toUpperCase();
        }
        String lastThreeChar = str.substring(str.length()-3);
        String firstThreeChar = str.substring(0,str.length()-3);
        return firstThreeChar + lastThreeChar.toUpperCase();
    }

}
