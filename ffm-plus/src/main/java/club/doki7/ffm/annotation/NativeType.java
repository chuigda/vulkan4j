package club.doki7.ffm.annotation;

import java.lang.annotation.Documented;

/// Marker annotation, indicating that a value is actually of an aliased native type.
@Documented
public @interface NativeType {
    String value() default "";
}
