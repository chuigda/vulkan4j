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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBufferCollectionBufferCreateInfoFUCHSIA.html">VkBufferCollectionBufferCreateInfoFUCHSIA</a>
@ValueBasedCandidate
public record VkBufferCollectionBufferCreateInfoFUCHSIA(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$collection = ValueLayout.ADDRESS.withName("collection");
    public static final OfInt LAYOUT$index = ValueLayout.JAVA_INT.withName("index");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$collection, LAYOUT$index);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkBufferCollectionBufferCreateInfoFUCHSIA allocate(Arena arena) {
        return new VkBufferCollectionBufferCreateInfoFUCHSIA(arena.allocate(LAYOUT));
    }

    public static VkBufferCollectionBufferCreateInfoFUCHSIA[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBufferCollectionBufferCreateInfoFUCHSIA[] ret = new VkBufferCollectionBufferCreateInfoFUCHSIA[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBufferCollectionBufferCreateInfoFUCHSIA(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$collection = PathElement.groupElement("PATH$collection");
    public static final PathElement PATH$index = PathElement.groupElement("PATH$index");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$collection = LAYOUT$collection.byteSize();
    public static final long SIZE$index = LAYOUT$index.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$collection = LAYOUT.byteOffset(PATH$collection);
    public static final long OFFSET$index = LAYOUT.byteOffset(PATH$index);

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
        if (s.address() == 0) {
            return null;
        }
        return new VkBufferCollectionFUCHSIA(s);
    }

    public void collection() {
        segment.set(LAYOUT$collection, OFFSET$collection, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int index() {
        return segment.get(LAYOUT$index, OFFSET$index);
    }

    public void index(@unsigned int value) {
        segment.set(LAYOUT$index, OFFSET$index, value);
    }

}
