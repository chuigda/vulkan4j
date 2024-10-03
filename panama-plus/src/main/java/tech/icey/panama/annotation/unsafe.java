package tech.icey.panama.annotation;

/// A marker annotation to indicate that the annotated method is unsafe.
///
/// An {@link unsafe} method, if misused, could cause undefined behaviour such as buffer overflow or null pointer
/// dereference, which could in turn cause data corruption or even crash the JVM.
public @interface unsafe {
    /// Safe alternative to the annotated method.
    String alt() default "";
}
