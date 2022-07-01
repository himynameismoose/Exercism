class Triangle {

    private double side1, side2, side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        // Check if any side is 0, throw TriangleException
        if (side1 <= 0 || side2 <= 0 | side3 <= 0)
            throw new TriangleException();

        // Check if legal triangle (2 side sum > 3rd side)
        if ((side1 + side2) < side3 || (side1 + side3) < side2 || (side2 + side3) < side1)
            throw new TriangleException();

        // Assign values
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    boolean isEquilateral() {
        return (side1 == side2) && (side1 == side3);
    }

    boolean isIsosceles() {
        return (side1 == side2) || (side1 == side3) || (side2 == side3);
    }

    boolean isScalene() {
        return !isEquilateral() && !isIsosceles();
    }

}
