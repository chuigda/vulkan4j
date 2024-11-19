package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkImportFenceFdInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkFence fence;
///     VkFenceImportFlags flags;
///     VkExternalFenceHandleTypeFlagBits handleType;
///     int fd;
/// } VkImportFenceFdInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImportFenceFdInfoKHR.html">VkImportFenceFdInfoKHR</a>
public record VkImportFenceFdInfoKHR(MemorySegment segment) implements IPointer {
    public VkImportFenceFdInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @Nullable VkFence fence() {
        MemorySegment s = segment.get(LAYOUT$fence, OFFSET$fence);
        if (s.address() == 0) {
            return null;
        }
        return new VkFence(s);
    }

    public void fence(@Nullable VkFence value) {
        segment.set(
            LAYOUT$fence,
            OFFSET$fence,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @enumtype(VkFenceImportFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkFenceImportFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkExternalFenceHandleTypeFlags.class) int handleType() {
        return segment.get(LAYOUT$handleType, OFFSET$handleType);
    }

    public void handleType(@enumtype(VkExternalFenceHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$handleType, OFFSET$handleType, value);
    }

    public int fd() {
        return segment.get(LAYOUT$fd, OFFSET$fd);
    }

    public void fd(int value) {
        segment.set(LAYOUT$fd, OFFSET$fd, value);
    }

    public static VkImportFenceFdInfoKHR allocate(Arena arena) {
        return new VkImportFenceFdInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkImportFenceFdInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportFenceFdInfoKHR[] ret = new VkImportFenceFdInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImportFenceFdInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImportFenceFdInfoKHR clone(Arena arena, VkImportFenceFdInfoKHR src) {
        VkImportFenceFdInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImportFenceFdInfoKHR[] clone(Arena arena, VkImportFenceFdInfoKHR[] src) {
        VkImportFenceFdInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("fence"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.JAVA_INT.withName("fd")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fence = PathElement.groupElement("fence");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$handleType = PathElement.groupElement("handleType");
    public static final PathElement PATH$fd = PathElement.groupElement("fd");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$fence = (AddressLayout) LAYOUT.select(PATH$fence);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$handleType = (OfInt) LAYOUT.select(PATH$handleType);
    public static final OfInt LAYOUT$fd = (OfInt) LAYOUT.select(PATH$fd);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fence = LAYOUT.byteOffset(PATH$fence);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$handleType = LAYOUT.byteOffset(PATH$handleType);
    public static final long OFFSET$fd = LAYOUT.byteOffset(PATH$fd);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fence = LAYOUT$fence.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$handleType = LAYOUT$handleType.byteSize();
    public static final long SIZE$fd = LAYOUT$fd.byteSize();
}
