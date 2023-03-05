import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class HW3 {

    public static List<String> iterList(List<String> list) {
        ListIterator<String> newList = list.listIterator();
        while (newList.hasNext()) {
            newList.set(newList.next().concat("!"));
        }
        return list;
    }
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("Фиолетовый");
        list.add("Голубой");
        list.add("Зеленый");
        list.add("Синий");
        list.add("Розовый");
        list.add("Серый");
        list.add("Желный");
        
        for(String s : list) //1. напечатать
            System.out.println(s);

        System.out.println("=".repeat(23));
        
        for (int i = 0; i < list.size(); i++) //2. добавить !
            list.set(i, list.get(i) + "!"); 

        list.add(0, "Белый! "); // 3. Вставить элемент в список в первой позиции

        String str = list.get(2); // 4. извлечь элемент по индексу

        list.set(0, "Черный! "); // 5. обновить по индексу

        list.remove(3); // 6. удалить элемент по индексу

        if (list.contains("Розовый!")) // 7. найти по значению
            System.out.println("найден");
        else
            System.out.println("не найден");

        for(String s : list) 
            System.out.println(s);
        System.out.println("=".repeat(23)); 

        List<String> newList = new ArrayList<>(); // 8. новый список
        newList.add("Синий!");
        newList.add("Розовый!");
        newList.add("Серый!");

        list.retainAll(newList); //9. Удалить из первого списка все элементы отсутствующие во втором списке.
        
        Collections.sort(list);//10. сортируем
        
        for(String s : list) 
            System.out.println(s);
    }
}