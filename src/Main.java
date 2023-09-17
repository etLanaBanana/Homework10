import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        извлечь число из текста.
        напечатать все числа в этой строке по порядку.
        написать функцию, возвращающую строку, каждый элемент которого
        представляет один бит 32-битного целого числа таким образом,
        чтобы при выводе на печать он выглядел как двоичное представление целого числа
        (младший значащий бит справа)
         */
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = text.replaceAll("[^0123456789]", "");
        System.out.println(text);
        int num = Integer.parseInt(Integer.toBinaryString(Integer.parseInt(text)));
        System.out.println(num);
    }
}