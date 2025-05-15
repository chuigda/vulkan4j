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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineBinaryHandlesInfoKHR.html">VkPipelineBinaryHandlesInfoKHR</a>
@ValueBasedCandidate
public record VkPipelineBinaryHandlesInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$pipelineBinaryCount = ValueLayout.JAVA_INT.withName("pipelineBinaryCount");
    public static final AddressLayout LAYOUT$pPipelineBinaries = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pPipelineBinaries");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pipelineBinaryCount, LAYOUT$pPipelineBinaries);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineBinaryHandlesInfoKHR allocate(Arena arena) {
        return new VkPipelineBinaryHandlesInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkPipelineBinaryHandlesInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineBinaryHandlesInfoKHR[] ret = new VkPipelineBinaryHandlesInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineBinaryHandlesInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineBinaryHandlesInfoKHR clone(Arena arena, VkPipelineBinaryHandlesInfoKHR src) {
        VkPipelineBinaryHandlesInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineBinaryHandlesInfoKHR[] clone(Arena arena, VkPipelineBinaryHandlesInfoKHR[] src) {
        VkPipelineBinaryHandlesInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pipelineBinaryCount = PathElement.groupElement("PATH$pipelineBinaryCount");
    public static final PathElement PATH$pPipelineBinaries = PathElement.groupElement("PATH$pPipelineBinaries");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipelineBinaryCount = LAYOUT$pipelineBinaryCount.byteSize();
    public static final long SIZE$pPipelineBinaries = LAYOUT$pPipelineBinaries.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineBinaryCount = LAYOUT.byteOffset(PATH$pipelineBinaryCount);
    public static final long OFFSET$pPipelineBinaries = LAYOUT.byteOffset(PATH$pPipelineBinaries);

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

    public @unsigned int pipelineBinaryCount() {
        return segment.get(LAYOUT$pipelineBinaryCount, OFFSET$pipelineBinaryCount);
    }

    public void pipelineBinaryCount(@unsigned int value) {
        segment.set(LAYOUT$pipelineBinaryCount, OFFSET$pipelineBinaryCount, value);
    }

    public @pointer(comment="VkPipelineBinaryKHR*") MemorySegment pPipelineBinariesRaw() {
        return segment.get(LAYOUT$pPipelineBinaries, OFFSET$pPipelineBinaries);
    }

    public void pPipelineBinariesRaw(@pointer(comment="VkPipelineBinaryKHR*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineBinaries, OFFSET$pPipelineBinaries, value);
    }

    /// Note: the returned {@link VkPipelineBinaryKHR.Buffer} does not have correct {@link VkPipelineBinaryKHR.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkPipelineBinaryKHR.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkPipelineBinaryKHR.Buffer pPipelineBinaries() {
        MemorySegment s = pPipelineBinariesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineBinaryKHR.Buffer(s);
    }


}
