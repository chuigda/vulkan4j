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

/// Represents a pointer to a {@code VkPipelineDepthStencilStateCreateInfo} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineDepthStencilStateCreateInfo.html">VkPipelineDepthStencilStateCreateInfo</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineDepthStencilStateCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public VkPipelineDepthStencilStateCreateInfo {
        sType(VkStructureType.PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO);
    }

    public static VkPipelineDepthStencilStateCreateInfo allocate(Arena arena) {
        return new VkPipelineDepthStencilStateCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineDepthStencilStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineDepthStencilStateCreateInfo[] ret = new VkPipelineDepthStencilStateCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineDepthStencilStateCreateInfo(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPipelineDepthStencilStateCreateInfo clone(Arena arena, VkPipelineDepthStencilStateCreateInfo src) {
        VkPipelineDepthStencilStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineDepthStencilStateCreateInfo[] clone(Arena arena, VkPipelineDepthStencilStateCreateInfo[] src) {
        VkPipelineDepthStencilStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("depthTestEnable"),
        ValueLayout.JAVA_INT.withName("depthWriteEnable"),
        ValueLayout.JAVA_INT.withName("depthCompareOp"),
        ValueLayout.JAVA_INT.withName("depthBoundsTestEnable"),
        ValueLayout.JAVA_INT.withName("stencilTestEnable"),
        VkStencilOpState.LAYOUT.withName("front"),
        VkStencilOpState.LAYOUT.withName("back"),
        ValueLayout.JAVA_FLOAT.withName("minDepthBounds"),
        ValueLayout.JAVA_FLOAT.withName("maxDepthBounds")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$depthTestEnable = PathElement.groupElement("PATH$depthTestEnable");
    public static final PathElement PATH$depthWriteEnable = PathElement.groupElement("PATH$depthWriteEnable");
    public static final PathElement PATH$depthCompareOp = PathElement.groupElement("PATH$depthCompareOp");
    public static final PathElement PATH$depthBoundsTestEnable = PathElement.groupElement("PATH$depthBoundsTestEnable");
    public static final PathElement PATH$stencilTestEnable = PathElement.groupElement("PATH$stencilTestEnable");
    public static final PathElement PATH$front = PathElement.groupElement("PATH$front");
    public static final PathElement PATH$back = PathElement.groupElement("PATH$back");
    public static final PathElement PATH$minDepthBounds = PathElement.groupElement("PATH$minDepthBounds");
    public static final PathElement PATH$maxDepthBounds = PathElement.groupElement("PATH$maxDepthBounds");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$depthTestEnable = (OfInt) LAYOUT.select(PATH$depthTestEnable);
    public static final OfInt LAYOUT$depthWriteEnable = (OfInt) LAYOUT.select(PATH$depthWriteEnable);
    public static final OfInt LAYOUT$depthCompareOp = (OfInt) LAYOUT.select(PATH$depthCompareOp);
    public static final OfInt LAYOUT$depthBoundsTestEnable = (OfInt) LAYOUT.select(PATH$depthBoundsTestEnable);
    public static final OfInt LAYOUT$stencilTestEnable = (OfInt) LAYOUT.select(PATH$stencilTestEnable);
    public static final StructLayout LAYOUT$front = (StructLayout) LAYOUT.select(PATH$front);
    public static final StructLayout LAYOUT$back = (StructLayout) LAYOUT.select(PATH$back);
    public static final OfFloat LAYOUT$minDepthBounds = (OfFloat) LAYOUT.select(PATH$minDepthBounds);
    public static final OfFloat LAYOUT$maxDepthBounds = (OfFloat) LAYOUT.select(PATH$maxDepthBounds);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$depthTestEnable = LAYOUT$depthTestEnable.byteSize();
    public static final long SIZE$depthWriteEnable = LAYOUT$depthWriteEnable.byteSize();
    public static final long SIZE$depthCompareOp = LAYOUT$depthCompareOp.byteSize();
    public static final long SIZE$depthBoundsTestEnable = LAYOUT$depthBoundsTestEnable.byteSize();
    public static final long SIZE$stencilTestEnable = LAYOUT$stencilTestEnable.byteSize();
    public static final long SIZE$front = LAYOUT$front.byteSize();
    public static final long SIZE$back = LAYOUT$back.byteSize();
    public static final long SIZE$minDepthBounds = LAYOUT$minDepthBounds.byteSize();
    public static final long SIZE$maxDepthBounds = LAYOUT$maxDepthBounds.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$depthTestEnable = LAYOUT.byteOffset(PATH$depthTestEnable);
    public static final long OFFSET$depthWriteEnable = LAYOUT.byteOffset(PATH$depthWriteEnable);
    public static final long OFFSET$depthCompareOp = LAYOUT.byteOffset(PATH$depthCompareOp);
    public static final long OFFSET$depthBoundsTestEnable = LAYOUT.byteOffset(PATH$depthBoundsTestEnable);
    public static final long OFFSET$stencilTestEnable = LAYOUT.byteOffset(PATH$stencilTestEnable);
    public static final long OFFSET$front = LAYOUT.byteOffset(PATH$front);
    public static final long OFFSET$back = LAYOUT.byteOffset(PATH$back);
    public static final long OFFSET$minDepthBounds = LAYOUT.byteOffset(PATH$minDepthBounds);
    public static final long OFFSET$maxDepthBounds = LAYOUT.byteOffset(PATH$maxDepthBounds);

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

    public @enumtype(VkPipelineDepthStencilStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineDepthStencilStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int depthTestEnable() {
        return segment.get(LAYOUT$depthTestEnable, OFFSET$depthTestEnable);
    }

    public void depthTestEnable(@unsigned int value) {
        segment.set(LAYOUT$depthTestEnable, OFFSET$depthTestEnable, value);
    }

    public @unsigned int depthWriteEnable() {
        return segment.get(LAYOUT$depthWriteEnable, OFFSET$depthWriteEnable);
    }

    public void depthWriteEnable(@unsigned int value) {
        segment.set(LAYOUT$depthWriteEnable, OFFSET$depthWriteEnable, value);
    }

    public @enumtype(VkCompareOp.class) int depthCompareOp() {
        return segment.get(LAYOUT$depthCompareOp, OFFSET$depthCompareOp);
    }

    public void depthCompareOp(@enumtype(VkCompareOp.class) int value) {
        segment.set(LAYOUT$depthCompareOp, OFFSET$depthCompareOp, value);
    }

    public @unsigned int depthBoundsTestEnable() {
        return segment.get(LAYOUT$depthBoundsTestEnable, OFFSET$depthBoundsTestEnable);
    }

    public void depthBoundsTestEnable(@unsigned int value) {
        segment.set(LAYOUT$depthBoundsTestEnable, OFFSET$depthBoundsTestEnable, value);
    }

    public @unsigned int stencilTestEnable() {
        return segment.get(LAYOUT$stencilTestEnable, OFFSET$stencilTestEnable);
    }

    public void stencilTestEnable(@unsigned int value) {
        segment.set(LAYOUT$stencilTestEnable, OFFSET$stencilTestEnable, value);
    }

    public VkStencilOpState front() {
        return new VkStencilOpState(segment.asSlice(OFFSET$front, LAYOUT$front));
    }

    public void front(VkStencilOpState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$front, SIZE$front);
    }

    public VkStencilOpState back() {
        return new VkStencilOpState(segment.asSlice(OFFSET$back, LAYOUT$back));
    }

    public void back(VkStencilOpState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$back, SIZE$back);
    }

    public float minDepthBounds() {
        return segment.get(LAYOUT$minDepthBounds, OFFSET$minDepthBounds);
    }

    public void minDepthBounds(float value) {
        segment.set(LAYOUT$minDepthBounds, OFFSET$minDepthBounds, value);
    }

    public float maxDepthBounds() {
        return segment.get(LAYOUT$maxDepthBounds, OFFSET$maxDepthBounds);
    }

    public void maxDepthBounds(float value) {
        segment.set(LAYOUT$maxDepthBounds, OFFSET$maxDepthBounds, value);
    }

}
