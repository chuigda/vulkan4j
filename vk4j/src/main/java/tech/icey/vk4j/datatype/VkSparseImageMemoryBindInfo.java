package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsafe;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.handle.VkImage;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;

/// {@snippet lang=c :
/// typedef struct VkSparseImageMemoryBindInfo {
///     VkImage image;
///     uint32_t bindCount;
///     const VkSparseImageMemoryBind* pBinds;
/// } VkSparseImageMemoryBindInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSparseImageMemoryBindInfo.html">VkSparseImageMemoryBindInfo</a>
public record VkSparseImageMemoryBindInfo(MemorySegment segment) implements IPointer {
    public VkSparseImageMemoryBindInfo(MemorySegment segment) {
        this.segment = segment;
    }

    public @nullable VkImage image() {
        MemorySegment s = segment.get(LAYOUT$image, OFFSET$image);
        if (s.address() == 0) {
            return null;
        }
        return new VkImage(s);
    }

    public void image(@nullable VkImage value) {
        segment.set(
            LAYOUT$image,
            OFFSET$image,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned int bindCount() {
        return segment.get(LAYOUT$bindCount, OFFSET$bindCount);
    }

    public void bindCount(@unsigned int value) {
        segment.set(LAYOUT$bindCount, OFFSET$bindCount, value);
    }

    public @pointer(comment="VkSparseImageMemoryBind*") MemorySegment pBindsRaw() {
        return segment.get(LAYOUT$pBinds, OFFSET$pBinds);
    }

    public void pBindsRaw(@pointer(comment="VkSparseImageMemoryBind*") MemorySegment value) {
        segment.set(LAYOUT$pBinds, OFFSET$pBinds, value);
    }

    public @nullable VkSparseImageMemoryBind pBinds() {
        MemorySegment s = pBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseImageMemoryBind(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkSparseImageMemoryBind[] pBinds(int assumedCount) {
        MemorySegment s = pBindsRaw().reinterpret(assumedCount * VkSparseImageMemoryBind.SIZE);
        VkSparseImageMemoryBind[] arr = new VkSparseImageMemoryBind[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSparseImageMemoryBind(s.asSlice(i * VkSparseImageMemoryBind.SIZE, VkSparseImageMemoryBind.SIZE));
        }
        return arr;
    }

    public void pBinds(@nullable VkSparseImageMemoryBind value) {
        pBindsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkSparseImageMemoryBindInfo allocate(Arena arena) {
        return new VkSparseImageMemoryBindInfo(arena.allocate(LAYOUT));
    }

    public static VkSparseImageMemoryBindInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseImageMemoryBindInfo[] ret = new VkSparseImageMemoryBindInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSparseImageMemoryBindInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSparseImageMemoryBindInfo clone(Arena arena, VkSparseImageMemoryBindInfo src) {
        VkSparseImageMemoryBindInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSparseImageMemoryBindInfo[] clone(Arena arena, VkSparseImageMemoryBindInfo[] src) {
        VkSparseImageMemoryBindInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.JAVA_INT.withName("bindCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSparseImageMemoryBind.LAYOUT).withName("pBinds")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$image = PathElement.groupElement("image");
    public static final PathElement PATH$bindCount = PathElement.groupElement("bindCount");
    public static final PathElement PATH$pBinds = PathElement.groupElement("pBinds");

    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);
    public static final OfInt LAYOUT$bindCount = (OfInt) LAYOUT.select(PATH$bindCount);
    public static final AddressLayout LAYOUT$pBinds = (AddressLayout) LAYOUT.select(PATH$pBinds);

    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$bindCount = LAYOUT.byteOffset(PATH$bindCount);
    public static final long OFFSET$pBinds = LAYOUT.byteOffset(PATH$pBinds);

    public static final long SIZE$image = LAYOUT$image.byteSize();
    public static final long SIZE$bindCount = LAYOUT$bindCount.byteSize();
    public static final long SIZE$pBinds = LAYOUT$pBinds.byteSize();
}
