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
/// typedef struct VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 enableYDegamma;
///     VkBool32 enableCbCrDegamma;
/// } VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.html">VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM</a>
public record VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(MemorySegment segment) implements IPointer {
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM);
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

    public @unsigned int enableYDegamma() {
        return segment.get(LAYOUT$enableYDegamma, OFFSET$enableYDegamma);
    }

    public void enableYDegamma(@unsigned int value) {
        segment.set(LAYOUT$enableYDegamma, OFFSET$enableYDegamma, value);
    }

    public @unsigned int enableCbCrDegamma() {
        return segment.get(LAYOUT$enableCbCrDegamma, OFFSET$enableCbCrDegamma);
    }

    public void enableCbCrDegamma(@unsigned int value) {
        segment.set(LAYOUT$enableCbCrDegamma, OFFSET$enableCbCrDegamma, value);
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM allocate(Arena arena) {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(arena.allocate(LAYOUT));
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[] ret = new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM clone(Arena arena, VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM src) {
        VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[] clone(Arena arena, VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[] src) {
        VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("enableYDegamma"),
        ValueLayout.JAVA_INT.withName("enableCbCrDegamma")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$enableYDegamma = PathElement.groupElement("enableYDegamma");
    public static final PathElement PATH$enableCbCrDegamma = PathElement.groupElement("enableCbCrDegamma");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$enableYDegamma = (OfInt) LAYOUT.select(PATH$enableYDegamma);
    public static final OfInt LAYOUT$enableCbCrDegamma = (OfInt) LAYOUT.select(PATH$enableCbCrDegamma);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$enableYDegamma = LAYOUT.byteOffset(PATH$enableYDegamma);
    public static final long OFFSET$enableCbCrDegamma = LAYOUT.byteOffset(PATH$enableCbCrDegamma);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$enableYDegamma = LAYOUT$enableYDegamma.byteSize();
    public static final long SIZE$enableCbCrDegamma = LAYOUT$enableCbCrDegamma.byteSize();
}
