class Hanoi {

    private HanoiTower start;
    private HanoiTower middle;
    private HanoiTower end;
    private int levels;
    private int height;
    private int counter = 1;

    private Hanoi(int level) {
        start = new HanoiTower("start", level);
        middle = new HanoiTower("middle", level);
        end = new HanoiTower("end", level);
        this.levels = level;
        start.initializeDisks();
        height = start.toString().length();
    }

    static void run(int levels) {
        Hanoi hanoi = new Hanoi(levels);
        hanoi.showMoves();
        hanoi.summary();
    }

    private void summary() {
        System.out.println("\nTHE END");
        showTowers();
        System.out.printf("You need %d move(s) to finish", counter-1);
    }

    private void showMoves() {
        moves(levels, start, middle, end);
        try {
            Thread.sleep(1000/levels);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void moves(int level, HanoiTower first, HanoiTower second, HanoiTower third) {
        if (level > 0) {
            moves(level - 1, first, third, second);
            showDiskMove(first, third);
            showTowers();
            try {
                Thread.sleep(1000/levels);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            HanoiDisk diskToMove = first.popDisk();
            third.pushDisk(diskToMove);
            counter++;
            moves(level - 1, second, first, third);
        }
    }

    private void showDiskMove(HanoiTower first, HanoiTower third) {
        System.out.printf("\nMOVE %d: %s from [%s] to [%s]\n", counter, first.topDisk(), first.name(), third.name());
    }

    private void showTowers() {
        System.out.printf("%-" + height + "s %-" + height + "s %s\n", start, middle, end);
    }
}
