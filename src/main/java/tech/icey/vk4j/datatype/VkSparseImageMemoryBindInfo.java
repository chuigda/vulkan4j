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

public record VkSparseImageMemoryBindInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.JAVA_INT.withName("bindCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSparseImageMemoryBind.LAYOUT).withName("pBinds")
    );

    public static final PathElement PATH$image = PathElement.groupElement(0);
    public static final PathElement PATH$bindCount = PathElement.groupElement(1);
    public static final PathElement PATH$pBinds = PathElement.groupElement(2);

    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);
    public static final OfInt LAYOUT$bindCount = (OfInt) LAYOUT.select(PATH$bindCount);
    public static final AddressLayout LAYOUT$pBinds = (AddressLayout) LAYOUT.select(PATH$pBinds);

    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$bindCount = LAYOUT.byteOffset(PATH$bindCount);
    public static final long OFFSET$pBinds = LAYOUT.byteOffset(PATH$pBinds);

    public VkSparseImageMemoryBindInfo(MemorySegment segment) {
        this.segment = segment;
    }

    public VkImage image() {
        return new VkImage(segment.asSlice(OFFSET$image, LAYOUT$image));
    }

    public void image(VkImage value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$image, LAYOUT$image.byteSize());
    }

    public @unsigned int bindCount() {
        return segment.get(LAYOUT$bindCount, OFFSET$bindCount);
    }

    public void bindCount(@unsigned int value) {
        segment.set(LAYOUT$bindCount, OFFSET$bindCount, value);
    }

    public @pointer(comment="VkSparseImageMemoryBind*") MemorySegment pBindsRaw() {
        return segment.get(LAYOUT$pBinds, OFFSET$pBinds);
    }

    public void pBindsRaw(@pointer(comment="VkSparseImageMemoryBind*") MemorySegment value) {
        segment.set(LAYOUT$pBinds, OFFSET$pBinds, value);
    }
    
    public VkSparseImageMemoryBind pBinds() {
        MemorySegment s = pBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseImageMemoryBind(s);
    }

    public void pBinds(VkSparseImageMemoryBind value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBindsRaw(s);
    }


    public static final class VkSparseImageMemoryBindInfoFactory implements IDataTypeFactory<VkSparseImageMemoryBindInfo> {
        @Override
        public Class<VkSparseImageMemoryBindInfo> clazz() {
            return VkSparseImageMemoryBindInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSparseImageMemoryBindInfo.LAYOUT;
        }

        @Override
        public VkSparseImageMemoryBindInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSparseImageMemoryBindInfo createUninit(MemorySegment segment) {
            return new VkSparseImageMemoryBindInfo(segment);
        }
    }

    public static final VkSparseImageMemoryBindInfoFactory FACTORY = new VkSparseImageMemoryBindInfoFactory();
}