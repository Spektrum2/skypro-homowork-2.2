public class RavenclawStudent extends HogwartsStudent {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String student, int powerOfMagic, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(student, powerOfMagic, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        if (intelligence < 0 || intelligence > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        if (wisdom < 0 || wisdom > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        if (wit < 0 || wit > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if (creativity < 0 || creativity > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.creativity = creativity;
    }

    public void compareStudentFaculty(RavenclawStudent student) {
        int point1 = intelligence + wisdom + wit + creativity;
        int point2 = student.getIntelligence() + student.getWisdom() + student.getWit() + student.getCreativity();
        if (point1 > point2) {
            System.out.println(this.getStudent() + " лучший Когтевранец, чем " + student.getStudent());
        } else if (point1 == point2) {
            System.out.println("У " + this.getStudent() + " и " + student.getStudent() + "силы равны");
        } else {
            System.out.println(student.getStudent() + " лучший Когтевранец, чем " + this.getStudent());
        }
    }

    @Override
    public String toString() {
        return "Студент - " + this.getStudent() +
                "; Сила магии - " + this.getPowerOfMagic() +
                "; Расстояние трансгрессии - " + this.getTransgression() +
                "; Ум - " + intelligence +
                "; Мудрость - " + wisdom +
                "; Остроумие - " + wit +
                "; Творчество - " + creativity;
    }
}
