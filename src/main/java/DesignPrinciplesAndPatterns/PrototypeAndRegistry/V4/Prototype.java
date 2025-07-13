package DesignPrinciplesAndPatterns.PrototypeAndRegistry.V3;

public interface Prototype<T> {
    /**
     * Creates a copy of the current object.
     *
     * @return a new instance that is a copy of this object
     */
    T copy();
    // We have used generic type T to allow flexibility in the type of object being copied.

    // Cloneable interface also exists with the same purpose
}
