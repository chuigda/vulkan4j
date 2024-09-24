package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDispatchIndirectCommand(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("z")
    );

    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");
    public static final PathElement PATH$z = PathElement.groupElement("z");

    public static final OfInt LAYOUT$x = (OfInt) LAYOUT.select(PATH$x);
    public static final OfInt LAYOUT$y = (OfInt) LAYOUT.select(PATH$y);
    public static final OfInt LAYOUT$z = (OfInt) LAYOUT.select(PATH$z);

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$z = LAYOUT.byteOffset(PATH$z);

    public VkDispatchIndirectCommand(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public void x(@unsigned int value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
    }

    public @unsigned int y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public void y(@unsigned int value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
    }

    public @unsigned int z() {
        return segment.get(LAYOUT$z, OFFSET$z);
    }

    public void z(@unsigned int value) {
        segment.set(LAYOUT$z, OFFSET$z, value);
    }


    public static final class VkDispatchIndirectCommandFactory implements IFactory<VkDispatchIndirectCommand> {
        @Override
        public Class<VkDispatchIndirectCommand> clazz() {
            return VkDispatchIndirectCommand.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDispatchIndirectCommand.LAYOUT;
        }

        @Override
        public VkDispatchIndirectCommand create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDispatchIndirectCommand createUninit(MemorySegment segment) {
            return new VkDispatchIndirectCommand(segment);
        }
    }

    public static final VkDispatchIndirectCommandFactory FACTORY = new VkDispatchIndirectCommandFactory();
}
