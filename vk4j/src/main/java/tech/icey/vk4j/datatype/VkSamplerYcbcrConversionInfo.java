package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.vk4j.enumtype.VkStructureType;
import tech.icey.vk4j.handle.VkSamplerYcbcrConversion;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO;

/// {@snippet lang=c :
/// typedef struct VkSamplerYcbcrConversionInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkSamplerYcbcrConversion conversion;
/// } VkSamplerYcbcrConversionInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSamplerYcbcrConversionInfo.html">VkSamplerYcbcrConversionInfo</a>
public record VkSamplerYcbcrConversionInfo(MemorySegment segment) implements IPointer {
    public VkSamplerYcbcrConversionInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO);
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

    public @nullable VkSamplerYcbcrConversion conversion() {
        MemorySegment s = segment.get(LAYOUT$conversion, OFFSET$conversion);
        if (s.address() == 0) {
            return null;
        }
        return new VkSamplerYcbcrConversion(s);
    }

    public void conversion(@nullable VkSamplerYcbcrConversion value) {
        segment.set(
            LAYOUT$conversion,
            OFFSET$conversion,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public static VkSamplerYcbcrConversionInfo allocate(Arena arena) {
        return new VkSamplerYcbcrConversionInfo(arena.allocate(LAYOUT));
    }

    public static VkSamplerYcbcrConversionInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerYcbcrConversionInfo[] ret = new VkSamplerYcbcrConversionInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSamplerYcbcrConversionInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSamplerYcbcrConversionInfo clone(Arena arena, VkSamplerYcbcrConversionInfo src) {
        VkSamplerYcbcrConversionInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSamplerYcbcrConversionInfo[] clone(Arena arena, VkSamplerYcbcrConversionInfo[] src) {
        VkSamplerYcbcrConversionInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("conversion")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$conversion = PathElement.groupElement("conversion");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$conversion = (AddressLayout) LAYOUT.select(PATH$conversion);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$conversion = LAYOUT.byteOffset(PATH$conversion);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$conversion = LAYOUT$conversion.byteSize();
}
