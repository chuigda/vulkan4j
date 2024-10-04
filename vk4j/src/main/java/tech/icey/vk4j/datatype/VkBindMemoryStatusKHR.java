package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.buffer.IntBuffer;
import tech.icey.vk4j.enumtype.VkResult;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR;

/// {@snippet lang=c :
/// typedef struct VkBindMemoryStatusKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkResult* pResult;
/// } VkBindMemoryStatusKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkBindMemoryStatusKHR.html">VkBindMemoryStatusKHR</a>
public record VkBindMemoryStatusKHR(MemorySegment segment) implements IPointer {
    public VkBindMemoryStatusKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BIND_MEMORY_STATUS_KHR);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @pointer(target=VkResult.class) MemorySegment pResultRaw() {
        return segment.get(LAYOUT$pResult, OFFSET$pResult);
    }

    public void pResultRaw(@pointer(target=VkResult.class) MemorySegment value) {
        segment.set(LAYOUT$pResult, OFFSET$pResult, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or {@link IntBuffer#write}ing
    /// the buffer.
    public @nullable @enumtype(VkResult.class) IntBuffer pResult() {
        MemorySegment s = pResultRaw();
        if (s.address() == 0) {
            return null;
        }

        return new IntBuffer(s);
    }

    public void pResult(@nullable @enumtype(VkResult.class) IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pResultRaw(s);
    }

    public static VkBindMemoryStatusKHR allocate(Arena arena) {
        return new VkBindMemoryStatusKHR(arena.allocate(LAYOUT));
    }

    public static VkBindMemoryStatusKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindMemoryStatusKHR[] ret = new VkBindMemoryStatusKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBindMemoryStatusKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBindMemoryStatusKHR clone(Arena arena, VkBindMemoryStatusKHR src) {
        VkBindMemoryStatusKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindMemoryStatusKHR[] clone(Arena arena, VkBindMemoryStatusKHR[] src) {
        VkBindMemoryStatusKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pResult")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pResult = PathElement.groupElement("pResult");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pResult = (AddressLayout) LAYOUT.select(PATH$pResult);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pResult = LAYOUT.byteOffset(PATH$pResult);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pResult = LAYOUT$pResult.byteSize();
}
