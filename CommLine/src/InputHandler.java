public class InputHandler {
    public static void print() {
        System.out.println("Hello from Varna");
    }
    public void help() {
        System.out.println("Usage: print, calc (two ints), help or exit to close the program.");
    }
    public int calc (int first, int second) throws Exception{
        if(second == 0) {
            throw new Exception("Second must be greater than zero");
        }
        return first / second;
    }
}
