// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами, 
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;

/**
 * book
 */
public class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) { 
            phoneBook.get(name).add(phoneNum);}
        else {
            ArrayList<Integer> num = new ArrayList<>();
            num.add(phoneNum);
            phoneBook.put(name, num);
            }
        }
    
        public void find(String name) {
        if (phoneBook.containsKey(name)){
           System.out.println(phoneBook.get(name));}
        else {
            System.out.println("Пользователя с таким именем нет. ");
        }
        }
    
        public static void getPhoneBook() {
        Map<String, ArrayList<Integer>> sorted = phoneBook.entrySet().stream()
          .sorted(comparingInt(e -> -e.getValue().size()))
          .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> {
            throw new AssertionError();
          }, LinkedHashMap::new));
        System.out.println(sorted);
        }
}