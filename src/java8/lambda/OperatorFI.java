package java8.lambda;

@FunctionalInterface
interface OperatorFI<T> {
    T process(T a, T b);
}
