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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRefreshObjectListKHR.html">VkRefreshObjectListKHR</a>
@ValueBasedCandidate
public record VkRefreshObjectListKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$objectCount = ValueLayout.JAVA_INT.withName("objectCount");
    public static final AddressLayout LAYOUT$pObjects = ValueLayout.ADDRESS.withTargetLayout(VkRefreshObjectKHR.LAYOUT).withName("pObjects");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$objectCount, LAYOUT$pObjects);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkRefreshObjectListKHR allocate(Arena arena) {
        return new VkRefreshObjectListKHR(arena.allocate(LAYOUT));
    }

    public static VkRefreshObjectListKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRefreshObjectListKHR[] ret = new VkRefreshObjectListKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRefreshObjectListKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRefreshObjectListKHR clone(Arena arena, VkRefreshObjectListKHR src) {
        VkRefreshObjectListKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRefreshObjectListKHR[] clone(Arena arena, VkRefreshObjectListKHR[] src) {
        VkRefreshObjectListKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$objectCount = PathElement.groupElement("PATH$objectCount");
    public static final PathElement PATH$pObjects = PathElement.groupElement("PATH$pObjects");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$objectCount = LAYOUT$objectCount.byteSize();
    public static final long SIZE$pObjects = LAYOUT$pObjects.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$objectCount = LAYOUT.byteOffset(PATH$objectCount);
    public static final long OFFSET$pObjects = LAYOUT.byteOffset(PATH$pObjects);

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

    public @unsigned int objectCount() {
        return segment.get(LAYOUT$objectCount, OFFSET$objectCount);
    }

    public void objectCount(@unsigned int value) {
        segment.set(LAYOUT$objectCount, OFFSET$objectCount, value);
    }

    public @pointer(comment="VkRefreshObjectKHR*") MemorySegment pObjectsRaw() {
        return segment.get(LAYOUT$pObjects, OFFSET$pObjects);
    }

    public void pObjectsRaw(@pointer(comment="VkRefreshObjectKHR*") MemorySegment value) {
        segment.set(LAYOUT$pObjects, OFFSET$pObjects, value);
    }

    public @Nullable VkRefreshObjectKHR pObjects() {
        MemorySegment s = pObjectsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRefreshObjectKHR(s);
    }

    public void pObjects(@Nullable VkRefreshObjectKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pObjectsRaw(s);
    }

    @unsafe public @Nullable VkRefreshObjectKHR[] pObjects(int assumedCount) {
        MemorySegment s = pObjectsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRefreshObjectKHR.SIZE);
        VkRefreshObjectKHR[] ret = new VkRefreshObjectKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRefreshObjectKHR(s.asSlice(i * VkRefreshObjectKHR.SIZE, VkRefreshObjectKHR.SIZE));
        }
        return ret;
    }

}
