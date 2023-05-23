public class Car extends AllTransport {

        public Car(String modelName, int wheelsCount) {
            super(modelName, wheelsCount);
        }

        public void updateTyre() {
            System.out.println("Меняем покрышку");
        }

        public void checkEngine() {
            System.out.println("Проверяем двигатель");
        }

    @Override
    public void transportServise() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
    }
}

