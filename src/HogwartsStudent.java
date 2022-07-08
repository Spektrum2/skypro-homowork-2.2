public abstract class HogwartsStudent {
    private String student;
    private int powerOfMagic;
    private int transgression;

    public HogwartsStudent(String student, int powerOfMagic, int transgression) {
        this.student = student;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    public void printStudent() {
        System.out.println(this);
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
        if (powerOfMagic < 0 || powerOfMagic > 100) {
            throw new IllegalArgumentException("Магическая сила указана не верно. Укажите магическую силу от 0 до 100");
        }
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        if (powerOfMagic < 0 || powerOfMagic > 100) {
            throw new IllegalArgumentException("Расстояние трансгрессии указана не верно. Укажите расстояние трансгрессии от 0 до 100");
        }
        this.transgression = transgression;
    }

    public void compareStudent(HogwartsStudent pupil) {
        int point1 = powerOfMagic + transgression;
        int point2 = pupil.powerOfMagic + pupil.transgression;
        if (point1 > point2) {
            System.out.println(student + " лучший студент, чем " + pupil.getStudent());
        } else if (point1 == point2) {
            System.out.println("У " + student + " и " + pupil.getStudent() + "силы равны");
        } else {
            System.out.println(pupil.getStudent() + " лучший студент, чем " + student);
        }
    }
}
