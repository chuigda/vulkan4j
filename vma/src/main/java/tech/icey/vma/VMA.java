package tech.icey.vma;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.panama.FunctionLoader;
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

    public VMA(FunctionLoader loader) {
        HANDLE$vmaCreateAllocator = loader.apply("vmaCreateAllocator", DESCRIPTOR$vmaCreateAllocator);
        HANDLE$vmaDestroyAllocator = loader.apply("vmaDestroyAllocator", DESCRIPTOR$vmaDestroyAllocator);
        HANDLE$vmaGetAllocatorInfo = loader.apply("vmaGetAllocatorInfo", DESCRIPTOR$vmaGetAllocatorInfo);
        HANDLE$vmaGetPhysicalDeviceProperties = loader.apply("vmaGetPhysicalDeviceProperties", DESCRIPTOR$vmaGetPhysicalDeviceProperties);
        HANDLE$vmaGetMemoryProperties = loader.apply("vmaGetMemoryProperties", DESCRIPTOR$vmaGetMemoryProperties);
        HANDLE$vmaGetMemoryTypeProperties = loader.apply("vmaGetMemoryTypeProperties", DESCRIPTOR$vmaGetMemoryTypeProperties);
        HANDLE$vmaSetCurrentFrameIndex = loader.apply("vmaSetCurrentFrameIndex", DESCRIPTOR$vmaSetCurrentFrameIndex);
        HANDLE$vmaCalculateStatistics = loader.apply("vmaCalculateStatistics", DESCRIPTOR$vmaCalculateStatistics);
        HANDLE$vmaGetHeapBudgets = loader.apply("vmaGetHeapBudgets", DESCRIPTOR$vmaGetHeapBudgets);
        HANDLE$vmaFindMemoryTypeIndex = loader.apply("vmaFindMemoryTypeIndex", DESCRIPTOR$vmaFindMemoryTypeIndex);
        HANDLE$vmaFindMemoryTypeIndexForBufferInfo = loader.apply("vmaFindMemoryTypeIndexForBufferInfo", DESCRIPTOR$vmaFindMemoryTypeIndexForBufferInfo);
        HANDLE$vmaFindMemoryTypeIndexForImageInfo = loader.apply("vmaFindMemoryTypeIndexForImageInfo", DESCRIPTOR$vmaFindMemoryTypeIndexForImageInfo);
        HANDLE$vmaCreatePool = loader.apply("vmaCreatePool", DESCRIPTOR$vmaCreatePool);
        HANDLE$vmaDestroyPool = loader.apply("vmaDestroyPool", DESCRIPTOR$vmaDestroyPool);
        HANDLE$vmaGetPoolStatistics = loader.apply("vmaGetPoolStatistics", DESCRIPTOR$vmaGetPoolStatistics);
        HANDLE$vmaCalculatePoolStatistics = loader.apply("vmaCalculatePoolStatistics", DESCRIPTOR$vmaCalculatePoolStatistics);
        HANDLE$vmaCheckPoolCorruption = loader.apply("vmaCheckPoolCorruption", DESCRIPTOR$vmaCheckPoolCorruption);
        HANDLE$vmaGetPoolName = loader.apply("vmaGetPoolName", DESCRIPTOR$vmaGetPoolName);
        HANDLE$vmaSetPoolName = loader.apply("vmaSetPoolName", DESCRIPTOR$vmaSetPoolName);
        HANDLE$vmaAllocateMemory = loader.apply("vmaAllocateMemory", DESCRIPTOR$vmaAllocateMemory);
        HANDLE$vmaAllocateMemoryPages = loader.apply("vmaAllocateMemoryPages", DESCRIPTOR$vmaAllocateMemoryPages);
        HANDLE$vmaAllocateMemoryForBuffer = loader.apply("vmaAllocateMemoryForBuffer", DESCRIPTOR$vmaAllocateMemoryForBuffer);
        HANDLE$vmaAllocateMemoryForImage = loader.apply("vmaAllocateMemoryForImage", DESCRIPTOR$vmaAllocateMemoryForImage);
        HANDLE$vmaFreeMemory = loader.apply("vmaFreeMemory", DESCRIPTOR$vmaFreeMemory);
        HANDLE$vmaFreeMemoryPages = loader.apply("vmaFreeMemoryPages", DESCRIPTOR$vmaFreeMemoryPages);
        HANDLE$vmaGetAllocationInfo = loader.apply("vmaGetAllocationInfo", DESCRIPTOR$vmaGetAllocationInfo);
        HANDLE$vmaGetAllocationInfo2 = loader.apply("vmaGetAllocationInfo2", DESCRIPTOR$vmaGetAllocationInfo2);
        HANDLE$vmaSetAllocationUserData = loader.apply("vmaSetAllocationUserData", DESCRIPTOR$vmaSetAllocationUserData);
        HANDLE$vmaSetAllocationName = loader.apply("vmaSetAllocationName", DESCRIPTOR$vmaSetAllocationName);
        HANDLE$vmaGetAllocationMemoryProperties = loader.apply("vmaGetAllocationMemoryProperties", DESCRIPTOR$vmaGetAllocationMemoryProperties);
        HANDLE$vmaMapMemory = loader.apply("vmaMapMemory", DESCRIPTOR$vmaMapMemory);
        HANDLE$vmaUnmapMemory = loader.apply("vmaUnmapMemory", DESCRIPTOR$vmaUnmapMemory);
        HANDLE$vmaFlushAllocation = loader.apply("vmaFlushAllocation", DESCRIPTOR$vmaFlushAllocation);
        HANDLE$vmaInvalidateAllocation = loader.apply("vmaInvalidateAllocation", DESCRIPTOR$vmaInvalidateAllocation);
        HANDLE$vmaFlushAllocations = loader.apply("vmaFlushAllocations", DESCRIPTOR$vmaFlushAllocations);
        HANDLE$vmaInvalidateAllocations = loader.apply("vmaInvalidateAllocations", DESCRIPTOR$vmaInvalidateAllocations);
        HANDLE$vmaCopyMemoryToAllocation = loader.apply("vmaCopyMemoryToAllocation", DESCRIPTOR$vmaCopyMemoryToAllocation);
        HANDLE$vmaCopyAllocationToMemory = loader.apply("vmaCopyAllocationToMemory", DESCRIPTOR$vmaCopyAllocationToMemory);
        HANDLE$vmaCheckCorruption = loader.apply("vmaCheckCorruption", DESCRIPTOR$vmaCheckCorruption);
        HANDLE$vmaBeginDefragmentation = loader.apply("vmaBeginDefragmentation", DESCRIPTOR$vmaBeginDefragmentation);
        HANDLE$vmaEndDefragmentation = loader.apply("vmaEndDefragmentation", DESCRIPTOR$vmaEndDefragmentation);
        HANDLE$vmaBeginDefragmentationPass = loader.apply("vmaBeginDefragmentationPass", DESCRIPTOR$vmaBeginDefragmentationPass);
        HANDLE$vmaEndDefragmentationPass = loader.apply("vmaEndDefragmentationPass", DESCRIPTOR$vmaEndDefragmentationPass);
        HANDLE$vmaBindBufferMemory = loader.apply("vmaBindBufferMemory", DESCRIPTOR$vmaBindBufferMemory);
        HANDLE$vmaBindBufferMemory2 = loader.apply("vmaBindBufferMemory2", DESCRIPTOR$vmaBindBufferMemory2);
        HANDLE$vmaBindImageMemory = loader.apply("vmaBindImageMemory", DESCRIPTOR$vmaBindImageMemory);
        HANDLE$vmaBindImageMemory2 = loader.apply("vmaBindImageMemory2", DESCRIPTOR$vmaBindImageMemory2);
        HANDLE$vmaCreateBuffer = loader.apply("vmaCreateBuffer", DESCRIPTOR$vmaCreateBuffer);
        HANDLE$vmaCreateBufferWithAlignment = loader.apply("vmaCreateBufferWithAlignment", DESCRIPTOR$vmaCreateBufferWithAlignment);
        HANDLE$vmaCreateAliasingBuffer = loader.apply("vmaCreateAliasingBuffer", DESCRIPTOR$vmaCreateAliasingBuffer);
        HANDLE$vmaCreateAliasingBuffer2 = loader.apply("vmaCreateAliasingBuffer2", DESCRIPTOR$vmaCreateAliasingBuffer2);
        HANDLE$vmaDestroyBuffer = loader.apply("vmaDestroyBuffer", DESCRIPTOR$vmaDestroyBuffer);
        HANDLE$vmaCreateImage = loader.apply("vmaCreateImage", DESCRIPTOR$vmaCreateImage);
        HANDLE$vmaCreateAliasingImage = loader.apply("vmaCreateAliasingImage", DESCRIPTOR$vmaCreateAliasingImage);
        HANDLE$vmaCreateAliasingImage2 = loader.apply("vmaCreateAliasingImage2", DESCRIPTOR$vmaCreateAliasingImage2);
        HANDLE$vmaDestroyImage = loader.apply("vmaDestroyImage", DESCRIPTOR$vmaDestroyImage);
        HANDLE$vmaCreateVirtualBlock = loader.apply("vmaCreateVirtualBlock", DESCRIPTOR$vmaCreateVirtualBlock);
        HANDLE$vmaDestroyVirtualBlock = loader.apply("vmaDestroyVirtualBlock", DESCRIPTOR$vmaDestroyVirtualBlock);
        HANDLE$vmaIsVirtualBlockEmpty = loader.apply("vmaIsVirtualBlockEmpty", DESCRIPTOR$vmaIsVirtualBlockEmpty);
        HANDLE$vmaGetVirtualAllocationInfo = loader.apply("vmaGetVirtualAllocationInfo", DESCRIPTOR$vmaGetVirtualAllocationInfo);
        HANDLE$vmaVirtualAllocate = loader.apply("vmaVirtualAllocate", DESCRIPTOR$vmaVirtualAllocate);
        HANDLE$vmaVirtualFree = loader.apply("vmaVirtualFree", DESCRIPTOR$vmaVirtualFree);
        HANDLE$vmaClearVirtualBlock = loader.apply("vmaClearVirtualBlock", DESCRIPTOR$vmaClearVirtualBlock);
        HANDLE$vmaSetVirtualAllocationUserData = loader.apply("vmaSetVirtualAllocationUserData", DESCRIPTOR$vmaSetVirtualAllocationUserData);
        HANDLE$vmaGetVirtualBlockStatistics = loader.apply("vmaGetVirtualBlockStatistics", DESCRIPTOR$vmaGetVirtualBlockStatistics);
        HANDLE$vmaCalculateVirtualBlockStatistics = loader.apply("vmaCalculateVirtualBlockStatistics", DESCRIPTOR$vmaCalculateVirtualBlockStatistics);
        HANDLE$vmaBuildVirtualBlockStatsString = loader.apply("vmaBuildVirtualBlockStatsString", DESCRIPTOR$vmaBuildVirtualBlockStatsString);
        HANDLE$vmaFreeVirtualBlockStatsString = loader.apply("vmaFreeVirtualBlockStatsString", DESCRIPTOR$vmaFreeVirtualBlockStatsString);
        HANDLE$vmaBuildStatsString = loader.apply("vmaBuildStatsString", DESCRIPTOR$vmaBuildStatsString);
        HANDLE$vmaFreeStatsString = loader.apply("vmaFreeStatsString", DESCRIPTOR$vmaFreeStatsString);
    }
}
