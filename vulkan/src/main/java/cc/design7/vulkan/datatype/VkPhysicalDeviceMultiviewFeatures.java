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

public record VkPhysicalDeviceMultiviewFeatures(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$multiview = ValueLayout.JAVA_INT.withName("multiview");
    public static final OfInt LAYOUT$multiviewGeometryShader = ValueLayout.JAVA_INT.withName("multiviewGeometryShader");
    public static final OfInt LAYOUT$multiviewTessellationShader = ValueLayout.JAVA_INT.withName("multiviewTessellationShader");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$multiview, LAYOUT$multiviewGeometryShader, LAYOUT$multiviewTessellationShader);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceMultiviewFeatures allocate(Arena arena) {
        return new VkPhysicalDeviceMultiviewFeatures(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMultiviewFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMultiviewFeatures[] ret = new VkPhysicalDeviceMultiviewFeatures[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMultiviewFeatures(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceMultiviewFeatures clone(Arena arena, VkPhysicalDeviceMultiviewFeatures src) {
        VkPhysicalDeviceMultiviewFeatures ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMultiviewFeatures[] clone(Arena arena, VkPhysicalDeviceMultiviewFeatures[] src) {
        VkPhysicalDeviceMultiviewFeatures[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$multiview = PathElement.groupElement("PATH$multiview");
    public static final PathElement PATH$multiviewGeometryShader = PathElement.groupElement("PATH$multiviewGeometryShader");
    public static final PathElement PATH$multiviewTessellationShader = PathElement.groupElement("PATH$multiviewTessellationShader");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$multiview = LAYOUT$multiview.byteSize();
    public static final long SIZE$multiviewGeometryShader = LAYOUT$multiviewGeometryShader.byteSize();
    public static final long SIZE$multiviewTessellationShader = LAYOUT$multiviewTessellationShader.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$multiview = LAYOUT.byteOffset(PATH$multiview);
    public static final long OFFSET$multiviewGeometryShader = LAYOUT.byteOffset(PATH$multiviewGeometryShader);
    public static final long OFFSET$multiviewTessellationShader = LAYOUT.byteOffset(PATH$multiviewTessellationShader);

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

    public @unsigned int multiview() {
        return segment.get(LAYOUT$multiview, OFFSET$multiview);
    }

    public void multiview(@unsigned int value) {
        segment.set(LAYOUT$multiview, OFFSET$multiview, value);
    }

    public @unsigned int multiviewGeometryShader() {
        return segment.get(LAYOUT$multiviewGeometryShader, OFFSET$multiviewGeometryShader);
    }

    public void multiviewGeometryShader(@unsigned int value) {
        segment.set(LAYOUT$multiviewGeometryShader, OFFSET$multiviewGeometryShader, value);
    }

    public @unsigned int multiviewTessellationShader() {
        return segment.get(LAYOUT$multiviewTessellationShader, OFFSET$multiviewTessellationShader);
    }

    public void multiviewTessellationShader(@unsigned int value) {
        segment.set(LAYOUT$multiviewTessellationShader, OFFSET$multiviewTessellationShader, value);
    }

}
/// dummy, not implemented yet
