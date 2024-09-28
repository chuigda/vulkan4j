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
/// typedef struct VkAntiLagPresentationInfoAMD {
///     VkStructureType sType;
///     void* pNext;
///     VkAntiLagStageAMD stage;
///     uint64_t frameIndex;
/// } VkAntiLagPresentationInfoAMD;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAntiLagPresentationInfoAMD.html">VkAntiLagPresentationInfoAMD</a>
public record VkAntiLagPresentationInfoAMD(MemorySegment segment) implements IPointer {
    public VkAntiLagPresentationInfoAMD(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD);
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

    public @enumtype(VkAntiLagStageAMD.class) int stage() {
        return segment.get(LAYOUT$stage, OFFSET$stage);
    }

    public void stage(@enumtype(VkAntiLagStageAMD.class) int value) {
        segment.set(LAYOUT$stage, OFFSET$stage, value);
    }

    public @unsigned long frameIndex() {
        return segment.get(LAYOUT$frameIndex, OFFSET$frameIndex);
    }

    public void frameIndex(@unsigned long value) {
        segment.set(LAYOUT$frameIndex, OFFSET$frameIndex, value);
    }

    public static VkAntiLagPresentationInfoAMD allocate(Arena arena) {
        return new VkAntiLagPresentationInfoAMD(arena.allocate(LAYOUT));
    }
    
    public static VkAntiLagPresentationInfoAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAntiLagPresentationInfoAMD[] ret = new VkAntiLagPresentationInfoAMD[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAntiLagPresentationInfoAMD(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.JAVA_LONG.withName("frameIndex")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stage = PathElement.groupElement("stage");
    public static final PathElement PATH$frameIndex = PathElement.groupElement("frameIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stage = (OfInt) LAYOUT.select(PATH$stage);
    public static final OfLong LAYOUT$frameIndex = (OfLong) LAYOUT.select(PATH$frameIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stage = LAYOUT.byteOffset(PATH$stage);
    public static final long OFFSET$frameIndex = LAYOUT.byteOffset(PATH$frameIndex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stage = LAYOUT$stage.byteSize();
    public static final long SIZE$frameIndex = LAYOUT$frameIndex.byteSize();
}
