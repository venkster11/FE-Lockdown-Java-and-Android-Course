public class Session2 {

    public static void main(String[] args) {
//        Session2a obj;
//        obj = new Session2a();

        // object creation
        // constructor overloading
        Session2a obj = new Session2a(18,28);
        obj.volume();

        obj.width = 10;
        obj.height = 12;
        obj.depth = 15;
        obj.volume();

        //method overloading
        obj.setDim(10,12,15);
        obj.volume();

        //method overloading
        obj.setDim(10,12);
        obj.volume();

        // object creation
        // constructor overloading
        Session2a obj1 = new Session2a(21,4,7);
        obj1.volume();

        obj1.width = 16;
        obj1.height = 18;
        obj1.depth = 20;
        obj1.volume();

        //method overloading
        obj1.setDim(16,18,20);
        obj1.volume();

        //method overloading
        obj1.setDim(16,18);
        obj1.volume();
    }
}
