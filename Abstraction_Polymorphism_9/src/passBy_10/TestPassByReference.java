package passBy_10;

public class TestPassByReference {

    public static void main(String[] args) {
        Point first  = new Point(4, 6);
        System.out.println("first: "+ first);
        move(first);
        System.out.println("first: "+ first);

    }

    public static void move(Point p){
        /*
        jo yaha p ke sath ched chad ki h wo p ke sath hi nhi balki first ke
        sath bhi ki h kyuki first & p reference same point ko hi point kr rhe h
        isliye jo x & y me change kiya wo first wale me bhi change ho gya
        */
        p.x++;
        p.y++;
        System.out.println(p);
    }

    public static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }

}
