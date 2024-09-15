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

public record VkTilePropertiesQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent3D.LAYOUT.withName("tileSize"),
        VkExtent2D.LAYOUT.withName("apronSize"),
        VkOffset2D.LAYOUT.withName("origin")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$tileSize = PathElement.groupElement(2);
    public static final PathElement PATH$apronSize = PathElement.groupElement(3);
    public static final PathElement PATH$origin = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$tileSize = (StructLayout) LAYOUT.select(PATH$tileSize);
    public static final StructLayout LAYOUT$apronSize = (StructLayout) LAYOUT.select(PATH$apronSize);
    public static final StructLayout LAYOUT$origin = (StructLayout) LAYOUT.select(PATH$origin);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$tileSize = LAYOUT.byteOffset(PATH$tileSize);
    public static final long OFFSET$apronSize = LAYOUT.byteOffset(PATH$apronSize);
    public static final long OFFSET$origin = LAYOUT.byteOffset(PATH$origin);

    public VkTilePropertiesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM);
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

    public VkExtent3D tileSize() {
        return new VkExtent3D(segment.asSlice(OFFSET$tileSize, LAYOUT$tileSize));
    }

    public void tileSize(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$tileSize, LAYOUT$tileSize.byteSize());
    }

    public VkExtent2D apronSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$apronSize, LAYOUT$apronSize));
    }

    public void apronSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$apronSize, LAYOUT$apronSize.byteSize());
    }

    public VkOffset2D origin() {
        return new VkOffset2D(segment.asSlice(OFFSET$origin, LAYOUT$origin));
    }

    public void origin(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$origin, LAYOUT$origin.byteSize());
    }


    public static final class VkTilePropertiesQCOMFactory implements IDataTypeFactory<VkTilePropertiesQCOM> {
        @Override
        public Class<VkTilePropertiesQCOM> clazz() {
            return VkTilePropertiesQCOM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkTilePropertiesQCOM.LAYOUT;
        }

        @Override
        public VkTilePropertiesQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkTilePropertiesQCOM createUninit(MemorySegment segment) {
            return new VkTilePropertiesQCOM(segment);
        }
    }

    public static final VkTilePropertiesQCOMFactory FACTORY = new VkTilePropertiesQCOMFactory();
}
