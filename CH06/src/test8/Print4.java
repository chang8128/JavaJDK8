package test8;

import java.time.LocalDate;
import java.util.Calendar;

public class Print4 {
    public static void main (String[] args) {
        String message = "Hello world!";
        String newMessage = message.substring(6, 12)
            + message.substring(1, 2);
        System.out.println(newMessage);
        System.out.println("apple".compareTo("banana"));
        System.out.println(LocalDate.now());
        System.out.println(Calendar.getInstance().getTime());

        for (int i=0; i<10; i=i++){
            i+=1;
            System.out.println("Hello World!");
        }
    }
}
