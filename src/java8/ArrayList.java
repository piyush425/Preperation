package java8;
/**
 *  ArrayList Internal Working – Summary (Beginner Friendly)
 * Default Capacity:
 * When you create a new ArrayList, it creates an internal array of size 10.
 * But the size (number of elements) is initially 0.
 *
 * Adding Elements:
 * Each add() puts the element in the next available slot.
 * size increases by 1 with every add().
 *
 * When Full (Capacity Reached):
 *
 * If the array is full and you add more elements:
 * ➤ Java creates a new array with 1.5x the old capacity
 * ➤ Copies all old elements to the new array
 * ➤ Then adds the new element
 *
 * Example:
 * Old capacity = 10
 * New capacity = 10 + (10 / 2) = 15
 *
 * Removing Elements:
 * remove(index) shifts elements to the left and decreases size.
 * Internal Storage:
 *
 * Elements are stored in a plain array: Object[] elementData
 */


/**
 * why is elementData in ArrayList marked transient?
 * transient Object[] elementData;
 *
 * Reasons:
 * It's an internal working array, not meant to be directly serialized.
 * It may have empty/null slots (not actual data).
 * It can have extra capacity that’s not used.
 *
 * During serialization, Java doesn’t want to waste space or store unused elements.
 *
 * Instead, ArrayList overrides serialization logic in writeObject() method to:
 *
 * Only serialize the actual elements (up to size), not the whole elementData array.
 *
 * Later during deserialization, readObject() will:
 *
 * Create a new internal array
 *
 * Restore only the needed elements (not the whole capacity)
 */