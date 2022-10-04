import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {


        Employee[] compound = new Employee[5];
        compound[0] = new Employee("Муравей Павел Сергеевич ", 1, 20000);
        compound[1] = new Employee("Богомолов Иван Петрович", 2, 30000);
        compound[2] = new Employee("Леопардова Людмила Алексеевна", 3, 40000);
        compound[3] = new Employee("Носорогов Александр Петрович", 4, 50000);
        compound[4] = new Employee("Соловей Анна Павловна", 5, 60000);

        for (Employee a : compound) {
            System.out.println(a);
        }
        int summm = 0;
        for (int i = 0; i < compound.length; i++) {
            summm = summm + compound[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты составляет: " + summm);


        int min = 0;
        int Max = 0;
        for (int i = 0; i < compound.length; i++) {
            if (Max < compound[i].getSalary() && compound[i].getSalary() >= 60000) {
                Max = compound[i].getSalary();
                System.out.println("Максимальная зарплату у: " + compound[4].getFIO() + " " + Max + " рублей");
            }


            if (min > compound[i].getSalary() || compound[i].getSalary() <= 20000) {
                min = compound[i].getSalary();
                System.out.println("Минимальная зарплату у: " + compound[0].getFIO() + " " + min + " рублей");
            }

        }

        mean(summm);


        for (int i = 0; i < compound.length; i++) {
            System.out.println(compound[i].getFIO());
        }

    }

    private static void mean(int summm) {
        int Srsumm = summm / 5;
        System.out.println("Средняя ЗП составляет: " + Srsumm);
    }


}