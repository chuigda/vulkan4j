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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCommandBufferInheritanceViewportScissorInfoNV.html"><code>VkCommandBufferInheritanceViewportScissorInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkCommandBufferInheritanceViewportScissorInfoNV {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkBool32 viewportScissor2D;
///     uint32_t viewportDepthCount;
///     VkViewport const* pViewportDepths;
/// } VkCommandBufferInheritanceViewportScissorInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV`
///
/// The {@link VkCommandBufferInheritanceViewportScissorInfoNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkCommandBufferInheritanceViewportScissorInfoNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCommandBufferInheritanceViewportScissorInfoNV.html"><code>VkCommandBufferInheritanceViewportScissorInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCommandBufferInheritanceViewportScissorInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkCommandBufferInheritanceViewportScissorInfoNV allocate(Arena arena) {
        VkCommandBufferInheritanceViewportScissorInfoNV ret = new VkCommandBufferInheritanceViewportScissorInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV);
        return ret;
    }

    public static VkCommandBufferInheritanceViewportScissorInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCommandBufferInheritanceViewportScissorInfoNV[] ret = new VkCommandBufferInheritanceViewportScissorInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCommandBufferInheritanceViewportScissorInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV);
        }
        return ret;
    }

    public static VkCommandBufferInheritanceViewportScissorInfoNV clone(Arena arena, VkCommandBufferInheritanceViewportScissorInfoNV src) {
        VkCommandBufferInheritanceViewportScissorInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCommandBufferInheritanceViewportScissorInfoNV[] clone(Arena arena, VkCommandBufferInheritanceViewportScissorInfoNV[] src) {
        VkCommandBufferInheritanceViewportScissorInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int viewportScissor2D() {
        return segment.get(LAYOUT$viewportScissor2D, OFFSET$viewportScissor2D);
    }

    public void viewportScissor2D(@unsigned int value) {
        segment.set(LAYOUT$viewportScissor2D, OFFSET$viewportScissor2D, value);
    }

    public @unsigned int viewportDepthCount() {
        return segment.get(LAYOUT$viewportDepthCount, OFFSET$viewportDepthCount);
    }

    public void viewportDepthCount(@unsigned int value) {
        segment.set(LAYOUT$viewportDepthCount, OFFSET$viewportDepthCount, value);
    }

    public @pointer(comment="VkViewport*") MemorySegment pViewportDepthsRaw() {
        return segment.get(LAYOUT$pViewportDepths, OFFSET$pViewportDepths);
    }

    public void pViewportDepthsRaw(@pointer(comment="VkViewport*") MemorySegment value) {
        segment.set(LAYOUT$pViewportDepths, OFFSET$pViewportDepths, value);
    }

    public @Nullable VkViewport pViewportDepths() {
        MemorySegment s = pViewportDepthsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkViewport(s);
    }

    public void pViewportDepths(@Nullable VkViewport value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewportDepthsRaw(s);
    }

    @unsafe public @Nullable VkViewport[] pViewportDepths(int assumedCount) {
        MemorySegment s = pViewportDepthsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkViewport.SIZE);
        VkViewport[] ret = new VkViewport[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkViewport(s.asSlice(i * VkViewport.SIZE, VkViewport.SIZE));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewportScissor2D"),
        ValueLayout.JAVA_INT.withName("viewportDepthCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkViewport.LAYOUT).withName("pViewportDepths")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$viewportScissor2D = PathElement.groupElement("PATH$viewportScissor2D");
    public static final PathElement PATH$viewportDepthCount = PathElement.groupElement("PATH$viewportDepthCount");
    public static final PathElement PATH$pViewportDepths = PathElement.groupElement("PATH$pViewportDepths");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$viewportScissor2D = (OfInt) LAYOUT.select(PATH$viewportScissor2D);
    public static final OfInt LAYOUT$viewportDepthCount = (OfInt) LAYOUT.select(PATH$viewportDepthCount);
    public static final AddressLayout LAYOUT$pViewportDepths = (AddressLayout) LAYOUT.select(PATH$pViewportDepths);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$viewportScissor2D = LAYOUT$viewportScissor2D.byteSize();
    public static final long SIZE$viewportDepthCount = LAYOUT$viewportDepthCount.byteSize();
    public static final long SIZE$pViewportDepths = LAYOUT$pViewportDepths.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$viewportScissor2D = LAYOUT.byteOffset(PATH$viewportScissor2D);
    public static final long OFFSET$viewportDepthCount = LAYOUT.byteOffset(PATH$viewportDepthCount);
    public static final long OFFSET$pViewportDepths = LAYOUT.byteOffset(PATH$pViewportDepths);
}
