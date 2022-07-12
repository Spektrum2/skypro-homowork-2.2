public class Truck implements Service {
    private String modelName;
    private int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + modelName);
        System.out.println("Меняем покрышку");
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }
}
