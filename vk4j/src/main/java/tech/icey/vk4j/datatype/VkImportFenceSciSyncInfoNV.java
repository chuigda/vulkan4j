package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkImportFenceSciSyncInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkFence fence;
///     VkExternalFenceHandleTypeFlagBits handleType;
///     void* handle;
/// } VkImportFenceSciSyncInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImportFenceSciSyncInfoNV.html">VkImportFenceSciSyncInfoNV</a>
public record VkImportFenceSciSyncInfoNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("fence"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.ADDRESS.withName("handle")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fence = PathElement.groupElement("fence");
    public static final PathElement PATH$handleType = PathElement.groupElement("handleType");
    public static final PathElement PATH$handle = PathElement.groupElement("handle");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$fence = (AddressLayout) LAYOUT.select(PATH$fence);
    public static final OfInt LAYOUT$handleType = (OfInt) LAYOUT.select(PATH$handleType);
    public static final AddressLayout LAYOUT$handle = (AddressLayout) LAYOUT.select(PATH$handle);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fence = LAYOUT.byteOffset(PATH$fence);
    public static final long OFFSET$handleType = LAYOUT.byteOffset(PATH$handleType);
    public static final long OFFSET$handle = LAYOUT.byteOffset(PATH$handle);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fence = LAYOUT$fence.byteSize();
    public static final long SIZE$handleType = LAYOUT$handleType.byteSize();
    public static final long SIZE$handle = LAYOUT$handle.byteSize();

    public VkImportFenceSciSyncInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMPORT_FENCE_SCI_SYNC_INFO_NV);
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

    public VkFence fence() {
        return new VkFence(segment.get(LAYOUT$fence, OFFSET$fence));
    }

    public void fence(VkFence value) {
        segment.set(LAYOUT$fence, OFFSET$fence, value.segment());
    }

    public @enumtype(VkExternalFenceHandleTypeFlags.class) int handleType() {
        return segment.get(LAYOUT$handleType, OFFSET$handleType);
    }

    public void handleType(@enumtype(VkExternalFenceHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$handleType, OFFSET$handleType, value);
    }

    public @pointer(comment="void*") MemorySegment handle() {
        return segment.get(LAYOUT$handle, OFFSET$handle);
    }

    public void handle(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$handle, OFFSET$handle, value);
    }

    public void handle(IPointer pointer) {
        handle(pointer.segment());
    }

    public static VkImportFenceSciSyncInfoNV allocate(Arena arena) {
        return new VkImportFenceSciSyncInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkImportFenceSciSyncInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportFenceSciSyncInfoNV[] ret = new VkImportFenceSciSyncInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImportFenceSciSyncInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
