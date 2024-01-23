public abstract class Transport {
    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }

    protected static void updateTyre(int wheelsCount) {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");;
        }
    }
    protected static void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    protected static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}
