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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerYcbcrConversionInfo.html">VkSamplerYcbcrConversionInfo</a>
@ValueBasedCandidate
public record VkSamplerYcbcrConversionInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$conversion = ValueLayout.ADDRESS.withName("conversion");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$conversion);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSamplerYcbcrConversionInfo allocate(Arena arena) {
        return new VkSamplerYcbcrConversionInfo(arena.allocate(LAYOUT));
    }

    public static VkSamplerYcbcrConversionInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerYcbcrConversionInfo[] ret = new VkSamplerYcbcrConversionInfo[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$conversion = PathElement.groupElement("PATH$conversion");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$conversion = LAYOUT$conversion.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$conversion = LAYOUT.byteOffset(PATH$conversion);

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

    public @Nullable VkSamplerYcbcrConversion conversion() {
        MemorySegment s = segment.asSlice(OFFSET$conversion, SIZE$conversion);
        if (s.address() == 0) {
            return null;
        }
        return new VkSamplerYcbcrConversion(s);
    }

    public void conversion() {
        segment.set(LAYOUT$conversion, OFFSET$conversion, value != null ? value.segment() : MemorySegment.NULL);
    }

}
