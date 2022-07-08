public abstract class Hogwarts {
    private String student;
    private int powerOfMagic;
    private int transgression;

    public Hogwarts(String student, int powerOfMagic, int transgression) {
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

    public void compareStudent(Hogwarts pupil) {
        if (powerOfMagic > pupil.getPowerOfMagic()) {
            System.out.println(student + " обладает большей мощностью магии, чем " + pupil.getStudent());
        } else if (powerOfMagic == pupil.getPowerOfMagic()) {
            System.out.println("У " + student + " и " + pupil.getStudent() + "силы магии равны");
        } else {
            System.out.println(pupil.getStudent() + " обладает большей мощностью магии, чем " + student);
        }
        if (transgression > pupil.getTransgression()) {
            System.out.println(student + " расстояние трансгрессии дальше, чем " + pupil.getStudent());
        } else if (transgression == pupil.getTransgression()) {
            System.out.println(student + " и " + pupil.getStudent() + "могут трансгрессировать на одинаковое расстояние");
        } else {
            System.out.println(pupil.getStudent() + " расстояние трансгрессии дальше, чем " + student);
        }
    }
}
