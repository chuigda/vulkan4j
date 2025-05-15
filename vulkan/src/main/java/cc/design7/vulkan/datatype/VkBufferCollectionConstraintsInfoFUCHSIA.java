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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBufferCollectionConstraintsInfoFUCHSIA.html">VkBufferCollectionConstraintsInfoFUCHSIA</a>
@ValueBasedCandidate
public record VkBufferCollectionConstraintsInfoFUCHSIA(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$minBufferCount = ValueLayout.JAVA_INT.withName("minBufferCount");
    public static final OfInt LAYOUT$maxBufferCount = ValueLayout.JAVA_INT.withName("maxBufferCount");
    public static final OfInt LAYOUT$minBufferCountForCamping = ValueLayout.JAVA_INT.withName("minBufferCountForCamping");
    public static final OfInt LAYOUT$minBufferCountForDedicatedSlack = ValueLayout.JAVA_INT.withName("minBufferCountForDedicatedSlack");
    public static final OfInt LAYOUT$minBufferCountForSharedSlack = ValueLayout.JAVA_INT.withName("minBufferCountForSharedSlack");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$minBufferCount, LAYOUT$maxBufferCount, LAYOUT$minBufferCountForCamping, LAYOUT$minBufferCountForDedicatedSlack, LAYOUT$minBufferCountForSharedSlack);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkBufferCollectionConstraintsInfoFUCHSIA allocate(Arena arena) {
        return new VkBufferCollectionConstraintsInfoFUCHSIA(arena.allocate(LAYOUT));
    }

    public static VkBufferCollectionConstraintsInfoFUCHSIA[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBufferCollectionConstraintsInfoFUCHSIA[] ret = new VkBufferCollectionConstraintsInfoFUCHSIA[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBufferCollectionConstraintsInfoFUCHSIA(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBufferCollectionConstraintsInfoFUCHSIA clone(Arena arena, VkBufferCollectionConstraintsInfoFUCHSIA src) {
        VkBufferCollectionConstraintsInfoFUCHSIA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBufferCollectionConstraintsInfoFUCHSIA[] clone(Arena arena, VkBufferCollectionConstraintsInfoFUCHSIA[] src) {
        VkBufferCollectionConstraintsInfoFUCHSIA[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$minBufferCount = PathElement.groupElement("PATH$minBufferCount");
    public static final PathElement PATH$maxBufferCount = PathElement.groupElement("PATH$maxBufferCount");
    public static final PathElement PATH$minBufferCountForCamping = PathElement.groupElement("PATH$minBufferCountForCamping");
    public static final PathElement PATH$minBufferCountForDedicatedSlack = PathElement.groupElement("PATH$minBufferCountForDedicatedSlack");
    public static final PathElement PATH$minBufferCountForSharedSlack = PathElement.groupElement("PATH$minBufferCountForSharedSlack");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$minBufferCount = LAYOUT$minBufferCount.byteSize();
    public static final long SIZE$maxBufferCount = LAYOUT$maxBufferCount.byteSize();
    public static final long SIZE$minBufferCountForCamping = LAYOUT$minBufferCountForCamping.byteSize();
    public static final long SIZE$minBufferCountForDedicatedSlack = LAYOUT$minBufferCountForDedicatedSlack.byteSize();
    public static final long SIZE$minBufferCountForSharedSlack = LAYOUT$minBufferCountForSharedSlack.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minBufferCount = LAYOUT.byteOffset(PATH$minBufferCount);
    public static final long OFFSET$maxBufferCount = LAYOUT.byteOffset(PATH$maxBufferCount);
    public static final long OFFSET$minBufferCountForCamping = LAYOUT.byteOffset(PATH$minBufferCountForCamping);
    public static final long OFFSET$minBufferCountForDedicatedSlack = LAYOUT.byteOffset(PATH$minBufferCountForDedicatedSlack);
    public static final long OFFSET$minBufferCountForSharedSlack = LAYOUT.byteOffset(PATH$minBufferCountForSharedSlack);

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

    public @unsigned int minBufferCount() {
        return segment.get(LAYOUT$minBufferCount, OFFSET$minBufferCount);
    }

    public void minBufferCount(@unsigned int value) {
        segment.set(LAYOUT$minBufferCount, OFFSET$minBufferCount, value);
    }

    public @unsigned int maxBufferCount() {
        return segment.get(LAYOUT$maxBufferCount, OFFSET$maxBufferCount);
    }

    public void maxBufferCount(@unsigned int value) {
        segment.set(LAYOUT$maxBufferCount, OFFSET$maxBufferCount, value);
    }

    public @unsigned int minBufferCountForCamping() {
        return segment.get(LAYOUT$minBufferCountForCamping, OFFSET$minBufferCountForCamping);
    }

    public void minBufferCountForCamping(@unsigned int value) {
        segment.set(LAYOUT$minBufferCountForCamping, OFFSET$minBufferCountForCamping, value);
    }

    public @unsigned int minBufferCountForDedicatedSlack() {
        return segment.get(LAYOUT$minBufferCountForDedicatedSlack, OFFSET$minBufferCountForDedicatedSlack);
    }

    public void minBufferCountForDedicatedSlack(@unsigned int value) {
        segment.set(LAYOUT$minBufferCountForDedicatedSlack, OFFSET$minBufferCountForDedicatedSlack, value);
    }

    public @unsigned int minBufferCountForSharedSlack() {
        return segment.get(LAYOUT$minBufferCountForSharedSlack, OFFSET$minBufferCountForSharedSlack);
    }

    public void minBufferCountForSharedSlack(@unsigned int value) {
        segment.set(LAYOUT$minBufferCountForSharedSlack, OFFSET$minBufferCountForSharedSlack, value);
    }

}
