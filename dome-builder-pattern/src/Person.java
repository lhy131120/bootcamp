import java.lang.module.ModuleDescriptor.Builder;

public class Person {
    private String name;
    private int age;

    public Person() {
        
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
    }

    public static Builder builder() {
        return new Person.Builder();
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
       this.name = name;
    }

    public void setAge(int age) {
       this.age = age;
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Person build() {
            return new Person(builder());
        }
    }

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setAge(18);
        person.setName("John");


        Person person2 = Person.builder() // create builder object
        .age(18)
        .name("John")
        .build();

        System.out.println(person2.getAge());
    }
}
