public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String student, int powerOfMagic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(student, powerOfMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (cunning < 0 || cunning > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (determination < 0 || determination > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (ambition < 0 || ambition > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0 || resourcefulness > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        if (lustForPower < 0 || lustForPower > 100) {
            throw new IllegalArgumentException("Оценка указана не верно. Укажите оценку от 0 до 100");
        }
        this.lustForPower = lustForPower;
    }
}
