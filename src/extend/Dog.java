package extend;
// Sub class
public class Dog extends Animal {
    String name;
    // lớp Dog kế thừa Animal
    @Override // Chú thich phát hiện lỗi
    public void makeSound() {
        // Empty
        System.out.println("go go");
    }
    public Dog(String species) {
        super(species); // Gọi đến constructor của lớp cha
    }
    public Dog(String species, String name) {
        super(species);
        this.name = name;
    }
    public void printSpecies() {
        // In tên loài  + tên của con chó
        System.out.println(super.getSpecies());
    }

//    @Override
//    public void move() {
//        System.out.println("Chó di chuyển");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Chó ăn xương");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("Chó đang ngu");
//    }
}