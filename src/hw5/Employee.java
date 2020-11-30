package hw5;

public class Employee {
    String soname;
    String name;
    String patronymic;
    String position;
    String email;
    int phone;
    int salary;
    int age;

    public Employee(){
    }

       public Employee(String soname, String name, String patronymic, String position, String email, int phone, int salary, int age) {
        this.soname = soname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
         System.out.printf("%s %s %s %s %s %d %d %d\n",soname,name,patronymic,position,email,phone,salary,age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "soname='" + soname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}


