public class Hw1TestPen {
    public static void main(String[] args) {
        Hw1Pen p1 = new Hw1Pen();
        Hw1Pen p2 = new Hw1Pen(123);
        Hw1Pen p3 = new Hw1Pen(123,"1234A");
        Hw1Pen p4 = new Hw1Pen(123,"1234A","Pentel");
        Hw1Pen p5 = new Hw1Pen(123,"1234A","Pentel",35.00);
        System.out.println(Hw1Pen.allPen()); 
        System.out.println("Sum of Pen : "+Hw1Pen.numberOfPen());
    }  
}