public class TestClass {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(43,79);
        System.out.println("add result:"+addResult);
        try{
            double divResult = calc.divide(15, 0);
            System.out.println("division result: "+divResult);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);    
        }
    }
}
