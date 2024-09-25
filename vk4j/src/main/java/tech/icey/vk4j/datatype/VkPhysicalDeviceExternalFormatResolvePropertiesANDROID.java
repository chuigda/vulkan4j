package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("nullColorAttachmentWithExternalFormatResolve"),
        ValueLayout.JAVA_INT.withName("externalFormatResolveChromaOffsetX"),
        ValueLayout.JAVA_INT.withName("externalFormatResolveChromaOffsetY")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$nullColorAttachmentWithExternalFormatResolve = PathElement.groupElement("nullColorAttachmentWithExternalFormatResolve");
    public static final PathElement PATH$externalFormatResolveChromaOffsetX = PathElement.groupElement("externalFormatResolveChromaOffsetX");
    public static final PathElement PATH$externalFormatResolveChromaOffsetY = PathElement.groupElement("externalFormatResolveChromaOffsetY");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$nullColorAttachmentWithExternalFormatResolve = (OfInt) LAYOUT.select(PATH$nullColorAttachmentWithExternalFormatResolve);
    public static final OfInt LAYOUT$externalFormatResolveChromaOffsetX = (OfInt) LAYOUT.select(PATH$externalFormatResolveChromaOffsetX);
    public static final OfInt LAYOUT$externalFormatResolveChromaOffsetY = (OfInt) LAYOUT.select(PATH$externalFormatResolveChromaOffsetY);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$nullColorAttachmentWithExternalFormatResolve = LAYOUT.byteOffset(PATH$nullColorAttachmentWithExternalFormatResolve);
    public static final long OFFSET$externalFormatResolveChromaOffsetX = LAYOUT.byteOffset(PATH$externalFormatResolveChromaOffsetX);
    public static final long OFFSET$externalFormatResolveChromaOffsetY = LAYOUT.byteOffset(PATH$externalFormatResolveChromaOffsetY);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$nullColorAttachmentWithExternalFormatResolve = LAYOUT$nullColorAttachmentWithExternalFormatResolve.byteSize();
    public static final long SIZE$externalFormatResolveChromaOffsetX = LAYOUT$externalFormatResolveChromaOffsetX.byteSize();
    public static final long SIZE$externalFormatResolveChromaOffsetY = LAYOUT$externalFormatResolveChromaOffsetY.byteSize();

    public VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_FORMAT_RESOLVE_PROPERTIES_ANDROID);
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

    public @unsigned int nullColorAttachmentWithExternalFormatResolve() {
        return segment.get(LAYOUT$nullColorAttachmentWithExternalFormatResolve, OFFSET$nullColorAttachmentWithExternalFormatResolve);
    }

    public void nullColorAttachmentWithExternalFormatResolve(@unsigned int value) {
        segment.set(LAYOUT$nullColorAttachmentWithExternalFormatResolve, OFFSET$nullColorAttachmentWithExternalFormatResolve, value);
    }

    public @enumtype(VkChromaLocation.class) int externalFormatResolveChromaOffsetX() {
        return segment.get(LAYOUT$externalFormatResolveChromaOffsetX, OFFSET$externalFormatResolveChromaOffsetX);
    }

    public void externalFormatResolveChromaOffsetX(@enumtype(VkChromaLocation.class) int value) {
        segment.set(LAYOUT$externalFormatResolveChromaOffsetX, OFFSET$externalFormatResolveChromaOffsetX, value);
    }

    public @enumtype(VkChromaLocation.class) int externalFormatResolveChromaOffsetY() {
        return segment.get(LAYOUT$externalFormatResolveChromaOffsetY, OFFSET$externalFormatResolveChromaOffsetY);
    }

    public void externalFormatResolveChromaOffsetY(@enumtype(VkChromaLocation.class) int value) {
        segment.set(LAYOUT$externalFormatResolveChromaOffsetY, OFFSET$externalFormatResolveChromaOffsetY, value);
    }

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID allocate(Arena arena) {
        return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[] ret = new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
