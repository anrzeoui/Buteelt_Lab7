package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    // Task 1 Refactor: Road manages its own logic.
    // Frogger no longer needs to access the raw array.
    public boolean isOccupied(int position) {
        return this.occupied[position];
    }

    public boolean isValid(int position) {
        return position >= 0 && position < this.occupied.length;
    }
}