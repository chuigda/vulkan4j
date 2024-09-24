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

public record VkGeometryTrianglesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("vertexData"),
        ValueLayout.JAVA_LONG.withName("vertexOffset"),
        ValueLayout.JAVA_INT.withName("vertexCount"),
        ValueLayout.JAVA_LONG.withName("vertexStride"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        ValueLayout.ADDRESS.withName("indexData"),
        ValueLayout.JAVA_LONG.withName("indexOffset"),
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("indexType"),
        ValueLayout.ADDRESS.withName("transformData"),
        ValueLayout.JAVA_LONG.withName("transformOffset")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$vertexData = PathElement.groupElement("vertexData");
    public static final PathElement PATH$vertexOffset = PathElement.groupElement("vertexOffset");
    public static final PathElement PATH$vertexCount = PathElement.groupElement("vertexCount");
    public static final PathElement PATH$vertexStride = PathElement.groupElement("vertexStride");
    public static final PathElement PATH$vertexFormat = PathElement.groupElement("vertexFormat");
    public static final PathElement PATH$indexData = PathElement.groupElement("indexData");
    public static final PathElement PATH$indexOffset = PathElement.groupElement("indexOffset");
    public static final PathElement PATH$indexCount = PathElement.groupElement("indexCount");
    public static final PathElement PATH$indexType = PathElement.groupElement("indexType");
    public static final PathElement PATH$transformData = PathElement.groupElement("transformData");
    public static final PathElement PATH$transformOffset = PathElement.groupElement("transformOffset");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$vertexData = (AddressLayout) LAYOUT.select(PATH$vertexData);
    public static final OfLong LAYOUT$vertexOffset = (OfLong) LAYOUT.select(PATH$vertexOffset);
    public static final OfInt LAYOUT$vertexCount = (OfInt) LAYOUT.select(PATH$vertexCount);
    public static final OfLong LAYOUT$vertexStride = (OfLong) LAYOUT.select(PATH$vertexStride);
    public static final OfInt LAYOUT$vertexFormat = (OfInt) LAYOUT.select(PATH$vertexFormat);
    public static final AddressLayout LAYOUT$indexData = (AddressLayout) LAYOUT.select(PATH$indexData);
    public static final OfLong LAYOUT$indexOffset = (OfLong) LAYOUT.select(PATH$indexOffset);
    public static final OfInt LAYOUT$indexCount = (OfInt) LAYOUT.select(PATH$indexCount);
    public static final OfInt LAYOUT$indexType = (OfInt) LAYOUT.select(PATH$indexType);
    public static final AddressLayout LAYOUT$transformData = (AddressLayout) LAYOUT.select(PATH$transformData);
    public static final OfLong LAYOUT$transformOffset = (OfLong) LAYOUT.select(PATH$transformOffset);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexData = LAYOUT.byteOffset(PATH$vertexData);
    public static final long OFFSET$vertexOffset = LAYOUT.byteOffset(PATH$vertexOffset);
    public static final long OFFSET$vertexCount = LAYOUT.byteOffset(PATH$vertexCount);
    public static final long OFFSET$vertexStride = LAYOUT.byteOffset(PATH$vertexStride);
    public static final long OFFSET$vertexFormat = LAYOUT.byteOffset(PATH$vertexFormat);
    public static final long OFFSET$indexData = LAYOUT.byteOffset(PATH$indexData);
    public static final long OFFSET$indexOffset = LAYOUT.byteOffset(PATH$indexOffset);
    public static final long OFFSET$indexCount = LAYOUT.byteOffset(PATH$indexCount);
    public static final long OFFSET$indexType = LAYOUT.byteOffset(PATH$indexType);
    public static final long OFFSET$transformData = LAYOUT.byteOffset(PATH$transformData);
    public static final long OFFSET$transformOffset = LAYOUT.byteOffset(PATH$transformOffset);

    public VkGeometryTrianglesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV);
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

    public VkBuffer vertexData() {
        return new VkBuffer(segment.asSlice(OFFSET$vertexData, LAYOUT$vertexData));
    }

    public void vertexData(VkBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vertexData, LAYOUT$vertexData.byteSize());
    }

    public @unsigned long vertexOffset() {
        return segment.get(LAYOUT$vertexOffset, OFFSET$vertexOffset);
    }

    public void vertexOffset(@unsigned long value) {
        segment.set(LAYOUT$vertexOffset, OFFSET$vertexOffset, value);
    }

    public @unsigned int vertexCount() {
        return segment.get(LAYOUT$vertexCount, OFFSET$vertexCount);
    }

    public void vertexCount(@unsigned int value) {
        segment.set(LAYOUT$vertexCount, OFFSET$vertexCount, value);
    }

    public @unsigned long vertexStride() {
        return segment.get(LAYOUT$vertexStride, OFFSET$vertexStride);
    }

    public void vertexStride(@unsigned long value) {
        segment.set(LAYOUT$vertexStride, OFFSET$vertexStride, value);
    }

    public @enumtype(VkFormat.class) int vertexFormat() {
        return segment.get(LAYOUT$vertexFormat, OFFSET$vertexFormat);
    }

    public void vertexFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$vertexFormat, OFFSET$vertexFormat, value);
    }

    public VkBuffer indexData() {
        return new VkBuffer(segment.asSlice(OFFSET$indexData, LAYOUT$indexData));
    }

    public void indexData(VkBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$indexData, LAYOUT$indexData.byteSize());
    }

    public @unsigned long indexOffset() {
        return segment.get(LAYOUT$indexOffset, OFFSET$indexOffset);
    }

    public void indexOffset(@unsigned long value) {
        segment.set(LAYOUT$indexOffset, OFFSET$indexOffset, value);
    }

    public @unsigned int indexCount() {
        return segment.get(LAYOUT$indexCount, OFFSET$indexCount);
    }

    public void indexCount(@unsigned int value) {
        segment.set(LAYOUT$indexCount, OFFSET$indexCount, value);
    }

    public @enumtype(VkIndexType.class) int indexType() {
        return segment.get(LAYOUT$indexType, OFFSET$indexType);
    }

    public void indexType(@enumtype(VkIndexType.class) int value) {
        segment.set(LAYOUT$indexType, OFFSET$indexType, value);
    }

    public VkBuffer transformData() {
        return new VkBuffer(segment.asSlice(OFFSET$transformData, LAYOUT$transformData));
    }

    public void transformData(VkBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transformData, LAYOUT$transformData.byteSize());
    }

    public @unsigned long transformOffset() {
        return segment.get(LAYOUT$transformOffset, OFFSET$transformOffset);
    }

    public void transformOffset(@unsigned long value) {
        segment.set(LAYOUT$transformOffset, OFFSET$transformOffset, value);
    }


    public static final class VkGeometryTrianglesNVFactory implements IFactory<VkGeometryTrianglesNV> {
        @Override
        public Class<VkGeometryTrianglesNV> clazz() {
            return VkGeometryTrianglesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkGeometryTrianglesNV.LAYOUT;
        }

        @Override
        public VkGeometryTrianglesNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkGeometryTrianglesNV createUninit(MemorySegment segment) {
            return new VkGeometryTrianglesNV(segment);
        }
    }

    public static final VkGeometryTrianglesNVFactory FACTORY = new VkGeometryTrianglesNVFactory();
}
