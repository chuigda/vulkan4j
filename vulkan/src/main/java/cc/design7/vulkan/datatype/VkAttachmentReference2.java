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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAttachmentReference2.html"><code>VkAttachmentReference2</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAttachmentReference2 {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t attachment;
///     VkImageLayout layout;
///     VkImageAspectFlags aspectMask;
/// } VkAttachmentReference2;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2`
///
/// The {@link VkAttachmentReference2#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkAttachmentReference2#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAttachmentReference2.html"><code>VkAttachmentReference2</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAttachmentReference2(@NotNull MemorySegment segment) implements IPointer {
    public static VkAttachmentReference2 allocate(Arena arena) {
        VkAttachmentReference2 ret = new VkAttachmentReference2(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ATTACHMENT_REFERENCE_2);
        return ret;
    }

    public static VkAttachmentReference2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAttachmentReference2[] ret = new VkAttachmentReference2[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAttachmentReference2(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.ATTACHMENT_REFERENCE_2);
        }
        return ret;
    }

    public static VkAttachmentReference2 clone(Arena arena, VkAttachmentReference2 src) {
        VkAttachmentReference2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAttachmentReference2[] clone(Arena arena, VkAttachmentReference2[] src) {
        VkAttachmentReference2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ATTACHMENT_REFERENCE_2);
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

    public @unsigned int attachment() {
        return segment.get(LAYOUT$attachment, OFFSET$attachment);
    }

    public void attachment(@unsigned int value) {
        segment.set(LAYOUT$attachment, OFFSET$attachment, value);
    }

    public @enumtype(VkImageLayout.class) int layout() {
        return segment.get(LAYOUT$layout, OFFSET$layout);
    }

    public void layout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$layout, OFFSET$layout, value);
    }

    public @enumtype(VkImageAspectFlags.class) int aspectMask() {
        return segment.get(LAYOUT$aspectMask, OFFSET$aspectMask);
    }

    public void aspectMask(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachment"),
        ValueLayout.JAVA_INT.withName("layout"),
        ValueLayout.JAVA_INT.withName("aspectMask")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$attachment = PathElement.groupElement("PATH$attachment");
    public static final PathElement PATH$layout = PathElement.groupElement("PATH$layout");
    public static final PathElement PATH$aspectMask = PathElement.groupElement("PATH$aspectMask");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$attachment = (OfInt) LAYOUT.select(PATH$attachment);
    public static final OfInt LAYOUT$layout = (OfInt) LAYOUT.select(PATH$layout);
    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$attachment = LAYOUT$attachment.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$aspectMask = LAYOUT$aspectMask.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$attachment = LAYOUT.byteOffset(PATH$attachment);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
}
