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

/// Represents a pointer to a {@code VkRenderPassBeginInfo} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassBeginInfo.html">VkRenderPassBeginInfo</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderPassBeginInfo(@NotNull MemorySegment segment) implements IPointer {
    public VkRenderPassBeginInfo {
        sType(VkStructureType.RENDER_PASS_BEGIN_INFO);
    }

    public static VkRenderPassBeginInfo allocate(Arena arena) {
        return new VkRenderPassBeginInfo(arena.allocate(LAYOUT));
    }

    public static VkRenderPassBeginInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassBeginInfo[] ret = new VkRenderPassBeginInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassBeginInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRenderPassBeginInfo clone(Arena arena, VkRenderPassBeginInfo src) {
        VkRenderPassBeginInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassBeginInfo[] clone(Arena arena, VkRenderPassBeginInfo[] src) {
        VkRenderPassBeginInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.ADDRESS.withName("framebuffer"),
        VkRect2D.LAYOUT.withName("renderArea"),
        ValueLayout.JAVA_INT.withName("clearValueCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkClearValue.LAYOUT).withName("pClearValues")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$renderPass = PathElement.groupElement("PATH$renderPass");
    public static final PathElement PATH$framebuffer = PathElement.groupElement("PATH$framebuffer");
    public static final PathElement PATH$renderArea = PathElement.groupElement("PATH$renderArea");
    public static final PathElement PATH$clearValueCount = PathElement.groupElement("PATH$clearValueCount");
    public static final PathElement PATH$pClearValues = PathElement.groupElement("PATH$pClearValues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$renderPass = (AddressLayout) LAYOUT.select(PATH$renderPass);
    public static final AddressLayout LAYOUT$framebuffer = (AddressLayout) LAYOUT.select(PATH$framebuffer);
    public static final StructLayout LAYOUT$renderArea = (StructLayout) LAYOUT.select(PATH$renderArea);
    public static final OfInt LAYOUT$clearValueCount = (OfInt) LAYOUT.select(PATH$clearValueCount);
    public static final AddressLayout LAYOUT$pClearValues = (AddressLayout) LAYOUT.select(PATH$pClearValues);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$renderPass = LAYOUT$renderPass.byteSize();
    public static final long SIZE$framebuffer = LAYOUT$framebuffer.byteSize();
    public static final long SIZE$renderArea = LAYOUT$renderArea.byteSize();
    public static final long SIZE$clearValueCount = LAYOUT$clearValueCount.byteSize();
    public static final long SIZE$pClearValues = LAYOUT$pClearValues.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$renderPass = LAYOUT.byteOffset(PATH$renderPass);
    public static final long OFFSET$framebuffer = LAYOUT.byteOffset(PATH$framebuffer);
    public static final long OFFSET$renderArea = LAYOUT.byteOffset(PATH$renderArea);
    public static final long OFFSET$clearValueCount = LAYOUT.byteOffset(PATH$clearValueCount);
    public static final long OFFSET$pClearValues = LAYOUT.byteOffset(PATH$pClearValues);

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

    public @Nullable VkRenderPass renderPass() {
        MemorySegment s = segment.asSlice(OFFSET$renderPass, SIZE$renderPass);
        if (s.address() == 0) {
            return null;
        }
        return new VkRenderPass(s);
    }

    public void renderPass(@Nullable VkRenderPass value) {
        segment.set(LAYOUT$renderPass, OFFSET$renderPass, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkFramebuffer framebuffer() {
        MemorySegment s = segment.asSlice(OFFSET$framebuffer, SIZE$framebuffer);
        if (s.address() == 0) {
            return null;
        }
        return new VkFramebuffer(s);
    }

    public void framebuffer(@Nullable VkFramebuffer value) {
        segment.set(LAYOUT$framebuffer, OFFSET$framebuffer, value != null ? value.segment() : MemorySegment.NULL);
    }

    public VkRect2D renderArea() {
        return new VkRect2D(segment.asSlice(OFFSET$renderArea, LAYOUT$renderArea));
    }

    public void renderArea(VkRect2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$renderArea, SIZE$renderArea);
    }

    public @unsigned int clearValueCount() {
        return segment.get(LAYOUT$clearValueCount, OFFSET$clearValueCount);
    }

    public void clearValueCount(@unsigned int value) {
        segment.set(LAYOUT$clearValueCount, OFFSET$clearValueCount, value);
    }

    public @pointer(comment="VkClearValue*") MemorySegment pClearValuesRaw() {
        return segment.get(LAYOUT$pClearValues, OFFSET$pClearValues);
    }

    public void pClearValuesRaw(@pointer(comment="VkClearValue*") MemorySegment value) {
        segment.set(LAYOUT$pClearValues, OFFSET$pClearValues, value);
    }

    public @Nullable VkClearValue pClearValues() {
        MemorySegment s = pClearValuesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkClearValue(s);
    }

    public void pClearValues(@Nullable VkClearValue value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pClearValuesRaw(s);
    }

    @unsafe public @Nullable VkClearValue[] pClearValues(int assumedCount) {
        MemorySegment s = pClearValuesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkClearValue.SIZE);
        VkClearValue[] ret = new VkClearValue[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkClearValue(s.asSlice(i * VkClearValue.SIZE, VkClearValue.SIZE));
        }
        return ret;
    }

}
