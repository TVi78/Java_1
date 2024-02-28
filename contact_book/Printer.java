import java.util.Scanner;

public class Printer {
    public static void main(String[] args) {
        boolean flag=true;
        PhoneBook myPhoneBook = new PhoneBook();
        Scanner iScanner=new Scanner(System.in);
        while (flag==true){
            System.out.println("--------------------------");
            System.out.println("Выберете номер пункта и введите его число:"+"\n"+"1.Добавить номер;"+"\n" +"2.Найти номер по имени;"+"\n"+"3.Вывести весь телефонный справочник;"+"\n"+"4.Выход ");
            String number="";
            while (number=="")
                number=iScanner.nextLine();
            
            switch(number){
                case "1":
                System.out.println("Введите имя: ");
                String name=iScanner.nextLine();
                System.out.println("Введите номер: ");
                int contactNumber=iScanner.nextInt();
                myPhoneBook.add(name, contactNumber);
                break;
                case "2":
                System.out.println("Введите имя: ");
                String nameFind=iScanner.nextLine();
                myPhoneBook.find(nameFind);
                break;
                case "3":
                PhoneBook.getPhoneBook();
                break;
                case "4":
                iScanner.close();
                flag=false;
                break;
                default:
                System.out.println("Ошибка! ");
                break;
            }
        }       
    }   
}
