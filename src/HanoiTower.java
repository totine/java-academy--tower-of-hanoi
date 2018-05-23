import java.util.Stack;

class HanoiTower {

    private final int maxSize;
    private Stack<HanoiDisk> hanoiStack;


    HanoiTower(int levels) {
        hanoiStack = new Stack<>();
        maxSize = levels;

    }

    void initializeDisks() {
        for (int size=maxSize; size<=1; size--) {
            hanoiStack.push(new HanoiDisk(size));
        }
    }


}
