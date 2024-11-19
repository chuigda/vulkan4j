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
/// typedef struct VkImportMemorySciBufInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkExternalMemoryHandleTypeFlagBits handleType;
///     NvSciBufObj handle;
/// } VkImportMemorySciBufInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImportMemorySciBufInfoNV.html">VkImportMemorySciBufInfoNV</a>
public record VkImportMemorySciBufInfoNV(MemorySegment segment) implements IPointer {
    public VkImportMemorySciBufInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMPORT_MEMORY_SCI_BUF_INFO_NV);
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

    public @enumtype(VkExternalMemoryHandleTypeFlags.class) int handleType() {
        return segment.get(LAYOUT$handleType, OFFSET$handleType);
    }

    public void handleType(@enumtype(VkExternalMemoryHandleTypeFlags.class) int value) {
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

    public static VkImportMemorySciBufInfoNV allocate(Arena arena) {
        return new VkImportMemorySciBufInfoNV(arena.allocate(LAYOUT));
    }

    public static VkImportMemorySciBufInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportMemorySciBufInfoNV[] ret = new VkImportMemorySciBufInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImportMemorySciBufInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImportMemorySciBufInfoNV clone(Arena arena, VkImportMemorySciBufInfoNV src) {
        VkImportMemorySciBufInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImportMemorySciBufInfoNV[] clone(Arena arena, VkImportMemorySciBufInfoNV[] src) {
        VkImportMemorySciBufInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("handleType"),
        ValueLayout.ADDRESS.withName("handle")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$handleType = PathElement.groupElement("handleType");
    public static final PathElement PATH$handle = PathElement.groupElement("handle");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$handleType = (OfInt) LAYOUT.select(PATH$handleType);
    public static final AddressLayout LAYOUT$handle = (AddressLayout) LAYOUT.select(PATH$handle);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$handleType = LAYOUT.byteOffset(PATH$handleType);
    public static final long OFFSET$handle = LAYOUT.byteOffset(PATH$handle);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$handleType = LAYOUT$handleType.byteSize();
    public static final long SIZE$handle = LAYOUT$handle.byteSize();
}
