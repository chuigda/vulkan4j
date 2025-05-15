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

public record VkPhysicalDeviceDrmPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$hasPrimary = ValueLayout.JAVA_INT.withName("hasPrimary");
    public static final OfInt LAYOUT$hasRender = ValueLayout.JAVA_INT.withName("hasRender");
    public static final OfLong LAYOUT$primaryMajor = ValueLayout.JAVA_LONG.withName("primaryMajor");
    public static final OfLong LAYOUT$primaryMinor = ValueLayout.JAVA_LONG.withName("primaryMinor");
    public static final OfLong LAYOUT$renderMajor = ValueLayout.JAVA_LONG.withName("renderMajor");
    public static final OfLong LAYOUT$renderMinor = ValueLayout.JAVA_LONG.withName("renderMinor");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$hasPrimary, LAYOUT$hasRender, LAYOUT$primaryMajor, LAYOUT$primaryMinor, LAYOUT$renderMajor, LAYOUT$renderMinor);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceDrmPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceDrmPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceDrmPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDrmPropertiesEXT[] ret = new VkPhysicalDeviceDrmPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceDrmPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceDrmPropertiesEXT clone(Arena arena, VkPhysicalDeviceDrmPropertiesEXT src) {
        VkPhysicalDeviceDrmPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceDrmPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceDrmPropertiesEXT[] src) {
        VkPhysicalDeviceDrmPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$hasPrimary = PathElement.groupElement("PATH$hasPrimary");
    public static final PathElement PATH$hasRender = PathElement.groupElement("PATH$hasRender");
    public static final PathElement PATH$primaryMajor = PathElement.groupElement("PATH$primaryMajor");
    public static final PathElement PATH$primaryMinor = PathElement.groupElement("PATH$primaryMinor");
    public static final PathElement PATH$renderMajor = PathElement.groupElement("PATH$renderMajor");
    public static final PathElement PATH$renderMinor = PathElement.groupElement("PATH$renderMinor");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$hasPrimary = LAYOUT$hasPrimary.byteSize();
    public static final long SIZE$hasRender = LAYOUT$hasRender.byteSize();
    public static final long SIZE$primaryMajor = LAYOUT$primaryMajor.byteSize();
    public static final long SIZE$primaryMinor = LAYOUT$primaryMinor.byteSize();
    public static final long SIZE$renderMajor = LAYOUT$renderMajor.byteSize();
    public static final long SIZE$renderMinor = LAYOUT$renderMinor.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$hasPrimary = LAYOUT.byteOffset(PATH$hasPrimary);
    public static final long OFFSET$hasRender = LAYOUT.byteOffset(PATH$hasRender);
    public static final long OFFSET$primaryMajor = LAYOUT.byteOffset(PATH$primaryMajor);
    public static final long OFFSET$primaryMinor = LAYOUT.byteOffset(PATH$primaryMinor);
    public static final long OFFSET$renderMajor = LAYOUT.byteOffset(PATH$renderMajor);
    public static final long OFFSET$renderMinor = LAYOUT.byteOffset(PATH$renderMinor);

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

    public @unsigned int hasPrimary() {
        return segment.get(LAYOUT$hasPrimary, OFFSET$hasPrimary);
    }

    public void hasPrimary(@unsigned int value) {
        segment.set(LAYOUT$hasPrimary, OFFSET$hasPrimary, value);
    }

    public @unsigned int hasRender() {
        return segment.get(LAYOUT$hasRender, OFFSET$hasRender);
    }

    public void hasRender(@unsigned int value) {
        segment.set(LAYOUT$hasRender, OFFSET$hasRender, value);
    }

    public long primaryMajor() {
        return segment.get(LAYOUT$primaryMajor, OFFSET$primaryMajor);
    }

    public void primaryMajor(long value) {
        segment.set(LAYOUT$primaryMajor, OFFSET$primaryMajor, value);
    }

    public long primaryMinor() {
        return segment.get(LAYOUT$primaryMinor, OFFSET$primaryMinor);
    }

    public void primaryMinor(long value) {
        segment.set(LAYOUT$primaryMinor, OFFSET$primaryMinor, value);
    }

    public long renderMajor() {
        return segment.get(LAYOUT$renderMajor, OFFSET$renderMajor);
    }

    public void renderMajor(long value) {
        segment.set(LAYOUT$renderMajor, OFFSET$renderMajor, value);
    }

    public long renderMinor() {
        return segment.get(LAYOUT$renderMinor, OFFSET$renderMinor);
    }

    public void renderMinor(long value) {
        segment.set(LAYOUT$renderMinor, OFFSET$renderMinor, value);
    }

}
/// dummy, not implemented yet
