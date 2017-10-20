public class Person {
    int PersonId;
    String name;
    int age;
    String work;

    public Person(int personId, String name, int age, String work) {
        PersonId = personId;
        this.name = name;
        this.age = age;
        this.work = work;
    }

    @Override
    public int hashCode(){
        return (this.name.length()+this.work.length())*this.age/this.PersonId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (PersonId != person.PersonId) return false;
        if (age != person.age) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return work != null ? work.equals(person.work) : person.work == null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "PersonId=" + PersonId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                '}';
    }
}
