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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCommandBufferAllocateInfo.html"><code>VkCommandBufferAllocateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkCommandBufferAllocateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkCommandPool commandPool;
///     VkCommandBufferLevel level;
///     uint32_t commandBufferCount;
/// } VkCommandBufferAllocateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO`
///
/// The {@link VkCommandBufferAllocateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkCommandBufferAllocateInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCommandBufferAllocateInfo.html"><code>VkCommandBufferAllocateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCommandBufferAllocateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkCommandBufferAllocateInfo allocate(Arena arena) {
        VkCommandBufferAllocateInfo ret = new VkCommandBufferAllocateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.COMMAND_BUFFER_ALLOCATE_INFO);
        return ret;
    }

    public static VkCommandBufferAllocateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCommandBufferAllocateInfo[] ret = new VkCommandBufferAllocateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCommandBufferAllocateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.COMMAND_BUFFER_ALLOCATE_INFO);
        }
        return ret;
    }

    public static VkCommandBufferAllocateInfo clone(Arena arena, VkCommandBufferAllocateInfo src) {
        VkCommandBufferAllocateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCommandBufferAllocateInfo[] clone(Arena arena, VkCommandBufferAllocateInfo[] src) {
        VkCommandBufferAllocateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.COMMAND_BUFFER_ALLOCATE_INFO);
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

    public @Nullable VkCommandPool commandPool() {
        MemorySegment s = segment.asSlice(OFFSET$commandPool, SIZE$commandPool);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkCommandPool(s);
    }

    public void commandPool(@Nullable VkCommandPool value) {
        segment.set(LAYOUT$commandPool, OFFSET$commandPool, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkCommandBufferLevel.class) int level() {
        return segment.get(LAYOUT$level, OFFSET$level);
    }

    public void level(@enumtype(VkCommandBufferLevel.class) int value) {
        segment.set(LAYOUT$level, OFFSET$level, value);
    }

    public @unsigned int commandBufferCount() {
        return segment.get(LAYOUT$commandBufferCount, OFFSET$commandBufferCount);
    }

    public void commandBufferCount(@unsigned int value) {
        segment.set(LAYOUT$commandBufferCount, OFFSET$commandBufferCount, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("commandPool"),
        ValueLayout.JAVA_INT.withName("level"),
        ValueLayout.JAVA_INT.withName("commandBufferCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$commandPool = PathElement.groupElement("PATH$commandPool");
    public static final PathElement PATH$level = PathElement.groupElement("PATH$level");
    public static final PathElement PATH$commandBufferCount = PathElement.groupElement("PATH$commandBufferCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$commandPool = (AddressLayout) LAYOUT.select(PATH$commandPool);
    public static final OfInt LAYOUT$level = (OfInt) LAYOUT.select(PATH$level);
    public static final OfInt LAYOUT$commandBufferCount = (OfInt) LAYOUT.select(PATH$commandBufferCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$commandPool = LAYOUT$commandPool.byteSize();
    public static final long SIZE$level = LAYOUT$level.byteSize();
    public static final long SIZE$commandBufferCount = LAYOUT$commandBufferCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$commandPool = LAYOUT.byteOffset(PATH$commandPool);
    public static final long OFFSET$level = LAYOUT.byteOffset(PATH$level);
    public static final long OFFSET$commandBufferCount = LAYOUT.byteOffset(PATH$commandBufferCount);
}
