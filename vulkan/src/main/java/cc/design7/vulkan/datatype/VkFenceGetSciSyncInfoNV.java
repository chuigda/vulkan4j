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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFenceGetSciSyncInfoNV.html">VkFenceGetSciSyncInfoNV</a>
@ValueBasedCandidate
public record VkFenceGetSciSyncInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$fence = ValueLayout.ADDRESS.withName("fence");
    public static final OfInt LAYOUT$handleType = ValueLayout.JAVA_INT.withName("handleType");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$fence, LAYOUT$handleType);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkFenceGetSciSyncInfoNV allocate(Arena arena) {
        return new VkFenceGetSciSyncInfoNV(arena.allocate(LAYOUT));
    }

    public static VkFenceGetSciSyncInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFenceGetSciSyncInfoNV[] ret = new VkFenceGetSciSyncInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkFenceGetSciSyncInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkFenceGetSciSyncInfoNV clone(Arena arena, VkFenceGetSciSyncInfoNV src) {
        VkFenceGetSciSyncInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkFenceGetSciSyncInfoNV[] clone(Arena arena, VkFenceGetSciSyncInfoNV[] src) {
        VkFenceGetSciSyncInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$fence = PathElement.groupElement("PATH$fence");
    public static final PathElement PATH$handleType = PathElement.groupElement("PATH$handleType");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fence = LAYOUT$fence.byteSize();
    public static final long SIZE$handleType = LAYOUT$handleType.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fence = LAYOUT.byteOffset(PATH$fence);
    public static final long OFFSET$handleType = LAYOUT.byteOffset(PATH$handleType);

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

    public @Nullable VkFence fence() {
        MemorySegment s = segment.asSlice(OFFSET$fence, SIZE$fence);
        if (s.address() == 0) {
            return null;
        }
        return new VkFence(s);
    }

    public void fence(@Nullable VkFence value) {
        segment.set(LAYOUT$fence, OFFSET$fence, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkExternalFenceHandleTypeFlags.class) int handleType() {
        return segment.get(LAYOUT$handleType, OFFSET$handleType);
    }

    public void handleType(@enumtype(VkExternalFenceHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$handleType, OFFSET$handleType, value);
    }

}
