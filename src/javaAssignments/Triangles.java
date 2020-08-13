package javaAssignments;
/**
 * 12. Triangles
 *
 * Determine if a triangle is equilateral, isosceles, or scalene. An equilateral
 * triangle has all three sides the same length. An isosceles triangle has at
 * least two sides the same length.
 *
 * (It is sometimes specified as having exactly two sides the same length, but
 * for the purposes of this exercise we'll say at least two.) A scalene triangle
 * has all sides of different lengths.
 */
public class Triangles {

    public static void main(String[] args) {
        Triangle triangle=new Triangle(4,5,6);
        System.out.println(triangle.isEquilateral());

    }

    static class Triangle {
        private double sideOne;
        private double sideTwo;
        private double sideThree;

        public Triangle() {
            super();
        }

        public Triangle(double sideOne, double sideTwo, double sideThree) {
            this();
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.sideThree = sideThree;
        }

        public double getSideOne() {
            return sideOne;
        }

        public void setSideOne(double sideOne) {
            this.sideOne = sideOne;
        }

        public double getSideTwo() {
            return sideTwo;
        }

        public void setSideTwo(double sideTwo) {
            this.sideTwo = sideTwo;
        }

        public double getSideThree() {
            return sideThree;
        }

        public void setSideThree(double sideThree) {
            this.sideThree = sideThree;
        }

        public boolean isEquilateral() {
            if(sideOne==sideTwo && sideOne==sideThree && sideTwo==sideThree) {
                return true;
            }
            return false;
        }

        public boolean isIsosceles() {
            if(sideOne==sideTwo || sideOne==sideThree || sideTwo==sideThree) {
                return true;
            }
            return false;
        }

        public boolean isScalene() {
            if(sideOne!=sideTwo && sideOne!=sideThree && sideTwo!=sideThree) {
                return true;
            }
            return false;
        }

    }

}
