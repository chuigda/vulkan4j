package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfFloat;
import static java.lang.foreign.ValueLayout.PathElement;

public record VkAabbPositionsKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("minX"),
        ValueLayout.JAVA_FLOAT.withName("minY"),
        ValueLayout.JAVA_FLOAT.withName("minZ"),
        ValueLayout.JAVA_FLOAT.withName("maxX"),
        ValueLayout.JAVA_FLOAT.withName("maxY"),
        ValueLayout.JAVA_FLOAT.withName("maxZ")
    );

    public static final PathElement PATH$minX = PathElement.groupElement("minX");
    public static final PathElement PATH$minY = PathElement.groupElement("minY");
    public static final PathElement PATH$minZ = PathElement.groupElement("minZ");
    public static final PathElement PATH$maxX = PathElement.groupElement("maxX");
    public static final PathElement PATH$maxY = PathElement.groupElement("maxY");
    public static final PathElement PATH$maxZ = PathElement.groupElement("maxZ");

    public static final OfFloat LAYOUT$minX = (OfFloat) LAYOUT.select(PATH$minX);
    public static final OfFloat LAYOUT$minY = (OfFloat) LAYOUT.select(PATH$minY);
    public static final OfFloat LAYOUT$minZ = (OfFloat) LAYOUT.select(PATH$minZ);
    public static final OfFloat LAYOUT$maxX = (OfFloat) LAYOUT.select(PATH$maxX);
    public static final OfFloat LAYOUT$maxY = (OfFloat) LAYOUT.select(PATH$maxY);
    public static final OfFloat LAYOUT$maxZ = (OfFloat) LAYOUT.select(PATH$maxZ);

    public static final long OFFSET$minX = LAYOUT.byteOffset(PATH$minX);
    public static final long OFFSET$minY = LAYOUT.byteOffset(PATH$minY);
    public static final long OFFSET$minZ = LAYOUT.byteOffset(PATH$minZ);
    public static final long OFFSET$maxX = LAYOUT.byteOffset(PATH$maxX);
    public static final long OFFSET$maxY = LAYOUT.byteOffset(PATH$maxY);
    public static final long OFFSET$maxZ = LAYOUT.byteOffset(PATH$maxZ);

    public VkAabbPositionsKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public float minX() {
        return segment.get(LAYOUT$minX, OFFSET$minX);
    }

    public void minX(float value) {
        segment.set(LAYOUT$minX, OFFSET$minX, value);
    }

    public float minY() {
        return segment.get(LAYOUT$minY, OFFSET$minY);
    }

    public void minY(float value) {
        segment.set(LAYOUT$minY, OFFSET$minY, value);
    }

    public float minZ() {
        return segment.get(LAYOUT$minZ, OFFSET$minZ);
    }

    public void minZ(float value) {
        segment.set(LAYOUT$minZ, OFFSET$minZ, value);
    }

    public float maxX() {
        return segment.get(LAYOUT$maxX, OFFSET$maxX);
    }

    public void maxX(float value) {
        segment.set(LAYOUT$maxX, OFFSET$maxX, value);
    }

    public float maxY() {
        return segment.get(LAYOUT$maxY, OFFSET$maxY);
    }

    public void maxY(float value) {
        segment.set(LAYOUT$maxY, OFFSET$maxY, value);
    }

    public float maxZ() {
        return segment.get(LAYOUT$maxZ, OFFSET$maxZ);
    }

    public void maxZ(float value) {
        segment.set(LAYOUT$maxZ, OFFSET$maxZ, value);
    }


    public static final class Factory implements IFactory<VkAabbPositionsKHR> {
        @Override
        public Class<VkAabbPositionsKHR> clazz() {
            return VkAabbPositionsKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkAabbPositionsKHR.LAYOUT;
        }

        @Override
        public VkAabbPositionsKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAabbPositionsKHR createUninit(MemorySegment segment) {
            return new VkAabbPositionsKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
