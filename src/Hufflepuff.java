public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String student, int powerOfMagic, int transgression, int diligence, int loyalty, int honesty) {
        super(student, powerOfMagic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        if (diligence < 0 || diligence > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty < 0 || loyalty > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (honesty < 0 || honesty > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.honesty = honesty;
    }

    public void compareStudentFaculty(Hufflepuff student) {
        int point1 = diligence + loyalty + honesty;
        int point2 = student.getDiligence() + student.getLoyalty() + student.getHonesty();
        if (point1 > point2) {
            System.out.println(this.getStudent() + " лучший Пуффендуец, чем " + student.getStudent());
        } else if (point1 == point2) {
            System.out.println("У " + this.getStudent() + " и " + student.getStudent() + "силы равны");
        } else {
            System.out.println(student.getStudent() + " лучший Пуффендуец, чем " + this.getStudent());
        }

    }

    @Override
    public String toString() {
        return "Студент - " + this.getStudent() +
                "; Сила магии - " + this.getPowerOfMagic() +
                "; Расстояние трансгрессии - " + this.getTransgression() +
                "; Трудолюбие - " + diligence +
                "; Верность - " + loyalty +
                "; Искренность - " + honesty;
    }
}
