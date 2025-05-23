/// Utility classes encapsulating {@link java.lang.foreign.MemorySegment}, providing type-safe way
/// to access native memory.
///
/// ## Quick start
///
/// Java 22 FFM presents a new way to access native memory, using the new
/// {@link java.lang.foreign.MemorySegment}. However, unlike previous practices like
/// {@link java.nio.Buffer}, {@link java.lang.foreign.MemorySegment} does not have any type
/// information attached to it. Type information are more relevant with read/write operations,
/// not the memory segment itself.
///
/// In order to fill the gap, a dozen of handy pointer wrapper types are provided in this package.
/// For example, to manipulate a pointer to integer(s), you may use
/// {@link club.doki7.ffm.ptr.IntPtr}:
///
/// {@snippet :
/// try (Arena arena = Arena.ofConfined()) {
///     IntPtr ptr = IntPtr.allocate(arena);
///     ptr.write(42);
///     assert ptr.read() == 42;
///
///     // pointer to an array of integers
///     int[] arr = {1, 2, 3, 4, 5};
///     IntPtr pArray = IntPtr.allocate(arena, arr); // copy from Java array
///     assert pArray.size() == 5;
///     for (int i = 0; i < pArray.size(); i++) {
///         assert pArray.read(i) == arr[i];
///     }
/// }
/// }
///
/// See the documentation of classes in this package for more details.
package club.doki7.ffm.ptr;
