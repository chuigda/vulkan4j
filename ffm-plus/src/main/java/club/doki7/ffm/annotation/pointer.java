package club.doki7.ffm.annotation;

import java.lang.annotation.Documented;

/// Marker annotation, indicating that a pointer value ({@link java.lang.foreign.MemorySegment} or
/// {@code long}) is a pointer to a specific type.
@Documented
public @interface pointer {
    Class<?> target() default Object.class;
    String comment() default "";
}
