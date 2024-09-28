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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceHostImageCopyPropertiesEXT.html">VkPhysicalDeviceHostImageCopyPropertiesEXT</a>
public record VkPhysicalDeviceHostImageCopyPropertiesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("copySrcLayoutCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCopySrcLayouts"),
        ValueLayout.JAVA_INT.withName("copyDstLayoutCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCopyDstLayouts"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("optimalTilingLayoutUUID"),
        ValueLayout.JAVA_INT.withName("identicalMemoryTypeRequirements")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$copySrcLayoutCount = PathElement.groupElement("copySrcLayoutCount");
    public static final PathElement PATH$pCopySrcLayouts = PathElement.groupElement("pCopySrcLayouts");
    public static final PathElement PATH$copyDstLayoutCount = PathElement.groupElement("copyDstLayoutCount");
    public static final PathElement PATH$pCopyDstLayouts = PathElement.groupElement("pCopyDstLayouts");
    public static final PathElement PATH$optimalTilingLayoutUUID = PathElement.groupElement("optimalTilingLayoutUUID");
    public static final PathElement PATH$identicalMemoryTypeRequirements = PathElement.groupElement("identicalMemoryTypeRequirements");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$copySrcLayoutCount = (OfInt) LAYOUT.select(PATH$copySrcLayoutCount);
    public static final AddressLayout LAYOUT$pCopySrcLayouts = (AddressLayout) LAYOUT.select(PATH$pCopySrcLayouts);
    public static final OfInt LAYOUT$copyDstLayoutCount = (OfInt) LAYOUT.select(PATH$copyDstLayoutCount);
    public static final AddressLayout LAYOUT$pCopyDstLayouts = (AddressLayout) LAYOUT.select(PATH$pCopyDstLayouts);
    public static final SequenceLayout LAYOUT$optimalTilingLayoutUUID = (SequenceLayout) LAYOUT.select(PATH$optimalTilingLayoutUUID);
    public static final OfInt LAYOUT$identicalMemoryTypeRequirements = (OfInt) LAYOUT.select(PATH$identicalMemoryTypeRequirements);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$copySrcLayoutCount = LAYOUT.byteOffset(PATH$copySrcLayoutCount);
    public static final long OFFSET$pCopySrcLayouts = LAYOUT.byteOffset(PATH$pCopySrcLayouts);
    public static final long OFFSET$copyDstLayoutCount = LAYOUT.byteOffset(PATH$copyDstLayoutCount);
    public static final long OFFSET$pCopyDstLayouts = LAYOUT.byteOffset(PATH$pCopyDstLayouts);
    public static final long OFFSET$optimalTilingLayoutUUID = LAYOUT.byteOffset(PATH$optimalTilingLayoutUUID);
    public static final long OFFSET$identicalMemoryTypeRequirements = LAYOUT.byteOffset(PATH$identicalMemoryTypeRequirements);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$copySrcLayoutCount = LAYOUT$copySrcLayoutCount.byteSize();
    public static final long SIZE$pCopySrcLayouts = LAYOUT$pCopySrcLayouts.byteSize();
    public static final long SIZE$copyDstLayoutCount = LAYOUT$copyDstLayoutCount.byteSize();
    public static final long SIZE$pCopyDstLayouts = LAYOUT$pCopyDstLayouts.byteSize();
    public static final long SIZE$optimalTilingLayoutUUID = LAYOUT$optimalTilingLayoutUUID.byteSize();
    public static final long SIZE$identicalMemoryTypeRequirements = LAYOUT$identicalMemoryTypeRequirements.byteSize();

    public VkPhysicalDeviceHostImageCopyPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_PROPERTIES_EXT);
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

    public @unsigned int copySrcLayoutCount() {
        return segment.get(LAYOUT$copySrcLayoutCount, OFFSET$copySrcLayoutCount);
    }

    public void copySrcLayoutCount(@unsigned int value) {
        segment.set(LAYOUT$copySrcLayoutCount, OFFSET$copySrcLayoutCount, value);
    }

    public @pointer(target=VkImageLayout.class) MemorySegment pCopySrcLayoutsRaw() {
        return segment.get(LAYOUT$pCopySrcLayouts, OFFSET$pCopySrcLayouts);
    }
    
    public void pCopySrcLayoutsRaw(@pointer(target=VkImageLayout.class) MemorySegment value) {
        segment.set(LAYOUT$pCopySrcLayouts, OFFSET$pCopySrcLayouts, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or {@link IntBuffer#write}ing
    /// the buffer.
    public @nullable @enumtype(VkImageLayout.class) IntBuffer pCopySrcLayouts() {
        MemorySegment s = pCopySrcLayoutsRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntBuffer(s);
    }

    public void pCopySrcLayouts(@nullable @enumtype(VkImageLayout.class) IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCopySrcLayoutsRaw(s);
    }

    public @unsigned int copyDstLayoutCount() {
        return segment.get(LAYOUT$copyDstLayoutCount, OFFSET$copyDstLayoutCount);
    }

    public void copyDstLayoutCount(@unsigned int value) {
        segment.set(LAYOUT$copyDstLayoutCount, OFFSET$copyDstLayoutCount, value);
    }

    public @pointer(target=VkImageLayout.class) MemorySegment pCopyDstLayoutsRaw() {
        return segment.get(LAYOUT$pCopyDstLayouts, OFFSET$pCopyDstLayouts);
    }
    
    public void pCopyDstLayoutsRaw(@pointer(target=VkImageLayout.class) MemorySegment value) {
        segment.set(LAYOUT$pCopyDstLayouts, OFFSET$pCopyDstLayouts, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or {@link IntBuffer#write}ing
    /// the buffer.
    public @nullable @enumtype(VkImageLayout.class) IntBuffer pCopyDstLayouts() {
        MemorySegment s = pCopyDstLayoutsRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntBuffer(s);
    }

    public void pCopyDstLayouts(@nullable @enumtype(VkImageLayout.class) IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCopyDstLayoutsRaw(s);
    }

    public MemorySegment optimalTilingLayoutUUIDRaw() {
        return segment.asSlice(OFFSET$optimalTilingLayoutUUID, SIZE$optimalTilingLayoutUUID);
    }

    public @unsigned ByteBuffer optimalTilingLayoutUUID() {
        return new ByteBuffer(optimalTilingLayoutUUIDRaw());
    }

    public void optimalTilingLayoutUUID(@unsigned ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$optimalTilingLayoutUUID, SIZE$optimalTilingLayoutUUID);
    }

    public @unsigned int identicalMemoryTypeRequirements() {
        return segment.get(LAYOUT$identicalMemoryTypeRequirements, OFFSET$identicalMemoryTypeRequirements);
    }

    public void identicalMemoryTypeRequirements(@unsigned int value) {
        segment.set(LAYOUT$identicalMemoryTypeRequirements, OFFSET$identicalMemoryTypeRequirements, value);
    }

    public static VkPhysicalDeviceHostImageCopyPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceHostImageCopyPropertiesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceHostImageCopyPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceHostImageCopyPropertiesEXT[] ret = new VkPhysicalDeviceHostImageCopyPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceHostImageCopyPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
