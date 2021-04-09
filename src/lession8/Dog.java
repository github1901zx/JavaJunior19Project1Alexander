package lession8;

public class Dog {
    private int age;
    private String name;
    private String breed;

    public void setName(String text){/** дает имя собаке*/
        this.name = text;
    }

    public void setAge(int age){/** дает Возраст собаке*/
        this.age = age;
    }

    public void setBreed(String text){/** дает породу собаке*/
        this.breed = text;
    }

    public void printAbout(){/** дает выводи информацию о собаке*/
        System.out.println("Name: " + name + " Age: " + age + " Breed: " + breed);

    }

}
