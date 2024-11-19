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
/// typedef struct VkPipelineBinaryHandlesInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t pipelineBinaryCount;
///     VkPipelineBinaryKHR* pPipelineBinaries;
/// } VkPipelineBinaryHandlesInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineBinaryHandlesInfoKHR.html">VkPipelineBinaryHandlesInfoKHR</a>
public record VkPipelineBinaryHandlesInfoKHR(MemorySegment segment) implements IPointer {
    public VkPipelineBinaryHandlesInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR);
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

    public @unsigned int pipelineBinaryCount() {
        return segment.get(LAYOUT$pipelineBinaryCount, OFFSET$pipelineBinaryCount);
    }

    public void pipelineBinaryCount(@unsigned int value) {
        segment.set(LAYOUT$pipelineBinaryCount, OFFSET$pipelineBinaryCount, value);
    }

    public @pointer(comment="VkPipelineBinaryKHR") MemorySegment pPipelineBinariesRaw() {
        return segment.get(LAYOUT$pPipelineBinaries, OFFSET$pPipelineBinaries);
    }

    public void pPipelineBinariesRaw(@pointer(comment="VkPipelineBinaryKHR") MemorySegment value) {
        segment.set(LAYOUT$pPipelineBinaries, OFFSET$pPipelineBinaries, value);
    }

    /// Note: the returned {@link VkPipelineBinaryKHR.Buffer} does not have correct
    /// {@link VkPipelineBinaryKHR.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkPipelineBinaryKHR.Buffer#reinterpret} to set the size before actually
    /// {@link VkPipelineBinaryKHR.Buffer#read}ing or {@link VkPipelineBinaryKHR.Buffer#write}ing
    /// the buffer.
    public @Nullable VkPipelineBinaryKHR.Buffer pPipelineBinaries() {
        MemorySegment s = pPipelineBinariesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineBinaryKHR.Buffer(s);
    }

    public void pPipelineBinaries(@Nullable VkPipelineBinaryKHR.Buffer value) {
        pPipelineBinariesRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkPipelineBinaryHandlesInfoKHR allocate(Arena arena) {
        return new VkPipelineBinaryHandlesInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkPipelineBinaryHandlesInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineBinaryHandlesInfoKHR[] ret = new VkPipelineBinaryHandlesInfoKHR[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pPipelineBinaries")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipelineBinaryCount = PathElement.groupElement("pipelineBinaryCount");
    public static final PathElement PATH$pPipelineBinaries = PathElement.groupElement("pPipelineBinaries");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pipelineBinaryCount = (OfInt) LAYOUT.select(PATH$pipelineBinaryCount);
    public static final AddressLayout LAYOUT$pPipelineBinaries = (AddressLayout) LAYOUT.select(PATH$pPipelineBinaries);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineBinaryCount = LAYOUT.byteOffset(PATH$pipelineBinaryCount);
    public static final long OFFSET$pPipelineBinaries = LAYOUT.byteOffset(PATH$pPipelineBinaries);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipelineBinaryCount = LAYOUT$pipelineBinaryCount.byteSize();
    public static final long SIZE$pPipelineBinaries = LAYOUT$pPipelineBinaries.byteSize();
}
