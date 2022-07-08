public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;


    public Gryffindor(String student, int powerOfMagic, int transgression, int nobility, int honor, int bravery) {
        super(student, powerOfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (nobility < 0 || nobility > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (honor < 0 || honor > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (bravery < 0 || bravery > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.bravery = bravery;
    }

    public void compareStudentFaculty(Gryffindor student) {
        int point1 = nobility + honor + bravery;
        int point2 = student.getNobility() + student.getHonor() + student.getBravery();
        if (point1 > point2) {
            System.out.println(this.getStudent() + " лучший Гриффиндорец, чем " + student.getStudent());
        } else if (point1 == point2) {
            System.out.println("У " + this.getStudent() + " и " + student.getStudent() + "силы равны");
        } else {
            System.out.println(student.getStudent() + " лучший Гриффиндорец, чем " + this.getStudent());
        }
    }

    @Override
    public String toString() {
        return "Студент - " + this.getStudent() +
                "; Сила магии - " + this.getPowerOfMagic() +
                "; Расстояние трансгрессии - " + this.getTransgression() +
                "; Благородство - " + nobility +
                "; Честь - " + honor +
                "; Храбрость - " + bravery;
    }
}
