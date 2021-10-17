package java17;

public class SealedClass {

    // `permits` not required if subclasses are in the same source file
    sealed class Plant permits Herb, Shrub, Climber {}

    public final class Shrub extends Plant {}
    public non-sealed class Herb extends Plant {}
    public sealed class Climber extends Plant permits Cucumber{}

    public final class Cucumber extends Climber {}

}
