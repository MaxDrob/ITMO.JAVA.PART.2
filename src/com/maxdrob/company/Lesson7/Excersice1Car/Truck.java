package com.maxdrob.company.Lesson7.Excersice1Car;

class Add {

    public static void main(String[] args) {
        Truck truck = new Truck(3500, "Cherokee", 'b', (char) 220, 8, 10000000);
        truck.outPut();

    }
    static class Truck extends Car {
        public int wheelCount;
        public int price;

        public Truck(int weight, String model, float speed, char colour, int wheelCount, int price) {
            super(weight, model, colour, speed);
            this.wheelCount = wheelCount;
            this.price = price;
        }

        public void newWheels(int newCount) {
            this.wheelCount = newCount;
            System.out.println("У Чероки " + this.wheelCount + " колес.");
        }

        @Override
        public void outPut() {
            super.outPut();
            System.out.println("У Чероки " + wheelCount + " колес. Цена базовой модели составляет " + price + " рублей.");
        }
    }
}
