import extend.*;

public class Main {
    public static final double PI = 3.14;
    // Biến instance
    // Thuộc tính
    // static int age = 100; // Có thể sử dụng trực tiếp
    int age ; // Có thể sử dụng trực tiếp
    static int ageStatic ;
    // Khối static
    static {
        ageStatic = 100000;
    }
    public static void main(String[] args) {
        // Khởi tạo đối tượng Main
        Main main1 = new Main();
        main1.age = 100; // Biến instance, thuộc tính
        Main main2 = new Main();
        main2.age = 10000;
        System.out.println(main1.age);
        System.out.println(main2.age);

        System.out.println(Main.ageStatic); // Biến tĩnh
        Main.print();
        Main.SubMain subMain = new Main.SubMain("Nguyễn Văn A");
        final String name;
        name = "Rikkei";

        Dog dog = new Dog("dhhdhd");
//        dog.species = "chó";
//        System.out.println(dog.species);
        dog.makeSound();
        // Đối tương dog đã bị ép kiểu thành Animal : ép kiểu ngầm đinh (upcasting)
        Animal animal = dog;
        // Ép kiểu tường ming (downcasting)
        Dog shiba  = (Dog) animal;  // Dog vừa là kiểu thực tế vừa là kiểu khai báo của shiba
        // Cat cat  = (Cat) animal; // cat có kiểu thực tế là chó, nhưng khai báo là Cat
        // Kiểm tra kiểu thực tế của 1 dối tượng : instanceof
        Animal animal1 = new Cat(); // chỉ sử dụng được các phương thức khai báo ở lớp cha, reflection
        if (animal1 instanceof Cat){
            System.out.println("Animal là kiểu mèo");
            // Ép được
            Cat cat = (Cat) animal1;
        }

        dog.toString();

//        Activity dog1 = new Dog();
//        Activity cat1 = new Cat();
//        dog1.eat();
//        dog1.move();
//        dog1.sleep();
//        cat1.eat();
//        cat1.move();
//        cat1.sleep();

        // Gọi phương thưc sum của Calculator
        // Nạp chồng thể hiện tính đa hình tại thời điểm compile time
        Calculator.sum(1,1.1f);
        Animal milu = new Dog("milu");
        milu.makeSound(); // Dự đoán của Animal
    }

    // Phương thức tĩnh
    public static void print(){
        System.out.println("Hello world");
    }
    // Lớp tĩnh
    static class SubMain{
        String name; // Khi nào có vùng nhớ
        public SubMain(String name) {
            this.name = name;
        }
    }
    public void printNumber(final int number){
        Print.printNumber(number);
    }
}