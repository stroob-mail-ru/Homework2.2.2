public class Car extends Transport implements ServiceStation {

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

    @Override
    public void check() {
        System.out.println();
        System.out.println("Обслуживаем " + getModelName());
        Transport.updateTyre(getWheelsCount());
        Transport.checkEngine();
    }
}