package za.ca.cput.adp3capstone.util;
/* Product.java
Helper util class
Author: Ethan Le Roux (222622172)
Date:8 April 2025
*/
public class Helper {
    public static boolean isStringNullOrEmpty(String x){
        if(x.isEmpty() || x == null)
            return true;
        return false;
    }

    public static boolean isIntNull(int y){
        if(y == 0)
            return true;
        return false;
    }

    public static boolean isIntNegative(int y){
        if(y < 0)
            return true;
        return false;
    }

    public static boolean isIntZero(int y){
        if(y == 0)
            return true;
        return false;
    }

    public static boolean isDoubleNull(double z){
        if(z == 0.0)
            return true;
        return false;
    }
}
