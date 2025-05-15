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

/// Represents a pointer to a {@code VkFragmentShadingRateAttachmentInfoKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFragmentShadingRateAttachmentInfoKHR.html">VkFragmentShadingRateAttachmentInfoKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkFragmentShadingRateAttachmentInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkFragmentShadingRateAttachmentInfoKHR {
        sType(VkStructureType.FRAGMENT_SHADING_RATE_ATTACHMENT_INFO_KHR);
    }

    public static VkFragmentShadingRateAttachmentInfoKHR allocate(Arena arena) {
        return new VkFragmentShadingRateAttachmentInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkFragmentShadingRateAttachmentInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFragmentShadingRateAttachmentInfoKHR[] ret = new VkFragmentShadingRateAttachmentInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkFragmentShadingRateAttachmentInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkFragmentShadingRateAttachmentInfoKHR clone(Arena arena, VkFragmentShadingRateAttachmentInfoKHR src) {
        VkFragmentShadingRateAttachmentInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkFragmentShadingRateAttachmentInfoKHR[] clone(Arena arena, VkFragmentShadingRateAttachmentInfoKHR[] src) {
        VkFragmentShadingRateAttachmentInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkAttachmentReference2.LAYOUT).withName("pFragmentShadingRateAttachment"),
        VkExtent2D.LAYOUT.withName("shadingRateAttachmentTexelSize")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pFragmentShadingRateAttachment = PathElement.groupElement("PATH$pFragmentShadingRateAttachment");
    public static final PathElement PATH$shadingRateAttachmentTexelSize = PathElement.groupElement("PATH$shadingRateAttachmentTexelSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pFragmentShadingRateAttachment = (AddressLayout) LAYOUT.select(PATH$pFragmentShadingRateAttachment);
    public static final StructLayout LAYOUT$shadingRateAttachmentTexelSize = (StructLayout) LAYOUT.select(PATH$shadingRateAttachmentTexelSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pFragmentShadingRateAttachment = LAYOUT$pFragmentShadingRateAttachment.byteSize();
    public static final long SIZE$shadingRateAttachmentTexelSize = LAYOUT$shadingRateAttachmentTexelSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pFragmentShadingRateAttachment = LAYOUT.byteOffset(PATH$pFragmentShadingRateAttachment);
    public static final long OFFSET$shadingRateAttachmentTexelSize = LAYOUT.byteOffset(PATH$shadingRateAttachmentTexelSize);

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

    public @pointer(comment="VkAttachmentReference2*") MemorySegment pFragmentShadingRateAttachmentRaw() {
        return segment.get(LAYOUT$pFragmentShadingRateAttachment, OFFSET$pFragmentShadingRateAttachment);
    }

    public void pFragmentShadingRateAttachmentRaw(@pointer(comment="VkAttachmentReference2*") MemorySegment value) {
        segment.set(LAYOUT$pFragmentShadingRateAttachment, OFFSET$pFragmentShadingRateAttachment, value);
    }

    public @Nullable VkAttachmentReference2 pFragmentShadingRateAttachment() {
        MemorySegment s = pFragmentShadingRateAttachmentRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentReference2(s);
    }

    public void pFragmentShadingRateAttachment(@Nullable VkAttachmentReference2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFragmentShadingRateAttachmentRaw(s);
    }

    @unsafe public @Nullable VkAttachmentReference2[] pFragmentShadingRateAttachment(int assumedCount) {
        MemorySegment s = pFragmentShadingRateAttachmentRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentReference2.SIZE);
        VkAttachmentReference2[] ret = new VkAttachmentReference2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentReference2(s.asSlice(i * VkAttachmentReference2.SIZE, VkAttachmentReference2.SIZE));
        }
        return ret;
    }

    public VkExtent2D shadingRateAttachmentTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$shadingRateAttachmentTexelSize, LAYOUT$shadingRateAttachmentTexelSize));
    }

    public void shadingRateAttachmentTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$shadingRateAttachmentTexelSize, SIZE$shadingRateAttachmentTexelSize);
    }

}
