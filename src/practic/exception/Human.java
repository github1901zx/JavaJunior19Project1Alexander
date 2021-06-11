package practic.exception;

public class Human {
    private int wieght;
    private String name;

    public Human() {

    }

    public Human(int wieght, String name) throws HumanException {
        if (wieght > 200 || wieght < 50) {
            throw new HumanException("Вес не может быть меньше 50 или больше 200");
        }
        if (name.isEmpty() || name.length() > 20) {
            throw new HumanException("Имя не может быть пустым, и не может быть больше 20 символов");
        }
        this.wieght = wieght;
        this.wieght = wieght;
        this.name = name;
    }

    public int getWieght() {
        return wieght;
    }

    public void setWieght(int wieght) throws HumanException {
        if (wieght > 200 || wieght < 50) {
            throw new HumanException("Вес не может быть меньше 50 или больше 200");
        }
        this.wieght = wieght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.length() > 20) {
            throw new RuntimeException("Имя не может быть пустым"); // не проверяемый
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;

        Human human = (Human) o;

        if (wieght != human.wieght) return false;
        return name != null ? name.equals(human.name) : human.name == null;
    }

    @Override
    public int hashCode() {
        int result = wieght;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human" + "wieght=" + wieght + "name" + name;
    }
}
