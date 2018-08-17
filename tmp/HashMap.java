package tmp;

import java.util.Map;
import java.util.Set;


public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new java.util.HashMap<>();
        //Collections.synchronizedMap(hashMap);

        // Помещаем данные на карточку
        hashMap.put("Васька", 5);
        hashMap.put("Мурзик", 8);
        hashMap.put("Рыжик", 12);
        hashMap.put("Барсик", 5);

        // Получаем набор элементов
        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();

        // Отобразим набор
        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        // Добавляем значение
        int value = hashMap.get("Рыжик");
        hashMap.put("Рыжик", value + 3);
        System.out.println("У Рыжика стало " + hashMap.get("Рыжик"));
    }
}
