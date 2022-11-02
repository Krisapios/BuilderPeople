public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 120) throw new IllegalArgumentException("Возраст не должен быть меньше нуля и больше 120");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Поле 'имя' не может быть пустым!");
        }
        if (surname == null) {
            throw new IllegalStateException("Поле 'фамилия' не может быть пустым!");
        }
        Person person = new Person(name, surname);
        person.setAddress(address);
        person.setAge(age);
        return person;
    }
}
