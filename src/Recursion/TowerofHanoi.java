package Recursion;

public class TowerofHanoi {

    private int totalDisks;

    //set up the puzzle with the specified number of disks
    public TowerofHanoi(int disks) {
        totalDisks = disks;
    }

    public static void main(String[] args) {
        TowerofHanoi towers = new TowerofHanoi(4);
        towers.solve();
    }

    //performs the initial call to moveTower to solve the puzzle
    //Move the disks from tower 1 to tower 3 using tower 2
    public void solve() {
        moveTower(totalDisks, 1, 3, 2);
    }

    private void moveTower(int numDisks, int start, int end, int temp) {
        if (numDisks == 1) {
            moveOneDisk(start, end);
        } else {
            moveTower(numDisks - 1, start, temp, end);
            moveOneDisk(start, end);
            moveTower(numDisks - 1, temp, end, start);
        }
    }

    private void moveOneDisk(int start, int end) {
        System.out.println(" Move one disk from " + start + " to " + end);
    }
}
