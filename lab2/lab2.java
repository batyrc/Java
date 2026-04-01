public class lab2 {
}class lab2 {

    void show1() {
        System.out.println("Бұл lab2 класы");
    }

    static void main() {
        lab2 obj = new lab2();
        obj.show1();
        obj.show3();
        obj.show2();
    }
}

class lab2 extends lab2 {
    void show3() {
        System.out.println("Бұл lab2 класы");
    }
}

class lab2 extends lab2 {
    void show2() {
        System.out.println("Бұл fclass2 класы");
    }
}
