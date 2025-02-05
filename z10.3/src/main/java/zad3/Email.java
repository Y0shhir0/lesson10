package zad3;

// Унаследуйте класс от базового класса, описывающего контакт Contact
public class Email extends  Contact{
private final String email;

public Email(String name,String email){
        super(name);
    this.email=email;
}

public String getEmail(){
    return email;
}

// Метод sendMessage переопределяет метод базового класса
        ...
public void sendMessage(){
    System.out.println("Отправим новогоднюю картинку коллеге на электронную почту "+email);
}

        ...
public void print(){
    System.out.println("Email: "+getEmail());
}
        }

