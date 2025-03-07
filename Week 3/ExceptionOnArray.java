public class ExceptionOnArray {
    public static void main(String[] args) {
        // Instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace(); // Print the exception stack trace
        } finally {
            System.out.println("clean up code..."); // This will always be executed
        }
    }
}
