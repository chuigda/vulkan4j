package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkCommandBufferBeginInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkCommandBufferUsageFlags flags;
///     const VkCommandBufferInheritanceInfo* pInheritanceInfo;
/// } VkCommandBufferBeginInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkCommandBufferBeginInfo.html">VkCommandBufferBeginInfo</a>
public record VkCommandBufferBeginInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withTargetLayout(VkCommandBufferInheritanceInfo.LAYOUT).withName("pInheritanceInfo")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pInheritanceInfo = PathElement.groupElement("pInheritanceInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pInheritanceInfo = (AddressLayout) LAYOUT.select(PATH$pInheritanceInfo);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pInheritanceInfo = LAYOUT.byteOffset(PATH$pInheritanceInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pInheritanceInfo = LAYOUT$pInheritanceInfo.byteSize();

    public VkCommandBufferBeginInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(VkCommandBufferUsageFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkCommandBufferUsageFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="VkCommandBufferInheritanceInfo*") MemorySegment pInheritanceInfoRaw() {
        return segment.get(LAYOUT$pInheritanceInfo, OFFSET$pInheritanceInfo);
    }

    public void pInheritanceInfoRaw(@pointer(comment="VkCommandBufferInheritanceInfo*") MemorySegment value) {
        segment.set(LAYOUT$pInheritanceInfo, OFFSET$pInheritanceInfo, value);
    }
    
    public @nullable VkCommandBufferInheritanceInfo pInheritanceInfo() {
        MemorySegment s = pInheritanceInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkCommandBufferInheritanceInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkCommandBufferInheritanceInfo[] pInheritanceInfo(int assumedCount) {
        MemorySegment s = pInheritanceInfoRaw().reinterpret(assumedCount * VkCommandBufferInheritanceInfo.SIZE);
        VkCommandBufferInheritanceInfo[] arr = new VkCommandBufferInheritanceInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkCommandBufferInheritanceInfo(s.asSlice(i * VkCommandBufferInheritanceInfo.SIZE, VkCommandBufferInheritanceInfo.SIZE));
        }
        return arr;
    }

    public void pInheritanceInfo(@nullable VkCommandBufferInheritanceInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pInheritanceInfoRaw(s);
    }

    public static VkCommandBufferBeginInfo allocate(Arena arena) {
        return new VkCommandBufferBeginInfo(arena.allocate(LAYOUT));
    }
    
    public static VkCommandBufferBeginInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCommandBufferBeginInfo[] ret = new VkCommandBufferBeginInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkCommandBufferBeginInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
