package tech.icey.panama.annotation;

/// A marker annotation, indicating the type will consequentially become {@code @ValueBased} once Project Valhalla gets
/// stablized. In order to maintain compatibility, it's better not to rely on object hash identity of these
/// annotated types.
public @interface ValueBasedCandidate {
}
