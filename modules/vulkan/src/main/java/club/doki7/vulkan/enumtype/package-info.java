/// Enumeration ({@code enum}) types of Vulkan API.
///
/// ## Quick start
///
/// In {@code vulkan4j} ecosystem, we don't use Java class types to represent C {@code enum} types.
/// We will be still using Java integers ({@code int} or {@code long}), also
/// {@link club.doki7.ffm.ptr} types when representing pointer to or array of enums.
///
/// In order to tell what enum type an integral value represents, we use the annotation
/// {@link club.doki7.ffm.annotation.EnumType @MagicConstant}. For example:
///
/// {@snippet :
/// public record VkBufferCreateInfo(MemorySegment segment) {
///     @MagicConstant(valuesFromClass = VkSharingMode.class) int sharingMode() {
///         // implementation omitted
///     }
///
///     void sharingMode(@MagicConstant(valuesFromClass = VkSharingMode.class) int value) {
///         // implementation omitted
///     }
///
///     // ...
/// }
/// }
///
/// The {@link org.intellij.lang.annotations.MagicConstant @MagicConstant} annotation provides useful in-IDE and
/// JavaDoc links, so you can Ctrl-Click on the annotation argument to jump to the definition of the
/// bitmask type.
///
/// Also, there's a handy {@code explain} function to explain a bitmask integral value. For example:
///
/// {@snippet :
/// VkSharingMode.explain(someSharingMode)
/// }
package club.doki7.vulkan.enumtype;
