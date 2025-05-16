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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderingAttachmentInfo.html"><code>VkRenderingAttachmentInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRenderingAttachmentInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkImageView imageView; // optional
///     VkImageLayout imageLayout;
///     VkResolveModeFlags resolveMode; // optional
///     VkImageView resolveImageView; // optional
///     VkImageLayout resolveImageLayout;
///     VkAttachmentLoadOp loadOp;
///     VkAttachmentStoreOp storeOp;
///     VkClearValue clearValue;
/// } VkRenderingAttachmentInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO`
///
/// The {@link VkRenderingAttachmentInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkRenderingAttachmentInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderingAttachmentInfo.html"><code>VkRenderingAttachmentInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderingAttachmentInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkRenderingAttachmentInfo allocate(Arena arena) {
        VkRenderingAttachmentInfo ret = new VkRenderingAttachmentInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RENDERING_ATTACHMENT_INFO);
        return ret;
    }

    public static VkRenderingAttachmentInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderingAttachmentInfo[] ret = new VkRenderingAttachmentInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderingAttachmentInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.RENDERING_ATTACHMENT_INFO);
        }
        return ret;
    }

    public static VkRenderingAttachmentInfo clone(Arena arena, VkRenderingAttachmentInfo src) {
        VkRenderingAttachmentInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderingAttachmentInfo[] clone(Arena arena, VkRenderingAttachmentInfo[] src) {
        VkRenderingAttachmentInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RENDERING_ATTACHMENT_INFO);
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

    public @enumtype(VkResolveModeFlags.class) int resolveMode() {
        return segment.get(LAYOUT$resolveMode, OFFSET$resolveMode);
    }

    public void resolveMode(@enumtype(VkResolveModeFlags.class) int value) {
        segment.set(LAYOUT$resolveMode, OFFSET$resolveMode, value);
    }

    public @Nullable VkImageView resolveImageView() {
        MemorySegment s = segment.asSlice(OFFSET$resolveImageView, SIZE$resolveImageView);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkImageView(s);
    }

    public void resolveImageView(@Nullable VkImageView value) {
        segment.set(LAYOUT$resolveImageView, OFFSET$resolveImageView, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkImageLayout.class) int resolveImageLayout() {
        return segment.get(LAYOUT$resolveImageLayout, OFFSET$resolveImageLayout);
    }

    public void resolveImageLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$resolveImageLayout, OFFSET$resolveImageLayout, value);
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

    public VkClearValue clearValue() {
        return new VkClearValue(segment.asSlice(OFFSET$clearValue, LAYOUT$clearValue));
    }

    public void clearValue(VkClearValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$clearValue, SIZE$clearValue);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.JAVA_INT.withName("imageLayout"),
        ValueLayout.JAVA_INT.withName("resolveMode"),
        ValueLayout.ADDRESS.withName("resolveImageView"),
        ValueLayout.JAVA_INT.withName("resolveImageLayout"),
        ValueLayout.JAVA_INT.withName("loadOp"),
        ValueLayout.JAVA_INT.withName("storeOp"),
        VkClearValue.LAYOUT.withName("clearValue")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$imageView = PathElement.groupElement("PATH$imageView");
    public static final PathElement PATH$imageLayout = PathElement.groupElement("PATH$imageLayout");
    public static final PathElement PATH$resolveMode = PathElement.groupElement("PATH$resolveMode");
    public static final PathElement PATH$resolveImageView = PathElement.groupElement("PATH$resolveImageView");
    public static final PathElement PATH$resolveImageLayout = PathElement.groupElement("PATH$resolveImageLayout");
    public static final PathElement PATH$loadOp = PathElement.groupElement("PATH$loadOp");
    public static final PathElement PATH$storeOp = PathElement.groupElement("PATH$storeOp");
    public static final PathElement PATH$clearValue = PathElement.groupElement("PATH$clearValue");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$imageView = (AddressLayout) LAYOUT.select(PATH$imageView);
    public static final OfInt LAYOUT$imageLayout = (OfInt) LAYOUT.select(PATH$imageLayout);
    public static final OfInt LAYOUT$resolveMode = (OfInt) LAYOUT.select(PATH$resolveMode);
    public static final AddressLayout LAYOUT$resolveImageView = (AddressLayout) LAYOUT.select(PATH$resolveImageView);
    public static final OfInt LAYOUT$resolveImageLayout = (OfInt) LAYOUT.select(PATH$resolveImageLayout);
    public static final OfInt LAYOUT$loadOp = (OfInt) LAYOUT.select(PATH$loadOp);
    public static final OfInt LAYOUT$storeOp = (OfInt) LAYOUT.select(PATH$storeOp);
    public static final StructLayout LAYOUT$clearValue = (StructLayout) LAYOUT.select(PATH$clearValue);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$imageView = LAYOUT$imageView.byteSize();
    public static final long SIZE$imageLayout = LAYOUT$imageLayout.byteSize();
    public static final long SIZE$resolveMode = LAYOUT$resolveMode.byteSize();
    public static final long SIZE$resolveImageView = LAYOUT$resolveImageView.byteSize();
    public static final long SIZE$resolveImageLayout = LAYOUT$resolveImageLayout.byteSize();
    public static final long SIZE$loadOp = LAYOUT$loadOp.byteSize();
    public static final long SIZE$storeOp = LAYOUT$storeOp.byteSize();
    public static final long SIZE$clearValue = LAYOUT$clearValue.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageView = LAYOUT.byteOffset(PATH$imageView);
    public static final long OFFSET$imageLayout = LAYOUT.byteOffset(PATH$imageLayout);
    public static final long OFFSET$resolveMode = LAYOUT.byteOffset(PATH$resolveMode);
    public static final long OFFSET$resolveImageView = LAYOUT.byteOffset(PATH$resolveImageView);
    public static final long OFFSET$resolveImageLayout = LAYOUT.byteOffset(PATH$resolveImageLayout);
    public static final long OFFSET$loadOp = LAYOUT.byteOffset(PATH$loadOp);
    public static final long OFFSET$storeOp = LAYOUT.byteOffset(PATH$storeOp);
    public static final long OFFSET$clearValue = LAYOUT.byteOffset(PATH$clearValue);
}
