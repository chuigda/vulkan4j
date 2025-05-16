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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineRenderingCreateInfo.html"><code>VkPipelineRenderingCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineRenderingCreateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t viewMask;
///     uint32_t colorAttachmentCount; // optional
///     VkFormat const* pColorAttachmentFormats;
///     VkFormat depthAttachmentFormat;
///     VkFormat stencilAttachmentFormat;
/// } VkPipelineRenderingCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_RENDERING_CREATE_INFO`
///
/// The {@link VkPipelineRenderingCreateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPipelineRenderingCreateInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineRenderingCreateInfo.html"><code>VkPipelineRenderingCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineRenderingCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineRenderingCreateInfo allocate(Arena arena) {
        VkPipelineRenderingCreateInfo ret = new VkPipelineRenderingCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_RENDERING_CREATE_INFO);
        return ret;
    }

    public static VkPipelineRenderingCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineRenderingCreateInfo[] ret = new VkPipelineRenderingCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineRenderingCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_RENDERING_CREATE_INFO);
        }
        return ret;
    }

    public static VkPipelineRenderingCreateInfo clone(Arena arena, VkPipelineRenderingCreateInfo src) {
        VkPipelineRenderingCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineRenderingCreateInfo[] clone(Arena arena, VkPipelineRenderingCreateInfo[] src) {
        VkPipelineRenderingCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_RENDERING_CREATE_INFO);
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

    public @unsigned int viewMask() {
        return segment.get(LAYOUT$viewMask, OFFSET$viewMask);
    }

    public void viewMask(@unsigned int value) {
        segment.set(LAYOUT$viewMask, OFFSET$viewMask, value);
    }

    public @unsigned int colorAttachmentCount() {
        return segment.get(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount);
    }

    public void colorAttachmentCount(@unsigned int value) {
        segment.set(LAYOUT$colorAttachmentCount, OFFSET$colorAttachmentCount, value);
    }

    public @pointer(target=VkFormat.class) MemorySegment pColorAttachmentFormatsRaw() {
        return segment.get(LAYOUT$pColorAttachmentFormats, OFFSET$pColorAttachmentFormats);
    }

    public void pColorAttachmentFormatsRaw(@pointer(target=VkFormat.class) MemorySegment value) {
        segment.set(LAYOUT$pColorAttachmentFormats, OFFSET$pColorAttachmentFormats, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkFormat.class) IntPtr pColorAttachmentFormats() {
        MemorySegment s = pColorAttachmentFormatsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pColorAttachmentFormats(@Nullable @enumtype(VkFormat.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorAttachmentFormatsRaw(s);
    }

    public @enumtype(VkFormat.class) int depthAttachmentFormat() {
        return segment.get(LAYOUT$depthAttachmentFormat, OFFSET$depthAttachmentFormat);
    }

    public void depthAttachmentFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$depthAttachmentFormat, OFFSET$depthAttachmentFormat, value);
    }

    public @enumtype(VkFormat.class) int stencilAttachmentFormat() {
        return segment.get(LAYOUT$stencilAttachmentFormat, OFFSET$stencilAttachmentFormat);
    }

    public void stencilAttachmentFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$stencilAttachmentFormat, OFFSET$stencilAttachmentFormat, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewMask"),
        ValueLayout.JAVA_INT.withName("colorAttachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pColorAttachmentFormats"),
        ValueLayout.JAVA_INT.withName("depthAttachmentFormat"),
        ValueLayout.JAVA_INT.withName("stencilAttachmentFormat")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$viewMask = PathElement.groupElement("PATH$viewMask");
    public static final PathElement PATH$colorAttachmentCount = PathElement.groupElement("PATH$colorAttachmentCount");
    public static final PathElement PATH$pColorAttachmentFormats = PathElement.groupElement("PATH$pColorAttachmentFormats");
    public static final PathElement PATH$depthAttachmentFormat = PathElement.groupElement("PATH$depthAttachmentFormat");
    public static final PathElement PATH$stencilAttachmentFormat = PathElement.groupElement("PATH$stencilAttachmentFormat");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$viewMask = (OfInt) LAYOUT.select(PATH$viewMask);
    public static final OfInt LAYOUT$colorAttachmentCount = (OfInt) LAYOUT.select(PATH$colorAttachmentCount);
    public static final AddressLayout LAYOUT$pColorAttachmentFormats = (AddressLayout) LAYOUT.select(PATH$pColorAttachmentFormats);
    public static final OfInt LAYOUT$depthAttachmentFormat = (OfInt) LAYOUT.select(PATH$depthAttachmentFormat);
    public static final OfInt LAYOUT$stencilAttachmentFormat = (OfInt) LAYOUT.select(PATH$stencilAttachmentFormat);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$viewMask = LAYOUT$viewMask.byteSize();
    public static final long SIZE$colorAttachmentCount = LAYOUT$colorAttachmentCount.byteSize();
    public static final long SIZE$pColorAttachmentFormats = LAYOUT$pColorAttachmentFormats.byteSize();
    public static final long SIZE$depthAttachmentFormat = LAYOUT$depthAttachmentFormat.byteSize();
    public static final long SIZE$stencilAttachmentFormat = LAYOUT$stencilAttachmentFormat.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$viewMask = LAYOUT.byteOffset(PATH$viewMask);
    public static final long OFFSET$colorAttachmentCount = LAYOUT.byteOffset(PATH$colorAttachmentCount);
    public static final long OFFSET$pColorAttachmentFormats = LAYOUT.byteOffset(PATH$pColorAttachmentFormats);
    public static final long OFFSET$depthAttachmentFormat = LAYOUT.byteOffset(PATH$depthAttachmentFormat);
    public static final long OFFSET$stencilAttachmentFormat = LAYOUT.byteOffset(PATH$stencilAttachmentFormat);
}
