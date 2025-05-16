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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoPictureResourceInfoKHR.html"><code>VkVideoPictureResourceInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoPictureResourceInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkOffset2D codedOffset;
///     VkExtent2D codedExtent;
///     uint32_t baseArrayLayer;
///     VkImageView imageViewBinding;
/// } VkVideoPictureResourceInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_PICTURE_RESOURCE_INFO_KHR`
///
/// The {@link VkVideoPictureResourceInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoPictureResourceInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoPictureResourceInfoKHR.html"><code>VkVideoPictureResourceInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoPictureResourceInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoPictureResourceInfoKHR allocate(Arena arena) {
        VkVideoPictureResourceInfoKHR ret = new VkVideoPictureResourceInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_PICTURE_RESOURCE_INFO_KHR);
        return ret;
    }

    public static VkVideoPictureResourceInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoPictureResourceInfoKHR[] ret = new VkVideoPictureResourceInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoPictureResourceInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_PICTURE_RESOURCE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoPictureResourceInfoKHR clone(Arena arena, VkVideoPictureResourceInfoKHR src) {
        VkVideoPictureResourceInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoPictureResourceInfoKHR[] clone(Arena arena, VkVideoPictureResourceInfoKHR[] src) {
        VkVideoPictureResourceInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_PICTURE_RESOURCE_INFO_KHR);
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

    public VkOffset2D codedOffset() {
        return new VkOffset2D(segment.asSlice(OFFSET$codedOffset, LAYOUT$codedOffset));
    }

    public void codedOffset(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$codedOffset, SIZE$codedOffset);
    }

    public VkExtent2D codedExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$codedExtent, LAYOUT$codedExtent));
    }

    public void codedExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$codedExtent, SIZE$codedExtent);
    }

    public @unsigned int baseArrayLayer() {
        return segment.get(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer);
    }

    public void baseArrayLayer(@unsigned int value) {
        segment.set(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer, value);
    }

    public @Nullable VkImageView imageViewBinding() {
        MemorySegment s = segment.asSlice(OFFSET$imageViewBinding, SIZE$imageViewBinding);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkImageView(s);
    }

    public void imageViewBinding(@Nullable VkImageView value) {
        segment.set(LAYOUT$imageViewBinding, OFFSET$imageViewBinding, value != null ? value.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkOffset2D.LAYOUT.withName("codedOffset"),
        VkExtent2D.LAYOUT.withName("codedExtent"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.ADDRESS.withName("imageViewBinding")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$codedOffset = PathElement.groupElement("PATH$codedOffset");
    public static final PathElement PATH$codedExtent = PathElement.groupElement("PATH$codedExtent");
    public static final PathElement PATH$baseArrayLayer = PathElement.groupElement("PATH$baseArrayLayer");
    public static final PathElement PATH$imageViewBinding = PathElement.groupElement("PATH$imageViewBinding");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$codedOffset = (StructLayout) LAYOUT.select(PATH$codedOffset);
    public static final StructLayout LAYOUT$codedExtent = (StructLayout) LAYOUT.select(PATH$codedExtent);
    public static final OfInt LAYOUT$baseArrayLayer = (OfInt) LAYOUT.select(PATH$baseArrayLayer);
    public static final AddressLayout LAYOUT$imageViewBinding = (AddressLayout) LAYOUT.select(PATH$imageViewBinding);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$codedOffset = LAYOUT$codedOffset.byteSize();
    public static final long SIZE$codedExtent = LAYOUT$codedExtent.byteSize();
    public static final long SIZE$baseArrayLayer = LAYOUT$baseArrayLayer.byteSize();
    public static final long SIZE$imageViewBinding = LAYOUT$imageViewBinding.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$codedOffset = LAYOUT.byteOffset(PATH$codedOffset);
    public static final long OFFSET$codedExtent = LAYOUT.byteOffset(PATH$codedExtent);
    public static final long OFFSET$baseArrayLayer = LAYOUT.byteOffset(PATH$baseArrayLayer);
    public static final long OFFSET$imageViewBinding = LAYOUT.byteOffset(PATH$imageViewBinding);
}
