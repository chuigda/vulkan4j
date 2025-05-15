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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageCompressionPropertiesEXT.html">VkImageCompressionPropertiesEXT</a>
@ValueBasedCandidate
public record VkImageCompressionPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$imageCompressionFlags = ValueLayout.JAVA_INT.withName("imageCompressionFlags");
    public static final OfInt LAYOUT$imageCompressionFixedRateFlags = ValueLayout.JAVA_INT.withName("imageCompressionFixedRateFlags");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$imageCompressionFlags, LAYOUT$imageCompressionFixedRateFlags);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageCompressionPropertiesEXT allocate(Arena arena) {
        return new VkImageCompressionPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkImageCompressionPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageCompressionPropertiesEXT[] ret = new VkImageCompressionPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageCompressionPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageCompressionPropertiesEXT clone(Arena arena, VkImageCompressionPropertiesEXT src) {
        VkImageCompressionPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageCompressionPropertiesEXT[] clone(Arena arena, VkImageCompressionPropertiesEXT[] src) {
        VkImageCompressionPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$imageCompressionFlags = PathElement.groupElement("PATH$imageCompressionFlags");
    public static final PathElement PATH$imageCompressionFixedRateFlags = PathElement.groupElement("PATH$imageCompressionFixedRateFlags");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$imageCompressionFlags = LAYOUT$imageCompressionFlags.byteSize();
    public static final long SIZE$imageCompressionFixedRateFlags = LAYOUT$imageCompressionFixedRateFlags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageCompressionFlags = LAYOUT.byteOffset(PATH$imageCompressionFlags);
    public static final long OFFSET$imageCompressionFixedRateFlags = LAYOUT.byteOffset(PATH$imageCompressionFixedRateFlags);

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

    public @enumtype(VkImageCompressionFlagsEXT.class) int imageCompressionFlags() {
        return segment.get(LAYOUT$imageCompressionFlags, OFFSET$imageCompressionFlags);
    }

    public void imageCompressionFlags(@enumtype(VkImageCompressionFlagsEXT.class) int value) {
        segment.set(LAYOUT$imageCompressionFlags, OFFSET$imageCompressionFlags, value);
    }

    public @enumtype(VkImageCompressionFixedRateFlagsEXT.class) int imageCompressionFixedRateFlags() {
        return segment.get(LAYOUT$imageCompressionFixedRateFlags, OFFSET$imageCompressionFixedRateFlags);
    }

    public void imageCompressionFixedRateFlags(@enumtype(VkImageCompressionFixedRateFlagsEXT.class) int value) {
        segment.set(LAYOUT$imageCompressionFixedRateFlags, OFFSET$imageCompressionFixedRateFlags, value);
    }

}
