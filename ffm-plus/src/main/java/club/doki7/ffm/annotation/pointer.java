package club.doki7.ffm.annotation;

import java.lang.annotation.Documented;

/// A marker annotation to indicate that the annotated value is a pointer.
@Documented
public @interface pointer {
    Class<?> target() default Object.class;
    String comment() default "";
}
