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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkViewportSwizzleNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y"),
        ValueLayout.JAVA_INT.withName("z"),
        ValueLayout.JAVA_INT.withName("w")
    );

    public static final PathElement PATH$x = PathElement.groupElement(0);
    public static final PathElement PATH$y = PathElement.groupElement(1);
    public static final PathElement PATH$z = PathElement.groupElement(2);
    public static final PathElement PATH$w = PathElement.groupElement(3);

    public static final OfInt LAYOUT$x = (OfInt) LAYOUT.select(PATH$x);
    public static final OfInt LAYOUT$y = (OfInt) LAYOUT.select(PATH$y);
    public static final OfInt LAYOUT$z = (OfInt) LAYOUT.select(PATH$z);
    public static final OfInt LAYOUT$w = (OfInt) LAYOUT.select(PATH$w);

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$z = LAYOUT.byteOffset(PATH$z);
    public static final long OFFSET$w = LAYOUT.byteOffset(PATH$w);

    public VkViewportSwizzleNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkViewportCoordinateSwizzleNV.class) int x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public void x(@enumtype(VkViewportCoordinateSwizzleNV.class) int value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
    }

    public @enumtype(VkViewportCoordinateSwizzleNV.class) int y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public void y(@enumtype(VkViewportCoordinateSwizzleNV.class) int value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
    }

    public @enumtype(VkViewportCoordinateSwizzleNV.class) int z() {
        return segment.get(LAYOUT$z, OFFSET$z);
    }

    public void z(@enumtype(VkViewportCoordinateSwizzleNV.class) int value) {
        segment.set(LAYOUT$z, OFFSET$z, value);
    }

    public @enumtype(VkViewportCoordinateSwizzleNV.class) int w() {
        return segment.get(LAYOUT$w, OFFSET$w);
    }

    public void w(@enumtype(VkViewportCoordinateSwizzleNV.class) int value) {
        segment.set(LAYOUT$w, OFFSET$w, value);
    }


    public static final class VkViewportSwizzleNVFactory implements IDataTypeFactory<VkViewportSwizzleNV> {
        @Override
        public Class<VkViewportSwizzleNV> clazz() {
            return VkViewportSwizzleNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkViewportSwizzleNV.LAYOUT;
        }

        @Override
        public VkViewportSwizzleNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkViewportSwizzleNV createUninit(MemorySegment segment) {
            return new VkViewportSwizzleNV(segment);
        }
    }

    public static final VkViewportSwizzleNVFactory FACTORY = new VkViewportSwizzleNVFactory();
}