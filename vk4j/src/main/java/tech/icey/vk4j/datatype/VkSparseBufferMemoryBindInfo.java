package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsafe;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.handle.VkBuffer;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;

/// {@snippet lang=c :
/// typedef struct VkSparseBufferMemoryBindInfo {
///     VkBuffer buffer;
///     uint32_t bindCount;
///     const VkSparseMemoryBind* pBinds;
/// } VkSparseBufferMemoryBindInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSparseBufferMemoryBindInfo.html">VkSparseBufferMemoryBindInfo</a>
public record VkSparseBufferMemoryBindInfo(MemorySegment segment) implements IPointer {
    public VkSparseBufferMemoryBindInfo(MemorySegment segment) {
        this.segment = segment;
    }

    public @nullable VkBuffer buffer() {
        MemorySegment s = segment.get(LAYOUT$buffer, OFFSET$buffer);
        if (s.address() == 0) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void buffer(@nullable VkBuffer value) {
        segment.set(
            LAYOUT$buffer,
            OFFSET$buffer,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned int bindCount() {
        return segment.get(LAYOUT$bindCount, OFFSET$bindCount);
    }

    public void bindCount(@unsigned int value) {
        segment.set(LAYOUT$bindCount, OFFSET$bindCount, value);
    }

    public @pointer(comment="VkSparseMemoryBind*") MemorySegment pBindsRaw() {
        return segment.get(LAYOUT$pBinds, OFFSET$pBinds);
    }

    public void pBindsRaw(@pointer(comment="VkSparseMemoryBind*") MemorySegment value) {
        segment.set(LAYOUT$pBinds, OFFSET$pBinds, value);
    }

    public @nullable VkSparseMemoryBind pBinds() {
        MemorySegment s = pBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseMemoryBind(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkSparseMemoryBind[] pBinds(int assumedCount) {
        MemorySegment s = pBindsRaw().reinterpret(assumedCount * VkSparseMemoryBind.SIZE);
        VkSparseMemoryBind[] arr = new VkSparseMemoryBind[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSparseMemoryBind(s.asSlice(i * VkSparseMemoryBind.SIZE, VkSparseMemoryBind.SIZE));
        }
        return arr;
    }

    public void pBinds(@nullable VkSparseMemoryBind value) {
        pBindsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkSparseBufferMemoryBindInfo allocate(Arena arena) {
        return new VkSparseBufferMemoryBindInfo(arena.allocate(LAYOUT));
    }

    public static VkSparseBufferMemoryBindInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseBufferMemoryBindInfo[] ret = new VkSparseBufferMemoryBindInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSparseBufferMemoryBindInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSparseBufferMemoryBindInfo clone(Arena arena, VkSparseBufferMemoryBindInfo src) {
        VkSparseBufferMemoryBindInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSparseBufferMemoryBindInfo[] clone(Arena arena, VkSparseBufferMemoryBindInfo[] src) {
        VkSparseBufferMemoryBindInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_INT.withName("bindCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSparseMemoryBind.LAYOUT).withName("pBinds")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$buffer = PathElement.groupElement("buffer");
    public static final PathElement PATH$bindCount = PathElement.groupElement("bindCount");
    public static final PathElement PATH$pBinds = PathElement.groupElement("pBinds");

    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);
    public static final OfInt LAYOUT$bindCount = (OfInt) LAYOUT.select(PATH$bindCount);
    public static final AddressLayout LAYOUT$pBinds = (AddressLayout) LAYOUT.select(PATH$pBinds);

    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$bindCount = LAYOUT.byteOffset(PATH$bindCount);
    public static final long OFFSET$pBinds = LAYOUT.byteOffset(PATH$pBinds);

    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();
    public static final long SIZE$bindCount = LAYOUT$bindCount.byteSize();
    public static final long SIZE$pBinds = LAYOUT$pBinds.byteSize();
}
