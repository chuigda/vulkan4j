package club.doki7.ffm.annotation;

import java.lang.annotation.Documented;

/// Marker annotation, indicating that an integral value is a C enum (maybe bitmask) type.
@Documented
public @interface EnumType {
    Class<?> value() default Object.class;
}
