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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportSemaphoreSciSyncInfoNV.html"><code>VkImportSemaphoreSciSyncInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImportSemaphoreSciSyncInfoNV {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkSemaphore semaphore;
///     VkExternalSemaphoreHandleTypeFlags handleType;
///     void* handle;
/// } VkImportSemaphoreSciSyncInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_SCI_SYNC_INFO_NV`
///
/// The {@link VkImportSemaphoreSciSyncInfoNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkImportSemaphoreSciSyncInfoNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportSemaphoreSciSyncInfoNV.html"><code>VkImportSemaphoreSciSyncInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImportSemaphoreSciSyncInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkImportSemaphoreSciSyncInfoNV allocate(Arena arena) {
        VkImportSemaphoreSciSyncInfoNV ret = new VkImportSemaphoreSciSyncInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMPORT_SEMAPHORE_SCI_SYNC_INFO_NV);
        return ret;
    }

    public static VkImportSemaphoreSciSyncInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportSemaphoreSciSyncInfoNV[] ret = new VkImportSemaphoreSciSyncInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImportSemaphoreSciSyncInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.IMPORT_SEMAPHORE_SCI_SYNC_INFO_NV);
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMPORT_SEMAPHORE_SCI_SYNC_INFO_NV);
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

    public @Nullable VkSemaphore semaphore() {
        MemorySegment s = segment.asSlice(OFFSET$semaphore, SIZE$semaphore);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSemaphore(s);
    }

    public void semaphore(@Nullable VkSemaphore value) {
        segment.set(LAYOUT$semaphore, OFFSET$semaphore, value != null ? value.segment() : MemorySegment.NULL);
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
        handle(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.ADDRESS.withName("handle")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$semaphore = PathElement.groupElement("PATH$semaphore");
    public static final PathElement PATH$handleType = PathElement.groupElement("PATH$handleType");
    public static final PathElement PATH$handle = PathElement.groupElement("PATH$handle");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$semaphore = (AddressLayout) LAYOUT.select(PATH$semaphore);
    public static final OfInt LAYOUT$handleType = (OfInt) LAYOUT.select(PATH$handleType);
    public static final AddressLayout LAYOUT$handle = (AddressLayout) LAYOUT.select(PATH$handle);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$semaphore = LAYOUT$semaphore.byteSize();
    public static final long SIZE$handleType = LAYOUT$handleType.byteSize();
    public static final long SIZE$handle = LAYOUT$handle.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$semaphore = LAYOUT.byteOffset(PATH$semaphore);
    public static final long OFFSET$handleType = LAYOUT.byteOffset(PATH$handleType);
    public static final long OFFSET$handle = LAYOUT.byteOffset(PATH$handle);
}
