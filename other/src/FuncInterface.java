public class FuncInterface {
    public static void main(String[] args) {
        Operation o = (x, y) -> x * y;
        System.out.println(o.solve(1, 2));
    }
}

@FunctionalInterface
interface Operation {
    int solve(int x, int y);
}