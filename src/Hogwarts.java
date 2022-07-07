public class Hogwarts {
    private String student;
    private int powerOfMagic;
    private int transgression;

    public Hogwarts(String student, int powerOfMagic, int transgression) {
        this.student = student;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    public void printStudent() {
        System.out.println(student);
    }


    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        if (powerOfMagic < 0 || powerOfMagic > 200) {
            throw new IllegalArgumentException("Магическая сила указана не верно. Укажите магическую силу от 0 до 200");
        }
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        if (powerOfMagic < 0 || powerOfMagic > 3000) {
            throw new IllegalArgumentException("Расстояние трансгрессии указана не верно. Укажите расстояние трансгрессии от 0 до 3000");
        }
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Студент - " + student +
                ", Сила магии - " + powerOfMagic +
                ", Расстояние трансгрессии - " + transgression;
    }
}
