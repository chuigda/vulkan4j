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

public record VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$nullColorAttachmentWithExternalFormatResolve = ValueLayout.JAVA_INT.withName("nullColorAttachmentWithExternalFormatResolve");
    public static final OfInt LAYOUT$externalFormatResolveChromaOffsetX = ValueLayout.JAVA_INT.withName("externalFormatResolveChromaOffsetX");
    public static final OfInt LAYOUT$externalFormatResolveChromaOffsetY = ValueLayout.JAVA_INT.withName("externalFormatResolveChromaOffsetY");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$nullColorAttachmentWithExternalFormatResolve, LAYOUT$externalFormatResolveChromaOffsetX, LAYOUT$externalFormatResolveChromaOffsetY);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID allocate(Arena arena) {
        return new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[] ret = new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceExternalFormatResolvePropertiesANDROID(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID clone(Arena arena, VkPhysicalDeviceExternalFormatResolvePropertiesANDROID src) {
        VkPhysicalDeviceExternalFormatResolvePropertiesANDROID ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[] clone(Arena arena, VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[] src) {
        VkPhysicalDeviceExternalFormatResolvePropertiesANDROID[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$nullColorAttachmentWithExternalFormatResolve = PathElement.groupElement("PATH$nullColorAttachmentWithExternalFormatResolve");
    public static final PathElement PATH$externalFormatResolveChromaOffsetX = PathElement.groupElement("PATH$externalFormatResolveChromaOffsetX");
    public static final PathElement PATH$externalFormatResolveChromaOffsetY = PathElement.groupElement("PATH$externalFormatResolveChromaOffsetY");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$nullColorAttachmentWithExternalFormatResolve = LAYOUT$nullColorAttachmentWithExternalFormatResolve.byteSize();
    public static final long SIZE$externalFormatResolveChromaOffsetX = LAYOUT$externalFormatResolveChromaOffsetX.byteSize();
    public static final long SIZE$externalFormatResolveChromaOffsetY = LAYOUT$externalFormatResolveChromaOffsetY.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$nullColorAttachmentWithExternalFormatResolve = LAYOUT.byteOffset(PATH$nullColorAttachmentWithExternalFormatResolve);
    public static final long OFFSET$externalFormatResolveChromaOffsetX = LAYOUT.byteOffset(PATH$externalFormatResolveChromaOffsetX);
    public static final long OFFSET$externalFormatResolveChromaOffsetY = LAYOUT.byteOffset(PATH$externalFormatResolveChromaOffsetY);

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

}
/// dummy, not implemented yet
