class HanoiDisk implements Comparable<HanoiDisk> {

    private final int size;

    @Override
    public String toString() {
        return "Disk " + size;
    }

    HanoiDisk(int size) {
        this.size = size;
    }


    @Override
    public int compareTo(HanoiDisk otherDisk) {
        return this.size - otherDisk.size;
    }
}
