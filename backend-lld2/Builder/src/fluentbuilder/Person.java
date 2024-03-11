package fluentbuilder;

public class Person {
    public String name;
    public String position;

    @Override
    public String toString() {
        return "Person{"+"name='" + name + '\'' + ", position='" + position + '\'' + '}';
    }
}

class PersonBuilder<SELF extends PersonBuilder<SELF>>
{
    protected Person person = new Person();

    public SELF withName(String name)
    {
        person.name = name;
        return (SELF)this;
    }

    public Person build() {
        return person;
    }
}
