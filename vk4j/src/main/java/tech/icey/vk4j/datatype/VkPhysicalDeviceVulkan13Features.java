package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceVulkan13Features {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 robustImageAccess;
///     VkBool32 inlineUniformBlock;
///     VkBool32 descriptorBindingInlineUniformBlockUpdateAfterBind;
///     VkBool32 pipelineCreationCacheControl;
///     VkBool32 privateData;
///     VkBool32 shaderDemoteToHelperInvocation;
///     VkBool32 shaderTerminateInvocation;
///     VkBool32 subgroupSizeControl;
///     VkBool32 computeFullSubgroups;
///     VkBool32 synchronization2;
///     VkBool32 textureCompressionASTC_HDR;
///     VkBool32 shaderZeroInitializeWorkgroupMemory;
///     VkBool32 dynamicRendering;
///     VkBool32 shaderIntegerDotProduct;
///     VkBool32 maintenance4;
/// } VkPhysicalDeviceVulkan13Features;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceVulkan13Features.html">VkPhysicalDeviceVulkan13Features</a>
public record VkPhysicalDeviceVulkan13Features(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceVulkan13Features(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_3_FEATURES);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int robustImageAccess() {
        return segment.get(LAYOUT$robustImageAccess, OFFSET$robustImageAccess);
    }

    public void robustImageAccess(@unsigned int value) {
        segment.set(LAYOUT$robustImageAccess, OFFSET$robustImageAccess, value);
    }

    public @unsigned int inlineUniformBlock() {
        return segment.get(LAYOUT$inlineUniformBlock, OFFSET$inlineUniformBlock);
    }

    public void inlineUniformBlock(@unsigned int value) {
        segment.set(LAYOUT$inlineUniformBlock, OFFSET$inlineUniformBlock, value);
    }

    public @unsigned int descriptorBindingInlineUniformBlockUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind, OFFSET$descriptorBindingInlineUniformBlockUpdateAfterBind);
    }

    public void descriptorBindingInlineUniformBlockUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind, OFFSET$descriptorBindingInlineUniformBlockUpdateAfterBind, value);
    }

    public @unsigned int pipelineCreationCacheControl() {
        return segment.get(LAYOUT$pipelineCreationCacheControl, OFFSET$pipelineCreationCacheControl);
    }

    public void pipelineCreationCacheControl(@unsigned int value) {
        segment.set(LAYOUT$pipelineCreationCacheControl, OFFSET$pipelineCreationCacheControl, value);
    }

    public @unsigned int privateData() {
        return segment.get(LAYOUT$privateData, OFFSET$privateData);
    }

    public void privateData(@unsigned int value) {
        segment.set(LAYOUT$privateData, OFFSET$privateData, value);
    }

    public @unsigned int shaderDemoteToHelperInvocation() {
        return segment.get(LAYOUT$shaderDemoteToHelperInvocation, OFFSET$shaderDemoteToHelperInvocation);
    }

    public void shaderDemoteToHelperInvocation(@unsigned int value) {
        segment.set(LAYOUT$shaderDemoteToHelperInvocation, OFFSET$shaderDemoteToHelperInvocation, value);
    }

    public @unsigned int shaderTerminateInvocation() {
        return segment.get(LAYOUT$shaderTerminateInvocation, OFFSET$shaderTerminateInvocation);
    }

    public void shaderTerminateInvocation(@unsigned int value) {
        segment.set(LAYOUT$shaderTerminateInvocation, OFFSET$shaderTerminateInvocation, value);
    }

    public @unsigned int subgroupSizeControl() {
        return segment.get(LAYOUT$subgroupSizeControl, OFFSET$subgroupSizeControl);
    }

    public void subgroupSizeControl(@unsigned int value) {
        segment.set(LAYOUT$subgroupSizeControl, OFFSET$subgroupSizeControl, value);
    }

    public @unsigned int computeFullSubgroups() {
        return segment.get(LAYOUT$computeFullSubgroups, OFFSET$computeFullSubgroups);
    }

    public void computeFullSubgroups(@unsigned int value) {
        segment.set(LAYOUT$computeFullSubgroups, OFFSET$computeFullSubgroups, value);
    }

    public @unsigned int synchronization2() {
        return segment.get(LAYOUT$synchronization2, OFFSET$synchronization2);
    }

    public void synchronization2(@unsigned int value) {
        segment.set(LAYOUT$synchronization2, OFFSET$synchronization2, value);
    }

    public @unsigned int textureCompressionASTC_HDR() {
        return segment.get(LAYOUT$textureCompressionASTC_HDR, OFFSET$textureCompressionASTC_HDR);
    }

    public void textureCompressionASTC_HDR(@unsigned int value) {
        segment.set(LAYOUT$textureCompressionASTC_HDR, OFFSET$textureCompressionASTC_HDR, value);
    }

    public @unsigned int shaderZeroInitializeWorkgroupMemory() {
        return segment.get(LAYOUT$shaderZeroInitializeWorkgroupMemory, OFFSET$shaderZeroInitializeWorkgroupMemory);
    }

    public void shaderZeroInitializeWorkgroupMemory(@unsigned int value) {
        segment.set(LAYOUT$shaderZeroInitializeWorkgroupMemory, OFFSET$shaderZeroInitializeWorkgroupMemory, value);
    }

    public @unsigned int dynamicRendering() {
        return segment.get(LAYOUT$dynamicRendering, OFFSET$dynamicRendering);
    }

    public void dynamicRendering(@unsigned int value) {
        segment.set(LAYOUT$dynamicRendering, OFFSET$dynamicRendering, value);
    }

    public @unsigned int shaderIntegerDotProduct() {
        return segment.get(LAYOUT$shaderIntegerDotProduct, OFFSET$shaderIntegerDotProduct);
    }

    public void shaderIntegerDotProduct(@unsigned int value) {
        segment.set(LAYOUT$shaderIntegerDotProduct, OFFSET$shaderIntegerDotProduct, value);
    }

    public @unsigned int maintenance4() {
        return segment.get(LAYOUT$maintenance4, OFFSET$maintenance4);
    }

    public void maintenance4(@unsigned int value) {
        segment.set(LAYOUT$maintenance4, OFFSET$maintenance4, value);
    }

    public static VkPhysicalDeviceVulkan13Features allocate(Arena arena) {
        return new VkPhysicalDeviceVulkan13Features(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceVulkan13Features[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVulkan13Features[] ret = new VkPhysicalDeviceVulkan13Features[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceVulkan13Features(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceVulkan13Features clone(Arena arena, VkPhysicalDeviceVulkan13Features src) {
        VkPhysicalDeviceVulkan13Features ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceVulkan13Features[] clone(Arena arena, VkPhysicalDeviceVulkan13Features[] src) {
        VkPhysicalDeviceVulkan13Features[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustImageAccess"),
        ValueLayout.JAVA_INT.withName("inlineUniformBlock"),
        ValueLayout.JAVA_INT.withName("descriptorBindingInlineUniformBlockUpdateAfterBind"),
        ValueLayout.JAVA_INT.withName("pipelineCreationCacheControl"),
        ValueLayout.JAVA_INT.withName("privateData"),
        ValueLayout.JAVA_INT.withName("shaderDemoteToHelperInvocation"),
        ValueLayout.JAVA_INT.withName("shaderTerminateInvocation"),
        ValueLayout.JAVA_INT.withName("subgroupSizeControl"),
        ValueLayout.JAVA_INT.withName("computeFullSubgroups"),
        ValueLayout.JAVA_INT.withName("synchronization2"),
        ValueLayout.JAVA_INT.withName("textureCompressionASTC_HDR"),
        ValueLayout.JAVA_INT.withName("shaderZeroInitializeWorkgroupMemory"),
        ValueLayout.JAVA_INT.withName("dynamicRendering"),
        ValueLayout.JAVA_INT.withName("shaderIntegerDotProduct"),
        ValueLayout.JAVA_INT.withName("maintenance4")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$robustImageAccess = PathElement.groupElement("robustImageAccess");
    public static final PathElement PATH$inlineUniformBlock = PathElement.groupElement("inlineUniformBlock");
    public static final PathElement PATH$descriptorBindingInlineUniformBlockUpdateAfterBind = PathElement.groupElement("descriptorBindingInlineUniformBlockUpdateAfterBind");
    public static final PathElement PATH$pipelineCreationCacheControl = PathElement.groupElement("pipelineCreationCacheControl");
    public static final PathElement PATH$privateData = PathElement.groupElement("privateData");
    public static final PathElement PATH$shaderDemoteToHelperInvocation = PathElement.groupElement("shaderDemoteToHelperInvocation");
    public static final PathElement PATH$shaderTerminateInvocation = PathElement.groupElement("shaderTerminateInvocation");
    public static final PathElement PATH$subgroupSizeControl = PathElement.groupElement("subgroupSizeControl");
    public static final PathElement PATH$computeFullSubgroups = PathElement.groupElement("computeFullSubgroups");
    public static final PathElement PATH$synchronization2 = PathElement.groupElement("synchronization2");
    public static final PathElement PATH$textureCompressionASTC_HDR = PathElement.groupElement("textureCompressionASTC_HDR");
    public static final PathElement PATH$shaderZeroInitializeWorkgroupMemory = PathElement.groupElement("shaderZeroInitializeWorkgroupMemory");
    public static final PathElement PATH$dynamicRendering = PathElement.groupElement("dynamicRendering");
    public static final PathElement PATH$shaderIntegerDotProduct = PathElement.groupElement("shaderIntegerDotProduct");
    public static final PathElement PATH$maintenance4 = PathElement.groupElement("maintenance4");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$robustImageAccess = (OfInt) LAYOUT.select(PATH$robustImageAccess);
    public static final OfInt LAYOUT$inlineUniformBlock = (OfInt) LAYOUT.select(PATH$inlineUniformBlock);
    public static final OfInt LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingInlineUniformBlockUpdateAfterBind);
    public static final OfInt LAYOUT$pipelineCreationCacheControl = (OfInt) LAYOUT.select(PATH$pipelineCreationCacheControl);
    public static final OfInt LAYOUT$privateData = (OfInt) LAYOUT.select(PATH$privateData);
    public static final OfInt LAYOUT$shaderDemoteToHelperInvocation = (OfInt) LAYOUT.select(PATH$shaderDemoteToHelperInvocation);
    public static final OfInt LAYOUT$shaderTerminateInvocation = (OfInt) LAYOUT.select(PATH$shaderTerminateInvocation);
    public static final OfInt LAYOUT$subgroupSizeControl = (OfInt) LAYOUT.select(PATH$subgroupSizeControl);
    public static final OfInt LAYOUT$computeFullSubgroups = (OfInt) LAYOUT.select(PATH$computeFullSubgroups);
    public static final OfInt LAYOUT$synchronization2 = (OfInt) LAYOUT.select(PATH$synchronization2);
    public static final OfInt LAYOUT$textureCompressionASTC_HDR = (OfInt) LAYOUT.select(PATH$textureCompressionASTC_HDR);
    public static final OfInt LAYOUT$shaderZeroInitializeWorkgroupMemory = (OfInt) LAYOUT.select(PATH$shaderZeroInitializeWorkgroupMemory);
    public static final OfInt LAYOUT$dynamicRendering = (OfInt) LAYOUT.select(PATH$dynamicRendering);
    public static final OfInt LAYOUT$shaderIntegerDotProduct = (OfInt) LAYOUT.select(PATH$shaderIntegerDotProduct);
    public static final OfInt LAYOUT$maintenance4 = (OfInt) LAYOUT.select(PATH$maintenance4);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$robustImageAccess = LAYOUT.byteOffset(PATH$robustImageAccess);
    public static final long OFFSET$inlineUniformBlock = LAYOUT.byteOffset(PATH$inlineUniformBlock);
    public static final long OFFSET$descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingInlineUniformBlockUpdateAfterBind);
    public static final long OFFSET$pipelineCreationCacheControl = LAYOUT.byteOffset(PATH$pipelineCreationCacheControl);
    public static final long OFFSET$privateData = LAYOUT.byteOffset(PATH$privateData);
    public static final long OFFSET$shaderDemoteToHelperInvocation = LAYOUT.byteOffset(PATH$shaderDemoteToHelperInvocation);
    public static final long OFFSET$shaderTerminateInvocation = LAYOUT.byteOffset(PATH$shaderTerminateInvocation);
    public static final long OFFSET$subgroupSizeControl = LAYOUT.byteOffset(PATH$subgroupSizeControl);
    public static final long OFFSET$computeFullSubgroups = LAYOUT.byteOffset(PATH$computeFullSubgroups);
    public static final long OFFSET$synchronization2 = LAYOUT.byteOffset(PATH$synchronization2);
    public static final long OFFSET$textureCompressionASTC_HDR = LAYOUT.byteOffset(PATH$textureCompressionASTC_HDR);
    public static final long OFFSET$shaderZeroInitializeWorkgroupMemory = LAYOUT.byteOffset(PATH$shaderZeroInitializeWorkgroupMemory);
    public static final long OFFSET$dynamicRendering = LAYOUT.byteOffset(PATH$dynamicRendering);
    public static final long OFFSET$shaderIntegerDotProduct = LAYOUT.byteOffset(PATH$shaderIntegerDotProduct);
    public static final long OFFSET$maintenance4 = LAYOUT.byteOffset(PATH$maintenance4);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$robustImageAccess = LAYOUT$robustImageAccess.byteSize();
    public static final long SIZE$inlineUniformBlock = LAYOUT$inlineUniformBlock.byteSize();
    public static final long SIZE$descriptorBindingInlineUniformBlockUpdateAfterBind = LAYOUT$descriptorBindingInlineUniformBlockUpdateAfterBind.byteSize();
    public static final long SIZE$pipelineCreationCacheControl = LAYOUT$pipelineCreationCacheControl.byteSize();
    public static final long SIZE$privateData = LAYOUT$privateData.byteSize();
    public static final long SIZE$shaderDemoteToHelperInvocation = LAYOUT$shaderDemoteToHelperInvocation.byteSize();
    public static final long SIZE$shaderTerminateInvocation = LAYOUT$shaderTerminateInvocation.byteSize();
    public static final long SIZE$subgroupSizeControl = LAYOUT$subgroupSizeControl.byteSize();
    public static final long SIZE$computeFullSubgroups = LAYOUT$computeFullSubgroups.byteSize();
    public static final long SIZE$synchronization2 = LAYOUT$synchronization2.byteSize();
    public static final long SIZE$textureCompressionASTC_HDR = LAYOUT$textureCompressionASTC_HDR.byteSize();
    public static final long SIZE$shaderZeroInitializeWorkgroupMemory = LAYOUT$shaderZeroInitializeWorkgroupMemory.byteSize();
    public static final long SIZE$dynamicRendering = LAYOUT$dynamicRendering.byteSize();
    public static final long SIZE$shaderIntegerDotProduct = LAYOUT$shaderIntegerDotProduct.byteSize();
    public static final long SIZE$maintenance4 = LAYOUT$maintenance4.byteSize();
}
