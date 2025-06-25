package club.doki7.ffm.annotation;

import java.lang.annotation.Documented;

/// Marker annotation, indicating that an integral value is a C bitmask type.
@Documented
public @interface Bitmask {
    Class<?> value() default void.class;
}
