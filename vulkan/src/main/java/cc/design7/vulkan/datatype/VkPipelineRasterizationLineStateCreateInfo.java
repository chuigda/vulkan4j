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

/// Represents a pointer to a {@code VkPipelineRasterizationLineStateCreateInfo} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineRasterizationLineStateCreateInfo.html">VkPipelineRasterizationLineStateCreateInfo</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineRasterizationLineStateCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public VkPipelineRasterizationLineStateCreateInfo {
        sType(VkStructureType.PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO);
    }

    public static VkPipelineRasterizationLineStateCreateInfo allocate(Arena arena) {
        return new VkPipelineRasterizationLineStateCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineRasterizationLineStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineRasterizationLineStateCreateInfo[] ret = new VkPipelineRasterizationLineStateCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineRasterizationLineStateCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineRasterizationLineStateCreateInfo clone(Arena arena, VkPipelineRasterizationLineStateCreateInfo src) {
        VkPipelineRasterizationLineStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineRasterizationLineStateCreateInfo[] clone(Arena arena, VkPipelineRasterizationLineStateCreateInfo[] src) {
        VkPipelineRasterizationLineStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lineRasterizationMode"),
        ValueLayout.JAVA_INT.withName("stippledLineEnable"),
        ValueLayout.JAVA_INT.withName("lineStippleFactor"),
        ValueLayout.JAVA_SHORT.withName("lineStipplePattern")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$lineRasterizationMode = PathElement.groupElement("PATH$lineRasterizationMode");
    public static final PathElement PATH$stippledLineEnable = PathElement.groupElement("PATH$stippledLineEnable");
    public static final PathElement PATH$lineStippleFactor = PathElement.groupElement("PATH$lineStippleFactor");
    public static final PathElement PATH$lineStipplePattern = PathElement.groupElement("PATH$lineStipplePattern");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$lineRasterizationMode = (OfInt) LAYOUT.select(PATH$lineRasterizationMode);
    public static final OfInt LAYOUT$stippledLineEnable = (OfInt) LAYOUT.select(PATH$stippledLineEnable);
    public static final OfInt LAYOUT$lineStippleFactor = (OfInt) LAYOUT.select(PATH$lineStippleFactor);
    public static final OfShort LAYOUT$lineStipplePattern = (OfShort) LAYOUT.select(PATH$lineStipplePattern);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$lineRasterizationMode = LAYOUT$lineRasterizationMode.byteSize();
    public static final long SIZE$stippledLineEnable = LAYOUT$stippledLineEnable.byteSize();
    public static final long SIZE$lineStippleFactor = LAYOUT$lineStippleFactor.byteSize();
    public static final long SIZE$lineStipplePattern = LAYOUT$lineStipplePattern.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$lineRasterizationMode = LAYOUT.byteOffset(PATH$lineRasterizationMode);
    public static final long OFFSET$stippledLineEnable = LAYOUT.byteOffset(PATH$stippledLineEnable);
    public static final long OFFSET$lineStippleFactor = LAYOUT.byteOffset(PATH$lineStippleFactor);
    public static final long OFFSET$lineStipplePattern = LAYOUT.byteOffset(PATH$lineStipplePattern);

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

    public @enumtype(VkLineRasterizationMode.class) int lineRasterizationMode() {
        return segment.get(LAYOUT$lineRasterizationMode, OFFSET$lineRasterizationMode);
    }

    public void lineRasterizationMode(@enumtype(VkLineRasterizationMode.class) int value) {
        segment.set(LAYOUT$lineRasterizationMode, OFFSET$lineRasterizationMode, value);
    }

    public @unsigned int stippledLineEnable() {
        return segment.get(LAYOUT$stippledLineEnable, OFFSET$stippledLineEnable);
    }

    public void stippledLineEnable(@unsigned int value) {
        segment.set(LAYOUT$stippledLineEnable, OFFSET$stippledLineEnable, value);
    }

    public @unsigned int lineStippleFactor() {
        return segment.get(LAYOUT$lineStippleFactor, OFFSET$lineStippleFactor);
    }

    public void lineStippleFactor(@unsigned int value) {
        segment.set(LAYOUT$lineStippleFactor, OFFSET$lineStippleFactor, value);
    }

    public @unsigned short lineStipplePattern() {
        return segment.get(LAYOUT$lineStipplePattern, OFFSET$lineStipplePattern);
    }

    public void lineStipplePattern(@unsigned short value) {
        segment.set(LAYOUT$lineStipplePattern, OFFSET$lineStipplePattern, value);
    }

}
