package com.zaremba.exceptions;

import java.io.IOException;

public class AClass {
    /**
     *
     * @param num
     * @return
     * @throws ArithmeticException
     */
    public static int calculation(int num) {
        if(num < 0){
            throw new ArithmeticException("Negative Number cannot do what ever it is I want");
        }
        else{
            //Rest of code
            System.out.println("Rest of code");
            return num;
        }
    }
}
