package tech.icey.panama.annotation;

/// A marker annotation to indicate that the annotated value is a pointer.
public @interface pointer {
    Class<?> target() default Object.class;
    String comment() default "";
}
