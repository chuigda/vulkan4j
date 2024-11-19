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
/// typedef struct VkShaderResourceUsageAMD {
///     uint32_t numUsedVgprs;
///     uint32_t numUsedSgprs;
///     uint32_t ldsSizePerLocalWorkGroup;
///     size_t ldsUsageSizeInBytes;
///     size_t scratchMemUsageInBytes;
/// } VkShaderResourceUsageAMD;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkShaderResourceUsageAMD.html">VkShaderResourceUsageAMD</a>
public record VkShaderResourceUsageAMD(MemorySegment segment) implements IPointer {
    public VkShaderResourceUsageAMD(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int numUsedVgprs() {
        return segment.get(LAYOUT$numUsedVgprs, OFFSET$numUsedVgprs);
    }

    public void numUsedVgprs(@unsigned int value) {
        segment.set(LAYOUT$numUsedVgprs, OFFSET$numUsedVgprs, value);
    }

    public @unsigned int numUsedSgprs() {
        return segment.get(LAYOUT$numUsedSgprs, OFFSET$numUsedSgprs);
    }

    public void numUsedSgprs(@unsigned int value) {
        segment.set(LAYOUT$numUsedSgprs, OFFSET$numUsedSgprs, value);
    }

    public @unsigned int ldsSizePerLocalWorkGroup() {
        return segment.get(LAYOUT$ldsSizePerLocalWorkGroup, OFFSET$ldsSizePerLocalWorkGroup);
    }

    public void ldsSizePerLocalWorkGroup(@unsigned int value) {
        segment.set(LAYOUT$ldsSizePerLocalWorkGroup, OFFSET$ldsSizePerLocalWorkGroup, value);
    }

    public @unsigned long ldsUsageSizeInBytes() {
            return NativeLayout.readCSizeT(segment, OFFSET$ldsUsageSizeInBytes);
        }
    
        public void ldsUsageSizeInBytes(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$ldsUsageSizeInBytes, value);
        }

    public @unsigned long scratchMemUsageInBytes() {
            return NativeLayout.readCSizeT(segment, OFFSET$scratchMemUsageInBytes);
        }
    
        public void scratchMemUsageInBytes(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$scratchMemUsageInBytes, value);
        }

    public static VkShaderResourceUsageAMD allocate(Arena arena) {
        return new VkShaderResourceUsageAMD(arena.allocate(LAYOUT));
    }

    public static VkShaderResourceUsageAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkShaderResourceUsageAMD[] ret = new VkShaderResourceUsageAMD[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkShaderResourceUsageAMD(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkShaderResourceUsageAMD clone(Arena arena, VkShaderResourceUsageAMD src) {
        VkShaderResourceUsageAMD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkShaderResourceUsageAMD[] clone(Arena arena, VkShaderResourceUsageAMD[] src) {
        VkShaderResourceUsageAMD[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("numUsedVgprs"),
        ValueLayout.JAVA_INT.withName("numUsedSgprs"),
        ValueLayout.JAVA_INT.withName("ldsSizePerLocalWorkGroup"),
        NativeLayout.C_SIZE_T.withName("ldsUsageSizeInBytes"),
        NativeLayout.C_SIZE_T.withName("scratchMemUsageInBytes")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$numUsedVgprs = PathElement.groupElement("numUsedVgprs");
    public static final PathElement PATH$numUsedSgprs = PathElement.groupElement("numUsedSgprs");
    public static final PathElement PATH$ldsSizePerLocalWorkGroup = PathElement.groupElement("ldsSizePerLocalWorkGroup");
    public static final PathElement PATH$ldsUsageSizeInBytes = PathElement.groupElement("ldsUsageSizeInBytes");
    public static final PathElement PATH$scratchMemUsageInBytes = PathElement.groupElement("scratchMemUsageInBytes");

    public static final OfInt LAYOUT$numUsedVgprs = (OfInt) LAYOUT.select(PATH$numUsedVgprs);
    public static final OfInt LAYOUT$numUsedSgprs = (OfInt) LAYOUT.select(PATH$numUsedSgprs);
    public static final OfInt LAYOUT$ldsSizePerLocalWorkGroup = (OfInt) LAYOUT.select(PATH$ldsSizePerLocalWorkGroup);

    public static final long OFFSET$numUsedVgprs = LAYOUT.byteOffset(PATH$numUsedVgprs);
    public static final long OFFSET$numUsedSgprs = LAYOUT.byteOffset(PATH$numUsedSgprs);
    public static final long OFFSET$ldsSizePerLocalWorkGroup = LAYOUT.byteOffset(PATH$ldsSizePerLocalWorkGroup);
    public static final long OFFSET$ldsUsageSizeInBytes = LAYOUT.byteOffset(PATH$ldsUsageSizeInBytes);
    public static final long OFFSET$scratchMemUsageInBytes = LAYOUT.byteOffset(PATH$scratchMemUsageInBytes);

    public static final long SIZE$numUsedVgprs = LAYOUT$numUsedVgprs.byteSize();
    public static final long SIZE$numUsedSgprs = LAYOUT$numUsedSgprs.byteSize();
    public static final long SIZE$ldsSizePerLocalWorkGroup = LAYOUT$ldsSizePerLocalWorkGroup.byteSize();
}
