package club.doki7.ffm.annotation;

import java.lang.annotation.Documented;

/// Marker annotation, indicating that the annotated record constructor is Unsafe
///
/// An {@link UnsafeConstructor} constructor, if misused, could cause undefined behaviour such as
/// buffer overflow or null pointer dereference, which could in turn cause data corruption or even
/// crash the JVM.
@Documented
public @interface UnsafeConstructor {
}
