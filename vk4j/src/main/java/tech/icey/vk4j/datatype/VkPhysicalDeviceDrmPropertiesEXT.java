package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceDrmPropertiesEXT.html">VkPhysicalDeviceDrmPropertiesEXT</a>
public record VkPhysicalDeviceDrmPropertiesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hasPrimary"),
        ValueLayout.JAVA_INT.withName("hasRender"),
        ValueLayout.JAVA_LONG.withName("primaryMajor"),
        ValueLayout.JAVA_LONG.withName("primaryMinor"),
        ValueLayout.JAVA_LONG.withName("renderMajor"),
        ValueLayout.JAVA_LONG.withName("renderMinor")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$hasPrimary = PathElement.groupElement("hasPrimary");
    public static final PathElement PATH$hasRender = PathElement.groupElement("hasRender");
    public static final PathElement PATH$primaryMajor = PathElement.groupElement("primaryMajor");
    public static final PathElement PATH$primaryMinor = PathElement.groupElement("primaryMinor");
    public static final PathElement PATH$renderMajor = PathElement.groupElement("renderMajor");
    public static final PathElement PATH$renderMinor = PathElement.groupElement("renderMinor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$hasPrimary = (OfInt) LAYOUT.select(PATH$hasPrimary);
    public static final OfInt LAYOUT$hasRender = (OfInt) LAYOUT.select(PATH$hasRender);
    public static final OfLong LAYOUT$primaryMajor = (OfLong) LAYOUT.select(PATH$primaryMajor);
    public static final OfLong LAYOUT$primaryMinor = (OfLong) LAYOUT.select(PATH$primaryMinor);
    public static final OfLong LAYOUT$renderMajor = (OfLong) LAYOUT.select(PATH$renderMajor);
    public static final OfLong LAYOUT$renderMinor = (OfLong) LAYOUT.select(PATH$renderMinor);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$hasPrimary = LAYOUT.byteOffset(PATH$hasPrimary);
    public static final long OFFSET$hasRender = LAYOUT.byteOffset(PATH$hasRender);
    public static final long OFFSET$primaryMajor = LAYOUT.byteOffset(PATH$primaryMajor);
    public static final long OFFSET$primaryMinor = LAYOUT.byteOffset(PATH$primaryMinor);
    public static final long OFFSET$renderMajor = LAYOUT.byteOffset(PATH$renderMajor);
    public static final long OFFSET$renderMinor = LAYOUT.byteOffset(PATH$renderMinor);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$hasPrimary = LAYOUT$hasPrimary.byteSize();
    public static final long SIZE$hasRender = LAYOUT$hasRender.byteSize();
    public static final long SIZE$primaryMajor = LAYOUT$primaryMajor.byteSize();
    public static final long SIZE$primaryMinor = LAYOUT$primaryMinor.byteSize();
    public static final long SIZE$renderMajor = LAYOUT$renderMajor.byteSize();
    public static final long SIZE$renderMinor = LAYOUT$renderMinor.byteSize();

    public VkPhysicalDeviceDrmPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRM_PROPERTIES_EXT);
    }

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

    public static VkPhysicalDeviceDrmPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceDrmPropertiesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceDrmPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDrmPropertiesEXT[] ret = new VkPhysicalDeviceDrmPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceDrmPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
