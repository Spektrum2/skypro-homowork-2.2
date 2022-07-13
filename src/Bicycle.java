public class Bicycle extends Transport implements Service {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + this.getModelName());
        System.out.println("Меняем покрышку");

    }
}
