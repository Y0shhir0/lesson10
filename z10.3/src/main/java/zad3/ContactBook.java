package zad3;

import java.util.ArrayList;
import java.util.List;

// Ограничьте класс ContactBook так, чтобы он могу хранить в себе только список контактов
public class ContactBook <T extends Contact>{
        // Объявите поле класса contacts - список контактов книги
        private  final List<T> contacts= new ArrayList<>();

public void addContact(T contact){
    contacts.add(contact);
}

public void printList(){
    // Выведите на экран весь список контактов книги
        for (T contact : contacts)
    System.out.println(contact.getName());
}

public void congratulate(String name){
    boolean contactPresented=false; //проверяем есть ли контакт в базе
    // Найдите контакт в книге по имени, и отправьте ему сообщение с помощью метода sendMessage()
        ...
    System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: "+name);
    contact.sendMessage();

    // Если контакт не найден, выведите соответствующее сообщение
    System.out.println("Не найден контакт с указанным именем.");
}

        }