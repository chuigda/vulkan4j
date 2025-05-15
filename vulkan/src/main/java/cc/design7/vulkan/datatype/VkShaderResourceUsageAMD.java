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

/// Represents a pointer to a {@code VkShaderResourceUsageAMD} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderResourceUsageAMD.html">VkShaderResourceUsageAMD</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkShaderResourceUsageAMD(@NotNull MemorySegment segment) implements IPointer {
    public static VkShaderResourceUsageAMD allocate(Arena arena) {
        return new VkShaderResourceUsageAMD(arena.allocate(LAYOUT));
    }

    public static VkShaderResourceUsageAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkShaderResourceUsageAMD[] ret = new VkShaderResourceUsageAMD[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("numUsedVgprs"),
        ValueLayout.JAVA_INT.withName("numUsedSgprs"),
        ValueLayout.JAVA_INT.withName("ldsSizePerLocalWorkGroup"),
        NativeLayout.C_SIZE_T.withName("ldsUsageSizeInBytes"),
        NativeLayout.C_SIZE_T.withName("scratchMemUsageInBytes")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$numUsedVgprs = PathElement.groupElement("PATH$numUsedVgprs");
    public static final PathElement PATH$numUsedSgprs = PathElement.groupElement("PATH$numUsedSgprs");
    public static final PathElement PATH$ldsSizePerLocalWorkGroup = PathElement.groupElement("PATH$ldsSizePerLocalWorkGroup");
    public static final PathElement PATH$ldsUsageSizeInBytes = PathElement.groupElement("PATH$ldsUsageSizeInBytes");
    public static final PathElement PATH$scratchMemUsageInBytes = PathElement.groupElement("PATH$scratchMemUsageInBytes");

    public static final OfInt LAYOUT$numUsedVgprs = (OfInt) LAYOUT.select(PATH$numUsedVgprs);
    public static final OfInt LAYOUT$numUsedSgprs = (OfInt) LAYOUT.select(PATH$numUsedSgprs);
    public static final OfInt LAYOUT$ldsSizePerLocalWorkGroup = (OfInt) LAYOUT.select(PATH$ldsSizePerLocalWorkGroup);

    public static final long SIZE$numUsedVgprs = LAYOUT$numUsedVgprs.byteSize();
    public static final long SIZE$numUsedSgprs = LAYOUT$numUsedSgprs.byteSize();
    public static final long SIZE$ldsSizePerLocalWorkGroup = LAYOUT$ldsSizePerLocalWorkGroup.byteSize();
    public static final long SIZE$ldsUsageSizeInBytes = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$scratchMemUsageInBytes = NativeLayout.C_SIZE_T.byteSize();

    public static final long OFFSET$numUsedVgprs = LAYOUT.byteOffset(PATH$numUsedVgprs);
    public static final long OFFSET$numUsedSgprs = LAYOUT.byteOffset(PATH$numUsedSgprs);
    public static final long OFFSET$ldsSizePerLocalWorkGroup = LAYOUT.byteOffset(PATH$ldsSizePerLocalWorkGroup);
    public static final long OFFSET$ldsUsageSizeInBytes = LAYOUT.byteOffset(PATH$ldsUsageSizeInBytes);
    public static final long OFFSET$scratchMemUsageInBytes = LAYOUT.byteOffset(PATH$scratchMemUsageInBytes);

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

}
