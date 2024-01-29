public class Car extends Transport implements Maintainable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String getModelName() {
        return super.getModelName();
    }
    @Override
    public int getWheelsCount() {
        return super.getWheelsCount();
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check() {
        System.out.println();
        System.out.println("Обслуживаем " + getModelName());
        updateTyre(getWheelsCount());
        checkEngine();
    }
}