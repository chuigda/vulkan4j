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
/// typedef struct VkImportSemaphoreSciSyncInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkSemaphore semaphore;
///     VkExternalSemaphoreHandleTypeFlagBits handleType;
///     void* handle;
/// } VkImportSemaphoreSciSyncInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImportSemaphoreSciSyncInfoNV.html">VkImportSemaphoreSciSyncInfoNV</a>
public record VkImportSemaphoreSciSyncInfoNV(MemorySegment segment) implements IPointer {
    public VkImportSemaphoreSciSyncInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_SCI_SYNC_INFO_NV);
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

    public @Nullable VkSemaphore semaphore() {
        MemorySegment s = segment.get(LAYOUT$semaphore, OFFSET$semaphore);
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore(s);
    }

    public void semaphore(@Nullable VkSemaphore value) {
        segment.set(
            LAYOUT$semaphore,
            OFFSET$semaphore,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @enumtype(VkExternalSemaphoreHandleTypeFlags.class) int handleType() {
        return segment.get(LAYOUT$handleType, OFFSET$handleType);
    }

    public void handleType(@enumtype(VkExternalSemaphoreHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$handleType, OFFSET$handleType, value);
    }

    public @pointer(comment="void*") MemorySegment handle() {
        return segment.get(LAYOUT$handle, OFFSET$handle);
    }

    public void handle(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$handle, OFFSET$handle, value);
    }

    public void handle(@Nullable IPointer pointer) {
        handle(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public static VkImportSemaphoreSciSyncInfoNV allocate(Arena arena) {
        return new VkImportSemaphoreSciSyncInfoNV(arena.allocate(LAYOUT));
    }

    public static VkImportSemaphoreSciSyncInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportSemaphoreSciSyncInfoNV[] ret = new VkImportSemaphoreSciSyncInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImportSemaphoreSciSyncInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImportSemaphoreSciSyncInfoNV clone(Arena arena, VkImportSemaphoreSciSyncInfoNV src) {
        VkImportSemaphoreSciSyncInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImportSemaphoreSciSyncInfoNV[] clone(Arena arena, VkImportSemaphoreSciSyncInfoNV[] src) {
        VkImportSemaphoreSciSyncInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.ADDRESS.withName("handle")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$semaphore = PathElement.groupElement("semaphore");
    public static final PathElement PATH$handleType = PathElement.groupElement("handleType");
    public static final PathElement PATH$handle = PathElement.groupElement("handle");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$semaphore = (AddressLayout) LAYOUT.select(PATH$semaphore);
    public static final OfInt LAYOUT$handleType = (OfInt) LAYOUT.select(PATH$handleType);
    public static final AddressLayout LAYOUT$handle = (AddressLayout) LAYOUT.select(PATH$handle);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$semaphore = LAYOUT.byteOffset(PATH$semaphore);
    public static final long OFFSET$handleType = LAYOUT.byteOffset(PATH$handleType);
    public static final long OFFSET$handle = LAYOUT.byteOffset(PATH$handle);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$semaphore = LAYOUT$semaphore.byteSize();
    public static final long SIZE$handleType = LAYOUT$handleType.byteSize();
    public static final long SIZE$handle = LAYOUT$handle.byteSize();
}
