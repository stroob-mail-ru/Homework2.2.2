public class Truck extends Transport implements Maintainable {

    public Truck(String modelName, int wheelsCount) {
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
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check() {
        System.out.println();
        System.out.println("Обслуживаем " + getModelName());
        updateTyre(getWheelsCount());
        checkEngine();
        checkTrailer();
    }
}