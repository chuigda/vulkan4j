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
/// typedef struct VkImportMemoryBufferCollectionFUCHSIA {
///     VkStructureType sType;
///     const void* pNext;
///     VkBufferCollectionFUCHSIA collection;
///     uint32_t index;
/// } VkImportMemoryBufferCollectionFUCHSIA;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImportMemoryBufferCollectionFUCHSIA.html">VkImportMemoryBufferCollectionFUCHSIA</a>
public record VkImportMemoryBufferCollectionFUCHSIA(MemorySegment segment) implements IPointer {
    public VkImportMemoryBufferCollectionFUCHSIA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMPORT_MEMORY_BUFFER_COLLECTION_FUCHSIA);
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

    public @Nullable VkBufferCollectionFUCHSIA collection() {
        MemorySegment s = segment.get(LAYOUT$collection, OFFSET$collection);
        if (s.address() == 0) {
            return null;
        }
        return new VkBufferCollectionFUCHSIA(s);
    }

    public void collection(@Nullable VkBufferCollectionFUCHSIA value) {
        segment.set(
            LAYOUT$collection,
            OFFSET$collection,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned int index() {
        return segment.get(LAYOUT$index, OFFSET$index);
    }

    public void index(@unsigned int value) {
        segment.set(LAYOUT$index, OFFSET$index, value);
    }

    public static VkImportMemoryBufferCollectionFUCHSIA allocate(Arena arena) {
        return new VkImportMemoryBufferCollectionFUCHSIA(arena.allocate(LAYOUT));
    }

    public static VkImportMemoryBufferCollectionFUCHSIA[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportMemoryBufferCollectionFUCHSIA[] ret = new VkImportMemoryBufferCollectionFUCHSIA[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImportMemoryBufferCollectionFUCHSIA(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImportMemoryBufferCollectionFUCHSIA clone(Arena arena, VkImportMemoryBufferCollectionFUCHSIA src) {
        VkImportMemoryBufferCollectionFUCHSIA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImportMemoryBufferCollectionFUCHSIA[] clone(Arena arena, VkImportMemoryBufferCollectionFUCHSIA[] src) {
        VkImportMemoryBufferCollectionFUCHSIA[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("collection"),
        ValueLayout.JAVA_INT.withName("index")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$collection = PathElement.groupElement("collection");
    public static final PathElement PATH$index = PathElement.groupElement("index");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$collection = (AddressLayout) LAYOUT.select(PATH$collection);
    public static final OfInt LAYOUT$index = (OfInt) LAYOUT.select(PATH$index);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$collection = LAYOUT.byteOffset(PATH$collection);
    public static final long OFFSET$index = LAYOUT.byteOffset(PATH$index);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$collection = LAYOUT$collection.byteSize();
    public static final long SIZE$index = LAYOUT$index.byteSize();
}
