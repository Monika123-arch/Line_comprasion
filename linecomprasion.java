public class linecomprasion {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public linecomprasion(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    static void compareTo(double length1, double length2) {
        if (length1 == length2)
            System.out.println("length1 is equal to length2");
        else if (length1 > length2)
            System.out.println("length1 is greater than length2");
        else
            System.out.println("length1 is shorter than length2");
    }

    static double calculate_length(linecomprasion obj) {
        double length = Math.sqrt(Math.pow(obj.x2 - obj.x1, 2) + Math.pow(obj.y2 - obj.y1, 2));
        return length;
    }

    public static void main(String[] args) {
        System.out.println("***welcome line comprasion problem***");
        linecomprasion line1 = new linecomprasion(2.3,3.5,5.3,4.5);
        linecomprasion line2 = new linecomprasion(3.5,4.6,8.5,4.5);
        double length1 = calculate_length(line1);
        double length2 = calculate_length(line2);
        compareTo(length1, length2);
    }
}
