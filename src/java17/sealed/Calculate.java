package java17.sealed;

public sealed interface Calculate permits Circle {
    void perimeter();
    void area();
}
