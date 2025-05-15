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

public record VkOpticalFlowSessionCreatePrivateDataInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$id = ValueLayout.JAVA_INT.withName("id");
    public static final OfInt LAYOUT$size = ValueLayout.JAVA_INT.withName("size");
    public static final AddressLayout LAYOUT$pPrivateData = ValueLayout.ADDRESS.withName("pPrivateData");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$id, LAYOUT$size, LAYOUT$pPrivateData);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV allocate(Arena arena) {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(arena.allocate(LAYOUT));
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkOpticalFlowSessionCreatePrivateDataInfoNV[] ret = new VkOpticalFlowSessionCreatePrivateDataInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV clone(Arena arena, VkOpticalFlowSessionCreatePrivateDataInfoNV src) {
        VkOpticalFlowSessionCreatePrivateDataInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV[] clone(Arena arena, VkOpticalFlowSessionCreatePrivateDataInfoNV[] src) {
        VkOpticalFlowSessionCreatePrivateDataInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$id = PathElement.groupElement("PATH$id");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");
    public static final PathElement PATH$pPrivateData = PathElement.groupElement("PATH$pPrivateData");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$id = LAYOUT$id.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$pPrivateData = LAYOUT$pPrivateData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$id = LAYOUT.byteOffset(PATH$id);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$pPrivateData = LAYOUT.byteOffset(PATH$pPrivateData);

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

    public @unsigned int id() {
        return segment.get(LAYOUT$id, OFFSET$id);
    }

    public void id(@unsigned int value) {
        segment.set(LAYOUT$id, OFFSET$id, value);
    }

    public @unsigned int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @pointer(comment="void*") MemorySegment pPrivateData() {
        return segment.get(LAYOUT$pPrivateData, OFFSET$pPrivateData);
    }

    public void pPrivateData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pPrivateData, OFFSET$pPrivateData, value);
    }

    public void pPrivateData(IPointer pointer) {
        pPrivateData(pointer.segment());
    }

}
/// dummy, not implemented yet
