package com.solucionfactible.dev;

/**
 * isValid allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * If the function is passed a valid PIN string, return true, else return false.
 * 
 * @author developer
 */
public class ValidatePIN {
	
	   public static boolean isValid(String pin) {
        boolean cont = pin.matches("[+-]?\\d*(\\.\\d+)?");
        if (cont == true) {
            if (pin.length() == 4 || pin.length() == 6) {
                return true; 
        }
            else{
                System.out.println("El PIN no esta dentro de los parametros");
                return false;
            }
        }
        else if(cont == false) {
            System.out.println("El pin deben ser solo numeros .. ");
        }
               return false;
            
    }

}
