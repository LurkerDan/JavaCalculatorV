import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Введи свои значения и операнды через пробел и нажмите ENTER для вывода результата");
            String line = input.nextLine();
            if(line.equals("exit")){
                System.out.println("Досвидания!");
            break;
            }

            try {
                String[] symbols = line.split(" ");
                if (symbols.length != 3) throw new Exception("Что-то пошло не так, попробуйте еще раз");

                Number a = ConvertArabs.parseAndValidate(symbols[0]);
                Number b = ConvertArabs.parseAndValidate(symbols[2], a.getType());
                String result = Operators.calculate(a, b, symbols[1]);
                System.out.println("Результат: \n" + result);


            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
