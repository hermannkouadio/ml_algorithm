package algorithms;

/**
 * represent the base structure of an algorithm
 * @param <T> inputs values to process
 * @param <V> expected result type
 */
public interface AlgorithmI<T, V> {
    void initialization();
    void definition();
    V process(T t);
}
