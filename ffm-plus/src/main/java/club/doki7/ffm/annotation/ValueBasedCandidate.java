package club.doki7.ffm.annotation;

import java.lang.annotation.Documented;

/// Marker annotation, indicating the annotated type will consequentially become {@code @ValueBased}
/// once Project Valhalla gets stabilized.
///
/// In order to maintain compatibility, it's better not to rely on object hash identity of these
/// annotated types.
@Documented
public @interface ValueBasedCandidate {
}
