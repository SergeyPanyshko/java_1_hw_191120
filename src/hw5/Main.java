package hw5;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivanov","Ivan","Ivanovoch","Worcker",
                "qqqq@gmail.com",1111111,12000,30);

        Employee[] employeesArr = {
                new Employee( "Ivanov", "Ivan", "Ivanovoch", "Worcker",
                        "wwww@gmail.com", 1111111, 15000, 33 ),
                new Employee( "Petrov", "Dima", "Sergeevich", "Worcker",
                        "qqqq@gmail.com", 222222, 118000, 40 ),
                new Employee( "Sidorov", "Stepan", "Michailovich", "Worcker",
                        "aaaa@gmail.com", 333333, 12000, 30 ),
                new Employee( "Dutov", "Sergey", "Evgrnrvich", "Worcker",
                        "ssss@gmail.com", 444444, 20000, 45 ),
                new Employee( "Popov", "Petr", "Ivanovich", "Worcker",
                        "dddd@gmail.com", 555555, 10000, 27 )
        };
        employee.info();
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].age >= 40) System.out.println( employeesArr[i] );
        }
    }
}
