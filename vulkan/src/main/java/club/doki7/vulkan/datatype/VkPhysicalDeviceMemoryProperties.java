package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMemoryProperties.html"><code>VkPhysicalDeviceMemoryProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceMemoryProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceMemoryProperties allocate(Arena arena) {
        return new VkPhysicalDeviceMemoryProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMemoryProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMemoryProperties[] ret = new VkPhysicalDeviceMemoryProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMemoryProperties(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPhysicalDeviceMemoryProperties clone(Arena arena, VkPhysicalDeviceMemoryProperties src) {
        VkPhysicalDeviceMemoryProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMemoryProperties[] clone(Arena arena, VkPhysicalDeviceMemoryProperties[] src) {
        VkPhysicalDeviceMemoryProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int memoryTypeCount() {
        return segment.get(LAYOUT$memoryTypeCount, OFFSET$memoryTypeCount);
    }

    public void memoryTypeCount(@unsigned int value) {
        segment.set(LAYOUT$memoryTypeCount, OFFSET$memoryTypeCount, value);
    }

    public @NotNull VkMemoryType memoryTypes() {
        return new VkMemoryType(segment.asSlice(OFFSET$memoryTypes, LAYOUT$memoryTypes));
    }

    public void memoryTypes(@NotNull VkMemoryType value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$memoryTypes, SIZE$memoryTypes);
    }

    public @unsigned int memoryHeapCount() {
        return segment.get(LAYOUT$memoryHeapCount, OFFSET$memoryHeapCount);
    }

    public void memoryHeapCount(@unsigned int value) {
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

    public static final PathElement PATH$memoryTypeCount = PathElement.groupElement("PATH$memoryTypeCount");
    public static final PathElement PATH$memoryTypes = PathElement.groupElement("PATH$memoryTypes");
    public static final PathElement PATH$memoryHeapCount = PathElement.groupElement("PATH$memoryHeapCount");
    public static final PathElement PATH$memoryHeaps = PathElement.groupElement("PATH$memoryHeaps");

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
