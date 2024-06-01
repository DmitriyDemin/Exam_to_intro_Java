package Exam_to_intro_Java;

import com.sun.source.tree.Tree;

import java.awt.print.Book;
import java.util.*;

public class PhoneBook {
    HashMap<String, TreeSet<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer number) {
        if (phoneBook.containsKey(name)) {      //проверка наличия в телефооной книге контакта//
            phoneBook.get(name).add(number);    //если контакт уже существует в Set его номеров, добавляется еще один номер//
        } else {
            TreeSet<Integer> nums = new TreeSet<>(); //если контакт не существует создается пустой Set, который парой с name добавляется в Map//
            phoneBook.put(name, nums);
            phoneBook.get(name).add(number);//далее пустой set заполняется первым номером//
        }

    }

    public Integer searchMax() {//поиск контакта с наибольшим количеством номеров
        int max = 0;
        for (String key : phoneBook.keySet()) {
            if (phoneBook.get(key).size() > max) {
                max = phoneBook.get(key).size();
            }
        }
        return max;
    }

    public HashMap<String, TreeSet<Integer>> sorted_2() {/*вариант с созданием новой Map, проблема в нейпорядоченности хранения в HashMap, метод не работает*/
        int max = searchMax();
        HashMap<String, TreeSet<Integer>> phoneBookSort = new HashMap<>();
        for (int i = max; i > 0; i--) {
            for (String key : phoneBook.keySet()) {
                if (phoneBook.get(key).size() == i) {
                    phoneBookSort.put(key, phoneBook.get(key));
                }
                max = max - 1;
            }

        }
        return phoneBookSort;
    }

    public void sortedPrint() {/*вариант с выводом нужной пары в кносоль*/
        int max = searchMax();
        for (int i = max; i >= 0; i--) {
            for (String key : phoneBook.keySet()) {
                if (phoneBook.get(key).size() == i) {
                    System.out.println(key + "=" + phoneBook.get(key));
                }
                max = max - 1;
            }

        }

    }
}



