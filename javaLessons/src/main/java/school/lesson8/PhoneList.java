package school.lesson8;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class PhoneList {
    HashMap<String, LinkedList<String>> phoneList = new HashMap<>();

    public LinkedList<String> get(String surname) {
        LinkedList<String> phones = new LinkedList<>();
        if (surname == null || surname == "") return phones;

        //Получаем список телефонов для данного абонента
        if (this.phoneList.containsKey(surname)) {
            phones = this.phoneList.get(surname);
        }
        return phones;
    }

    public void getPhone(String surname) {
        System.out.println("For " + surname + " get phone: " + get(surname));
    }

    public void add(String surname, String phone) {
        if (surname == null || surname == "" || phone == null || phone == "") return;
        LinkedList<String> phones;
        phones = this.get(surname);
        phones.addLast(phone);
        this.phoneList.put(surname, phones);
    }

    public void print() {
        HashMap<String, LinkedList<String>> pl = this.phoneList;
        Set<Map.Entry<String, LinkedList<String>>> set = pl.entrySet();
        for (Map.Entry<String, LinkedList<String>> o : set) {
            System.out.println("Surname: " + o.getKey() + ", Phone: " + o.getValue() + ";");
        }
    }
}