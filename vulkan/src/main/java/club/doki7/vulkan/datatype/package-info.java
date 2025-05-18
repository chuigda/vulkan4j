/// Structure ({@code struct} or {@code union}) types of Vulkan API.
///
/// ## Quick start
///
/// In {@code vulkan4j} ecosystem, structures are represented with a Java record type containing
/// a single {@link java.lang.foreign.MemorySegment} field. That segment is the pointer to the
/// first byte of the structure in native memory.
///
/// To allocate a structure, you can use the {@code allocate} series functions:
///
/// {@snippet :
/// try (Arena arena = Arena.ofConfined()) {
///     // Allocate one structure, sType will be initialized automatically by allocate function
///     VkBufferCreateInfo info = VkBufferCreateInfo.allocate(arena);
///     useBufferCreateInfo(info, 1);
///
///     // Allocate multiple structures in a continuous memory block
///     // all the structures will be initialized automatically, too
///     VkBufferCreateInfo[] infoArray = VkBufferCreateInfo.allocate(arena, 10);
///     // When interacting with C APIs, the address of the first structure is of course the address
///     // of the whole memory block.
///     useBufferCreateInfo(infoArray[0], 10);
/// }
///
/// // A common C API pattern, accepting one or more structures. The first argument is the address
/// // of the first element in the array, the second argument is the number of elements.
/// void useBufferCreateInfo(VkBufferCreateInfo info, int count) {
///     // implementation omitted
/// }
/// }
package club.doki7.vulkan.datatype;
