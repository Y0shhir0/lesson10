package zad3;

// Дополните объявление класса Contact
public abstract class  Contact{
    // Класс должен содержать одно полe - имя пользователя name
protected String name;
public  Contact(String name){
        this.name = name;
}
    // И два метода - sendMessage() для отправки сообщения и print() для печати информации о контакте
   public abstract  void sendMessage(String message);
public abstract void print();
}