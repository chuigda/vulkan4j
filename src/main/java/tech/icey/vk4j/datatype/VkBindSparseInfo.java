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

public record VkBindSparseInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pWaitSemaphores"),
        ValueLayout.JAVA_INT.withName("bufferBindCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSparseBufferMemoryBindInfo.LAYOUT).withName("pBufferBinds"),
        ValueLayout.JAVA_INT.withName("imageOpaqueBindCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSparseImageOpaqueMemoryBindInfo.LAYOUT).withName("pImageOpaqueBinds"),
        ValueLayout.JAVA_INT.withName("imageBindCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSparseImageMemoryBindInfo.LAYOUT).withName("pImageBinds"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSignalSemaphores")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$waitSemaphoreCount = PathElement.groupElement(2);
    public static final PathElement PATH$pWaitSemaphores = PathElement.groupElement(3);
    public static final PathElement PATH$bufferBindCount = PathElement.groupElement(4);
    public static final PathElement PATH$pBufferBinds = PathElement.groupElement(5);
    public static final PathElement PATH$imageOpaqueBindCount = PathElement.groupElement(6);
    public static final PathElement PATH$pImageOpaqueBinds = PathElement.groupElement(7);
    public static final PathElement PATH$imageBindCount = PathElement.groupElement(8);
    public static final PathElement PATH$pImageBinds = PathElement.groupElement(9);
    public static final PathElement PATH$signalSemaphoreCount = PathElement.groupElement(10);
    public static final PathElement PATH$pSignalSemaphores = PathElement.groupElement(11);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$waitSemaphoreCount = (OfInt) LAYOUT.select(PATH$waitSemaphoreCount);
    public static final AddressLayout LAYOUT$pWaitSemaphores = (AddressLayout) LAYOUT.select(PATH$pWaitSemaphores);
    public static final OfInt LAYOUT$bufferBindCount = (OfInt) LAYOUT.select(PATH$bufferBindCount);
    public static final AddressLayout LAYOUT$pBufferBinds = (AddressLayout) LAYOUT.select(PATH$pBufferBinds);
    public static final OfInt LAYOUT$imageOpaqueBindCount = (OfInt) LAYOUT.select(PATH$imageOpaqueBindCount);
    public static final AddressLayout LAYOUT$pImageOpaqueBinds = (AddressLayout) LAYOUT.select(PATH$pImageOpaqueBinds);
    public static final OfInt LAYOUT$imageBindCount = (OfInt) LAYOUT.select(PATH$imageBindCount);
    public static final AddressLayout LAYOUT$pImageBinds = (AddressLayout) LAYOUT.select(PATH$pImageBinds);
    public static final OfInt LAYOUT$signalSemaphoreCount = (OfInt) LAYOUT.select(PATH$signalSemaphoreCount);
    public static final AddressLayout LAYOUT$pSignalSemaphores = (AddressLayout) LAYOUT.select(PATH$pSignalSemaphores);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreCount = LAYOUT.byteOffset(PATH$waitSemaphoreCount);
    public static final long OFFSET$pWaitSemaphores = LAYOUT.byteOffset(PATH$pWaitSemaphores);
    public static final long OFFSET$bufferBindCount = LAYOUT.byteOffset(PATH$bufferBindCount);
    public static final long OFFSET$pBufferBinds = LAYOUT.byteOffset(PATH$pBufferBinds);
    public static final long OFFSET$imageOpaqueBindCount = LAYOUT.byteOffset(PATH$imageOpaqueBindCount);
    public static final long OFFSET$pImageOpaqueBinds = LAYOUT.byteOffset(PATH$pImageOpaqueBinds);
    public static final long OFFSET$imageBindCount = LAYOUT.byteOffset(PATH$imageBindCount);
    public static final long OFFSET$pImageBinds = LAYOUT.byteOffset(PATH$pImageBinds);
    public static final long OFFSET$signalSemaphoreCount = LAYOUT.byteOffset(PATH$signalSemaphoreCount);
    public static final long OFFSET$pSignalSemaphores = LAYOUT.byteOffset(PATH$pSignalSemaphores);

    public VkBindSparseInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BIND_SPARSE_INFO);
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

    public @unsigned int waitSemaphoreCount() {
        return segment.get(LAYOUT$waitSemaphoreCount, OFFSET$waitSemaphoreCount);
    }

    public void waitSemaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$waitSemaphoreCount, OFFSET$waitSemaphoreCount, value);
    }

    public @pointer(comment="VkSemaphore*") MemorySegment pWaitSemaphoresRaw() {
        return segment.get(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores);
    }

    public void pWaitSemaphoresRaw(@pointer(comment="VkSemaphore*") MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores, value);
    }
    
    public @nullable VkSemaphore pWaitSemaphores() {
        MemorySegment s = pWaitSemaphoresRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore(s);
    }

    public void pWaitSemaphores(@nullable VkSemaphore value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWaitSemaphoresRaw(s);
    }

    public @unsigned int bufferBindCount() {
        return segment.get(LAYOUT$bufferBindCount, OFFSET$bufferBindCount);
    }

    public void bufferBindCount(@unsigned int value) {
        segment.set(LAYOUT$bufferBindCount, OFFSET$bufferBindCount, value);
    }

    public @pointer(comment="VkSparseBufferMemoryBindInfo*") MemorySegment pBufferBindsRaw() {
        return segment.get(LAYOUT$pBufferBinds, OFFSET$pBufferBinds);
    }

    public void pBufferBindsRaw(@pointer(comment="VkSparseBufferMemoryBindInfo*") MemorySegment value) {
        segment.set(LAYOUT$pBufferBinds, OFFSET$pBufferBinds, value);
    }
    
    public @nullable VkSparseBufferMemoryBindInfo pBufferBinds() {
        MemorySegment s = pBufferBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseBufferMemoryBindInfo(s);
    }

    public void pBufferBinds(@nullable VkSparseBufferMemoryBindInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBufferBindsRaw(s);
    }

    public @unsigned int imageOpaqueBindCount() {
        return segment.get(LAYOUT$imageOpaqueBindCount, OFFSET$imageOpaqueBindCount);
    }

    public void imageOpaqueBindCount(@unsigned int value) {
        segment.set(LAYOUT$imageOpaqueBindCount, OFFSET$imageOpaqueBindCount, value);
    }

    public @pointer(comment="VkSparseImageOpaqueMemoryBindInfo*") MemorySegment pImageOpaqueBindsRaw() {
        return segment.get(LAYOUT$pImageOpaqueBinds, OFFSET$pImageOpaqueBinds);
    }

    public void pImageOpaqueBindsRaw(@pointer(comment="VkSparseImageOpaqueMemoryBindInfo*") MemorySegment value) {
        segment.set(LAYOUT$pImageOpaqueBinds, OFFSET$pImageOpaqueBinds, value);
    }
    
    public @nullable VkSparseImageOpaqueMemoryBindInfo pImageOpaqueBinds() {
        MemorySegment s = pImageOpaqueBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseImageOpaqueMemoryBindInfo(s);
    }

    public void pImageOpaqueBinds(@nullable VkSparseImageOpaqueMemoryBindInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageOpaqueBindsRaw(s);
    }

    public @unsigned int imageBindCount() {
        return segment.get(LAYOUT$imageBindCount, OFFSET$imageBindCount);
    }

    public void imageBindCount(@unsigned int value) {
        segment.set(LAYOUT$imageBindCount, OFFSET$imageBindCount, value);
    }

    public @pointer(comment="VkSparseImageMemoryBindInfo*") MemorySegment pImageBindsRaw() {
        return segment.get(LAYOUT$pImageBinds, OFFSET$pImageBinds);
    }

    public void pImageBindsRaw(@pointer(comment="VkSparseImageMemoryBindInfo*") MemorySegment value) {
        segment.set(LAYOUT$pImageBinds, OFFSET$pImageBinds, value);
    }
    
    public @nullable VkSparseImageMemoryBindInfo pImageBinds() {
        MemorySegment s = pImageBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseImageMemoryBindInfo(s);
    }

    public void pImageBinds(@nullable VkSparseImageMemoryBindInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageBindsRaw(s);
    }

    public @unsigned int signalSemaphoreCount() {
        return segment.get(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount);
    }

    public void signalSemaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount, value);
    }

    public @pointer(comment="VkSemaphore*") MemorySegment pSignalSemaphoresRaw() {
        return segment.get(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores);
    }

    public void pSignalSemaphoresRaw(@pointer(comment="VkSemaphore*") MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores, value);
    }
    
    public @nullable VkSemaphore pSignalSemaphores() {
        MemorySegment s = pSignalSemaphoresRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore(s);
    }

    public void pSignalSemaphores(@nullable VkSemaphore value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSignalSemaphoresRaw(s);
    }


    public static final class VkBindSparseInfoFactory implements IDataTypeFactory<VkBindSparseInfo> {
        @Override
        public Class<VkBindSparseInfo> clazz() {
            return VkBindSparseInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBindSparseInfo.LAYOUT;
        }

        @Override
        public VkBindSparseInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkBindSparseInfo createUninit(MemorySegment segment) {
            return new VkBindSparseInfo(segment);
        }
    }

    public static final VkBindSparseInfoFactory FACTORY = new VkBindSparseInfoFactory();
}
