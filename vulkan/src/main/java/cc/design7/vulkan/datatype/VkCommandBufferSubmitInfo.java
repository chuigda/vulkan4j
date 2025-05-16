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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCommandBufferSubmitInfo.html"><code>VkCommandBufferSubmitInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkCommandBufferSubmitInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkCommandBuffer commandBuffer;
///     uint32_t deviceMask;
/// } VkCommandBufferSubmitInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO`
///
/// The {@link VkCommandBufferSubmitInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkCommandBufferSubmitInfo#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCommandBufferSubmitInfo.html"><code>VkCommandBufferSubmitInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCommandBufferSubmitInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkCommandBufferSubmitInfo allocate(Arena arena) {
        VkCommandBufferSubmitInfo ret = new VkCommandBufferSubmitInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.COMMAND_BUFFER_SUBMIT_INFO);
        return ret;
    }

    public static VkCommandBufferSubmitInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCommandBufferSubmitInfo[] ret = new VkCommandBufferSubmitInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCommandBufferSubmitInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.COMMAND_BUFFER_SUBMIT_INFO);
        }
        return ret;
    }

    public static VkCommandBufferSubmitInfo clone(Arena arena, VkCommandBufferSubmitInfo src) {
        VkCommandBufferSubmitInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCommandBufferSubmitInfo[] clone(Arena arena, VkCommandBufferSubmitInfo[] src) {
        VkCommandBufferSubmitInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.COMMAND_BUFFER_SUBMIT_INFO);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @Nullable VkCommandBuffer commandBuffer() {
        MemorySegment s = segment.asSlice(OFFSET$commandBuffer, SIZE$commandBuffer);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkCommandBuffer(s);
    }

    public void commandBuffer(@Nullable VkCommandBuffer value) {
        segment.set(LAYOUT$commandBuffer, OFFSET$commandBuffer, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int deviceMask() {
        return segment.get(LAYOUT$deviceMask, OFFSET$deviceMask);
    }

    public void deviceMask(@unsigned int value) {
        segment.set(LAYOUT$deviceMask, OFFSET$deviceMask, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("commandBuffer"),
        ValueLayout.JAVA_INT.withName("deviceMask")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$commandBuffer = PathElement.groupElement("PATH$commandBuffer");
    public static final PathElement PATH$deviceMask = PathElement.groupElement("PATH$deviceMask");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$commandBuffer = (AddressLayout) LAYOUT.select(PATH$commandBuffer);
    public static final OfInt LAYOUT$deviceMask = (OfInt) LAYOUT.select(PATH$deviceMask);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$commandBuffer = LAYOUT$commandBuffer.byteSize();
    public static final long SIZE$deviceMask = LAYOUT$deviceMask.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$commandBuffer = LAYOUT.byteOffset(PATH$commandBuffer);
    public static final long OFFSET$deviceMask = LAYOUT.byteOffset(PATH$deviceMask);
}
