public class Operators {
    public static String calculate(Number a, Number b, String operator) {

        int result;
        switch (operator) {
            case "+":
                result = a.getValue() + b.getValue();
                break;

            case "-":
                result = a.getValue() - b.getValue();
                break;

            case "*":
                result = a.getValue() * b.getValue();
                break;

            case "/":
                result = a.getValue() / b.getValue();
                break;
            default:
                throw new IllegalStateException("Неверный оператор " + operator+ "\nИспользуйте только +, -, *, / ");
        }
        if(a.getType()==TypeNumber.ROMAN){
            return ConvertRomans.convert(result);
        }
     return String.valueOf(result);
    }
}
