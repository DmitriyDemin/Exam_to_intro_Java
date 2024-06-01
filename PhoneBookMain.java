//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
//их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по
//убыванию числа телефонов.


package Exam_to_intro_Java;

public class PhoneBookMain {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.add("misha", 1);
        book.add("masha", 2);
        book.add("masha", 3);
        book.add("musha", 1);
        book.add("musha", 2);
        book.add("musha", 3);

        book.sortedPrint();

    }

}
