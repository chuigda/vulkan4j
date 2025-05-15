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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseImageOpaqueMemoryBindInfo.html">VkSparseImageOpaqueMemoryBindInfo</a>
@ValueBasedCandidate
public record VkSparseImageOpaqueMemoryBindInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final AddressLayout LAYOUT$image = ValueLayout.ADDRESS.withName("image");
    public static final OfInt LAYOUT$bindCount = ValueLayout.JAVA_INT.withName("bindCount");
    public static final AddressLayout LAYOUT$pBinds = ValueLayout.ADDRESS.withTargetLayout(VkSparseMemoryBind.LAYOUT).withName("pBinds");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$image, LAYOUT$bindCount, LAYOUT$pBinds);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSparseImageOpaqueMemoryBindInfo allocate(Arena arena) {
        return new VkSparseImageOpaqueMemoryBindInfo(arena.allocate(LAYOUT));
    }

    public static VkSparseImageOpaqueMemoryBindInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseImageOpaqueMemoryBindInfo[] ret = new VkSparseImageOpaqueMemoryBindInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSparseImageOpaqueMemoryBindInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSparseImageOpaqueMemoryBindInfo clone(Arena arena, VkSparseImageOpaqueMemoryBindInfo src) {
        VkSparseImageOpaqueMemoryBindInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSparseImageOpaqueMemoryBindInfo[] clone(Arena arena, VkSparseImageOpaqueMemoryBindInfo[] src) {
        VkSparseImageOpaqueMemoryBindInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$image = PathElement.groupElement("PATH$image");
    public static final PathElement PATH$bindCount = PathElement.groupElement("PATH$bindCount");
    public static final PathElement PATH$pBinds = PathElement.groupElement("PATH$pBinds");

    public static final long SIZE$image = LAYOUT$image.byteSize();
    public static final long SIZE$bindCount = LAYOUT$bindCount.byteSize();
    public static final long SIZE$pBinds = LAYOUT$pBinds.byteSize();

    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$bindCount = LAYOUT.byteOffset(PATH$bindCount);
    public static final long OFFSET$pBinds = LAYOUT.byteOffset(PATH$pBinds);

    public @Nullable VkImage image() {
        MemorySegment s = segment.asSlice(OFFSET$image, SIZE$image);
        if (s.address() == 0) {
            return null;
        }
        return new VkImage(s);
    }

    public void image(@Nullable VkImage value) {
        segment.set(LAYOUT$image, OFFSET$image, value != null ? value.segment() : MemorySegment.NULL);
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
