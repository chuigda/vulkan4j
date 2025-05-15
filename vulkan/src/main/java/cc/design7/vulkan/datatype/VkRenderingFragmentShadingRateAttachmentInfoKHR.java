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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderingFragmentShadingRateAttachmentInfoKHR.html"><code>VkRenderingFragmentShadingRateAttachmentInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRenderingFragmentShadingRateAttachmentInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkImageView imageView; // optional
///     VkImageLayout imageLayout;
///     VkExtent2D shadingRateAttachmentTexelSize;
/// } VkRenderingFragmentShadingRateAttachmentInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR`
///
/// The {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkRenderingFragmentShadingRateAttachmentInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderingFragmentShadingRateAttachmentInfoKHR.html"><code>VkRenderingFragmentShadingRateAttachmentInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderingFragmentShadingRateAttachmentInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkRenderingFragmentShadingRateAttachmentInfoKHR allocate(Arena arena) {
        VkRenderingFragmentShadingRateAttachmentInfoKHR ret = new VkRenderingFragmentShadingRateAttachmentInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR);
        return ret;
    }

    public static VkRenderingFragmentShadingRateAttachmentInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderingFragmentShadingRateAttachmentInfoKHR[] ret = new VkRenderingFragmentShadingRateAttachmentInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderingFragmentShadingRateAttachmentInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR);
        }
        return ret;
    }

    public static VkRenderingFragmentShadingRateAttachmentInfoKHR clone(Arena arena, VkRenderingFragmentShadingRateAttachmentInfoKHR src) {
        VkRenderingFragmentShadingRateAttachmentInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderingFragmentShadingRateAttachmentInfoKHR[] clone(Arena arena, VkRenderingFragmentShadingRateAttachmentInfoKHR[] src) {
        VkRenderingFragmentShadingRateAttachmentInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RENDERING_FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR);
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

    public @Nullable VkImageView imageView() {
        MemorySegment s = segment.asSlice(OFFSET$imageView, SIZE$imageView);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkImageView(s);
    }

    public void imageView(@Nullable VkImageView value) {
        segment.set(LAYOUT$imageView, OFFSET$imageView, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkImageLayout.class) int imageLayout() {
        return segment.get(LAYOUT$imageLayout, OFFSET$imageLayout);
    }

    public void imageLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$imageLayout, OFFSET$imageLayout, value);
    }

    public VkExtent2D shadingRateAttachmentTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$shadingRateAttachmentTexelSize, LAYOUT$shadingRateAttachmentTexelSize));
    }

    public void shadingRateAttachmentTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$shadingRateAttachmentTexelSize, SIZE$shadingRateAttachmentTexelSize);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout"),
        VkExtent2D.LAYOUT.withName("shadingRateAttachmentTexelSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$imageView = PathElement.groupElement("PATH$imageView");
    public static final PathElement PATH$imageLayout = PathElement.groupElement("PATH$imageLayout");
    public static final PathElement PATH$shadingRateAttachmentTexelSize = PathElement.groupElement("PATH$shadingRateAttachmentTexelSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$imageView = (AddressLayout) LAYOUT.select(PATH$imageView);
    public static final OfInt LAYOUT$imageLayout = (OfInt) LAYOUT.select(PATH$imageLayout);
    public static final StructLayout LAYOUT$shadingRateAttachmentTexelSize = (StructLayout) LAYOUT.select(PATH$shadingRateAttachmentTexelSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$imageView = LAYOUT$imageView.byteSize();
    public static final long SIZE$imageLayout = LAYOUT$imageLayout.byteSize();
    public static final long SIZE$shadingRateAttachmentTexelSize = LAYOUT$shadingRateAttachmentTexelSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageView = LAYOUT.byteOffset(PATH$imageView);
    public static final long OFFSET$imageLayout = LAYOUT.byteOffset(PATH$imageLayout);
    public static final long OFFSET$shadingRateAttachmentTexelSize = LAYOUT.byteOffset(PATH$shadingRateAttachmentTexelSize);
}
