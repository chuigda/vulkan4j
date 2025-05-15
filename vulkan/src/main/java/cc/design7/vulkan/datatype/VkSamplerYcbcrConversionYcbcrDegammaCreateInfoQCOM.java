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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.html">VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM</a>
@ValueBasedCandidate
public record VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$enableYDegamma = ValueLayout.JAVA_INT.withName("enableYDegamma");
    public static final OfInt LAYOUT$enableCbCrDegamma = ValueLayout.JAVA_INT.withName("enableCbCrDegamma");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$enableYDegamma, LAYOUT$enableCbCrDegamma);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM allocate(Arena arena) {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(arena.allocate(LAYOUT));
    }

    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[] ret = new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$enableYDegamma = PathElement.groupElement("PATH$enableYDegamma");
    public static final PathElement PATH$enableCbCrDegamma = PathElement.groupElement("PATH$enableCbCrDegamma");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$enableYDegamma = LAYOUT$enableYDegamma.byteSize();
    public static final long SIZE$enableCbCrDegamma = LAYOUT$enableCbCrDegamma.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$enableYDegamma = LAYOUT.byteOffset(PATH$enableYDegamma);
    public static final long OFFSET$enableCbCrDegamma = LAYOUT.byteOffset(PATH$enableCbCrDegamma);

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

}
