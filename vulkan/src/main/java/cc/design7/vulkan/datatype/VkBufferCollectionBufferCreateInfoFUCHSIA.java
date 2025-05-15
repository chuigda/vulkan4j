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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBufferCollectionBufferCreateInfoFUCHSIA.html"><code>VkBufferCollectionBufferCreateInfoFUCHSIA</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBufferCollectionBufferCreateInfoFUCHSIA {
///     VkStructureType sType;
///     void const* pNext;
///     VkBufferCollectionFUCHSIA collection;
///     uint32_t index;
/// } VkBufferCollectionBufferCreateInfoFUCHSIA;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_BUFFER_COLLECTION_BUFFER_CREATE_INFO_FUCHSIA`
///
/// The {@link VkBufferCollectionBufferCreateInfoFUCHSIA#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkBufferCollectionBufferCreateInfoFUCHSIA#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBufferCollectionBufferCreateInfoFUCHSIA.html"><code>VkBufferCollectionBufferCreateInfoFUCHSIA</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBufferCollectionBufferCreateInfoFUCHSIA(@NotNull MemorySegment segment) implements IPointer {
    public static VkBufferCollectionBufferCreateInfoFUCHSIA allocate(Arena arena) {
        VkBufferCollectionBufferCreateInfoFUCHSIA ret = new VkBufferCollectionBufferCreateInfoFUCHSIA(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.BUFFER_COLLECTION_BUFFER_CREATE_INFO_FUCHSIA);
        return ret;
    }

    public static VkBufferCollectionBufferCreateInfoFUCHSIA[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBufferCollectionBufferCreateInfoFUCHSIA[] ret = new VkBufferCollectionBufferCreateInfoFUCHSIA[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBufferCollectionBufferCreateInfoFUCHSIA(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.BUFFER_COLLECTION_BUFFER_CREATE_INFO_FUCHSIA);
        }
        return ret;
    }

    public static VkBufferCollectionBufferCreateInfoFUCHSIA clone(Arena arena, VkBufferCollectionBufferCreateInfoFUCHSIA src) {
        VkBufferCollectionBufferCreateInfoFUCHSIA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBufferCollectionBufferCreateInfoFUCHSIA[] clone(Arena arena, VkBufferCollectionBufferCreateInfoFUCHSIA[] src) {
        VkBufferCollectionBufferCreateInfoFUCHSIA[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.BUFFER_COLLECTION_BUFFER_CREATE_INFO_FUCHSIA);
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

    public @Nullable VkBufferCollectionFUCHSIA collection() {
        MemorySegment s = segment.asSlice(OFFSET$collection, SIZE$collection);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBufferCollectionFUCHSIA(s);
    }

    public void collection(@Nullable VkBufferCollectionFUCHSIA value) {
        segment.set(LAYOUT$collection, OFFSET$collection, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int index() {
        return segment.get(LAYOUT$index, OFFSET$index);
    }

    public void index(@unsigned int value) {
        segment.set(LAYOUT$index, OFFSET$index, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("collection"),
        ValueLayout.JAVA_INT.withName("index")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$collection = PathElement.groupElement("PATH$collection");
    public static final PathElement PATH$index = PathElement.groupElement("PATH$index");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$collection = (AddressLayout) LAYOUT.select(PATH$collection);
    public static final OfInt LAYOUT$index = (OfInt) LAYOUT.select(PATH$index);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$collection = LAYOUT$collection.byteSize();
    public static final long SIZE$index = LAYOUT$index.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$collection = LAYOUT.byteOffset(PATH$collection);
    public static final long OFFSET$index = LAYOUT.byteOffset(PATH$index);
}
