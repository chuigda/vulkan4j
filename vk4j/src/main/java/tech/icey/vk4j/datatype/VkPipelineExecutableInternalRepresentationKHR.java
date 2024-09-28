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

public record VkPipelineExecutableInternalRepresentationKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("isText"),
        NativeLayout.C_SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$name = PathElement.groupElement("name");
    public static final PathElement PATH$description = PathElement.groupElement("description");
    public static final PathElement PATH$isText = PathElement.groupElement("isText");
    public static final PathElement PATH$dataSize = PathElement.groupElement("dataSize");
    public static final PathElement PATH$pData = PathElement.groupElement("pData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$name = (SequenceLayout) LAYOUT.select(PATH$name);
    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);
    public static final OfInt LAYOUT$isText = (OfInt) LAYOUT.select(PATH$isText);
    public static final AddressLayout LAYOUT$pData = (AddressLayout) LAYOUT.select(PATH$pData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$isText = LAYOUT.byteOffset(PATH$isText);
    public static final long OFFSET$dataSize = LAYOUT.byteOffset(PATH$dataSize);
    public static final long OFFSET$pData = LAYOUT.byteOffset(PATH$pData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$isText = LAYOUT$isText.byteSize();
    public static final long SIZE$pData = LAYOUT$pData.byteSize();

    public VkPipelineExecutableInternalRepresentationKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR);
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

    public MemorySegment nameRaw() {
        return segment.asSlice(OFFSET$name, SIZE$name);
    }

    public ByteBuffer name() {
        return new ByteBuffer(nameRaw());
    }

    public void name(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$name, SIZE$name);
    }

    public MemorySegment descriptionRaw() {
        return segment.asSlice(OFFSET$description, SIZE$description);
    }

    public ByteBuffer description() {
        return new ByteBuffer(descriptionRaw());
    }

    public void description(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, SIZE$description);
    }

    public @unsigned int isText() {
        return segment.get(LAYOUT$isText, OFFSET$isText);
    }

    public void isText(@unsigned int value) {
        segment.set(LAYOUT$isText, OFFSET$isText, value);
    }

    public @unsigned long dataSize() {
            return NativeLayout.readCSizeT(segment, OFFSET$dataSize);
        }
    
        public void dataSize(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$dataSize, value);
        }

    public @pointer(comment="void*") MemorySegment pData() {
        return segment.get(LAYOUT$pData, OFFSET$pData);
    }

    public void pData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pData, OFFSET$pData, value);
    }

    public void pData(IPointer pointer) {
        pData(pointer.segment());
    }

    public static VkPipelineExecutableInternalRepresentationKHR allocate(Arena arena) {
        return new VkPipelineExecutableInternalRepresentationKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineExecutableInternalRepresentationKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineExecutableInternalRepresentationKHR[] ret = new VkPipelineExecutableInternalRepresentationKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineExecutableInternalRepresentationKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
