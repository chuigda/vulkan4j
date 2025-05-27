package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMemoryProperties.html"><code>VkPhysicalDeviceMemoryProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMemoryProperties {
///     uint32_t memoryTypeCount; // @link substring="memoryTypeCount" target="#memoryTypeCount"
///     VkMemoryType memoryTypes; // @link substring="VkMemoryType" target="VkMemoryType" @link substring="memoryTypes" target="#memoryTypes"
///     uint32_t memoryHeapCount; // @link substring="memoryHeapCount" target="#memoryHeapCount"
///     VkMemoryHeap memoryHeaps; // @link substring="VkMemoryHeap" target="VkMemoryHeap" @link substring="memoryHeaps" target="#memoryHeaps"
/// } VkPhysicalDeviceMemoryProperties;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMemoryProperties.html"><code>VkPhysicalDeviceMemoryProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceMemoryProperties(@NotNull MemorySegment segment) implements IVkPhysicalDeviceMemoryProperties {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMemoryProperties.html"><code>VkPhysicalDeviceMemoryProperties</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceMemoryProperties}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceMemoryProperties to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceMemoryProperties.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceMemoryProperties {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceMemoryProperties.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceMemoryProperties at(long index) {
            return new VkPhysicalDeviceMemoryProperties(segment.asSlice(index * VkPhysicalDeviceMemoryProperties.BYTES, VkPhysicalDeviceMemoryProperties.BYTES));
        }

        public void write(long index, @NotNull VkPhysicalDeviceMemoryProperties value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceMemoryProperties.BYTES, VkPhysicalDeviceMemoryProperties.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkPhysicalDeviceMemoryProperties.BYTES, VkPhysicalDeviceMemoryProperties.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPhysicalDeviceMemoryProperties.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPhysicalDeviceMemoryProperties.BYTES,
                (end - start) * VkPhysicalDeviceMemoryProperties.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPhysicalDeviceMemoryProperties.BYTES));
        }

        public VkPhysicalDeviceMemoryProperties[] toArray() {
            VkPhysicalDeviceMemoryProperties[] ret = new VkPhysicalDeviceMemoryProperties[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkPhysicalDeviceMemoryProperties allocate(Arena arena) {
        return new VkPhysicalDeviceMemoryProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMemoryProperties.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkPhysicalDeviceMemoryProperties.Ptr(segment);
    }

    public static VkPhysicalDeviceMemoryProperties clone(Arena arena, VkPhysicalDeviceMemoryProperties src) {
        VkPhysicalDeviceMemoryProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Unsigned int memoryTypeCount() {
        return segment.get(LAYOUT$memoryTypeCount, OFFSET$memoryTypeCount);
    }

    public void memoryTypeCount(@Unsigned int value) {
        segment.set(LAYOUT$memoryTypeCount, OFFSET$memoryTypeCount, value);
    }

    public @NotNull VkMemoryType memoryTypes() {
        return new VkMemoryType(segment.asSlice(OFFSET$memoryTypes, LAYOUT$memoryTypes));
    }

    public void memoryTypes(@NotNull VkMemoryType value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$memoryTypes, SIZE$memoryTypes);
    }

    public @Unsigned int memoryHeapCount() {
        return segment.get(LAYOUT$memoryHeapCount, OFFSET$memoryHeapCount);
    }

    public void memoryHeapCount(@Unsigned int value) {
        segment.set(LAYOUT$memoryHeapCount, OFFSET$memoryHeapCount, value);
    }

    public @NotNull VkMemoryHeap memoryHeaps() {
        return new VkMemoryHeap(segment.asSlice(OFFSET$memoryHeaps, LAYOUT$memoryHeaps));
    }

    public void memoryHeaps(@NotNull VkMemoryHeap value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$memoryHeaps, SIZE$memoryHeaps);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("memoryTypeCount"),
        VkMemoryType.LAYOUT.withName("memoryTypes"),
        ValueLayout.JAVA_INT.withName("memoryHeapCount"),
        VkMemoryHeap.LAYOUT.withName("memoryHeaps")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$memoryTypeCount = PathElement.groupElement("memoryTypeCount");
    public static final PathElement PATH$memoryTypes = PathElement.groupElement("memoryTypes");
    public static final PathElement PATH$memoryHeapCount = PathElement.groupElement("memoryHeapCount");
    public static final PathElement PATH$memoryHeaps = PathElement.groupElement("memoryHeaps");

    public static final OfInt LAYOUT$memoryTypeCount = (OfInt) LAYOUT.select(PATH$memoryTypeCount);
    public static final StructLayout LAYOUT$memoryTypes = (StructLayout) LAYOUT.select(PATH$memoryTypes);
    public static final OfInt LAYOUT$memoryHeapCount = (OfInt) LAYOUT.select(PATH$memoryHeapCount);
    public static final StructLayout LAYOUT$memoryHeaps = (StructLayout) LAYOUT.select(PATH$memoryHeaps);

    public static final long SIZE$memoryTypeCount = LAYOUT$memoryTypeCount.byteSize();
    public static final long SIZE$memoryTypes = LAYOUT$memoryTypes.byteSize();
    public static final long SIZE$memoryHeapCount = LAYOUT$memoryHeapCount.byteSize();
    public static final long SIZE$memoryHeaps = LAYOUT$memoryHeaps.byteSize();

    public static final long OFFSET$memoryTypeCount = LAYOUT.byteOffset(PATH$memoryTypeCount);
    public static final long OFFSET$memoryTypes = LAYOUT.byteOffset(PATH$memoryTypes);
    public static final long OFFSET$memoryHeapCount = LAYOUT.byteOffset(PATH$memoryHeapCount);
    public static final long OFFSET$memoryHeaps = LAYOUT.byteOffset(PATH$memoryHeaps);
}
