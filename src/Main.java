public class Main {

    public static void main(String[] args) {
        try {
            Exception_Generator generator = new Exception_Generator();
            generator.generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException!");
            System.out.println("Error message: " + e.getMessage());
            System.out.println("\nStackTrace:");
            e.printStackTrace();
            System.out.println("\nToString():");
            System.out.println(e.toString());
        }
    }
}