package cc.design7.ffm.annotation;

/// A marker annotation to indicate that the annotated value is a pointer.
public @interface pointer {
    Class<?> target() default Object.class;
    String comment() default "";
}
