package recursionAssignment;

import java.io.*;
import java.util.*;

public class Recursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(strCopy(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
    }

    public static int count7(int n) {
        if(n / 10.0 < 1) {
            if(n == 7) {
                return 1;
            } else {
                return 0;
            }
        } else  {
            return count7((n - (n % 10))/10) + count7(n % 10);
        }

    }


    public static int countHi(String str) {
        if(str.length() < 2) {
            return 0;
        } else if (str.length() == 2) {
            if(str.equals("hi")) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return countHi(str.substring(0, 2)) + countHi(str.substring(1, str.length()));
        }
    }

    public static int countPi(String str) {
        if(str.length() < 4) {
            return 0;
        } else if (str.length() == 4) {
            if(str.equals("3.14")) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return countPi(str.substring(0, 4)) + countPi(str.substring(1, str.length()));
        }
    }

    public static String pairStar(String str) {
        if(str.length() < 2) {
            return str;
        } else if(str.length() == 2) {
            if(str.charAt(0) == str.charAt(1)) {
                return str.substring(0,1) + "*" + str.substring(1, 2);
            } else {
                return str;
            }
        } else {
            return pairStar(str.substring(0, 2)).substring(0, 1) + pairStar(str.substring(1, str.length()));
        }
    }

    public static String stringClean(String str) {
        if(str.length() < 2) {
            return str;
        } else if(str.length() == 2) {
            if(str.charAt(0) == str.charAt(1)) {
                return str.substring(0, 1);
            } else {
                return str;
            }
        } else {
            return stringClean(str.substring(0, 2)) + stringClean(str.substring(1, str.length()))
                                                                            .substring(1);
        }
    }

    public static boolean strCopy(String str, String str1, int nums) {
        
        if(nums == 0) {
            return true;
        } else if(str.length() < str1.length()) {
          return false;  
        } else if(str.substring(0, str1.length()).equals(str1)) {
            return strCopy(str.substring(1), str1, nums - 1);
        } else {
            return strCopy(str.substring(1), str1, nums);
        }
    }



}
