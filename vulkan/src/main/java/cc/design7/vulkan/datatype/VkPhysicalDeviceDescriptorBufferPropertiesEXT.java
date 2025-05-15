package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceDescriptorBufferPropertiesEXT.html"><code>VkPhysicalDeviceDescriptorBufferPropertiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceDescriptorBufferPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 combinedImageSamplerDescriptorSingleArray;
///     VkBool32 bufferlessPushDescriptors;
///     VkBool32 allowSamplerImageViewPostSubmitCreation;
///     VkDeviceSize descriptorBufferOffsetAlignment;
///     uint32_t maxDescriptorBufferBindings;
///     uint32_t maxResourceDescriptorBufferBindings;
///     uint32_t maxSamplerDescriptorBufferBindings;
///     uint32_t maxEmbeddedImmutableSamplerBindings;
///     uint32_t maxEmbeddedImmutableSamplers;
///     size_t bufferCaptureReplayDescriptorDataSize;
///     size_t imageCaptureReplayDescriptorDataSize;
///     size_t imageViewCaptureReplayDescriptorDataSize;
///     size_t samplerCaptureReplayDescriptorDataSize;
///     size_t accelerationStructureCaptureReplayDescriptorDataSize;
///     size_t samplerDescriptorSize;
///     size_t combinedImageSamplerDescriptorSize;
///     size_t sampledImageDescriptorSize;
///     size_t storageImageDescriptorSize;
///     size_t uniformTexelBufferDescriptorSize;
///     size_t robustUniformTexelBufferDescriptorSize;
///     size_t storageTexelBufferDescriptorSize;
///     size_t robustStorageTexelBufferDescriptorSize;
///     size_t uniformBufferDescriptorSize;
///     size_t robustUniformBufferDescriptorSize;
///     size_t storageBufferDescriptorSize;
///     size_t robustStorageBufferDescriptorSize;
///     size_t inputAttachmentDescriptorSize;
///     size_t accelerationStructureDescriptorSize;
///     VkDeviceSize maxSamplerDescriptorBufferRange;
///     VkDeviceSize maxResourceDescriptorBufferRange;
///     VkDeviceSize samplerDescriptorBufferAddressSpaceSize;
///     VkDeviceSize resourceDescriptorBufferAddressSpaceSize;
///     VkDeviceSize descriptorBufferAddressSpaceSize;
/// } VkPhysicalDeviceDescriptorBufferPropertiesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT`
///
/// The {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceDescriptorBufferPropertiesEXT#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceDescriptorBufferPropertiesEXT.html"><code>VkPhysicalDeviceDescriptorBufferPropertiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceDescriptorBufferPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT allocate(Arena arena) {
        VkPhysicalDeviceDescriptorBufferPropertiesEXT ret = new VkPhysicalDeviceDescriptorBufferPropertiesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDescriptorBufferPropertiesEXT[] ret = new VkPhysicalDeviceDescriptorBufferPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceDescriptorBufferPropertiesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT clone(Arena arena, VkPhysicalDeviceDescriptorBufferPropertiesEXT src) {
        VkPhysicalDeviceDescriptorBufferPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceDescriptorBufferPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceDescriptorBufferPropertiesEXT[] src) {
        VkPhysicalDeviceDescriptorBufferPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_PROPERTIES_EXT);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int combinedImageSamplerDescriptorSingleArray() {
        return segment.get(LAYOUT$combinedImageSamplerDescriptorSingleArray, OFFSET$combinedImageSamplerDescriptorSingleArray);
    }

    public void combinedImageSamplerDescriptorSingleArray(@unsigned int value) {
        segment.set(LAYOUT$combinedImageSamplerDescriptorSingleArray, OFFSET$combinedImageSamplerDescriptorSingleArray, value);
    }

    public @unsigned int bufferlessPushDescriptors() {
        return segment.get(LAYOUT$bufferlessPushDescriptors, OFFSET$bufferlessPushDescriptors);
    }

    public void bufferlessPushDescriptors(@unsigned int value) {
        segment.set(LAYOUT$bufferlessPushDescriptors, OFFSET$bufferlessPushDescriptors, value);
    }

    public @unsigned int allowSamplerImageViewPostSubmitCreation() {
        return segment.get(LAYOUT$allowSamplerImageViewPostSubmitCreation, OFFSET$allowSamplerImageViewPostSubmitCreation);
    }

    public void allowSamplerImageViewPostSubmitCreation(@unsigned int value) {
        segment.set(LAYOUT$allowSamplerImageViewPostSubmitCreation, OFFSET$allowSamplerImageViewPostSubmitCreation, value);
    }

    public @unsigned long descriptorBufferOffsetAlignment() {
        return segment.get(LAYOUT$descriptorBufferOffsetAlignment, OFFSET$descriptorBufferOffsetAlignment);
    }

    public void descriptorBufferOffsetAlignment(@unsigned long value) {
        segment.set(LAYOUT$descriptorBufferOffsetAlignment, OFFSET$descriptorBufferOffsetAlignment, value);
    }

    public @unsigned int maxDescriptorBufferBindings() {
        return segment.get(LAYOUT$maxDescriptorBufferBindings, OFFSET$maxDescriptorBufferBindings);
    }

    public void maxDescriptorBufferBindings(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorBufferBindings, OFFSET$maxDescriptorBufferBindings, value);
    }

    public @unsigned int maxResourceDescriptorBufferBindings() {
        return segment.get(LAYOUT$maxResourceDescriptorBufferBindings, OFFSET$maxResourceDescriptorBufferBindings);
    }

    public void maxResourceDescriptorBufferBindings(@unsigned int value) {
        segment.set(LAYOUT$maxResourceDescriptorBufferBindings, OFFSET$maxResourceDescriptorBufferBindings, value);
    }

    public @unsigned int maxSamplerDescriptorBufferBindings() {
        return segment.get(LAYOUT$maxSamplerDescriptorBufferBindings, OFFSET$maxSamplerDescriptorBufferBindings);
    }

    public void maxSamplerDescriptorBufferBindings(@unsigned int value) {
        segment.set(LAYOUT$maxSamplerDescriptorBufferBindings, OFFSET$maxSamplerDescriptorBufferBindings, value);
    }

    public @unsigned int maxEmbeddedImmutableSamplerBindings() {
        return segment.get(LAYOUT$maxEmbeddedImmutableSamplerBindings, OFFSET$maxEmbeddedImmutableSamplerBindings);
    }

    public void maxEmbeddedImmutableSamplerBindings(@unsigned int value) {
        segment.set(LAYOUT$maxEmbeddedImmutableSamplerBindings, OFFSET$maxEmbeddedImmutableSamplerBindings, value);
    }

    public @unsigned int maxEmbeddedImmutableSamplers() {
        return segment.get(LAYOUT$maxEmbeddedImmutableSamplers, OFFSET$maxEmbeddedImmutableSamplers);
    }

    public void maxEmbeddedImmutableSamplers(@unsigned int value) {
        segment.set(LAYOUT$maxEmbeddedImmutableSamplers, OFFSET$maxEmbeddedImmutableSamplers, value);
    }

    public @unsigned long bufferCaptureReplayDescriptorDataSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$bufferCaptureReplayDescriptorDataSize);
    }

    public void bufferCaptureReplayDescriptorDataSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$bufferCaptureReplayDescriptorDataSize, value);
    }

    public @unsigned long imageCaptureReplayDescriptorDataSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$imageCaptureReplayDescriptorDataSize);
    }

    public void imageCaptureReplayDescriptorDataSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$imageCaptureReplayDescriptorDataSize, value);
    }

    public @unsigned long imageViewCaptureReplayDescriptorDataSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$imageViewCaptureReplayDescriptorDataSize);
    }

    public void imageViewCaptureReplayDescriptorDataSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$imageViewCaptureReplayDescriptorDataSize, value);
    }

    public @unsigned long samplerCaptureReplayDescriptorDataSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$samplerCaptureReplayDescriptorDataSize);
    }

    public void samplerCaptureReplayDescriptorDataSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$samplerCaptureReplayDescriptorDataSize, value);
    }

    public @unsigned long accelerationStructureCaptureReplayDescriptorDataSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$accelerationStructureCaptureReplayDescriptorDataSize);
    }

    public void accelerationStructureCaptureReplayDescriptorDataSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$accelerationStructureCaptureReplayDescriptorDataSize, value);
    }

    public @unsigned long samplerDescriptorSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$samplerDescriptorSize);
    }

    public void samplerDescriptorSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$samplerDescriptorSize, value);
    }

    public @unsigned long combinedImageSamplerDescriptorSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$combinedImageSamplerDescriptorSize);
    }

    public void combinedImageSamplerDescriptorSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$combinedImageSamplerDescriptorSize, value);
    }

    public @unsigned long sampledImageDescriptorSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$sampledImageDescriptorSize);
    }

    public void sampledImageDescriptorSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$sampledImageDescriptorSize, value);
    }

    public @unsigned long storageImageDescriptorSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$storageImageDescriptorSize);
    }

    public void storageImageDescriptorSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$storageImageDescriptorSize, value);
    }

    public @unsigned long uniformTexelBufferDescriptorSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$uniformTexelBufferDescriptorSize);
    }

    public void uniformTexelBufferDescriptorSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$uniformTexelBufferDescriptorSize, value);
    }

    public @unsigned long robustUniformTexelBufferDescriptorSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$robustUniformTexelBufferDescriptorSize);
    }

    public void robustUniformTexelBufferDescriptorSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$robustUniformTexelBufferDescriptorSize, value);
    }

    public @unsigned long storageTexelBufferDescriptorSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$storageTexelBufferDescriptorSize);
    }

    public void storageTexelBufferDescriptorSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$storageTexelBufferDescriptorSize, value);
    }

    public @unsigned long robustStorageTexelBufferDescriptorSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$robustStorageTexelBufferDescriptorSize);
    }

    public void robustStorageTexelBufferDescriptorSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$robustStorageTexelBufferDescriptorSize, value);
    }

    public @unsigned long uniformBufferDescriptorSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$uniformBufferDescriptorSize);
    }

    public void uniformBufferDescriptorSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$uniformBufferDescriptorSize, value);
    }

    public @unsigned long robustUniformBufferDescriptorSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$robustUniformBufferDescriptorSize);
    }

    public void robustUniformBufferDescriptorSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$robustUniformBufferDescriptorSize, value);
    }

    public @unsigned long storageBufferDescriptorSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$storageBufferDescriptorSize);
    }

    public void storageBufferDescriptorSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$storageBufferDescriptorSize, value);
    }

    public @unsigned long robustStorageBufferDescriptorSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$robustStorageBufferDescriptorSize);
    }

    public void robustStorageBufferDescriptorSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$robustStorageBufferDescriptorSize, value);
    }

    public @unsigned long inputAttachmentDescriptorSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$inputAttachmentDescriptorSize);
    }

    public void inputAttachmentDescriptorSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$inputAttachmentDescriptorSize, value);
    }

    public @unsigned long accelerationStructureDescriptorSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$accelerationStructureDescriptorSize);
    }

    public void accelerationStructureDescriptorSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$accelerationStructureDescriptorSize, value);
    }

    public @unsigned long maxSamplerDescriptorBufferRange() {
        return segment.get(LAYOUT$maxSamplerDescriptorBufferRange, OFFSET$maxSamplerDescriptorBufferRange);
    }

    public void maxSamplerDescriptorBufferRange(@unsigned long value) {
        segment.set(LAYOUT$maxSamplerDescriptorBufferRange, OFFSET$maxSamplerDescriptorBufferRange, value);
    }

    public @unsigned long maxResourceDescriptorBufferRange() {
        return segment.get(LAYOUT$maxResourceDescriptorBufferRange, OFFSET$maxResourceDescriptorBufferRange);
    }

    public void maxResourceDescriptorBufferRange(@unsigned long value) {
        segment.set(LAYOUT$maxResourceDescriptorBufferRange, OFFSET$maxResourceDescriptorBufferRange, value);
    }

    public @unsigned long samplerDescriptorBufferAddressSpaceSize() {
        return segment.get(LAYOUT$samplerDescriptorBufferAddressSpaceSize, OFFSET$samplerDescriptorBufferAddressSpaceSize);
    }

    public void samplerDescriptorBufferAddressSpaceSize(@unsigned long value) {
        segment.set(LAYOUT$samplerDescriptorBufferAddressSpaceSize, OFFSET$samplerDescriptorBufferAddressSpaceSize, value);
    }

    public @unsigned long resourceDescriptorBufferAddressSpaceSize() {
        return segment.get(LAYOUT$resourceDescriptorBufferAddressSpaceSize, OFFSET$resourceDescriptorBufferAddressSpaceSize);
    }

    public void resourceDescriptorBufferAddressSpaceSize(@unsigned long value) {
        segment.set(LAYOUT$resourceDescriptorBufferAddressSpaceSize, OFFSET$resourceDescriptorBufferAddressSpaceSize, value);
    }

    public @unsigned long descriptorBufferAddressSpaceSize() {
        return segment.get(LAYOUT$descriptorBufferAddressSpaceSize, OFFSET$descriptorBufferAddressSpaceSize);
    }

    public void descriptorBufferAddressSpaceSize(@unsigned long value) {
        segment.set(LAYOUT$descriptorBufferAddressSpaceSize, OFFSET$descriptorBufferAddressSpaceSize, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("combinedImageSamplerDescriptorSingleArray"),
        ValueLayout.JAVA_INT.withName("bufferlessPushDescriptors"),
        ValueLayout.JAVA_INT.withName("allowSamplerImageViewPostSubmitCreation"),
        ValueLayout.JAVA_LONG.withName("descriptorBufferOffsetAlignment"),
        ValueLayout.JAVA_INT.withName("maxDescriptorBufferBindings"),
        ValueLayout.JAVA_INT.withName("maxResourceDescriptorBufferBindings"),
        ValueLayout.JAVA_INT.withName("maxSamplerDescriptorBufferBindings"),
        ValueLayout.JAVA_INT.withName("maxEmbeddedImmutableSamplerBindings"),
        ValueLayout.JAVA_INT.withName("maxEmbeddedImmutableSamplers"),
        NativeLayout.C_SIZE_T.withName("bufferCaptureReplayDescriptorDataSize"),
        NativeLayout.C_SIZE_T.withName("imageCaptureReplayDescriptorDataSize"),
        NativeLayout.C_SIZE_T.withName("imageViewCaptureReplayDescriptorDataSize"),
        NativeLayout.C_SIZE_T.withName("samplerCaptureReplayDescriptorDataSize"),
        NativeLayout.C_SIZE_T.withName("accelerationStructureCaptureReplayDescriptorDataSize"),
        NativeLayout.C_SIZE_T.withName("samplerDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("combinedImageSamplerDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("sampledImageDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("storageImageDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("uniformTexelBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("robustUniformTexelBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("storageTexelBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("robustStorageTexelBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("uniformBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("robustUniformBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("storageBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("robustStorageBufferDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("inputAttachmentDescriptorSize"),
        NativeLayout.C_SIZE_T.withName("accelerationStructureDescriptorSize"),
        ValueLayout.JAVA_LONG.withName("maxSamplerDescriptorBufferRange"),
        ValueLayout.JAVA_LONG.withName("maxResourceDescriptorBufferRange"),
        ValueLayout.JAVA_LONG.withName("samplerDescriptorBufferAddressSpaceSize"),
        ValueLayout.JAVA_LONG.withName("resourceDescriptorBufferAddressSpaceSize"),
        ValueLayout.JAVA_LONG.withName("descriptorBufferAddressSpaceSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$combinedImageSamplerDescriptorSingleArray = PathElement.groupElement("PATH$combinedImageSamplerDescriptorSingleArray");
    public static final PathElement PATH$bufferlessPushDescriptors = PathElement.groupElement("PATH$bufferlessPushDescriptors");
    public static final PathElement PATH$allowSamplerImageViewPostSubmitCreation = PathElement.groupElement("PATH$allowSamplerImageViewPostSubmitCreation");
    public static final PathElement PATH$descriptorBufferOffsetAlignment = PathElement.groupElement("PATH$descriptorBufferOffsetAlignment");
    public static final PathElement PATH$maxDescriptorBufferBindings = PathElement.groupElement("PATH$maxDescriptorBufferBindings");
    public static final PathElement PATH$maxResourceDescriptorBufferBindings = PathElement.groupElement("PATH$maxResourceDescriptorBufferBindings");
    public static final PathElement PATH$maxSamplerDescriptorBufferBindings = PathElement.groupElement("PATH$maxSamplerDescriptorBufferBindings");
    public static final PathElement PATH$maxEmbeddedImmutableSamplerBindings = PathElement.groupElement("PATH$maxEmbeddedImmutableSamplerBindings");
    public static final PathElement PATH$maxEmbeddedImmutableSamplers = PathElement.groupElement("PATH$maxEmbeddedImmutableSamplers");
    public static final PathElement PATH$bufferCaptureReplayDescriptorDataSize = PathElement.groupElement("PATH$bufferCaptureReplayDescriptorDataSize");
    public static final PathElement PATH$imageCaptureReplayDescriptorDataSize = PathElement.groupElement("PATH$imageCaptureReplayDescriptorDataSize");
    public static final PathElement PATH$imageViewCaptureReplayDescriptorDataSize = PathElement.groupElement("PATH$imageViewCaptureReplayDescriptorDataSize");
    public static final PathElement PATH$samplerCaptureReplayDescriptorDataSize = PathElement.groupElement("PATH$samplerCaptureReplayDescriptorDataSize");
    public static final PathElement PATH$accelerationStructureCaptureReplayDescriptorDataSize = PathElement.groupElement("PATH$accelerationStructureCaptureReplayDescriptorDataSize");
    public static final PathElement PATH$samplerDescriptorSize = PathElement.groupElement("PATH$samplerDescriptorSize");
    public static final PathElement PATH$combinedImageSamplerDescriptorSize = PathElement.groupElement("PATH$combinedImageSamplerDescriptorSize");
    public static final PathElement PATH$sampledImageDescriptorSize = PathElement.groupElement("PATH$sampledImageDescriptorSize");
    public static final PathElement PATH$storageImageDescriptorSize = PathElement.groupElement("PATH$storageImageDescriptorSize");
    public static final PathElement PATH$uniformTexelBufferDescriptorSize = PathElement.groupElement("PATH$uniformTexelBufferDescriptorSize");
    public static final PathElement PATH$robustUniformTexelBufferDescriptorSize = PathElement.groupElement("PATH$robustUniformTexelBufferDescriptorSize");
    public static final PathElement PATH$storageTexelBufferDescriptorSize = PathElement.groupElement("PATH$storageTexelBufferDescriptorSize");
    public static final PathElement PATH$robustStorageTexelBufferDescriptorSize = PathElement.groupElement("PATH$robustStorageTexelBufferDescriptorSize");
    public static final PathElement PATH$uniformBufferDescriptorSize = PathElement.groupElement("PATH$uniformBufferDescriptorSize");
    public static final PathElement PATH$robustUniformBufferDescriptorSize = PathElement.groupElement("PATH$robustUniformBufferDescriptorSize");
    public static final PathElement PATH$storageBufferDescriptorSize = PathElement.groupElement("PATH$storageBufferDescriptorSize");
    public static final PathElement PATH$robustStorageBufferDescriptorSize = PathElement.groupElement("PATH$robustStorageBufferDescriptorSize");
    public static final PathElement PATH$inputAttachmentDescriptorSize = PathElement.groupElement("PATH$inputAttachmentDescriptorSize");
    public static final PathElement PATH$accelerationStructureDescriptorSize = PathElement.groupElement("PATH$accelerationStructureDescriptorSize");
    public static final PathElement PATH$maxSamplerDescriptorBufferRange = PathElement.groupElement("PATH$maxSamplerDescriptorBufferRange");
    public static final PathElement PATH$maxResourceDescriptorBufferRange = PathElement.groupElement("PATH$maxResourceDescriptorBufferRange");
    public static final PathElement PATH$samplerDescriptorBufferAddressSpaceSize = PathElement.groupElement("PATH$samplerDescriptorBufferAddressSpaceSize");
    public static final PathElement PATH$resourceDescriptorBufferAddressSpaceSize = PathElement.groupElement("PATH$resourceDescriptorBufferAddressSpaceSize");
    public static final PathElement PATH$descriptorBufferAddressSpaceSize = PathElement.groupElement("PATH$descriptorBufferAddressSpaceSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$combinedImageSamplerDescriptorSingleArray = (OfInt) LAYOUT.select(PATH$combinedImageSamplerDescriptorSingleArray);
    public static final OfInt LAYOUT$bufferlessPushDescriptors = (OfInt) LAYOUT.select(PATH$bufferlessPushDescriptors);
    public static final OfInt LAYOUT$allowSamplerImageViewPostSubmitCreation = (OfInt) LAYOUT.select(PATH$allowSamplerImageViewPostSubmitCreation);
    public static final OfLong LAYOUT$descriptorBufferOffsetAlignment = (OfLong) LAYOUT.select(PATH$descriptorBufferOffsetAlignment);
    public static final OfInt LAYOUT$maxDescriptorBufferBindings = (OfInt) LAYOUT.select(PATH$maxDescriptorBufferBindings);
    public static final OfInt LAYOUT$maxResourceDescriptorBufferBindings = (OfInt) LAYOUT.select(PATH$maxResourceDescriptorBufferBindings);
    public static final OfInt LAYOUT$maxSamplerDescriptorBufferBindings = (OfInt) LAYOUT.select(PATH$maxSamplerDescriptorBufferBindings);
    public static final OfInt LAYOUT$maxEmbeddedImmutableSamplerBindings = (OfInt) LAYOUT.select(PATH$maxEmbeddedImmutableSamplerBindings);
    public static final OfInt LAYOUT$maxEmbeddedImmutableSamplers = (OfInt) LAYOUT.select(PATH$maxEmbeddedImmutableSamplers);
    public static final OfLong LAYOUT$maxSamplerDescriptorBufferRange = (OfLong) LAYOUT.select(PATH$maxSamplerDescriptorBufferRange);
    public static final OfLong LAYOUT$maxResourceDescriptorBufferRange = (OfLong) LAYOUT.select(PATH$maxResourceDescriptorBufferRange);
    public static final OfLong LAYOUT$samplerDescriptorBufferAddressSpaceSize = (OfLong) LAYOUT.select(PATH$samplerDescriptorBufferAddressSpaceSize);
    public static final OfLong LAYOUT$resourceDescriptorBufferAddressSpaceSize = (OfLong) LAYOUT.select(PATH$resourceDescriptorBufferAddressSpaceSize);
    public static final OfLong LAYOUT$descriptorBufferAddressSpaceSize = (OfLong) LAYOUT.select(PATH$descriptorBufferAddressSpaceSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$combinedImageSamplerDescriptorSingleArray = LAYOUT$combinedImageSamplerDescriptorSingleArray.byteSize();
    public static final long SIZE$bufferlessPushDescriptors = LAYOUT$bufferlessPushDescriptors.byteSize();
    public static final long SIZE$allowSamplerImageViewPostSubmitCreation = LAYOUT$allowSamplerImageViewPostSubmitCreation.byteSize();
    public static final long SIZE$descriptorBufferOffsetAlignment = LAYOUT$descriptorBufferOffsetAlignment.byteSize();
    public static final long SIZE$maxDescriptorBufferBindings = LAYOUT$maxDescriptorBufferBindings.byteSize();
    public static final long SIZE$maxResourceDescriptorBufferBindings = LAYOUT$maxResourceDescriptorBufferBindings.byteSize();
    public static final long SIZE$maxSamplerDescriptorBufferBindings = LAYOUT$maxSamplerDescriptorBufferBindings.byteSize();
    public static final long SIZE$maxEmbeddedImmutableSamplerBindings = LAYOUT$maxEmbeddedImmutableSamplerBindings.byteSize();
    public static final long SIZE$maxEmbeddedImmutableSamplers = LAYOUT$maxEmbeddedImmutableSamplers.byteSize();
    public static final long SIZE$bufferCaptureReplayDescriptorDataSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$imageCaptureReplayDescriptorDataSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$imageViewCaptureReplayDescriptorDataSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$samplerCaptureReplayDescriptorDataSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$accelerationStructureCaptureReplayDescriptorDataSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$samplerDescriptorSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$combinedImageSamplerDescriptorSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$sampledImageDescriptorSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$storageImageDescriptorSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$uniformTexelBufferDescriptorSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$robustUniformTexelBufferDescriptorSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$storageTexelBufferDescriptorSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$robustStorageTexelBufferDescriptorSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$uniformBufferDescriptorSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$robustUniformBufferDescriptorSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$storageBufferDescriptorSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$robustStorageBufferDescriptorSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$inputAttachmentDescriptorSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$accelerationStructureDescriptorSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$maxSamplerDescriptorBufferRange = LAYOUT$maxSamplerDescriptorBufferRange.byteSize();
    public static final long SIZE$maxResourceDescriptorBufferRange = LAYOUT$maxResourceDescriptorBufferRange.byteSize();
    public static final long SIZE$samplerDescriptorBufferAddressSpaceSize = LAYOUT$samplerDescriptorBufferAddressSpaceSize.byteSize();
    public static final long SIZE$resourceDescriptorBufferAddressSpaceSize = LAYOUT$resourceDescriptorBufferAddressSpaceSize.byteSize();
    public static final long SIZE$descriptorBufferAddressSpaceSize = LAYOUT$descriptorBufferAddressSpaceSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$combinedImageSamplerDescriptorSingleArray = LAYOUT.byteOffset(PATH$combinedImageSamplerDescriptorSingleArray);
    public static final long OFFSET$bufferlessPushDescriptors = LAYOUT.byteOffset(PATH$bufferlessPushDescriptors);
    public static final long OFFSET$allowSamplerImageViewPostSubmitCreation = LAYOUT.byteOffset(PATH$allowSamplerImageViewPostSubmitCreation);
    public static final long OFFSET$descriptorBufferOffsetAlignment = LAYOUT.byteOffset(PATH$descriptorBufferOffsetAlignment);
    public static final long OFFSET$maxDescriptorBufferBindings = LAYOUT.byteOffset(PATH$maxDescriptorBufferBindings);
    public static final long OFFSET$maxResourceDescriptorBufferBindings = LAYOUT.byteOffset(PATH$maxResourceDescriptorBufferBindings);
    public static final long OFFSET$maxSamplerDescriptorBufferBindings = LAYOUT.byteOffset(PATH$maxSamplerDescriptorBufferBindings);
    public static final long OFFSET$maxEmbeddedImmutableSamplerBindings = LAYOUT.byteOffset(PATH$maxEmbeddedImmutableSamplerBindings);
    public static final long OFFSET$maxEmbeddedImmutableSamplers = LAYOUT.byteOffset(PATH$maxEmbeddedImmutableSamplers);
    public static final long OFFSET$bufferCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PATH$bufferCaptureReplayDescriptorDataSize);
    public static final long OFFSET$imageCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PATH$imageCaptureReplayDescriptorDataSize);
    public static final long OFFSET$imageViewCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PATH$imageViewCaptureReplayDescriptorDataSize);
    public static final long OFFSET$samplerCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PATH$samplerCaptureReplayDescriptorDataSize);
    public static final long OFFSET$accelerationStructureCaptureReplayDescriptorDataSize = LAYOUT.byteOffset(PATH$accelerationStructureCaptureReplayDescriptorDataSize);
    public static final long OFFSET$samplerDescriptorSize = LAYOUT.byteOffset(PATH$samplerDescriptorSize);
    public static final long OFFSET$combinedImageSamplerDescriptorSize = LAYOUT.byteOffset(PATH$combinedImageSamplerDescriptorSize);
    public static final long OFFSET$sampledImageDescriptorSize = LAYOUT.byteOffset(PATH$sampledImageDescriptorSize);
    public static final long OFFSET$storageImageDescriptorSize = LAYOUT.byteOffset(PATH$storageImageDescriptorSize);
    public static final long OFFSET$uniformTexelBufferDescriptorSize = LAYOUT.byteOffset(PATH$uniformTexelBufferDescriptorSize);
    public static final long OFFSET$robustUniformTexelBufferDescriptorSize = LAYOUT.byteOffset(PATH$robustUniformTexelBufferDescriptorSize);
    public static final long OFFSET$storageTexelBufferDescriptorSize = LAYOUT.byteOffset(PATH$storageTexelBufferDescriptorSize);
    public static final long OFFSET$robustStorageTexelBufferDescriptorSize = LAYOUT.byteOffset(PATH$robustStorageTexelBufferDescriptorSize);
    public static final long OFFSET$uniformBufferDescriptorSize = LAYOUT.byteOffset(PATH$uniformBufferDescriptorSize);
    public static final long OFFSET$robustUniformBufferDescriptorSize = LAYOUT.byteOffset(PATH$robustUniformBufferDescriptorSize);
    public static final long OFFSET$storageBufferDescriptorSize = LAYOUT.byteOffset(PATH$storageBufferDescriptorSize);
    public static final long OFFSET$robustStorageBufferDescriptorSize = LAYOUT.byteOffset(PATH$robustStorageBufferDescriptorSize);
    public static final long OFFSET$inputAttachmentDescriptorSize = LAYOUT.byteOffset(PATH$inputAttachmentDescriptorSize);
    public static final long OFFSET$accelerationStructureDescriptorSize = LAYOUT.byteOffset(PATH$accelerationStructureDescriptorSize);
    public static final long OFFSET$maxSamplerDescriptorBufferRange = LAYOUT.byteOffset(PATH$maxSamplerDescriptorBufferRange);
    public static final long OFFSET$maxResourceDescriptorBufferRange = LAYOUT.byteOffset(PATH$maxResourceDescriptorBufferRange);
    public static final long OFFSET$samplerDescriptorBufferAddressSpaceSize = LAYOUT.byteOffset(PATH$samplerDescriptorBufferAddressSpaceSize);
    public static final long OFFSET$resourceDescriptorBufferAddressSpaceSize = LAYOUT.byteOffset(PATH$resourceDescriptorBufferAddressSpaceSize);
    public static final long OFFSET$descriptorBufferAddressSpaceSize = LAYOUT.byteOffset(PATH$descriptorBufferAddressSpaceSize);
}
