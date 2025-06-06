package club.doki7.ffm.annotation;

import java.lang.annotation.Documented;

/// Marker annotation, indicating that the annotated integral value should be treated as Unsigned.
///
/// For example, if an {@code int} is annotated with this annotation, you should use
/// {@link Integer#toUnsignedString} to get its string representation, and so on.
@Documented
public @interface Unsigned {}
