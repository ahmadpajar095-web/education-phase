// class  animal {
    //     void eat() {
        //         System.out.println("eating...");
        //     }
        // }
        
        // class crab extends animal {
            //     void eat(){
                //         System.out.println("crab is eating sand");
//     }
//     public void walk(){
    //         System.out.println("crab is walking sideways");
    //     }
    // }
    
    
class ShapeBetter {
    private String color;
    public ShapeBetter(String color) { this.color = color; }
    public String getColor() { return color; }
}

class RectangleBetter extends ShapeBetter {
    private int length, width;
    public RectangleBetter(String color, int length, int width) {
        super(color);         // panggil konstruktor ShapeBetter
        this.length = length;
        this.width  = width;
    }
    public int getLength() { return length; }
    public int getWidth()  { return width; }
}


class Parent {
    Parent() { System.out.println("Parent constructor"); }
}
class Child extends Parent {
    void anak() { System.out.println("Child constructor"); }
}

public class inher {
    
    public static void main(String[] args) {
        RectangleBetter rect = new RectangleBetter("Red", 5, 10);
        System.out.println("Color: " + rect.getColor());
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        Child obj = new Child();
        obj.anak();
        // animal a = new animal();
        // a.eat();
        // crab c = new crab();
        // c.eat();
        // c.walk();
        
    }
}
