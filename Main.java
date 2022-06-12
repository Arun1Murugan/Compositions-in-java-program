public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12,145);

        Bed bed = new Bed("Modern",4,20, 4, 1);

        Lamp lamp = new Lamp("Classic", true, 100);

        BedRoom bedRoom = new BedRoom("Arun",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }
}