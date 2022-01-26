/**
 * Java 1. Homework 5
 *
 * @author Andrey Z
 * @version 27.01.2022
 */
class Lesson5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "manager", "ivan@mail.ru", "79999999999", 40000, 27);
        persArray[1] = new Person("Olegov Oleg", "teamlead", "oleg@mail.ru", "79999998888", 60000, 41);
        persArray[2] = new Person("Semenov Semen", "administrator", "semen@mail.ru", "79999997777", 32000, 23);
        persArray[3] = new Person("Egorova Maria", "accountant", "maria@mail.ru", "79999996666", 39000, 45);
        persArray[4] = new Person("Romanov Roman", "courier", "roman@mail.ru", "79999995555", 28000, 19);
        for (Person person : persArray)
            if (person.getAge() > 40)
                System.out.println(person);
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    
    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
        return "Person: " + name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }
}