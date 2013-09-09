package com.example;

public class MySecondException {


    public int divide(int numberToDivide, int numberToDivideBy)
    throws BadNumberException{
       if(numberToDivideBy == 0){
           throw new BadNumberException(numberToDivideBy);
        }
        return numberToDivide / numberToDivideBy;
    }
 


public void callDivide(){
    try {
        int result = divide(2,0);
        System.out.println(result);
    } catch (BadNumberException e) {
        //do something clever with the exception
        System.out.println(e.getMessage());
    }
    System.out.println("Division attempt done");
}




public static void main(String args[]) throws CleoException{

	
 new MySecondException().callDivide();

}
}
