package tech.icey.vk4j.annotations;

/// A marker annotation to indicate that the annotated method is unsafe.
///
/// Note that in Rust world, the concept {@code unsafe} is defined as "can create undefined
/// behavior if misused". However, there's no (or maybe rarely) undefined behaviour in Java world.
/// So this {@code unsafe} is used to indicate that a method, if misused, could cause data
/// inconsistency, violating assumptions of other parts of the code, etc.
public @interface unsafe {
    /// Safe alternative to the annotated method.
    String alt() default "";
}
