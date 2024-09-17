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

public record VkProtectedSubmitInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("protectedSubmit")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$protectedSubmit = PathElement.groupElement("protectedSubmit");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$protectedSubmit = (OfInt) LAYOUT.select(PATH$protectedSubmit);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$protectedSubmit = LAYOUT.byteOffset(PATH$protectedSubmit);

    public VkProtectedSubmitInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO);
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

    public @unsigned int protectedSubmit() {
        return segment.get(LAYOUT$protectedSubmit, OFFSET$protectedSubmit);
    }

    public void protectedSubmit(@unsigned int value) {
        segment.set(LAYOUT$protectedSubmit, OFFSET$protectedSubmit, value);
    }


    public static final class VkProtectedSubmitInfoFactory implements IFactory<VkProtectedSubmitInfo> {
        @Override
        public Class<VkProtectedSubmitInfo> clazz() {
            return VkProtectedSubmitInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkProtectedSubmitInfo.LAYOUT;
        }

        @Override
        public VkProtectedSubmitInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkProtectedSubmitInfo createUninit(MemorySegment segment) {
            return new VkProtectedSubmitInfo(segment);
        }
    }

    public static final VkProtectedSubmitInfoFactory FACTORY = new VkProtectedSubmitInfoFactory();
}
