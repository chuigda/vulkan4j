package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPipelineDynamicStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineDynamicStateCreateFlags flags;
///     uint32_t dynamicStateCount;
///     const VkDynamicState* pDynamicStates;
/// } VkPipelineDynamicStateCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineDynamicStateCreateInfo.html">VkPipelineDynamicStateCreateInfo</a>
public record VkPipelineDynamicStateCreateInfo(MemorySegment segment) implements IPointer {
    public VkPipelineDynamicStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @enumtype(VkPipelineDynamicStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineDynamicStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int dynamicStateCount() {
        return segment.get(LAYOUT$dynamicStateCount, OFFSET$dynamicStateCount);
    }

    public void dynamicStateCount(@unsigned int value) {
        segment.set(LAYOUT$dynamicStateCount, OFFSET$dynamicStateCount, value);
    }

    public @pointer(target=VkDynamicState.class) MemorySegment pDynamicStatesRaw() {
        return segment.get(LAYOUT$pDynamicStates, OFFSET$pDynamicStates);
    }

    public void pDynamicStatesRaw(@pointer(target=VkDynamicState.class) MemorySegment value) {
        segment.set(LAYOUT$pDynamicStates, OFFSET$pDynamicStates, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or {@link IntBuffer#write}ing
    /// the buffer.
    public @Nullable @enumtype(VkDynamicState.class) IntBuffer pDynamicStates() {
        MemorySegment s = pDynamicStatesRaw();
        if (s.address() == 0) {
            return null;
        }

        return new IntBuffer(s);
    }

    public void pDynamicStates(@Nullable @enumtype(VkDynamicState.class) IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDynamicStatesRaw(s);
    }

    public static VkPipelineDynamicStateCreateInfo allocate(Arena arena) {
        return new VkPipelineDynamicStateCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineDynamicStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineDynamicStateCreateInfo[] ret = new VkPipelineDynamicStateCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineDynamicStateCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineDynamicStateCreateInfo clone(Arena arena, VkPipelineDynamicStateCreateInfo src) {
        VkPipelineDynamicStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineDynamicStateCreateInfo[] clone(Arena arena, VkPipelineDynamicStateCreateInfo[] src) {
        VkPipelineDynamicStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("dynamicStateCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDynamicStates")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$dynamicStateCount = PathElement.groupElement("dynamicStateCount");
    public static final PathElement PATH$pDynamicStates = PathElement.groupElement("pDynamicStates");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$dynamicStateCount = (OfInt) LAYOUT.select(PATH$dynamicStateCount);
    public static final AddressLayout LAYOUT$pDynamicStates = (AddressLayout) LAYOUT.select(PATH$pDynamicStates);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$dynamicStateCount = LAYOUT.byteOffset(PATH$dynamicStateCount);
    public static final long OFFSET$pDynamicStates = LAYOUT.byteOffset(PATH$pDynamicStates);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$dynamicStateCount = LAYOUT$dynamicStateCount.byteSize();
    public static final long SIZE$pDynamicStates = LAYOUT$pDynamicStates.byteSize();
}
