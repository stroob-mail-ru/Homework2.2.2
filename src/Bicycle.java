public class Bicycle extends Transport implements Maintainable {

    public Bicycle(String modelName, int wheelsCount) {
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

    @Override
    public void check() {
        System.out.println();
        System.out.println("Обслуживаем " + getModelName());
        updateTyre(getWheelsCount());
    }
}