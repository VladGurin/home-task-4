package ua.level.lesson4;

public class lesson44 {
    public static void main(String[] args) {
// String Processor
        String myString = "Wake up NEO ";

        String temp = myString.concat("!"); //присваивает переменной значение myString + "!"

        System.out.println(myString.concat("!")); //прибавляет к строке другую только на печать, без изменения значения самой переменной
        System.out.println(myString.length());  // длина строки
        System.out.println(temp.length());

        System.out.println(temp.contains(myString)); // проверяет содержит ли temp строку myString

        String str1 = "";
        System.out.println("String str1 is Blank - " + str1.isBlank()); // проверка является ли строка пустой
        System.out.println("String str1 is Empty - " + str1.isEmpty()); // не содержит ли сиволы?

        String str2 = " ";
        System.out.println("String str2 is Blank - " + str2.isBlank()); // проверка является ли строка пустой
        System.out.println("String str2 is Empty - " + str2.isEmpty()); // не содержит ли сиволы? если содержит, то False

        String str3 = " Terminator ";
        System.out.println(str3.length());
        System.out.println(str3.trim().length()); // обрезает пробелы по краям слова

        System.out.println(myString.endsWith("NEO ")); //проверка заканчивается ли строка на эти символы?

        System.out.println(myString.repeat(4)); //повтор строки

        System.out.println(myString.startsWith("Wake")); //проверка начинается ли строка на эти символы?

        System.out.println(myString.split(" ")); //разбить строку по символу " "??? не получается
        for (String myStringSplit : myString.split(" ", 3)) {    //разбивает строку по пробелу
            // и выводит каждое слово на новой строке
            System.out.println(myStringSplit);
        }


        System.out.println(myString.repeat(4).split(" ").length); // повторяет строку, разбивает и считает количество пробелов в новой строке

        System.out.println(myString.substring(3, 7)); // берет с 3 по 7 символ из строки

        String text = "«Мой дядя самых честных правил,\n" +   //присваиваем переменной текст
                "Когда не в шутку занемог,\n" +
                "Он уважать себя заставил\n" +
                "И лучше выдумать не мог.\n" +
                "Его пример другим наука;\n" +
                "Но, боже мой, какая скука\n" +
                "С больным сидеть и день и ночь,\n" +
                "Не отходя ни шагу прочь!\n" +
                "Какое низкое коварство\n" +
                "Полуживого забавлять,\n" +
                "Ему подушки поправлять,\n" +
                "Печально подносить лекарство,\n" +
                "Вздыхать и думать про себя:\n" +
                "Когда же черт возьмет тебя!»";
        System.out.println(text.split(" ").length + " - количество пробелов");   // считаем количество пробелов

        String textNew = text.replace("\n", " "); // заменяем символ конца строки на пробел
        System.out.println(textNew.split(" ").length + " - количество слов"); // и считаем количество пробелов,
        // тем самым считаем количесво слов

        System.out.println(text.replace("\n", " ").split(" ").length);
        // делаем то же самое, но одной строкой

    }
}
