package project9;

public class TestCustomException2 {
    static void validate(int marks)
    throws NumberIsGreaterException,NumberIsLesserException{
        if(marks>100){
            throw new NumberIsGreaterException("marks is >100");
        }
        else if(marks<0){
            throw new NumberIsLesserException("marks is <0");

        }
        else{
            System.out.println("marks is right");
        }
    }
    public static void main(String[] args) {
        try{
            validate(130);
        }
        catch(NumberIsGreaterException ex){
            System.out.println("Exception occured "+ex);
        }
        catch(NumberIsLesserException ex){
            System.out.println("exception occured "+ex);
        }
        System.out.println("rest of the code");
    }
}
