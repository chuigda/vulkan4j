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

public record VkSparseImageOpaqueMemoryBindInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.JAVA_INT.withName("bindCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSparseMemoryBind.LAYOUT).withName("pBinds")
    );

    public static final PathElement PATH$image = PathElement.groupElement("image");
    public static final PathElement PATH$bindCount = PathElement.groupElement("bindCount");
    public static final PathElement PATH$pBinds = PathElement.groupElement("pBinds");

    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);
    public static final OfInt LAYOUT$bindCount = (OfInt) LAYOUT.select(PATH$bindCount);
    public static final AddressLayout LAYOUT$pBinds = (AddressLayout) LAYOUT.select(PATH$pBinds);

    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$bindCount = LAYOUT.byteOffset(PATH$bindCount);
    public static final long OFFSET$pBinds = LAYOUT.byteOffset(PATH$pBinds);

    public VkSparseImageOpaqueMemoryBindInfo(MemorySegment segment) {
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

    public @pointer(comment="VkSparseMemoryBind*") MemorySegment pBindsRaw() {
        return segment.get(LAYOUT$pBinds, OFFSET$pBinds);
    }

    public void pBindsRaw(@pointer(comment="VkSparseMemoryBind*") MemorySegment value) {
        segment.set(LAYOUT$pBinds, OFFSET$pBinds, value);
    }
    
    public @nullable VkSparseMemoryBind pBinds() {
        MemorySegment s = pBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseMemoryBind(s);
    }

    public void pBinds(@nullable VkSparseMemoryBind value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBindsRaw(s);
    }


    public static final class VkSparseImageOpaqueMemoryBindInfoFactory implements IDataTypeFactory<VkSparseImageOpaqueMemoryBindInfo> {
        @Override
        public Class<VkSparseImageOpaqueMemoryBindInfo> clazz() {
            return VkSparseImageOpaqueMemoryBindInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSparseImageOpaqueMemoryBindInfo.LAYOUT;
        }

        @Override
        public VkSparseImageOpaqueMemoryBindInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSparseImageOpaqueMemoryBindInfo createUninit(MemorySegment segment) {
            return new VkSparseImageOpaqueMemoryBindInfo(segment);
        }
    }

    public static final VkSparseImageOpaqueMemoryBindInfoFactory FACTORY = new VkSparseImageOpaqueMemoryBindInfoFactory();
}
