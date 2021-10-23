package java17;

public class SealedInterface {

    sealed interface Shape permits Shape2d, Shape3d {}

    non-sealed interface Shape2d extends Shape {}
    non-sealed interface Shape3d extends Shape {}
}
