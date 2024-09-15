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

public record VkComponentMapping(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("r"),
        ValueLayout.JAVA_INT.withName("g"),
        ValueLayout.JAVA_INT.withName("b"),
        ValueLayout.JAVA_INT.withName("a")
    );

    public static final PathElement PATH$r = PathElement.groupElement(0);
    public static final PathElement PATH$g = PathElement.groupElement(1);
    public static final PathElement PATH$b = PathElement.groupElement(2);
    public static final PathElement PATH$a = PathElement.groupElement(3);

    public static final OfInt LAYOUT$r = (OfInt) LAYOUT.select(PATH$r);
    public static final OfInt LAYOUT$g = (OfInt) LAYOUT.select(PATH$g);
    public static final OfInt LAYOUT$b = (OfInt) LAYOUT.select(PATH$b);
    public static final OfInt LAYOUT$a = (OfInt) LAYOUT.select(PATH$a);

    public static final long OFFSET$r = LAYOUT.byteOffset(PATH$r);
    public static final long OFFSET$g = LAYOUT.byteOffset(PATH$g);
    public static final long OFFSET$b = LAYOUT.byteOffset(PATH$b);
    public static final long OFFSET$a = LAYOUT.byteOffset(PATH$a);

    public VkComponentMapping(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkComponentSwizzle.class) int r() {
        return segment.get(LAYOUT$r, OFFSET$r);
    }

    public void r(@enumtype(VkComponentSwizzle.class) int value) {
        segment.set(LAYOUT$r, OFFSET$r, value);
    }

    public @enumtype(VkComponentSwizzle.class) int g() {
        return segment.get(LAYOUT$g, OFFSET$g);
    }

    public void g(@enumtype(VkComponentSwizzle.class) int value) {
        segment.set(LAYOUT$g, OFFSET$g, value);
    }

    public @enumtype(VkComponentSwizzle.class) int b() {
        return segment.get(LAYOUT$b, OFFSET$b);
    }

    public void b(@enumtype(VkComponentSwizzle.class) int value) {
        segment.set(LAYOUT$b, OFFSET$b, value);
    }

    public @enumtype(VkComponentSwizzle.class) int a() {
        return segment.get(LAYOUT$a, OFFSET$a);
    }

    public void a(@enumtype(VkComponentSwizzle.class) int value) {
        segment.set(LAYOUT$a, OFFSET$a, value);
    }


    public static final class VkComponentMappingFactory implements IDataTypeFactory<VkComponentMapping> {
        @Override
        public Class<VkComponentMapping> clazz() {
            return VkComponentMapping.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkComponentMapping.LAYOUT;
        }

        @Override
        public VkComponentMapping create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkComponentMapping createUninit(MemorySegment segment) {
            return new VkComponentMapping(segment);
        }
    }

    public static final VkComponentMappingFactory FACTORY = new VkComponentMappingFactory();
}
