

public class Employee {
    public String FIO;
    private int departament;
    public int salary;
    private static int number = 1;
    private int id;



    public Employee(String FIO, int departament, int salary) {
        this.FIO = FIO;
        this.departament = departament;
        this.salary = salary;
        this.id = number++;
    }

    public String getFIO() {
        return this.FIO;
    }
    public int getDepartament(){
        return this.departament;
    }
    public int getSalary(){
        return this.salary;
    }

    public void setDepartament(int departament){
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return ("Порядковый номер " + id + " ФИО " + FIO + " Зарплата " + salary + " Департамент " + departament);
    }



    }



