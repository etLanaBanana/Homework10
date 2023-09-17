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
        int num = Integer.parseInt(text);
        int[] num2 = new int[text.length()];
        for (int i = 0; i < num2.length; i++) {
            num2[i] = num;
        }
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
        int dlina = 32 - text.length();
        int[] num3 = new int[dlina];
        System.out.println(dlina);

        int[] result = new int[num3.length + num2.length];
        int count = 0;
        for(int i = 0; i<num3.length; i++) {
            result[i] = num3[i];
            count++;
        }
        for(int j = 0;j<num2.length;j++) {
            result[count++] = num2[j];
        }
        for(int i = 0;i<result.length;i++)
            System.out.print(result[i]+" ");
    }
}
