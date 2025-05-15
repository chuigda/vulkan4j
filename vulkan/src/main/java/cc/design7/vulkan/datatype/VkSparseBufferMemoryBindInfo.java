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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseBufferMemoryBindInfo.html">VkSparseBufferMemoryBindInfo</a>
@ValueBasedCandidate
public record VkSparseBufferMemoryBindInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final AddressLayout LAYOUT$buffer = ValueLayout.ADDRESS.withName("buffer");
    public static final OfInt LAYOUT$bindCount = ValueLayout.JAVA_INT.withName("bindCount");
    public static final AddressLayout LAYOUT$pBinds = ValueLayout.ADDRESS.withTargetLayout(VkSparseMemoryBind.LAYOUT).withName("pBinds");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$buffer, LAYOUT$bindCount, LAYOUT$pBinds);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSparseBufferMemoryBindInfo allocate(Arena arena) {
        return new VkSparseBufferMemoryBindInfo(arena.allocate(LAYOUT));
    }

    public static VkSparseBufferMemoryBindInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseBufferMemoryBindInfo[] ret = new VkSparseBufferMemoryBindInfo[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$buffer = PathElement.groupElement("PATH$buffer");
    public static final PathElement PATH$bindCount = PathElement.groupElement("PATH$bindCount");
    public static final PathElement PATH$pBinds = PathElement.groupElement("PATH$pBinds");

    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();
    public static final long SIZE$bindCount = LAYOUT$bindCount.byteSize();
    public static final long SIZE$pBinds = LAYOUT$pBinds.byteSize();

    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$bindCount = LAYOUT.byteOffset(PATH$bindCount);
    public static final long OFFSET$pBinds = LAYOUT.byteOffset(PATH$pBinds);

    public @Nullable VkBuffer buffer() {
        MemorySegment s = segment.asSlice(OFFSET$buffer, SIZE$buffer);
        if (s.address() == 0) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void buffer(@Nullable VkBuffer value) {
        segment.set(LAYOUT$buffer, OFFSET$buffer, value != null ? value.segment() : MemorySegment.NULL);
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

    public @Nullable VkSparseMemoryBind pBinds() {
        MemorySegment s = pBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseMemoryBind(s);
    }

    public void pBinds(@Nullable VkSparseMemoryBind value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBindsRaw(s);
    }

    @unsafe public @Nullable VkSparseMemoryBind[] pBinds(int assumedCount) {
        MemorySegment s = pBindsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSparseMemoryBind.SIZE);
        VkSparseMemoryBind[] ret = new VkSparseMemoryBind[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSparseMemoryBind(s.asSlice(i * VkSparseMemoryBind.SIZE, VkSparseMemoryBind.SIZE));
        }
        return ret;
    }

}
