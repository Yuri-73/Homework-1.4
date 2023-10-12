import java.util.Arrays;

public class Main {
    public static void main(String[] args) {




        System.out.print("Сортировка символов строки через массив символов:");
        String str = "CADB";
        System.out.println("str = " +str);
        char[] chars = str.toCharArray(); //Строку превращаем в массив символов
        System.out.println(chars); //Вывод массива символов
        Arrays.sort(chars); //Сортировка массива символов
        System.out.println(chars); //Вывод массива символов
        str = new String(chars); //Превращение массива символов chars в строку str
        System.out.println("str = " +str); //Вывод строки str
        System.out.println();
        System.out.println("Склеивание 2-х строк:");
        String street = "Манежная";
        street = street + " площадь";
        System.out.println ("Адрес магазина – " +street);

        System.out.println();
        System.out.println("Замена строчного символа на прописной");
        String street1 = "манежная";
        System.out.println("street1 = " +street1);
        String streetTrue = street1.replace("м", "М");
        System.out.println("streetTrue = " +streetTrue);

        System.out.println();
        System.out.println("Сравнение 2-х строк:");
        String s1 = "Красная";
        String s2 = "Красная";
        boolean equal = s1.equals(s2);
        System.out.println("equal = " +equal);

        System.out.println();
        System.out.println("Превращение байтового массива в строку в коде ASCII:");
        byte[] textInBytes = {33, 33, 33}; //Байтовый массив
        String stringFromBytes = new String(textInBytes); //Объявление строки stringFromBytes, в конструктор которой вставляем байтовый массив
        System.out.println("stringFromBytes = " +stringFromBytes); //Вывод строки stringFromBytes
    }
}