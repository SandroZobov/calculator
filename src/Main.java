import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int a;
        int b;
        int result = 0;

        String[] mas = str.split(" ");

        if (mas[0].matches("[0-9]") && mas[2].matches("[0-9]")) {
            a = Integer.parseInt(mas[0]);
            b = Integer.parseInt(mas[2]);
        } else {
            ConverterToArabic converter = new ConverterToArabic();
            a = converter.convert(mas[0].toUpperCase());
            b = converter.convert(mas[2].toUpperCase());
        }

        String oper = mas[1];

        switch (oper) {
            case "+":
                result = sum(a, b);
                break;
            case "-":
                result = dif(a, b);
                break;
            case "/":
                result = div(a, b);
                break;
            case "*":
                result = mul(a, b);
                break;
            default:
                throw new Exception();

        }
        if (!mas[0].matches("[0-9]") && !mas[2].matches("[0-9]")) {
            ConverterToRim converterToRim = new ConverterToRim();
            String resultRim = converterToRim.convert(result);
            System.out.println(resultRim);
        } else {
            System.out.println(result);
        }
    }

    private static int sum(int x, int y) {
        return x + y;
    }

    private static int mul(int x, int y) {
        return x * y;
    }

    private static int div(int x, int y) {
        return x / y;
    }

    private static int dif(int x, int y) {
        return x - y;
    }
}
