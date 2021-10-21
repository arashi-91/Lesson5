import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //ФИО, должность, емейил, телефон, зарплата, возраст
        Employee person1 = new Employee( "Иванов И.И." , "Директор", "iiivanov@mail.ru",
                9996667, 50000, 50);
        Employee person2 = new Employee( "Петров П.П." , "Главный бухгалтер", "pppetrov@mail.ru",
                9995558, 40000, 40);
        Employee person3 = new Employee( "Сидоров С.С." , "Ведущий бухгалтер", "sssidorov@mail.ru",
                9994449, 30000, 35);
        Employee person4 = new Employee( "Федоров Ф.Ф." , "Экономист", "fffyodorov@mail.ru",
                9993331, 30000, 30);
        Employee person5 = new Employee( "Алексеева А.А." , "Секретарь", "aaalexeeva@mail.ru",
                9992220, 30000, 40);


    }

}






