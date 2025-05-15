package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindVideoSessionMemoryInfoKHR.html"><code>VkBindVideoSessionMemoryInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBindVideoSessionMemoryInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t memoryBindIndex;
///     VkDeviceMemory memory;
///     VkDeviceSize memoryOffset;
///     VkDeviceSize memorySize;
/// } VkBindVideoSessionMemoryInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_BIND_VIDEO_SESSION_MEMORY_INFO_KHR`
///
/// The {@link VkBindVideoSessionMemoryInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkBindVideoSessionMemoryInfoKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindVideoSessionMemoryInfoKHR.html"><code>VkBindVideoSessionMemoryInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBindVideoSessionMemoryInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkBindVideoSessionMemoryInfoKHR allocate(Arena arena) {
        VkBindVideoSessionMemoryInfoKHR ret = new VkBindVideoSessionMemoryInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.BIND_VIDEO_SESSION_MEMORY_INFO_KHR);
        return ret;
    }

    public static VkBindVideoSessionMemoryInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindVideoSessionMemoryInfoKHR[] ret = new VkBindVideoSessionMemoryInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBindVideoSessionMemoryInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.BIND_VIDEO_SESSION_MEMORY_INFO_KHR);
        }
        return ret;
    }

    public static VkBindVideoSessionMemoryInfoKHR clone(Arena arena, VkBindVideoSessionMemoryInfoKHR src) {
        VkBindVideoSessionMemoryInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindVideoSessionMemoryInfoKHR[] clone(Arena arena, VkBindVideoSessionMemoryInfoKHR[] src) {
        VkBindVideoSessionMemoryInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.BIND_VIDEO_SESSION_MEMORY_INFO_KHR);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int memoryBindIndex() {
        return segment.get(LAYOUT$memoryBindIndex, OFFSET$memoryBindIndex);
    }

    public void memoryBindIndex(@unsigned int value) {
        segment.set(LAYOUT$memoryBindIndex, OFFSET$memoryBindIndex, value);
    }

    public @Nullable VkDeviceMemory memory() {
        MemorySegment s = segment.asSlice(OFFSET$memory, SIZE$memory);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDeviceMemory(s);
    }

    public void memory(@Nullable VkDeviceMemory value) {
        segment.set(LAYOUT$memory, OFFSET$memory, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long memoryOffset() {
        return segment.get(LAYOUT$memoryOffset, OFFSET$memoryOffset);
    }

    public void memoryOffset(@unsigned long value) {
        segment.set(LAYOUT$memoryOffset, OFFSET$memoryOffset, value);
    }

    public @unsigned long memorySize() {
        return segment.get(LAYOUT$memorySize, OFFSET$memorySize);
    }

    public void memorySize(@unsigned long value) {
        segment.set(LAYOUT$memorySize, OFFSET$memorySize, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("memoryBindIndex"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset"),
        ValueLayout.JAVA_LONG.withName("memorySize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$memoryBindIndex = PathElement.groupElement("PATH$memoryBindIndex");
    public static final PathElement PATH$memory = PathElement.groupElement("PATH$memory");
    public static final PathElement PATH$memoryOffset = PathElement.groupElement("PATH$memoryOffset");
    public static final PathElement PATH$memorySize = PathElement.groupElement("PATH$memorySize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$memoryBindIndex = (OfInt) LAYOUT.select(PATH$memoryBindIndex);
    public static final AddressLayout LAYOUT$memory = (AddressLayout) LAYOUT.select(PATH$memory);
    public static final OfLong LAYOUT$memoryOffset = (OfLong) LAYOUT.select(PATH$memoryOffset);
    public static final OfLong LAYOUT$memorySize = (OfLong) LAYOUT.select(PATH$memorySize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$memoryBindIndex = LAYOUT$memoryBindIndex.byteSize();
    public static final long SIZE$memory = LAYOUT$memory.byteSize();
    public static final long SIZE$memoryOffset = LAYOUT$memoryOffset.byteSize();
    public static final long SIZE$memorySize = LAYOUT$memorySize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$memoryBindIndex = LAYOUT.byteOffset(PATH$memoryBindIndex);
    public static final long OFFSET$memory = LAYOUT.byteOffset(PATH$memory);
    public static final long OFFSET$memoryOffset = LAYOUT.byteOffset(PATH$memoryOffset);
    public static final long OFFSET$memorySize = LAYOUT.byteOffset(PATH$memorySize);
}
