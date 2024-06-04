package edu.kis.vh.nursery;

/**
 * Klasa jest implementacja stosu 
 */
public class DefaultCountingOutRhymer {

    private static final int ARRAY_SIZE = 12;
    private static final int EMPTY = -1;
    private static final int CAPACITY = ARRAY_SIZE - 1;
    private static final int IF_EMPTY = -1;

    private final int[] numbers = new int[ARRAY_SIZE];

    private int total = EMPTY;


    /**
     * Dodanie liczby do stosu
     *
     * @param in liczba do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza czy stos jest pusty
     *
     * @return true, jesli stos jest pusty; w przeciwnym razie false
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Sprawdza czy stos jest pelny
     *
     * @return true, jesli stos jest pelny; w przeciwnym razie false
     */
    public boolean isFull() {
        return total == CAPACITY;
    }

    /**
     * Zwraca ostatnio dodana liczbe bez jej usuwania ze stosu
     *
     * @return ostatnio dodana liczba lub IF_EMPTY, jesli stos jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total];
    }

    /**
     * Zwraca ostatnio dodana liczbe i ja usuwa ze stosu
     *
     * @return ostatnio dodana liczba lub IF_EMPTY, jesli stos jest pusty
     */
    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total--];
    }

}
