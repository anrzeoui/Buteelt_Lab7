package frogger;

/**
 * Refactor Task 1 & 2: Frogger
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22), Duan Liang (F23)
 */
public class Frogger {

    // Task 1: Frogger holds a Road reference and its position.
    private final Road road;
    private int position;

    // Task 2 Refactor: replaced 6 separate String fields with a single FroggerID.
    private final FroggerID id;
    private final Records records;

    public Frogger(Road road, int position, Records records, FroggerID id) {
        this.road = road;
        this.position = position;
        this.records = records;
        this.id = id;
    }

    /**
     * Moves Frogger.
     *
     * @param forward true is move forward, else false.
     * @return true if move successful, else false.
     */
    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        // Task 1 Refactor: Road now owns isValid/isOccupied — no raw array access here.
        if (!road.isValid(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    /**
     * Records Frogger to the list of records.
     *
     * @return true if record successful, else false.
     */
    public boolean recordMyself() {
        // Task 2 Refactor: pass FroggerID instead of 6 individual String fields.
        return records.addRecord(this.id);
    }

}