package week2;

public class MyException extends Exception {

    MyException() {  // Exception with no error message.
        super();
    }

    MyException(String errorMessage){ // Exception with error message.
        super(errorMessage);
    }



}
