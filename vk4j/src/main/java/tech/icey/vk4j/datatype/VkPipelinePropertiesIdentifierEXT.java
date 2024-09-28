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

/// {@snippet lang=c :
/// typedef struct VkPipelinePropertiesIdentifierEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint8_t pipelineIdentifier[VK_UUID_SIZE];
/// } VkPipelinePropertiesIdentifierEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelinePropertiesIdentifierEXT.html">VkPipelinePropertiesIdentifierEXT</a>
public record VkPipelinePropertiesIdentifierEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineIdentifier")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipelineIdentifier = PathElement.groupElement("pipelineIdentifier");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$pipelineIdentifier = (SequenceLayout) LAYOUT.select(PATH$pipelineIdentifier);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineIdentifier = LAYOUT.byteOffset(PATH$pipelineIdentifier);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipelineIdentifier = LAYOUT$pipelineIdentifier.byteSize();

    public VkPipelinePropertiesIdentifierEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_PROPERTIES_IDENTIFIER_EXT);
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

    public MemorySegment pipelineIdentifierRaw() {
        return segment.asSlice(OFFSET$pipelineIdentifier, SIZE$pipelineIdentifier);
    }

    public @unsigned ByteBuffer pipelineIdentifier() {
        return new ByteBuffer(pipelineIdentifierRaw());
    }

    public void pipelineIdentifier(@unsigned ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pipelineIdentifier, SIZE$pipelineIdentifier);
    }

    public static VkPipelinePropertiesIdentifierEXT allocate(Arena arena) {
        return new VkPipelinePropertiesIdentifierEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPipelinePropertiesIdentifierEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelinePropertiesIdentifierEXT[] ret = new VkPipelinePropertiesIdentifierEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelinePropertiesIdentifierEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
