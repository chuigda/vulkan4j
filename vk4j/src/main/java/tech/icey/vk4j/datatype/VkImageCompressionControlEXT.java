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

public record VkImageCompressionControlEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("compressionControlPlaneCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pFixedRateFlags")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$compressionControlPlaneCount = PathElement.groupElement("compressionControlPlaneCount");
    public static final PathElement PATH$pFixedRateFlags = PathElement.groupElement("pFixedRateFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$compressionControlPlaneCount = (OfInt) LAYOUT.select(PATH$compressionControlPlaneCount);
    public static final AddressLayout LAYOUT$pFixedRateFlags = (AddressLayout) LAYOUT.select(PATH$pFixedRateFlags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$compressionControlPlaneCount = LAYOUT.byteOffset(PATH$compressionControlPlaneCount);
    public static final long OFFSET$pFixedRateFlags = LAYOUT.byteOffset(PATH$pFixedRateFlags);

    public VkImageCompressionControlEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT);
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

    public @enumtype(VkImageCompressionFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkImageCompressionFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int compressionControlPlaneCount() {
        return segment.get(LAYOUT$compressionControlPlaneCount, OFFSET$compressionControlPlaneCount);
    }

    public void compressionControlPlaneCount(@unsigned int value) {
        segment.set(LAYOUT$compressionControlPlaneCount, OFFSET$compressionControlPlaneCount, value);
    }

    public @pointer(target=VkImageCompressionFixedRateFlagsEXT.class) MemorySegment pFixedRateFlagsRaw() {
        return segment.get(LAYOUT$pFixedRateFlags, OFFSET$pFixedRateFlags);
    }
    
    public void pFixedRateFlagsRaw(@pointer(target=VkImageCompressionFixedRateFlagsEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pFixedRateFlags, OFFSET$pFixedRateFlags, value);
    }
    
    public @nullable IntBuffer pFixedRateFlags() {
        MemorySegment s = pFixedRateFlagsRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntBuffer(s);
    }
    
    public void pFixedRateFlags(@nullable IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFixedRateFlagsRaw(s);
    }

    public static VkImageCompressionControlEXT allocate(Arena arena) {
        return new VkImageCompressionControlEXT(arena.allocate(LAYOUT));
    }
    
    public static VkImageCompressionControlEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageCompressionControlEXT[] ret = new VkImageCompressionControlEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageCompressionControlEXT(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
