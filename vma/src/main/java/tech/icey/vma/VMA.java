package tech.icey.vma;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.panama.RawFunctionLoader;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vma.datatype.*;
import tech.icey.vma.handle.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.handle.*;

public final class VMA {
    public int vmaCreateAllocator(
            @pointer(target=VmaAllocatorCreateInfo.class) VmaAllocatorCreateInfo pCreateInfo,
            @pointer(target=VmaAllocator.class) VmaAllocator.Buffer pAllocator
    ) {
        try {
            return (int) HANDLE$vmaCreateAllocator.invokeExact(
                    pCreateInfo.segment(),
                    pAllocator.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaDestroyAllocator(
            @nullable VmaAllocator allocator
    ) {
        try {
            HANDLE$vmaDestroyAllocator.invokeExact(
                    (MemorySegment) (allocator != null ? allocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaGetAllocatorInfo(
            VmaAllocator allocator,
            @pointer(target=VmaAllocatorInfo.class) VmaAllocatorInfo pAllocatorInfo
    ) {
        try {
            HANDLE$vmaGetAllocatorInfo.invokeExact(
                    allocator.segment(),
                    pAllocatorInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaGetPhysicalDeviceProperties(
            VmaAllocator allocator,
            PointerBuffer ppPhysicalDeviceProperties
    ) {
        try {
            HANDLE$vmaGetPhysicalDeviceProperties.invokeExact(
                    allocator.segment(),
                    ppPhysicalDeviceProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaGetMemoryProperties(
            VmaAllocator allocator,
            PointerBuffer ppPhysicalDeviceMemoryProperties
    ) {
        try {
            HANDLE$vmaGetMemoryProperties.invokeExact(
                    allocator.segment(),
                    ppPhysicalDeviceMemoryProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaGetMemoryTypeProperties(
            VmaAllocator allocator,
            @unsigned int memoryTypeIndex,
            @enumtype(VkMemoryPropertyFlags.class) IntBuffer pFlags
    ) {
        try {
            HANDLE$vmaGetMemoryTypeProperties.invokeExact(
                    allocator.segment(),
                    memoryTypeIndex,
                    pFlags.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaSetCurrentFrameIndex(
            VmaAllocator allocator,
            @unsigned int frameIndex
    ) {
        try {
            HANDLE$vmaSetCurrentFrameIndex.invokeExact(
                    allocator.segment(),
                    frameIndex
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaCalculateStatistics(
            VmaAllocator allocator,
            @pointer(target=VmaTotalStatistics.class) VmaTotalStatistics pStats
    ) {
        try {
            HANDLE$vmaCalculateStatistics.invokeExact(
                    allocator.segment(),
                    pStats.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaGetHeapBudgets(
            VmaAllocator allocator,
            @pointer(target=VmaBudget.class) VmaBudget pBudgets
    ) {
        try {
            HANDLE$vmaGetHeapBudgets.invokeExact(
                    allocator.segment(),
                    pBudgets.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaFindMemoryTypeIndex(
            VmaAllocator allocator,
            @unsigned int memoryTypeBits,
            @pointer(target=VmaAllocationCreateInfo.class) VmaAllocationCreateInfo pAllocationCreateInfo,
            @unsigned IntBuffer pMemoryTypeIndex
    ) {
        try {
            return (int) HANDLE$vmaFindMemoryTypeIndex.invokeExact(
                    allocator.segment(),
                    memoryTypeBits,
                    pAllocationCreateInfo.segment(),
                    pMemoryTypeIndex.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaFindMemoryTypeIndexForBufferInfo(
            VmaAllocator allocator,
            @pointer(target=VkBufferCreateInfo.class) VkBufferCreateInfo pBufferCreateInfo,
            @pointer(target=VmaAllocationCreateInfo.class) VmaAllocationCreateInfo pAllocationCreateInfo,
            @unsigned IntBuffer pMemoryTypeIndex
    ) {
        try {
            return (int) HANDLE$vmaFindMemoryTypeIndexForBufferInfo.invokeExact(
                    allocator.segment(),
                    pBufferCreateInfo.segment(),
                    pAllocationCreateInfo.segment(),
                    pMemoryTypeIndex.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaFindMemoryTypeIndexForImageInfo(
            VmaAllocator allocator,
            @pointer(target=VkImageCreateInfo.class) VkImageCreateInfo pImageCreateInfo,
            @pointer(target=VmaAllocationCreateInfo.class) VmaAllocationCreateInfo pAllocationCreateInfo,
            @unsigned IntBuffer pMemoryTypeIndex
    ) {
        try {
            return (int) HANDLE$vmaFindMemoryTypeIndexForImageInfo.invokeExact(
                    allocator.segment(),
                    pImageCreateInfo.segment(),
                    pAllocationCreateInfo.segment(),
                    pMemoryTypeIndex.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaCreatePool(
            VmaAllocator allocator,
            @pointer(target=VmaPoolCreateInfo.class) VmaPoolCreateInfo pCreateInfo,
            @pointer(target=VmaPool.class) VmaPool.Buffer pPool
    ) {
        try {
            return (int) HANDLE$vmaCreatePool.invokeExact(
                    allocator.segment(),
                    pCreateInfo.segment(),
                    pPool.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaDestroyPool(
            VmaAllocator allocator,
            @nullable VmaPool pool
    ) {
        try {
            HANDLE$vmaDestroyPool.invokeExact(
                    allocator.segment(),
                    (MemorySegment) (pool != null ? pool.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaGetPoolStatistics(
            VmaAllocator allocator,
            VmaPool pool,
            @pointer(target=VmaStatistics.class) VmaStatistics pPoolStats
    ) {
        try {
            HANDLE$vmaGetPoolStatistics.invokeExact(
                    allocator.segment(),
                    pool.segment(),
                    pPoolStats.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaCalculatePoolStatistics(
            VmaAllocator allocator,
            VmaPool pool,
            @pointer(target=VmaDetailedStatistics.class) VmaDetailedStatistics pPoolStats
    ) {
        try {
            HANDLE$vmaCalculatePoolStatistics.invokeExact(
                    allocator.segment(),
                    pool.segment(),
                    pPoolStats.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaCheckPoolCorruption(
            VmaAllocator allocator,
            VmaPool pool
    ) {
        try {
            return (int) HANDLE$vmaCheckPoolCorruption.invokeExact(
                    allocator.segment(),
                    pool.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaGetPoolName(
            VmaAllocator allocator,
            VmaPool pool,
            PointerBuffer ppName
    ) {
        try {
            HANDLE$vmaGetPoolName.invokeExact(
                    allocator.segment(),
                    pool.segment(),
                    ppName.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaSetPoolName(
            VmaAllocator allocator,
            VmaPool pool,
            @nullable ByteBuffer pName
    ) {
        try {
            HANDLE$vmaSetPoolName.invokeExact(
                    allocator.segment(),
                    pool.segment(),
                    (MemorySegment) (pName != null ? pName.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaAllocateMemory(
            VmaAllocator allocator,
            @pointer(target=VkMemoryRequirements.class) VkMemoryRequirements pVkMemoryRequirements,
            @pointer(target=VmaAllocationCreateInfo.class) VmaAllocationCreateInfo pCreateInfo,
            @pointer(target=VmaAllocation.class) VmaAllocation.Buffer pAllocation,
            @nullable @pointer(target=VmaAllocationInfo.class) VmaAllocationInfo pAllocationInfo
    ) {
        try {
            return (int) HANDLE$vmaAllocateMemory.invokeExact(
                    allocator.segment(),
                    pVkMemoryRequirements.segment(),
                    pCreateInfo.segment(),
                    pAllocation.segment(),
                    (MemorySegment) (pAllocationInfo != null ? pAllocationInfo.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaAllocateMemoryPages(
            VmaAllocator allocator,
            @pointer(target=VkMemoryRequirements.class) VkMemoryRequirements pVkMemoryRequirements,
            @pointer(target=VmaAllocationCreateInfo.class) VmaAllocationCreateInfo pCreateInfo,
            long allocationCount,
            @pointer(target=VmaAllocation.class) VmaAllocation.Buffer pAllocations,
            @nullable @pointer(target=VmaAllocationInfo.class) VmaAllocationInfo pAllocationInfo
    ) {
        try {
            return (int) HANDLE$vmaAllocateMemoryPages.invokeExact(
                    allocator.segment(),
                    pVkMemoryRequirements.segment(),
                    pCreateInfo.segment(),
                    MemorySegment.ofAddress(allocationCount),
                    pAllocations.segment(),
                    (MemorySegment) (pAllocationInfo != null ? pAllocationInfo.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaAllocateMemoryForBuffer(
            VmaAllocator allocator,
            VkBuffer buffer,
            @pointer(target=VmaAllocationCreateInfo.class) VmaAllocationCreateInfo pCreateInfo,
            @pointer(target=VmaAllocation.class) VmaAllocation.Buffer pAllocation,
            @nullable @pointer(target=VmaAllocationInfo.class) VmaAllocationInfo pAllocationInfo
    ) {
        try {
            return (int) HANDLE$vmaAllocateMemoryForBuffer.invokeExact(
                    allocator.segment(),
                    buffer.segment(),
                    pCreateInfo.segment(),
                    pAllocation.segment(),
                    (MemorySegment) (pAllocationInfo != null ? pAllocationInfo.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaAllocateMemoryForImage(
            VmaAllocator allocator,
            VkImage image,
            @pointer(target=VmaAllocationCreateInfo.class) VmaAllocationCreateInfo pCreateInfo,
            @pointer(target=VmaAllocation.class) VmaAllocation.Buffer pAllocation,
            @nullable @pointer(target=VmaAllocationInfo.class) VmaAllocationInfo pAllocationInfo
    ) {
        try {
            return (int) HANDLE$vmaAllocateMemoryForImage.invokeExact(
                    allocator.segment(),
                    image.segment(),
                    pCreateInfo.segment(),
                    pAllocation.segment(),
                    (MemorySegment) (pAllocationInfo != null ? pAllocationInfo.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaFreeMemory(
            VmaAllocator allocator,
            @nullable VmaAllocation allocation
    ) {
        try {
            HANDLE$vmaFreeMemory.invokeExact(
                    allocator.segment(),
                    (MemorySegment) (allocation != null ? allocation.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaFreeMemoryPages(
            VmaAllocator allocator,
            long allocationCount,
            @pointer(target=VmaAllocation.class) VmaAllocation.Buffer pAllocations
    ) {
        try {
            HANDLE$vmaFreeMemoryPages.invokeExact(
                    allocator.segment(),
                    MemorySegment.ofAddress(allocationCount),
                    pAllocations.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaGetAllocationInfo(
            VmaAllocator allocator,
            VmaAllocation allocation,
            @pointer(target=VmaAllocationInfo.class) VmaAllocationInfo pAllocationInfo
    ) {
        try {
            HANDLE$vmaGetAllocationInfo.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    pAllocationInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaGetAllocationInfo2(
            VmaAllocator allocator,
            VmaAllocation allocation,
            @pointer(target=VmaAllocationInfo2.class) VmaAllocationInfo2 pAllocationInfo
    ) {
        try {
            HANDLE$vmaGetAllocationInfo2.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    pAllocationInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaSetAllocationUserData(
            VmaAllocator allocator,
            VmaAllocation allocation,
            @pointer(comment="void*") MemorySegment pUserData
    ) {
        try {
            HANDLE$vmaSetAllocationUserData.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    pUserData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaSetAllocationName(
            VmaAllocator allocator,
            VmaAllocation allocation,
            @nullable ByteBuffer pName
    ) {
        try {
            HANDLE$vmaSetAllocationName.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    (MemorySegment) (pName != null ? pName.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaGetAllocationMemoryProperties(
            VmaAllocator allocator,
            VmaAllocation allocation,
            @enumtype(VkMemoryPropertyFlags.class) IntBuffer pFlags
    ) {
        try {
            HANDLE$vmaGetAllocationMemoryProperties.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    pFlags.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaMapMemory(
            VmaAllocator allocator,
            VmaAllocation allocation,
            PointerBuffer ppData
    ) {
        try {
            return (int) HANDLE$vmaMapMemory.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    ppData.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaUnmapMemory(
            VmaAllocator allocator,
            VmaAllocation allocation
    ) {
        try {
            HANDLE$vmaUnmapMemory.invokeExact(
                    allocator.segment(),
                    allocation.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaFlushAllocation(
            VmaAllocator allocator,
            VmaAllocation allocation,
            @unsigned long offset,
            @unsigned long size
    ) {
        try {
            return (int) HANDLE$vmaFlushAllocation.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    offset,
                    size
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaInvalidateAllocation(
            VmaAllocator allocator,
            VmaAllocation allocation,
            @unsigned long offset,
            @unsigned long size
    ) {
        try {
            return (int) HANDLE$vmaInvalidateAllocation.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    offset,
                    size
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaFlushAllocations(
            VmaAllocator allocator,
            @unsigned int allocationCount,
            @nullable @pointer(target=VmaAllocation.class) VmaAllocation.Buffer allocations,
            @nullable @unsigned LongBuffer offsets,
            @nullable @unsigned LongBuffer sizes
    ) {
        try {
            return (int) HANDLE$vmaFlushAllocations.invokeExact(
                    allocator.segment(),
                    allocationCount,
                    (MemorySegment) (allocations != null ? allocations.segment() : MemorySegment.NULL),
                    (MemorySegment) (offsets != null ? offsets.segment() : MemorySegment.NULL),
                    (MemorySegment) (sizes != null ? sizes.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaInvalidateAllocations(
            VmaAllocator allocator,
            @unsigned int allocationCount,
            @nullable @pointer(target=VmaAllocation.class) VmaAllocation.Buffer allocations,
            @nullable @unsigned LongBuffer offsets,
            @nullable @unsigned LongBuffer sizes
    ) {
        try {
            return (int) HANDLE$vmaInvalidateAllocations.invokeExact(
                    allocator.segment(),
                    allocationCount,
                    (MemorySegment) (allocations != null ? allocations.segment() : MemorySegment.NULL),
                    (MemorySegment) (offsets != null ? offsets.segment() : MemorySegment.NULL),
                    (MemorySegment) (sizes != null ? sizes.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaCopyMemoryToAllocation(
            VmaAllocator allocator,
            @pointer(comment="void*") MemorySegment pSrcHostPointer,
            VmaAllocation dstAllocation,
            @unsigned long dstAllocationLocalOffset,
            @unsigned long size
    ) {
        try {
            return (int) HANDLE$vmaCopyMemoryToAllocation.invokeExact(
                    allocator.segment(),
                    pSrcHostPointer,
                    dstAllocation.segment(),
                    dstAllocationLocalOffset,
                    size
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaCopyAllocationToMemory(
            VmaAllocator allocator,
            VmaAllocation srcAllocation,
            @unsigned long srcAllocationLocalOffset,
            @pointer(comment="void*") MemorySegment pDstHostPointer,
            @unsigned long size
    ) {
        try {
            return (int) HANDLE$vmaCopyAllocationToMemory.invokeExact(
                    allocator.segment(),
                    srcAllocation.segment(),
                    srcAllocationLocalOffset,
                    pDstHostPointer,
                    size
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaCheckCorruption(
            VmaAllocator allocator,
            @unsigned int memoryTypeBits
    ) {
        try {
            return (int) HANDLE$vmaCheckCorruption.invokeExact(
                    allocator.segment(),
                    memoryTypeBits
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaBeginDefragmentation(
            VmaAllocator allocator,
            @pointer(target=VmaDefragmentationInfo.class) VmaDefragmentationInfo pInfo,
            @pointer(target=VmaDefragmentationContext.class) VmaDefragmentationContext.Buffer pContext
    ) {
        try {
            return (int) HANDLE$vmaBeginDefragmentation.invokeExact(
                    allocator.segment(),
                    pInfo.segment(),
                    pContext.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaEndDefragmentation(
            VmaAllocator allocator,
            VmaDefragmentationContext context,
            @nullable @pointer(target=VmaDefragmentationStats.class) VmaDefragmentationStats pStats
    ) {
        try {
            HANDLE$vmaEndDefragmentation.invokeExact(
                    allocator.segment(),
                    context.segment(),
                    (MemorySegment) (pStats != null ? pStats.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaBeginDefragmentationPass(
            VmaAllocator allocator,
            VmaDefragmentationContext context,
            @pointer(target=VmaDefragmentationPassMoveInfo.class) VmaDefragmentationPassMoveInfo pPassInfo
    ) {
        try {
            return (int) HANDLE$vmaBeginDefragmentationPass.invokeExact(
                    allocator.segment(),
                    context.segment(),
                    pPassInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaEndDefragmentationPass(
            VmaAllocator allocator,
            VmaDefragmentationContext context,
            @pointer(target=VmaDefragmentationPassMoveInfo.class) VmaDefragmentationPassMoveInfo pPassInfo
    ) {
        try {
            return (int) HANDLE$vmaEndDefragmentationPass.invokeExact(
                    allocator.segment(),
                    context.segment(),
                    pPassInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaBindBufferMemory(
            VmaAllocator allocator,
            VmaAllocation allocation,
            VkBuffer buffer
    ) {
        try {
            return (int) HANDLE$vmaBindBufferMemory.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    buffer.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaBindBufferMemory2(
            VmaAllocator allocator,
            VmaAllocation allocation,
            @unsigned long allocationLocalOffset,
            VkBuffer buffer,
            @pointer(comment="void*") MemorySegment pNext
    ) {
        try {
            return (int) HANDLE$vmaBindBufferMemory2.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    allocationLocalOffset,
                    buffer.segment(),
                    pNext
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaBindImageMemory(
            VmaAllocator allocator,
            VmaAllocation allocation,
            VkImage image
    ) {
        try {
            return (int) HANDLE$vmaBindImageMemory.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    image.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaBindImageMemory2(
            VmaAllocator allocator,
            VmaAllocation allocation,
            @unsigned long allocationLocalOffset,
            VkImage image,
            @pointer(comment="void*") MemorySegment pNext
    ) {
        try {
            return (int) HANDLE$vmaBindImageMemory2.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    allocationLocalOffset,
                    image.segment(),
                    pNext
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaCreateBuffer(
            VmaAllocator allocator,
            @pointer(target=VkBufferCreateInfo.class) VkBufferCreateInfo pBufferCreateInfo,
            @pointer(target=VmaAllocationCreateInfo.class) VmaAllocationCreateInfo pAllocationCreateInfo,
            @pointer(target=VkBuffer.class) VkBuffer.Buffer pBuffer,
            @pointer(target=VmaAllocation.class) VmaAllocation.Buffer pAllocation,
            @nullable @pointer(target=VmaAllocationInfo.class) VmaAllocationInfo pAllocationInfo
    ) {
        try {
            return (int) HANDLE$vmaCreateBuffer.invokeExact(
                    allocator.segment(),
                    pBufferCreateInfo.segment(),
                    pAllocationCreateInfo.segment(),
                    pBuffer.segment(),
                    pAllocation.segment(),
                    (MemorySegment) (pAllocationInfo != null ? pAllocationInfo.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaCreateBufferWithAlignment(
            VmaAllocator allocator,
            @pointer(target=VkBufferCreateInfo.class) VkBufferCreateInfo pBufferCreateInfo,
            @pointer(target=VmaAllocationCreateInfo.class) VmaAllocationCreateInfo pAllocationCreateInfo,
            @unsigned long minAlignment,
            @pointer(target=VkBuffer.class) VkBuffer.Buffer pBuffer,
            @pointer(target=VmaAllocation.class) VmaAllocation.Buffer pAllocation,
            @nullable @pointer(target=VmaAllocationInfo.class) VmaAllocationInfo pAllocationInfo
    ) {
        try {
            return (int) HANDLE$vmaCreateBufferWithAlignment.invokeExact(
                    allocator.segment(),
                    pBufferCreateInfo.segment(),
                    pAllocationCreateInfo.segment(),
                    minAlignment,
                    pBuffer.segment(),
                    pAllocation.segment(),
                    (MemorySegment) (pAllocationInfo != null ? pAllocationInfo.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaCreateAliasingBuffer(
            VmaAllocator allocator,
            VmaAllocation allocation,
            @pointer(target=VkBufferCreateInfo.class) VkBufferCreateInfo pBufferCreateInfo,
            @pointer(target=VkBuffer.class) VkBuffer.Buffer pBuffer
    ) {
        try {
            return (int) HANDLE$vmaCreateAliasingBuffer.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    pBufferCreateInfo.segment(),
                    pBuffer.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaCreateAliasingBuffer2(
            VmaAllocator allocator,
            VmaAllocation allocation,
            @unsigned long allocationLocalOffset,
            @pointer(target=VkBufferCreateInfo.class) VkBufferCreateInfo pBufferCreateInfo,
            @pointer(target=VkBuffer.class) VkBuffer.Buffer pBuffer
    ) {
        try {
            return (int) HANDLE$vmaCreateAliasingBuffer2.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    allocationLocalOffset,
                    pBufferCreateInfo.segment(),
                    pBuffer.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaDestroyBuffer(
            VmaAllocator allocator,
            @nullable VkBuffer buffer,
            @nullable VmaAllocation allocation
    ) {
        try {
            HANDLE$vmaDestroyBuffer.invokeExact(
                    allocator.segment(),
                    (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL),
                    (MemorySegment) (allocation != null ? allocation.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaCreateImage(
            VmaAllocator allocator,
            @pointer(target=VkImageCreateInfo.class) VkImageCreateInfo pImageCreateInfo,
            @pointer(target=VmaAllocationCreateInfo.class) VmaAllocationCreateInfo pAllocationCreateInfo,
            @pointer(target=VkImage.class) VkImage.Buffer pImage,
            @pointer(target=VmaAllocation.class) VmaAllocation.Buffer pAllocation,
            @nullable @pointer(target=VmaAllocationInfo.class) VmaAllocationInfo pAllocationInfo
    ) {
        try {
            return (int) HANDLE$vmaCreateImage.invokeExact(
                    allocator.segment(),
                    pImageCreateInfo.segment(),
                    pAllocationCreateInfo.segment(),
                    pImage.segment(),
                    pAllocation.segment(),
                    (MemorySegment) (pAllocationInfo != null ? pAllocationInfo.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaCreateAliasingImage(
            VmaAllocator allocator,
            VmaAllocation allocation,
            @pointer(target=VkImageCreateInfo.class) VkImageCreateInfo pImageCreateInfo,
            @pointer(target=VkImage.class) VkImage.Buffer pImage
    ) {
        try {
            return (int) HANDLE$vmaCreateAliasingImage.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    pImageCreateInfo.segment(),
                    pImage.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaCreateAliasingImage2(
            VmaAllocator allocator,
            VmaAllocation allocation,
            @unsigned long allocationLocalOffset,
            @pointer(target=VkImageCreateInfo.class) VkImageCreateInfo pImageCreateInfo,
            @pointer(target=VkImage.class) VkImage.Buffer pImage
    ) {
        try {
            return (int) HANDLE$vmaCreateAliasingImage2.invokeExact(
                    allocator.segment(),
                    allocation.segment(),
                    allocationLocalOffset,
                    pImageCreateInfo.segment(),
                    pImage.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaDestroyImage(
            VmaAllocator allocator,
            @nullable VkImage image,
            @nullable VmaAllocation allocation
    ) {
        try {
            HANDLE$vmaDestroyImage.invokeExact(
                    allocator.segment(),
                    (MemorySegment) (image != null ? image.segment() : MemorySegment.NULL),
                    (MemorySegment) (allocation != null ? allocation.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaCreateVirtualBlock(
            @pointer(target=VmaVirtualBlockCreateInfo.class) VmaVirtualBlockCreateInfo pCreateInfo,
            @pointer(target=VmaVirtualBlock.class) VmaVirtualBlock.Buffer pVirtualBlock
    ) {
        try {
            return (int) HANDLE$vmaCreateVirtualBlock.invokeExact(
                    pCreateInfo.segment(),
                    pVirtualBlock.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaDestroyVirtualBlock(
            @nullable VmaVirtualBlock virtualBlock
    ) {
        try {
            HANDLE$vmaDestroyVirtualBlock.invokeExact(
                    (MemorySegment) (virtualBlock != null ? virtualBlock.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vmaIsVirtualBlockEmpty(
            VmaVirtualBlock virtualBlock
    ) {
        try {
            return (int) HANDLE$vmaIsVirtualBlockEmpty.invokeExact(
                    virtualBlock.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaGetVirtualAllocationInfo(
            VmaVirtualBlock virtualBlock,
            VmaVirtualAllocation allocation,
            @pointer(target=VmaVirtualAllocationInfo.class) VmaVirtualAllocationInfo pVirtualAllocInfo
    ) {
        try {
            HANDLE$vmaGetVirtualAllocationInfo.invokeExact(
                    virtualBlock.segment(),
                    allocation.segment(),
                    pVirtualAllocInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public int vmaVirtualAllocate(
            VmaVirtualBlock virtualBlock,
            @pointer(target=VmaVirtualAllocationCreateInfo.class) VmaVirtualAllocationCreateInfo pCreateInfo,
            @pointer(target=VmaVirtualAllocation.class) VmaVirtualAllocation.Buffer pAllocation,
            @nullable @unsigned LongBuffer pOffset
    ) {
        try {
            return (int) HANDLE$vmaVirtualAllocate.invokeExact(
                    virtualBlock.segment(),
                    pCreateInfo.segment(),
                    pAllocation.segment(),
                    (MemorySegment) (pOffset != null ? pOffset.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaVirtualFree(
            VmaVirtualBlock virtualBlock,
            @nullable VmaVirtualAllocation allocation
    ) {
        try {
            HANDLE$vmaVirtualFree.invokeExact(
                    virtualBlock.segment(),
                    (MemorySegment) (allocation != null ? allocation.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaClearVirtualBlock(
            VmaVirtualBlock virtualBlock
    ) {
        try {
            HANDLE$vmaClearVirtualBlock.invokeExact(
                    virtualBlock.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaSetVirtualAllocationUserData(
            VmaVirtualBlock virtualBlock,
            VmaVirtualAllocation allocation,
            @pointer(comment="void*") MemorySegment pUserData
    ) {
        try {
            HANDLE$vmaSetVirtualAllocationUserData.invokeExact(
                    virtualBlock.segment(),
                    allocation.segment(),
                    pUserData
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaGetVirtualBlockStatistics(
            VmaVirtualBlock virtualBlock,
            @pointer(target=VmaStatistics.class) VmaStatistics pStats
    ) {
        try {
            HANDLE$vmaGetVirtualBlockStatistics.invokeExact(
                    virtualBlock.segment(),
                    pStats.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaCalculateVirtualBlockStatistics(
            VmaVirtualBlock virtualBlock,
            @pointer(target=VmaDetailedStatistics.class) VmaDetailedStatistics pStats
    ) {
        try {
            HANDLE$vmaCalculateVirtualBlockStatistics.invokeExact(
                    virtualBlock.segment(),
                    pStats.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaBuildVirtualBlockStatsString(
            VmaVirtualBlock virtualBlock,
            PointerBuffer ppStatsString,
            @unsigned int detailedMap
    ) {
        try {
            HANDLE$vmaBuildVirtualBlockStatsString.invokeExact(
                    virtualBlock.segment(),
                    ppStatsString.segment(),
                    detailedMap
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaFreeVirtualBlockStatsString(
            VmaVirtualBlock virtualBlock,
            @nullable ByteBuffer pStatsString
    ) {
        try {
            HANDLE$vmaFreeVirtualBlockStatsString.invokeExact(
                    virtualBlock.segment(),
                    (MemorySegment) (pStatsString != null ? pStatsString.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaBuildStatsString(
            VmaAllocator allocator,
            PointerBuffer ppStatsString,
            @unsigned int detailedMap
    ) {
        try {
            HANDLE$vmaBuildStatsString.invokeExact(
                    allocator.segment(),
                    ppStatsString.segment(),
                    detailedMap
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vmaFreeStatsString(
            VmaAllocator allocator,
            @nullable ByteBuffer pStatsString
    ) {
        try {
            HANDLE$vmaFreeStatsString.invokeExact(
                    allocator.segment(),
                    (MemorySegment) (pStatsString != null ? pStatsString.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vk4jSetJavaTrace(
            @pointer(comment="void*") MemorySegment javaTrace
    ) {
        try {
            HANDLE$vk4jSetJavaTrace.invokeExact(
                    javaTrace
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public static final FunctionDescriptor DESCRIPTOR$vmaCreateAllocator = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocatorCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaDestroyAllocator = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaGetAllocatorInfo = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocatorInfo.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaGetPhysicalDeviceProperties = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceProperties.LAYOUT))
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaGetMemoryProperties = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceMemoryProperties.LAYOUT))
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaGetMemoryTypeProperties = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaSetCurrentFrameIndex = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCalculateStatistics = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaTotalStatistics.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaGetHeapBudgets = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaBudget.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaFindMemoryTypeIndex = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaFindMemoryTypeIndexForBufferInfo = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaFindMemoryTypeIndexForImageInfo = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCreatePool = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaPoolCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaDestroyPool = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaGetPoolStatistics = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaStatistics.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCalculatePoolStatistics = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaDetailedStatistics.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCheckPoolCorruption = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaGetPoolName = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE))
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaSetPoolName = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaAllocateMemory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationInfo.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaAllocateMemoryPages = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMemoryRequirements.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationCreateInfo.LAYOUT),
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationInfo.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaAllocateMemoryForBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationInfo.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaAllocateMemoryForImage = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationInfo.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaFreeMemory = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaFreeMemoryPages = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            NativeLayout.C_SIZE_T,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaGetAllocationInfo = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationInfo.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaGetAllocationInfo2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationInfo2.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaSetAllocationUserData = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaSetAllocationName = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaGetAllocationMemoryProperties = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaMapMemory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaUnmapMemory = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaFlushAllocation = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaInvalidateAllocation = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaFlushAllocations = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaInvalidateAllocations = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCopyMemoryToAllocation = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCopyAllocationToMemory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCheckCorruption = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaBeginDefragmentation = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaDefragmentationInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaEndDefragmentation = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaDefragmentationStats.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaBeginDefragmentationPass = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaDefragmentationPassMoveInfo.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaEndDefragmentationPass = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaDefragmentationPassMoveInfo.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaBindBufferMemory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaBindBufferMemory2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaBindImageMemory = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaBindImageMemory2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCreateBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationInfo.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCreateBufferWithAlignment = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationCreateInfo.LAYOUT),
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationInfo.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCreateAliasingBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCreateAliasingBuffer2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(VkBufferCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaDestroyBuffer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCreateImage = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(VmaAllocationInfo.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCreateAliasingImage = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImageCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCreateAliasingImage2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(VkImageCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaDestroyImage = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCreateVirtualBlock = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VmaVirtualBlockCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaDestroyVirtualBlock = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaIsVirtualBlockEmpty = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaGetVirtualAllocationInfo = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaVirtualAllocationInfo.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaVirtualAllocate = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaVirtualAllocationCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaVirtualFree = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaClearVirtualBlock = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaSetVirtualAllocationUserData = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaGetVirtualBlockStatistics = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaStatistics.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaCalculateVirtualBlockStatistics = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VmaDetailedStatistics.LAYOUT)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaBuildVirtualBlockStatsString = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)),
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaFreeVirtualBlockStatsString = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaBuildStatsString = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)),
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$vmaFreeStatsString = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$vk4jSetJavaTrace = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );

    public final @nullable MemorySegment SEGMENT$vmaCreateAllocator;
    public final @nullable MemorySegment SEGMENT$vmaDestroyAllocator;
    public final @nullable MemorySegment SEGMENT$vmaGetAllocatorInfo;
    public final @nullable MemorySegment SEGMENT$vmaGetPhysicalDeviceProperties;
    public final @nullable MemorySegment SEGMENT$vmaGetMemoryProperties;
    public final @nullable MemorySegment SEGMENT$vmaGetMemoryTypeProperties;
    public final @nullable MemorySegment SEGMENT$vmaSetCurrentFrameIndex;
    public final @nullable MemorySegment SEGMENT$vmaCalculateStatistics;
    public final @nullable MemorySegment SEGMENT$vmaGetHeapBudgets;
    public final @nullable MemorySegment SEGMENT$vmaFindMemoryTypeIndex;
    public final @nullable MemorySegment SEGMENT$vmaFindMemoryTypeIndexForBufferInfo;
    public final @nullable MemorySegment SEGMENT$vmaFindMemoryTypeIndexForImageInfo;
    public final @nullable MemorySegment SEGMENT$vmaCreatePool;
    public final @nullable MemorySegment SEGMENT$vmaDestroyPool;
    public final @nullable MemorySegment SEGMENT$vmaGetPoolStatistics;
    public final @nullable MemorySegment SEGMENT$vmaCalculatePoolStatistics;
    public final @nullable MemorySegment SEGMENT$vmaCheckPoolCorruption;
    public final @nullable MemorySegment SEGMENT$vmaGetPoolName;
    public final @nullable MemorySegment SEGMENT$vmaSetPoolName;
    public final @nullable MemorySegment SEGMENT$vmaAllocateMemory;
    public final @nullable MemorySegment SEGMENT$vmaAllocateMemoryPages;
    public final @nullable MemorySegment SEGMENT$vmaAllocateMemoryForBuffer;
    public final @nullable MemorySegment SEGMENT$vmaAllocateMemoryForImage;
    public final @nullable MemorySegment SEGMENT$vmaFreeMemory;
    public final @nullable MemorySegment SEGMENT$vmaFreeMemoryPages;
    public final @nullable MemorySegment SEGMENT$vmaGetAllocationInfo;
    public final @nullable MemorySegment SEGMENT$vmaGetAllocationInfo2;
    public final @nullable MemorySegment SEGMENT$vmaSetAllocationUserData;
    public final @nullable MemorySegment SEGMENT$vmaSetAllocationName;
    public final @nullable MemorySegment SEGMENT$vmaGetAllocationMemoryProperties;
    public final @nullable MemorySegment SEGMENT$vmaMapMemory;
    public final @nullable MemorySegment SEGMENT$vmaUnmapMemory;
    public final @nullable MemorySegment SEGMENT$vmaFlushAllocation;
    public final @nullable MemorySegment SEGMENT$vmaInvalidateAllocation;
    public final @nullable MemorySegment SEGMENT$vmaFlushAllocations;
    public final @nullable MemorySegment SEGMENT$vmaInvalidateAllocations;
    public final @nullable MemorySegment SEGMENT$vmaCopyMemoryToAllocation;
    public final @nullable MemorySegment SEGMENT$vmaCopyAllocationToMemory;
    public final @nullable MemorySegment SEGMENT$vmaCheckCorruption;
    public final @nullable MemorySegment SEGMENT$vmaBeginDefragmentation;
    public final @nullable MemorySegment SEGMENT$vmaEndDefragmentation;
    public final @nullable MemorySegment SEGMENT$vmaBeginDefragmentationPass;
    public final @nullable MemorySegment SEGMENT$vmaEndDefragmentationPass;
    public final @nullable MemorySegment SEGMENT$vmaBindBufferMemory;
    public final @nullable MemorySegment SEGMENT$vmaBindBufferMemory2;
    public final @nullable MemorySegment SEGMENT$vmaBindImageMemory;
    public final @nullable MemorySegment SEGMENT$vmaBindImageMemory2;
    public final @nullable MemorySegment SEGMENT$vmaCreateBuffer;
    public final @nullable MemorySegment SEGMENT$vmaCreateBufferWithAlignment;
    public final @nullable MemorySegment SEGMENT$vmaCreateAliasingBuffer;
    public final @nullable MemorySegment SEGMENT$vmaCreateAliasingBuffer2;
    public final @nullable MemorySegment SEGMENT$vmaDestroyBuffer;
    public final @nullable MemorySegment SEGMENT$vmaCreateImage;
    public final @nullable MemorySegment SEGMENT$vmaCreateAliasingImage;
    public final @nullable MemorySegment SEGMENT$vmaCreateAliasingImage2;
    public final @nullable MemorySegment SEGMENT$vmaDestroyImage;
    public final @nullable MemorySegment SEGMENT$vmaCreateVirtualBlock;
    public final @nullable MemorySegment SEGMENT$vmaDestroyVirtualBlock;
    public final @nullable MemorySegment SEGMENT$vmaIsVirtualBlockEmpty;
    public final @nullable MemorySegment SEGMENT$vmaGetVirtualAllocationInfo;
    public final @nullable MemorySegment SEGMENT$vmaVirtualAllocate;
    public final @nullable MemorySegment SEGMENT$vmaVirtualFree;
    public final @nullable MemorySegment SEGMENT$vmaClearVirtualBlock;
    public final @nullable MemorySegment SEGMENT$vmaSetVirtualAllocationUserData;
    public final @nullable MemorySegment SEGMENT$vmaGetVirtualBlockStatistics;
    public final @nullable MemorySegment SEGMENT$vmaCalculateVirtualBlockStatistics;
    public final @nullable MemorySegment SEGMENT$vmaBuildVirtualBlockStatsString;
    public final @nullable MemorySegment SEGMENT$vmaFreeVirtualBlockStatsString;
    public final @nullable MemorySegment SEGMENT$vmaBuildStatsString;
    public final @nullable MemorySegment SEGMENT$vmaFreeStatsString;
    public final @nullable MemorySegment SEGMENT$vk4jSetJavaTrace;

    public final @nullable MethodHandle HANDLE$vmaCreateAllocator;
    public final @nullable MethodHandle HANDLE$vmaDestroyAllocator;
    public final @nullable MethodHandle HANDLE$vmaGetAllocatorInfo;
    public final @nullable MethodHandle HANDLE$vmaGetPhysicalDeviceProperties;
    public final @nullable MethodHandle HANDLE$vmaGetMemoryProperties;
    public final @nullable MethodHandle HANDLE$vmaGetMemoryTypeProperties;
    public final @nullable MethodHandle HANDLE$vmaSetCurrentFrameIndex;
    public final @nullable MethodHandle HANDLE$vmaCalculateStatistics;
    public final @nullable MethodHandle HANDLE$vmaGetHeapBudgets;
    public final @nullable MethodHandle HANDLE$vmaFindMemoryTypeIndex;
    public final @nullable MethodHandle HANDLE$vmaFindMemoryTypeIndexForBufferInfo;
    public final @nullable MethodHandle HANDLE$vmaFindMemoryTypeIndexForImageInfo;
    public final @nullable MethodHandle HANDLE$vmaCreatePool;
    public final @nullable MethodHandle HANDLE$vmaDestroyPool;
    public final @nullable MethodHandle HANDLE$vmaGetPoolStatistics;
    public final @nullable MethodHandle HANDLE$vmaCalculatePoolStatistics;
    public final @nullable MethodHandle HANDLE$vmaCheckPoolCorruption;
    public final @nullable MethodHandle HANDLE$vmaGetPoolName;
    public final @nullable MethodHandle HANDLE$vmaSetPoolName;
    public final @nullable MethodHandle HANDLE$vmaAllocateMemory;
    public final @nullable MethodHandle HANDLE$vmaAllocateMemoryPages;
    public final @nullable MethodHandle HANDLE$vmaAllocateMemoryForBuffer;
    public final @nullable MethodHandle HANDLE$vmaAllocateMemoryForImage;
    public final @nullable MethodHandle HANDLE$vmaFreeMemory;
    public final @nullable MethodHandle HANDLE$vmaFreeMemoryPages;
    public final @nullable MethodHandle HANDLE$vmaGetAllocationInfo;
    public final @nullable MethodHandle HANDLE$vmaGetAllocationInfo2;
    public final @nullable MethodHandle HANDLE$vmaSetAllocationUserData;
    public final @nullable MethodHandle HANDLE$vmaSetAllocationName;
    public final @nullable MethodHandle HANDLE$vmaGetAllocationMemoryProperties;
    public final @nullable MethodHandle HANDLE$vmaMapMemory;
    public final @nullable MethodHandle HANDLE$vmaUnmapMemory;
    public final @nullable MethodHandle HANDLE$vmaFlushAllocation;
    public final @nullable MethodHandle HANDLE$vmaInvalidateAllocation;
    public final @nullable MethodHandle HANDLE$vmaFlushAllocations;
    public final @nullable MethodHandle HANDLE$vmaInvalidateAllocations;
    public final @nullable MethodHandle HANDLE$vmaCopyMemoryToAllocation;
    public final @nullable MethodHandle HANDLE$vmaCopyAllocationToMemory;
    public final @nullable MethodHandle HANDLE$vmaCheckCorruption;
    public final @nullable MethodHandle HANDLE$vmaBeginDefragmentation;
    public final @nullable MethodHandle HANDLE$vmaEndDefragmentation;
    public final @nullable MethodHandle HANDLE$vmaBeginDefragmentationPass;
    public final @nullable MethodHandle HANDLE$vmaEndDefragmentationPass;
    public final @nullable MethodHandle HANDLE$vmaBindBufferMemory;
    public final @nullable MethodHandle HANDLE$vmaBindBufferMemory2;
    public final @nullable MethodHandle HANDLE$vmaBindImageMemory;
    public final @nullable MethodHandle HANDLE$vmaBindImageMemory2;
    public final @nullable MethodHandle HANDLE$vmaCreateBuffer;
    public final @nullable MethodHandle HANDLE$vmaCreateBufferWithAlignment;
    public final @nullable MethodHandle HANDLE$vmaCreateAliasingBuffer;
    public final @nullable MethodHandle HANDLE$vmaCreateAliasingBuffer2;
    public final @nullable MethodHandle HANDLE$vmaDestroyBuffer;
    public final @nullable MethodHandle HANDLE$vmaCreateImage;
    public final @nullable MethodHandle HANDLE$vmaCreateAliasingImage;
    public final @nullable MethodHandle HANDLE$vmaCreateAliasingImage2;
    public final @nullable MethodHandle HANDLE$vmaDestroyImage;
    public final @nullable MethodHandle HANDLE$vmaCreateVirtualBlock;
    public final @nullable MethodHandle HANDLE$vmaDestroyVirtualBlock;
    public final @nullable MethodHandle HANDLE$vmaIsVirtualBlockEmpty;
    public final @nullable MethodHandle HANDLE$vmaGetVirtualAllocationInfo;
    public final @nullable MethodHandle HANDLE$vmaVirtualAllocate;
    public final @nullable MethodHandle HANDLE$vmaVirtualFree;
    public final @nullable MethodHandle HANDLE$vmaClearVirtualBlock;
    public final @nullable MethodHandle HANDLE$vmaSetVirtualAllocationUserData;
    public final @nullable MethodHandle HANDLE$vmaGetVirtualBlockStatistics;
    public final @nullable MethodHandle HANDLE$vmaCalculateVirtualBlockStatistics;
    public final @nullable MethodHandle HANDLE$vmaBuildVirtualBlockStatsString;
    public final @nullable MethodHandle HANDLE$vmaFreeVirtualBlockStatsString;
    public final @nullable MethodHandle HANDLE$vmaBuildStatsString;
    public final @nullable MethodHandle HANDLE$vmaFreeStatsString;
    public final @nullable MethodHandle HANDLE$vk4jSetJavaTrace;

    public VMA(RawFunctionLoader loader) {
        SEGMENT$vmaCreateAllocator = loader.apply("vmaCreateAllocator");
        HANDLE$vmaCreateAllocator = RawFunctionLoader.link(SEGMENT$vmaCreateAllocator, DESCRIPTOR$vmaCreateAllocator);
        SEGMENT$vmaDestroyAllocator = loader.apply("vmaDestroyAllocator");
        HANDLE$vmaDestroyAllocator = RawFunctionLoader.link(SEGMENT$vmaDestroyAllocator, DESCRIPTOR$vmaDestroyAllocator);
        SEGMENT$vmaGetAllocatorInfo = loader.apply("vmaGetAllocatorInfo");
        HANDLE$vmaGetAllocatorInfo = RawFunctionLoader.link(SEGMENT$vmaGetAllocatorInfo, DESCRIPTOR$vmaGetAllocatorInfo);
        SEGMENT$vmaGetPhysicalDeviceProperties = loader.apply("vmaGetPhysicalDeviceProperties");
        HANDLE$vmaGetPhysicalDeviceProperties = RawFunctionLoader.link(SEGMENT$vmaGetPhysicalDeviceProperties, DESCRIPTOR$vmaGetPhysicalDeviceProperties);
        SEGMENT$vmaGetMemoryProperties = loader.apply("vmaGetMemoryProperties");
        HANDLE$vmaGetMemoryProperties = RawFunctionLoader.link(SEGMENT$vmaGetMemoryProperties, DESCRIPTOR$vmaGetMemoryProperties);
        SEGMENT$vmaGetMemoryTypeProperties = loader.apply("vmaGetMemoryTypeProperties");
        HANDLE$vmaGetMemoryTypeProperties = RawFunctionLoader.link(SEGMENT$vmaGetMemoryTypeProperties, DESCRIPTOR$vmaGetMemoryTypeProperties);
        SEGMENT$vmaSetCurrentFrameIndex = loader.apply("vmaSetCurrentFrameIndex");
        HANDLE$vmaSetCurrentFrameIndex = RawFunctionLoader.link(SEGMENT$vmaSetCurrentFrameIndex, DESCRIPTOR$vmaSetCurrentFrameIndex);
        SEGMENT$vmaCalculateStatistics = loader.apply("vmaCalculateStatistics");
        HANDLE$vmaCalculateStatistics = RawFunctionLoader.link(SEGMENT$vmaCalculateStatistics, DESCRIPTOR$vmaCalculateStatistics);
        SEGMENT$vmaGetHeapBudgets = loader.apply("vmaGetHeapBudgets");
        HANDLE$vmaGetHeapBudgets = RawFunctionLoader.link(SEGMENT$vmaGetHeapBudgets, DESCRIPTOR$vmaGetHeapBudgets);
        SEGMENT$vmaFindMemoryTypeIndex = loader.apply("vmaFindMemoryTypeIndex");
        HANDLE$vmaFindMemoryTypeIndex = RawFunctionLoader.link(SEGMENT$vmaFindMemoryTypeIndex, DESCRIPTOR$vmaFindMemoryTypeIndex);
        SEGMENT$vmaFindMemoryTypeIndexForBufferInfo = loader.apply("vmaFindMemoryTypeIndexForBufferInfo");
        HANDLE$vmaFindMemoryTypeIndexForBufferInfo = RawFunctionLoader.link(SEGMENT$vmaFindMemoryTypeIndexForBufferInfo, DESCRIPTOR$vmaFindMemoryTypeIndexForBufferInfo);
        SEGMENT$vmaFindMemoryTypeIndexForImageInfo = loader.apply("vmaFindMemoryTypeIndexForImageInfo");
        HANDLE$vmaFindMemoryTypeIndexForImageInfo = RawFunctionLoader.link(SEGMENT$vmaFindMemoryTypeIndexForImageInfo, DESCRIPTOR$vmaFindMemoryTypeIndexForImageInfo);
        SEGMENT$vmaCreatePool = loader.apply("vmaCreatePool");
        HANDLE$vmaCreatePool = RawFunctionLoader.link(SEGMENT$vmaCreatePool, DESCRIPTOR$vmaCreatePool);
        SEGMENT$vmaDestroyPool = loader.apply("vmaDestroyPool");
        HANDLE$vmaDestroyPool = RawFunctionLoader.link(SEGMENT$vmaDestroyPool, DESCRIPTOR$vmaDestroyPool);
        SEGMENT$vmaGetPoolStatistics = loader.apply("vmaGetPoolStatistics");
        HANDLE$vmaGetPoolStatistics = RawFunctionLoader.link(SEGMENT$vmaGetPoolStatistics, DESCRIPTOR$vmaGetPoolStatistics);
        SEGMENT$vmaCalculatePoolStatistics = loader.apply("vmaCalculatePoolStatistics");
        HANDLE$vmaCalculatePoolStatistics = RawFunctionLoader.link(SEGMENT$vmaCalculatePoolStatistics, DESCRIPTOR$vmaCalculatePoolStatistics);
        SEGMENT$vmaCheckPoolCorruption = loader.apply("vmaCheckPoolCorruption");
        HANDLE$vmaCheckPoolCorruption = RawFunctionLoader.link(SEGMENT$vmaCheckPoolCorruption, DESCRIPTOR$vmaCheckPoolCorruption);
        SEGMENT$vmaGetPoolName = loader.apply("vmaGetPoolName");
        HANDLE$vmaGetPoolName = RawFunctionLoader.link(SEGMENT$vmaGetPoolName, DESCRIPTOR$vmaGetPoolName);
        SEGMENT$vmaSetPoolName = loader.apply("vmaSetPoolName");
        HANDLE$vmaSetPoolName = RawFunctionLoader.link(SEGMENT$vmaSetPoolName, DESCRIPTOR$vmaSetPoolName);
        SEGMENT$vmaAllocateMemory = loader.apply("vmaAllocateMemory");
        HANDLE$vmaAllocateMemory = RawFunctionLoader.link(SEGMENT$vmaAllocateMemory, DESCRIPTOR$vmaAllocateMemory);
        SEGMENT$vmaAllocateMemoryPages = loader.apply("vmaAllocateMemoryPages");
        HANDLE$vmaAllocateMemoryPages = RawFunctionLoader.link(SEGMENT$vmaAllocateMemoryPages, DESCRIPTOR$vmaAllocateMemoryPages);
        SEGMENT$vmaAllocateMemoryForBuffer = loader.apply("vmaAllocateMemoryForBuffer");
        HANDLE$vmaAllocateMemoryForBuffer = RawFunctionLoader.link(SEGMENT$vmaAllocateMemoryForBuffer, DESCRIPTOR$vmaAllocateMemoryForBuffer);
        SEGMENT$vmaAllocateMemoryForImage = loader.apply("vmaAllocateMemoryForImage");
        HANDLE$vmaAllocateMemoryForImage = RawFunctionLoader.link(SEGMENT$vmaAllocateMemoryForImage, DESCRIPTOR$vmaAllocateMemoryForImage);
        SEGMENT$vmaFreeMemory = loader.apply("vmaFreeMemory");
        HANDLE$vmaFreeMemory = RawFunctionLoader.link(SEGMENT$vmaFreeMemory, DESCRIPTOR$vmaFreeMemory);
        SEGMENT$vmaFreeMemoryPages = loader.apply("vmaFreeMemoryPages");
        HANDLE$vmaFreeMemoryPages = RawFunctionLoader.link(SEGMENT$vmaFreeMemoryPages, DESCRIPTOR$vmaFreeMemoryPages);
        SEGMENT$vmaGetAllocationInfo = loader.apply("vmaGetAllocationInfo");
        HANDLE$vmaGetAllocationInfo = RawFunctionLoader.link(SEGMENT$vmaGetAllocationInfo, DESCRIPTOR$vmaGetAllocationInfo);
        SEGMENT$vmaGetAllocationInfo2 = loader.apply("vmaGetAllocationInfo2");
        HANDLE$vmaGetAllocationInfo2 = RawFunctionLoader.link(SEGMENT$vmaGetAllocationInfo2, DESCRIPTOR$vmaGetAllocationInfo2);
        SEGMENT$vmaSetAllocationUserData = loader.apply("vmaSetAllocationUserData");
        HANDLE$vmaSetAllocationUserData = RawFunctionLoader.link(SEGMENT$vmaSetAllocationUserData, DESCRIPTOR$vmaSetAllocationUserData);
        SEGMENT$vmaSetAllocationName = loader.apply("vmaSetAllocationName");
        HANDLE$vmaSetAllocationName = RawFunctionLoader.link(SEGMENT$vmaSetAllocationName, DESCRIPTOR$vmaSetAllocationName);
        SEGMENT$vmaGetAllocationMemoryProperties = loader.apply("vmaGetAllocationMemoryProperties");
        HANDLE$vmaGetAllocationMemoryProperties = RawFunctionLoader.link(SEGMENT$vmaGetAllocationMemoryProperties, DESCRIPTOR$vmaGetAllocationMemoryProperties);
        SEGMENT$vmaMapMemory = loader.apply("vmaMapMemory");
        HANDLE$vmaMapMemory = RawFunctionLoader.link(SEGMENT$vmaMapMemory, DESCRIPTOR$vmaMapMemory);
        SEGMENT$vmaUnmapMemory = loader.apply("vmaUnmapMemory");
        HANDLE$vmaUnmapMemory = RawFunctionLoader.link(SEGMENT$vmaUnmapMemory, DESCRIPTOR$vmaUnmapMemory);
        SEGMENT$vmaFlushAllocation = loader.apply("vmaFlushAllocation");
        HANDLE$vmaFlushAllocation = RawFunctionLoader.link(SEGMENT$vmaFlushAllocation, DESCRIPTOR$vmaFlushAllocation);
        SEGMENT$vmaInvalidateAllocation = loader.apply("vmaInvalidateAllocation");
        HANDLE$vmaInvalidateAllocation = RawFunctionLoader.link(SEGMENT$vmaInvalidateAllocation, DESCRIPTOR$vmaInvalidateAllocation);
        SEGMENT$vmaFlushAllocations = loader.apply("vmaFlushAllocations");
        HANDLE$vmaFlushAllocations = RawFunctionLoader.link(SEGMENT$vmaFlushAllocations, DESCRIPTOR$vmaFlushAllocations);
        SEGMENT$vmaInvalidateAllocations = loader.apply("vmaInvalidateAllocations");
        HANDLE$vmaInvalidateAllocations = RawFunctionLoader.link(SEGMENT$vmaInvalidateAllocations, DESCRIPTOR$vmaInvalidateAllocations);
        SEGMENT$vmaCopyMemoryToAllocation = loader.apply("vmaCopyMemoryToAllocation");
        HANDLE$vmaCopyMemoryToAllocation = RawFunctionLoader.link(SEGMENT$vmaCopyMemoryToAllocation, DESCRIPTOR$vmaCopyMemoryToAllocation);
        SEGMENT$vmaCopyAllocationToMemory = loader.apply("vmaCopyAllocationToMemory");
        HANDLE$vmaCopyAllocationToMemory = RawFunctionLoader.link(SEGMENT$vmaCopyAllocationToMemory, DESCRIPTOR$vmaCopyAllocationToMemory);
        SEGMENT$vmaCheckCorruption = loader.apply("vmaCheckCorruption");
        HANDLE$vmaCheckCorruption = RawFunctionLoader.link(SEGMENT$vmaCheckCorruption, DESCRIPTOR$vmaCheckCorruption);
        SEGMENT$vmaBeginDefragmentation = loader.apply("vmaBeginDefragmentation");
        HANDLE$vmaBeginDefragmentation = RawFunctionLoader.link(SEGMENT$vmaBeginDefragmentation, DESCRIPTOR$vmaBeginDefragmentation);
        SEGMENT$vmaEndDefragmentation = loader.apply("vmaEndDefragmentation");
        HANDLE$vmaEndDefragmentation = RawFunctionLoader.link(SEGMENT$vmaEndDefragmentation, DESCRIPTOR$vmaEndDefragmentation);
        SEGMENT$vmaBeginDefragmentationPass = loader.apply("vmaBeginDefragmentationPass");
        HANDLE$vmaBeginDefragmentationPass = RawFunctionLoader.link(SEGMENT$vmaBeginDefragmentationPass, DESCRIPTOR$vmaBeginDefragmentationPass);
        SEGMENT$vmaEndDefragmentationPass = loader.apply("vmaEndDefragmentationPass");
        HANDLE$vmaEndDefragmentationPass = RawFunctionLoader.link(SEGMENT$vmaEndDefragmentationPass, DESCRIPTOR$vmaEndDefragmentationPass);
        SEGMENT$vmaBindBufferMemory = loader.apply("vmaBindBufferMemory");
        HANDLE$vmaBindBufferMemory = RawFunctionLoader.link(SEGMENT$vmaBindBufferMemory, DESCRIPTOR$vmaBindBufferMemory);
        SEGMENT$vmaBindBufferMemory2 = loader.apply("vmaBindBufferMemory2");
        HANDLE$vmaBindBufferMemory2 = RawFunctionLoader.link(SEGMENT$vmaBindBufferMemory2, DESCRIPTOR$vmaBindBufferMemory2);
        SEGMENT$vmaBindImageMemory = loader.apply("vmaBindImageMemory");
        HANDLE$vmaBindImageMemory = RawFunctionLoader.link(SEGMENT$vmaBindImageMemory, DESCRIPTOR$vmaBindImageMemory);
        SEGMENT$vmaBindImageMemory2 = loader.apply("vmaBindImageMemory2");
        HANDLE$vmaBindImageMemory2 = RawFunctionLoader.link(SEGMENT$vmaBindImageMemory2, DESCRIPTOR$vmaBindImageMemory2);
        SEGMENT$vmaCreateBuffer = loader.apply("vmaCreateBuffer");
        HANDLE$vmaCreateBuffer = RawFunctionLoader.link(SEGMENT$vmaCreateBuffer, DESCRIPTOR$vmaCreateBuffer);
        SEGMENT$vmaCreateBufferWithAlignment = loader.apply("vmaCreateBufferWithAlignment");
        HANDLE$vmaCreateBufferWithAlignment = RawFunctionLoader.link(SEGMENT$vmaCreateBufferWithAlignment, DESCRIPTOR$vmaCreateBufferWithAlignment);
        SEGMENT$vmaCreateAliasingBuffer = loader.apply("vmaCreateAliasingBuffer");
        HANDLE$vmaCreateAliasingBuffer = RawFunctionLoader.link(SEGMENT$vmaCreateAliasingBuffer, DESCRIPTOR$vmaCreateAliasingBuffer);
        SEGMENT$vmaCreateAliasingBuffer2 = loader.apply("vmaCreateAliasingBuffer2");
        HANDLE$vmaCreateAliasingBuffer2 = RawFunctionLoader.link(SEGMENT$vmaCreateAliasingBuffer2, DESCRIPTOR$vmaCreateAliasingBuffer2);
        SEGMENT$vmaDestroyBuffer = loader.apply("vmaDestroyBuffer");
        HANDLE$vmaDestroyBuffer = RawFunctionLoader.link(SEGMENT$vmaDestroyBuffer, DESCRIPTOR$vmaDestroyBuffer);
        SEGMENT$vmaCreateImage = loader.apply("vmaCreateImage");
        HANDLE$vmaCreateImage = RawFunctionLoader.link(SEGMENT$vmaCreateImage, DESCRIPTOR$vmaCreateImage);
        SEGMENT$vmaCreateAliasingImage = loader.apply("vmaCreateAliasingImage");
        HANDLE$vmaCreateAliasingImage = RawFunctionLoader.link(SEGMENT$vmaCreateAliasingImage, DESCRIPTOR$vmaCreateAliasingImage);
        SEGMENT$vmaCreateAliasingImage2 = loader.apply("vmaCreateAliasingImage2");
        HANDLE$vmaCreateAliasingImage2 = RawFunctionLoader.link(SEGMENT$vmaCreateAliasingImage2, DESCRIPTOR$vmaCreateAliasingImage2);
        SEGMENT$vmaDestroyImage = loader.apply("vmaDestroyImage");
        HANDLE$vmaDestroyImage = RawFunctionLoader.link(SEGMENT$vmaDestroyImage, DESCRIPTOR$vmaDestroyImage);
        SEGMENT$vmaCreateVirtualBlock = loader.apply("vmaCreateVirtualBlock");
        HANDLE$vmaCreateVirtualBlock = RawFunctionLoader.link(SEGMENT$vmaCreateVirtualBlock, DESCRIPTOR$vmaCreateVirtualBlock);
        SEGMENT$vmaDestroyVirtualBlock = loader.apply("vmaDestroyVirtualBlock");
        HANDLE$vmaDestroyVirtualBlock = RawFunctionLoader.link(SEGMENT$vmaDestroyVirtualBlock, DESCRIPTOR$vmaDestroyVirtualBlock);
        SEGMENT$vmaIsVirtualBlockEmpty = loader.apply("vmaIsVirtualBlockEmpty");
        HANDLE$vmaIsVirtualBlockEmpty = RawFunctionLoader.link(SEGMENT$vmaIsVirtualBlockEmpty, DESCRIPTOR$vmaIsVirtualBlockEmpty);
        SEGMENT$vmaGetVirtualAllocationInfo = loader.apply("vmaGetVirtualAllocationInfo");
        HANDLE$vmaGetVirtualAllocationInfo = RawFunctionLoader.link(SEGMENT$vmaGetVirtualAllocationInfo, DESCRIPTOR$vmaGetVirtualAllocationInfo);
        SEGMENT$vmaVirtualAllocate = loader.apply("vmaVirtualAllocate");
        HANDLE$vmaVirtualAllocate = RawFunctionLoader.link(SEGMENT$vmaVirtualAllocate, DESCRIPTOR$vmaVirtualAllocate);
        SEGMENT$vmaVirtualFree = loader.apply("vmaVirtualFree");
        HANDLE$vmaVirtualFree = RawFunctionLoader.link(SEGMENT$vmaVirtualFree, DESCRIPTOR$vmaVirtualFree);
        SEGMENT$vmaClearVirtualBlock = loader.apply("vmaClearVirtualBlock");
        HANDLE$vmaClearVirtualBlock = RawFunctionLoader.link(SEGMENT$vmaClearVirtualBlock, DESCRIPTOR$vmaClearVirtualBlock);
        SEGMENT$vmaSetVirtualAllocationUserData = loader.apply("vmaSetVirtualAllocationUserData");
        HANDLE$vmaSetVirtualAllocationUserData = RawFunctionLoader.link(SEGMENT$vmaSetVirtualAllocationUserData, DESCRIPTOR$vmaSetVirtualAllocationUserData);
        SEGMENT$vmaGetVirtualBlockStatistics = loader.apply("vmaGetVirtualBlockStatistics");
        HANDLE$vmaGetVirtualBlockStatistics = RawFunctionLoader.link(SEGMENT$vmaGetVirtualBlockStatistics, DESCRIPTOR$vmaGetVirtualBlockStatistics);
        SEGMENT$vmaCalculateVirtualBlockStatistics = loader.apply("vmaCalculateVirtualBlockStatistics");
        HANDLE$vmaCalculateVirtualBlockStatistics = RawFunctionLoader.link(SEGMENT$vmaCalculateVirtualBlockStatistics, DESCRIPTOR$vmaCalculateVirtualBlockStatistics);
        SEGMENT$vmaBuildVirtualBlockStatsString = loader.apply("vmaBuildVirtualBlockStatsString");
        HANDLE$vmaBuildVirtualBlockStatsString = RawFunctionLoader.link(SEGMENT$vmaBuildVirtualBlockStatsString, DESCRIPTOR$vmaBuildVirtualBlockStatsString);
        SEGMENT$vmaFreeVirtualBlockStatsString = loader.apply("vmaFreeVirtualBlockStatsString");
        HANDLE$vmaFreeVirtualBlockStatsString = RawFunctionLoader.link(SEGMENT$vmaFreeVirtualBlockStatsString, DESCRIPTOR$vmaFreeVirtualBlockStatsString);
        SEGMENT$vmaBuildStatsString = loader.apply("vmaBuildStatsString");
        HANDLE$vmaBuildStatsString = RawFunctionLoader.link(SEGMENT$vmaBuildStatsString, DESCRIPTOR$vmaBuildStatsString);
        SEGMENT$vmaFreeStatsString = loader.apply("vmaFreeStatsString");
        HANDLE$vmaFreeStatsString = RawFunctionLoader.link(SEGMENT$vmaFreeStatsString, DESCRIPTOR$vmaFreeStatsString);
        SEGMENT$vk4jSetJavaTrace = loader.apply("vk4jSetJavaTrace");
        HANDLE$vk4jSetJavaTrace = RawFunctionLoader.link(SEGMENT$vk4jSetJavaTrace, DESCRIPTOR$vk4jSetJavaTrace);
    }
}
