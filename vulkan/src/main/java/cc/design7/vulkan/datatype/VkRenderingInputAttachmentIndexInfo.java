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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderingInputAttachmentIndexInfo.html"><code>VkRenderingInputAttachmentIndexInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRenderingInputAttachmentIndexInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t colorAttachmentCount; // optional
///     uint32_t const* pColorAttachmentInputIndices; // optional
///     uint32_t const* pDepthInputAttachmentIndex; // optional
///     uint32_t const* pStencilInputAttachmentIndex; // optional
/// } VkRenderingInputAttachmentIndexInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO`
///
/// The {@link VkRenderingInputAttachmentIndexInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkRenderingInputAttachmentIndexInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderingInputAttachmentIndexInfo.html"><code>VkRenderingInputAttachmentIndexInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderingInputAttachmentIndexInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkRenderingInputAttachmentIndexInfo allocate(Arena arena) {
        VkRenderingInputAttachmentIndexInfo ret = new VkRenderingInputAttachmentIndexInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RENDERING_INPUT_ATTACHMENT_INDEX_INFO);
        return ret;
    }

    public static VkRenderingInputAttachmentIndexInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderingInputAttachmentIndexInfo[] ret = new VkRenderingInputAttachmentIndexInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderingInputAttachmentIndexInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.RENDERING_INPUT_ATTACHMENT_INDEX_INFO);
        }
        return ret;
    }

    public static VkRenderingInputAttachmentIndexInfo clone(Arena arena, VkRenderingInputAttachmentIndexInfo src) {
        VkRenderingInputAttachmentIndexInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderingInputAttachmentIndexInfo[] clone(Arena arena, VkRenderingInputAttachmentIndexInfo[] src) {
        VkRenderingInputAttachmentIndexInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RENDERING_INPUT_ATTACHMENT_INDEX_INFO);
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

    public @unsigned int colorAttachmentCount() {
        return segment.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);
    }

    public void colorAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);
    }

    public @pointer(comment="int*") MemorySegment pColorAttachmentInputIndicesRaw() {
        return segment.get(LAYOUT$pColorAttachmentInputIndices, OFFSET$pColorAttachmentInputIndices);
    }

    public void pColorAttachmentInputIndicesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pColorAttachmentInputIndices, OFFSET$pColorAttachmentInputIndices, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pColorAttachmentInputIndices() {
        MemorySegment s = pColorAttachmentInputIndicesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pColorAttachmentInputIndices(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorAttachmentInputIndicesRaw(s);
    }

    public @pointer(comment="int*") MemorySegment pDepthInputAttachmentIndexRaw() {
        return segment.get(LAYOUT$pDepthInputAttachmentIndex, OFFSET$pDepthInputAttachmentIndex);
    }

    public void pDepthInputAttachmentIndexRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pDepthInputAttachmentIndex, OFFSET$pDepthInputAttachmentIndex, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pDepthInputAttachmentIndex() {
        MemorySegment s = pDepthInputAttachmentIndexRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pDepthInputAttachmentIndex(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDepthInputAttachmentIndexRaw(s);
    }

    public @pointer(comment="int*") MemorySegment pStencilInputAttachmentIndexRaw() {
        return segment.get(LAYOUT$pStencilInputAttachmentIndex, OFFSET$pStencilInputAttachmentIndex);
    }

    public void pStencilInputAttachmentIndexRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pStencilInputAttachmentIndex, OFFSET$pStencilInputAttachmentIndex, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pStencilInputAttachmentIndex() {
        MemorySegment s = pStencilInputAttachmentIndexRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pStencilInputAttachmentIndex(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStencilInputAttachmentIndexRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pColorAttachmentInputIndices"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDepthInputAttachmentIndex"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pStencilInputAttachmentIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$colorAttachmentCount = PathElement.groupElement("PATH$colorAttachmentCount");
    public static final PathElement PATH$pColorAttachmentInputIndices = PathElement.groupElement("PATH$pColorAttachmentInputIndices");
    public static final PathElement PATH$pDepthInputAttachmentIndex = PathElement.groupElement("PATH$pDepthInputAttachmentIndex");
    public static final PathElement PATH$pStencilInputAttachmentIndex = PathElement.groupElement("PATH$pStencilInputAttachmentIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$colorAttachmentCount = (OfInt) LAYOUT.select(PATH$colorAttachmentCount);
    public static final AddressLayout LAYOUT$pColorAttachmentInputIndices = (AddressLayout) LAYOUT.select(PATH$pColorAttachmentInputIndices);
    public static final AddressLayout LAYOUT$pDepthInputAttachmentIndex = (AddressLayout) LAYOUT.select(PATH$pDepthInputAttachmentIndex);
    public static final AddressLayout LAYOUT$pStencilInputAttachmentIndex = (AddressLayout) LAYOUT.select(PATH$pStencilInputAttachmentIndex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$colorAttachmentCount = LAYOUT$colorAttachmentCount.byteSize();
    public static final long SIZE$pColorAttachmentInputIndices = LAYOUT$pColorAttachmentInputIndices.byteSize();
    public static final long SIZE$pDepthInputAttachmentIndex = LAYOUT$pDepthInputAttachmentIndex.byteSize();
    public static final long SIZE$pStencilInputAttachmentIndex = LAYOUT$pStencilInputAttachmentIndex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$colorAttachmentCount = LAYOUT.byteOffset(PATH$colorAttachmentCount);
    public static final long OFFSET$pColorAttachmentInputIndices = LAYOUT.byteOffset(PATH$pColorAttachmentInputIndices);
    public static final long OFFSET$pDepthInputAttachmentIndex = LAYOUT.byteOffset(PATH$pDepthInputAttachmentIndex);
    public static final long OFFSET$pStencilInputAttachmentIndex = LAYOUT.byteOffset(PATH$pStencilInputAttachmentIndex);
}
