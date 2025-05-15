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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBaseInStructure.html">VkBaseInStructure</a>
@ValueBasedCandidate
public record VkBaseInStructure(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withTargetLayout(VkBaseInStructure.LAYOUT).withName("pNext");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkBaseInStructure allocate(Arena arena) {
        return new VkBaseInStructure(arena.allocate(LAYOUT));
    }

    public static VkBaseInStructure[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBaseInStructure[] ret = new VkBaseInStructure[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBaseInStructure(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBaseInStructure clone(Arena arena, VkBaseInStructure src) {
        VkBaseInStructure ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBaseInStructure[] clone(Arena arena, VkBaseInStructure[] src) {
        VkBaseInStructure[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="VkBaseInStructure*") MemorySegment pNextRaw() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNextRaw(@pointer(comment="VkBaseInStructure*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public @Nullable VkBaseInStructure pNext() {
        MemorySegment s = pNextRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBaseInStructure(s);
    }

    public void pNext(@Nullable VkBaseInStructure value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pNextRaw(s);
    }

    @unsafe public @Nullable VkBaseInStructure[] pNext(int assumedCount) {
        MemorySegment s = pNextRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkBaseInStructure.SIZE);
        VkBaseInStructure[] ret = new VkBaseInStructure[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkBaseInStructure(s.asSlice(i * VkBaseInStructure.SIZE, VkBaseInStructure.SIZE));
        }
        return ret;
    }

}
