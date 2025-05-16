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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAttachmentDescription2.html"><code>VkAttachmentDescription2</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAttachmentDescription2 {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkAttachmentDescriptionFlags flags; // optional
///     VkFormat format;
///     VkSampleCountFlags samples;
///     VkAttachmentLoadOp loadOp;
///     VkAttachmentStoreOp storeOp;
///     VkAttachmentLoadOp stencilLoadOp;
///     VkAttachmentStoreOp stencilStoreOp;
///     VkImageLayout initialLayout;
///     VkImageLayout finalLayout;
/// } VkAttachmentDescription2;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ATTACHMENT_DESCRIPTION_2`
///
/// The {@link VkAttachmentDescription2#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkAttachmentDescription2#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAttachmentDescription2.html"><code>VkAttachmentDescription2</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAttachmentDescription2(@NotNull MemorySegment segment) implements IPointer {
    public static VkAttachmentDescription2 allocate(Arena arena) {
        VkAttachmentDescription2 ret = new VkAttachmentDescription2(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ATTACHMENT_DESCRIPTION_2);
        return ret;
    }

    public static VkAttachmentDescription2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAttachmentDescription2[] ret = new VkAttachmentDescription2[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAttachmentDescription2(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.ATTACHMENT_DESCRIPTION_2);
        }
        return ret;
    }

    public static VkAttachmentDescription2 clone(Arena arena, VkAttachmentDescription2 src) {
        VkAttachmentDescription2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAttachmentDescription2[] clone(Arena arena, VkAttachmentDescription2[] src) {
        VkAttachmentDescription2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ATTACHMENT_DESCRIPTION_2);
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

    public @enumtype(VkAttachmentDescriptionFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkAttachmentDescriptionFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public @enumtype(VkSampleCountFlags.class) int samples() {
        return segment.get(LAYOUT$samples, OFFSET$samples);
    }

    public void samples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$samples, OFFSET$samples, value);
    }

    public @enumtype(VkAttachmentLoadOp.class) int loadOp() {
        return segment.get(LAYOUT$loadOp, OFFSET$loadOp);
    }

    public void loadOp(@enumtype(VkAttachmentLoadOp.class) int value) {
        segment.set(LAYOUT$loadOp, OFFSET$loadOp, value);
    }

    public @enumtype(VkAttachmentStoreOp.class) int storeOp() {
        return segment.get(LAYOUT$storeOp, OFFSET$storeOp);
    }

    public void storeOp(@enumtype(VkAttachmentStoreOp.class) int value) {
        segment.set(LAYOUT$storeOp, OFFSET$storeOp, value);
    }

    public @enumtype(VkAttachmentLoadOp.class) int stencilLoadOp() {
        return segment.get(LAYOUT$stencilLoadOp, OFFSET$stencilLoadOp);
    }

    public void stencilLoadOp(@enumtype(VkAttachmentLoadOp.class) int value) {
        segment.set(LAYOUT$stencilLoadOp, OFFSET$stencilLoadOp, value);
    }

    public @enumtype(VkAttachmentStoreOp.class) int stencilStoreOp() {
        return segment.get(LAYOUT$stencilStoreOp, OFFSET$stencilStoreOp);
    }

    public void stencilStoreOp(@enumtype(VkAttachmentStoreOp.class) int value) {
        segment.set(LAYOUT$stencilStoreOp, OFFSET$stencilStoreOp, value);
    }

    public @enumtype(VkImageLayout.class) int initialLayout() {
        return segment.get(LAYOUT$initialLayout, OFFSET$initialLayout);
    }

    public void initialLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$initialLayout, OFFSET$initialLayout, value);
    }

    public @enumtype(VkImageLayout.class) int finalLayout() {
        return segment.get(LAYOUT$finalLayout, OFFSET$finalLayout);
    }

    public void finalLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$finalLayout, OFFSET$finalLayout, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("samples"),
        ValueLayout.JAVA_INT.withName("loadOp"),
        ValueLayout.JAVA_INT.withName("storeOp"),
        ValueLayout.JAVA_INT.withName("stencilLoadOp"),
        ValueLayout.JAVA_INT.withName("stencilStoreOp"),
        ValueLayout.JAVA_INT.withName("initialLayout"),
        ValueLayout.JAVA_INT.withName("finalLayout")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");
    public static final PathElement PATH$samples = PathElement.groupElement("PATH$samples");
    public static final PathElement PATH$loadOp = PathElement.groupElement("PATH$loadOp");
    public static final PathElement PATH$storeOp = PathElement.groupElement("PATH$storeOp");
    public static final PathElement PATH$stencilLoadOp = PathElement.groupElement("PATH$stencilLoadOp");
    public static final PathElement PATH$stencilStoreOp = PathElement.groupElement("PATH$stencilStoreOp");
    public static final PathElement PATH$initialLayout = PathElement.groupElement("PATH$initialLayout");
    public static final PathElement PATH$finalLayout = PathElement.groupElement("PATH$finalLayout");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$samples = (OfInt) LAYOUT.select(PATH$samples);
    public static final OfInt LAYOUT$loadOp = (OfInt) LAYOUT.select(PATH$loadOp);
    public static final OfInt LAYOUT$storeOp = (OfInt) LAYOUT.select(PATH$storeOp);
    public static final OfInt LAYOUT$stencilLoadOp = (OfInt) LAYOUT.select(PATH$stencilLoadOp);
    public static final OfInt LAYOUT$stencilStoreOp = (OfInt) LAYOUT.select(PATH$stencilStoreOp);
    public static final OfInt LAYOUT$initialLayout = (OfInt) LAYOUT.select(PATH$initialLayout);
    public static final OfInt LAYOUT$finalLayout = (OfInt) LAYOUT.select(PATH$finalLayout);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$samples = LAYOUT$samples.byteSize();
    public static final long SIZE$loadOp = LAYOUT$loadOp.byteSize();
    public static final long SIZE$storeOp = LAYOUT$storeOp.byteSize();
    public static final long SIZE$stencilLoadOp = LAYOUT$stencilLoadOp.byteSize();
    public static final long SIZE$stencilStoreOp = LAYOUT$stencilStoreOp.byteSize();
    public static final long SIZE$initialLayout = LAYOUT$initialLayout.byteSize();
    public static final long SIZE$finalLayout = LAYOUT$finalLayout.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$samples = LAYOUT.byteOffset(PATH$samples);
    public static final long OFFSET$loadOp = LAYOUT.byteOffset(PATH$loadOp);
    public static final long OFFSET$storeOp = LAYOUT.byteOffset(PATH$storeOp);
    public static final long OFFSET$stencilLoadOp = LAYOUT.byteOffset(PATH$stencilLoadOp);
    public static final long OFFSET$stencilStoreOp = LAYOUT.byteOffset(PATH$stencilStoreOp);
    public static final long OFFSET$initialLayout = LAYOUT.byteOffset(PATH$initialLayout);
    public static final long OFFSET$finalLayout = LAYOUT.byteOffset(PATH$finalLayout);
}
