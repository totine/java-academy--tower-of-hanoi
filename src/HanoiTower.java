import java.util.Arrays;
import java.util.Stack;

class HanoiTower {

    private final int maxSize;
    private Stack<HanoiDisk> hanoiStack;
    private String name;


    HanoiTower(String name, int levels) {
        hanoiStack = new Stack<>();
        maxSize = levels;
        this.name = name;

    }

    void initializeDisks() {
        for (int size = maxSize; size >= 1; size--) {
            hanoiStack.push(new HanoiDisk(size));
        }
    }

    HanoiDisk popDisk() {
        return hanoiStack.pop();
    }

    void pushDisk(HanoiDisk hanoiDisk) {
        hanoiStack.push(hanoiDisk);
    }

    @Override
    public String toString() {
        return name + ": " + Arrays.toString(hanoiStack.toArray());
    }

    HanoiDisk topDisk() {
        return hanoiStack.peek();
    }

    public String name() {
        return name;
    }
}
