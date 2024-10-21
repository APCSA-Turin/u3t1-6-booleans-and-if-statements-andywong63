public class SelectionMadness {

    // no instance variables //

    public SelectionMadness() {
    }

    /*
     * Returns 1 of 5 randomly generated fortunes as a string;
     * you should write your own 5 fortunes! (see output for examples)
     */
    public String fortune() {
        int fortuneIndex = (int) (Math.random() * 5);
        if (fortuneIndex == 0) {
            return "Today will be a good day";
        } else if (fortuneIndex == 1) {
            return "Nothing bad will happen today";
        } else if (fortuneIndex == 2) {
            return "The sun will shine";
        } else if (fortuneIndex == 3) {
            return "There will be no rain today";
        } else {
            return "Life is good";
        }
    }

    /*
     * Returns the largest of three provided integers: num1, num2, or num3
     */
    public int largest(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    /*
     * Returns true if the three provided lengths create a right triangle, in
     * other words, a2 + b2 = c2, where c is the longest side; returns false
     * Otherwise (hint: use the largest() method that you wrote).
     * Note the "largest" side could be any of the 3 numbers, i.e. your method
     * should work if side1 = 3, side2 = 4, and side3 = 5 and also if
     * side1 = 5, side2 = 4, and side3 = 3
     */
    public boolean rightTriangle(int side1, int side2, int side3) {
        int hypotenuse = largest(side1, side2, side3);
        int legsSquared = 0;
        if (side1 != hypotenuse) {
            legsSquared += Math.pow(side1, 2);
        }
        if (side2 != hypotenuse) {
            legsSquared += Math.pow(side2, 2);
        }
        if (side3 != hypotenuse) {
            legsSquared += Math.pow(side3, 2);
        }
        return legsSquared == Math.pow(hypotenuse, 2);
    }
}