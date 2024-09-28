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
/// typedef struct VkAntiLagDataAMD {
///     VkStructureType sType;
///     const void* pNext;
///     VkAntiLagModeAMD mode;
///     uint32_t maxFPS;
///     const VkAntiLagPresentationInfoAMD* pPresentationInfo;
/// } VkAntiLagDataAMD;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAntiLagDataAMD.html">VkAntiLagDataAMD</a>
public record VkAntiLagDataAMD(MemorySegment segment) implements IPointer {
    public VkAntiLagDataAMD(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD);
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

    public @enumtype(VkAntiLagModeAMD.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkAntiLagModeAMD.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

    public @unsigned int maxFPS() {
        return segment.get(LAYOUT$maxFPS, OFFSET$maxFPS);
    }

    public void maxFPS(@unsigned int value) {
        segment.set(LAYOUT$maxFPS, OFFSET$maxFPS, value);
    }

    public @pointer(comment="VkAntiLagPresentationInfoAMD*") MemorySegment pPresentationInfoRaw() {
        return segment.get(LAYOUT$pPresentationInfo, OFFSET$pPresentationInfo);
    }

    public void pPresentationInfoRaw(@pointer(comment="VkAntiLagPresentationInfoAMD*") MemorySegment value) {
        segment.set(LAYOUT$pPresentationInfo, OFFSET$pPresentationInfo, value);
    }

    public @nullable VkAntiLagPresentationInfoAMD pPresentationInfo() {
        MemorySegment s = pPresentationInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAntiLagPresentationInfoAMD(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkAntiLagPresentationInfoAMD[] pPresentationInfo(int assumedCount) {
        MemorySegment s = pPresentationInfoRaw().reinterpret(assumedCount * VkAntiLagPresentationInfoAMD.SIZE);
        VkAntiLagPresentationInfoAMD[] arr = new VkAntiLagPresentationInfoAMD[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkAntiLagPresentationInfoAMD(s.asSlice(i * VkAntiLagPresentationInfoAMD.SIZE, VkAntiLagPresentationInfoAMD.SIZE));
        }
        return arr;
    }

    public void pPresentationInfo(@nullable VkAntiLagPresentationInfoAMD value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPresentationInfoRaw(s);
    }

    public static VkAntiLagDataAMD allocate(Arena arena) {
        return new VkAntiLagDataAMD(arena.allocate(LAYOUT));
    }
    
    public static VkAntiLagDataAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAntiLagDataAMD[] ret = new VkAntiLagDataAMD[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAntiLagDataAMD(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_INT.withName("maxFPS"),
        ValueLayout.ADDRESS.withTargetLayout(VkAntiLagPresentationInfoAMD.LAYOUT).withName("pPresentationInfo")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$mode = PathElement.groupElement("mode");
    public static final PathElement PATH$maxFPS = PathElement.groupElement("maxFPS");
    public static final PathElement PATH$pPresentationInfo = PathElement.groupElement("pPresentationInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);
    public static final OfInt LAYOUT$maxFPS = (OfInt) LAYOUT.select(PATH$maxFPS);
    public static final AddressLayout LAYOUT$pPresentationInfo = (AddressLayout) LAYOUT.select(PATH$pPresentationInfo);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
    public static final long OFFSET$maxFPS = LAYOUT.byteOffset(PATH$maxFPS);
    public static final long OFFSET$pPresentationInfo = LAYOUT.byteOffset(PATH$pPresentationInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();
    public static final long SIZE$maxFPS = LAYOUT$maxFPS.byteSize();
    public static final long SIZE$pPresentationInfo = LAYOUT$pPresentationInfo.byteSize();

}
