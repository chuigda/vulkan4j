package club.doki7.ffm.annotation;

/// A marker annotation to indicate that the annotated value should be treated as unsigned.
///
/// For example, if an {@code int} is annotated with this annotation, you should use
/// {@link Integer#toUnsignedString} to get its string representation, and so on.
public @interface unsigned {}
