public class MainMemory {
    public static void main(String[] args) {
        try {
            memory();
        } catch (OutOfMemoryError e) {
            System.out.println("Crash!!!");
        }
    }

    public static void memory() {
        int ArraySize = 2 * 200000 * 1000;
        int[] i = new int[ArraySize];

    }
}



