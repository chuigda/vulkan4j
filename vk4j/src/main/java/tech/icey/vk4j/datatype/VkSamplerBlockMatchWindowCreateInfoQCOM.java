package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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
/// typedef struct VkSamplerBlockMatchWindowCreateInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
///     VkExtent2D windowExtent;
///     VkBlockMatchWindowCompareModeQCOM windowCompareMode;
/// } VkSamplerBlockMatchWindowCreateInfoQCOM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSamplerBlockMatchWindowCreateInfoQCOM.html">VkSamplerBlockMatchWindowCreateInfoQCOM</a>
public record VkSamplerBlockMatchWindowCreateInfoQCOM(MemorySegment segment) implements IPointer {
    public VkSamplerBlockMatchWindowCreateInfoQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM);
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

    public VkExtent2D windowExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$windowExtent, LAYOUT$windowExtent));
    }

    public void windowExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$windowExtent, SIZE$windowExtent);
    }

    public @enumtype(VkBlockMatchWindowCompareModeQCOM.class) int windowCompareMode() {
        return segment.get(LAYOUT$windowCompareMode, OFFSET$windowCompareMode);
    }

    public void windowCompareMode(@enumtype(VkBlockMatchWindowCompareModeQCOM.class) int value) {
        segment.set(LAYOUT$windowCompareMode, OFFSET$windowCompareMode, value);
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM allocate(Arena arena) {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(arena.allocate(LAYOUT));
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerBlockMatchWindowCreateInfoQCOM[] ret = new VkSamplerBlockMatchWindowCreateInfoQCOM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSamplerBlockMatchWindowCreateInfoQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM clone(Arena arena, VkSamplerBlockMatchWindowCreateInfoQCOM src) {
        VkSamplerBlockMatchWindowCreateInfoQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM[] clone(Arena arena, VkSamplerBlockMatchWindowCreateInfoQCOM[] src) {
        VkSamplerBlockMatchWindowCreateInfoQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("windowExtent"),
        ValueLayout.JAVA_INT.withName("windowCompareMode")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$windowExtent = PathElement.groupElement("windowExtent");
    public static final PathElement PATH$windowCompareMode = PathElement.groupElement("windowCompareMode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$windowExtent = (StructLayout) LAYOUT.select(PATH$windowExtent);
    public static final OfInt LAYOUT$windowCompareMode = (OfInt) LAYOUT.select(PATH$windowCompareMode);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$windowExtent = LAYOUT.byteOffset(PATH$windowExtent);
    public static final long OFFSET$windowCompareMode = LAYOUT.byteOffset(PATH$windowCompareMode);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$windowExtent = LAYOUT$windowExtent.byteSize();
    public static final long SIZE$windowCompareMode = LAYOUT$windowCompareMode.byteSize();
}
