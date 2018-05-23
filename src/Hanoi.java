public class Hanoi {

    private HanoiTower start;
    private HanoiTower middle;
    private HanoiTower end;

    private Hanoi(int levels) {
        start = new HanoiTower(levels);
        middle = new HanoiTower(levels);
        end = new HanoiTower(levels);
        start.initializeDisks();
    }

    public static void main(String[] args) {
        int levels;
        try {
            levels = Integer.parseInt(args[0]);
        }
        catch (Exception e) {
            levels = 3;
        }
        Hanoi.run(levels);
    }

    private static void run(int levels) {
        Hanoi hanoi = new Hanoi(levels);
        hanoi.showMoves();
    }

    private void showMoves() {

    }
}
