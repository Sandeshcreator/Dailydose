public class Exam {
    public static void main(String[] args) {
        String input = "123.55"; // String value to parse as double

        try {
            double value = Double.parseDouble(input);
            System.out.println("Parsed value: " + value);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid double value!");
        }
    }
}
