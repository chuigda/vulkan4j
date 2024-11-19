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
/// typedef union VkDescriptorDataEXT {
///     const VkSampler* pSampler;
///     const VkDescriptorImageInfo* pCombinedImageSampler;
///     const VkDescriptorImageInfo* pInputAttachmentImage;
///     const VkDescriptorImageInfo* pSampledImage;
///     const VkDescriptorImageInfo* pStorageImage;
///     const VkDescriptorAddressInfoEXT* pUniformTexelBuffer;
///     const VkDescriptorAddressInfoEXT* pStorageTexelBuffer;
///     const VkDescriptorAddressInfoEXT* pUniformBuffer;
///     const VkDescriptorAddressInfoEXT* pStorageBuffer;
///     VkDeviceAddress accelerationStructure;
/// } VkDescriptorDataEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDescriptorDataEXT.html">VkDescriptorDataEXT</a>
public record VkDescriptorDataEXT(MemorySegment segment) implements IPointer {
    public VkDescriptorDataEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @pointer(comment="VkSampler") MemorySegment pSamplerRaw() {
        return segment.get(LAYOUT$pSampler, OFFSET$pSampler);
    }

    public void pSamplerRaw(@pointer(comment="VkSampler") MemorySegment value) {
        segment.set(LAYOUT$pSampler, OFFSET$pSampler, value);
    }

    /// Note: the returned {@link VkSampler.Buffer} does not have correct
    /// {@link VkSampler.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkSampler.Buffer#reinterpret} to set the size before actually
    /// {@link VkSampler.Buffer#read}ing or {@link VkSampler.Buffer#write}ing
    /// the buffer.
    public @Nullable VkSampler.Buffer pSampler() {
        MemorySegment s = pSamplerRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSampler.Buffer(s);
    }

    public void pSampler(@Nullable VkSampler.Buffer value) {
        pSamplerRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="VkDescriptorImageInfo*") MemorySegment pCombinedImageSamplerRaw() {
        return segment.get(LAYOUT$pCombinedImageSampler, OFFSET$pCombinedImageSampler);
    }

    public void pCombinedImageSamplerRaw(@pointer(comment="VkDescriptorImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pCombinedImageSampler, OFFSET$pCombinedImageSampler, value);
    }

    public @Nullable VkDescriptorImageInfo pCombinedImageSampler() {
        MemorySegment s = pCombinedImageSamplerRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkDescriptorImageInfo[] pCombinedImageSampler(int assumedCount) {
        MemorySegment s = pCombinedImageSamplerRaw().reinterpret(assumedCount * VkDescriptorImageInfo.SIZE);
        VkDescriptorImageInfo[] arr = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.SIZE, VkDescriptorImageInfo.SIZE));
        }
        return arr;
    }

    public void pCombinedImageSampler(@Nullable VkDescriptorImageInfo value) {
        pCombinedImageSamplerRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="VkDescriptorImageInfo*") MemorySegment pInputAttachmentImageRaw() {
        return segment.get(LAYOUT$pInputAttachmentImage, OFFSET$pInputAttachmentImage);
    }

    public void pInputAttachmentImageRaw(@pointer(comment="VkDescriptorImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pInputAttachmentImage, OFFSET$pInputAttachmentImage, value);
    }

    public @Nullable VkDescriptorImageInfo pInputAttachmentImage() {
        MemorySegment s = pInputAttachmentImageRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkDescriptorImageInfo[] pInputAttachmentImage(int assumedCount) {
        MemorySegment s = pInputAttachmentImageRaw().reinterpret(assumedCount * VkDescriptorImageInfo.SIZE);
        VkDescriptorImageInfo[] arr = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.SIZE, VkDescriptorImageInfo.SIZE));
        }
        return arr;
    }

    public void pInputAttachmentImage(@Nullable VkDescriptorImageInfo value) {
        pInputAttachmentImageRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="VkDescriptorImageInfo*") MemorySegment pSampledImageRaw() {
        return segment.get(LAYOUT$pSampledImage, OFFSET$pSampledImage);
    }

    public void pSampledImageRaw(@pointer(comment="VkDescriptorImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pSampledImage, OFFSET$pSampledImage, value);
    }

    public @Nullable VkDescriptorImageInfo pSampledImage() {
        MemorySegment s = pSampledImageRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkDescriptorImageInfo[] pSampledImage(int assumedCount) {
        MemorySegment s = pSampledImageRaw().reinterpret(assumedCount * VkDescriptorImageInfo.SIZE);
        VkDescriptorImageInfo[] arr = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.SIZE, VkDescriptorImageInfo.SIZE));
        }
        return arr;
    }

    public void pSampledImage(@Nullable VkDescriptorImageInfo value) {
        pSampledImageRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="VkDescriptorImageInfo*") MemorySegment pStorageImageRaw() {
        return segment.get(LAYOUT$pStorageImage, OFFSET$pStorageImage);
    }

    public void pStorageImageRaw(@pointer(comment="VkDescriptorImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStorageImage, OFFSET$pStorageImage, value);
    }

    public @Nullable VkDescriptorImageInfo pStorageImage() {
        MemorySegment s = pStorageImageRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkDescriptorImageInfo[] pStorageImage(int assumedCount) {
        MemorySegment s = pStorageImageRaw().reinterpret(assumedCount * VkDescriptorImageInfo.SIZE);
        VkDescriptorImageInfo[] arr = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.SIZE, VkDescriptorImageInfo.SIZE));
        }
        return arr;
    }

    public void pStorageImage(@Nullable VkDescriptorImageInfo value) {
        pStorageImageRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment pUniformTexelBufferRaw() {
        return segment.get(LAYOUT$pUniformTexelBuffer, OFFSET$pUniformTexelBuffer);
    }

    public void pUniformTexelBufferRaw(@pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pUniformTexelBuffer, OFFSET$pUniformTexelBuffer, value);
    }

    public @Nullable VkDescriptorAddressInfoEXT pUniformTexelBuffer() {
        MemorySegment s = pUniformTexelBufferRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorAddressInfoEXT(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkDescriptorAddressInfoEXT[] pUniformTexelBuffer(int assumedCount) {
        MemorySegment s = pUniformTexelBufferRaw().reinterpret(assumedCount * VkDescriptorAddressInfoEXT.SIZE);
        VkDescriptorAddressInfoEXT[] arr = new VkDescriptorAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDescriptorAddressInfoEXT(s.asSlice(i * VkDescriptorAddressInfoEXT.SIZE, VkDescriptorAddressInfoEXT.SIZE));
        }
        return arr;
    }

    public void pUniformTexelBuffer(@Nullable VkDescriptorAddressInfoEXT value) {
        pUniformTexelBufferRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment pStorageTexelBufferRaw() {
        return segment.get(LAYOUT$pStorageTexelBuffer, OFFSET$pStorageTexelBuffer);
    }

    public void pStorageTexelBufferRaw(@pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pStorageTexelBuffer, OFFSET$pStorageTexelBuffer, value);
    }

    public @Nullable VkDescriptorAddressInfoEXT pStorageTexelBuffer() {
        MemorySegment s = pStorageTexelBufferRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorAddressInfoEXT(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkDescriptorAddressInfoEXT[] pStorageTexelBuffer(int assumedCount) {
        MemorySegment s = pStorageTexelBufferRaw().reinterpret(assumedCount * VkDescriptorAddressInfoEXT.SIZE);
        VkDescriptorAddressInfoEXT[] arr = new VkDescriptorAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDescriptorAddressInfoEXT(s.asSlice(i * VkDescriptorAddressInfoEXT.SIZE, VkDescriptorAddressInfoEXT.SIZE));
        }
        return arr;
    }

    public void pStorageTexelBuffer(@Nullable VkDescriptorAddressInfoEXT value) {
        pStorageTexelBufferRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment pUniformBufferRaw() {
        return segment.get(LAYOUT$pUniformBuffer, OFFSET$pUniformBuffer);
    }

    public void pUniformBufferRaw(@pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pUniformBuffer, OFFSET$pUniformBuffer, value);
    }

    public @Nullable VkDescriptorAddressInfoEXT pUniformBuffer() {
        MemorySegment s = pUniformBufferRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorAddressInfoEXT(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkDescriptorAddressInfoEXT[] pUniformBuffer(int assumedCount) {
        MemorySegment s = pUniformBufferRaw().reinterpret(assumedCount * VkDescriptorAddressInfoEXT.SIZE);
        VkDescriptorAddressInfoEXT[] arr = new VkDescriptorAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDescriptorAddressInfoEXT(s.asSlice(i * VkDescriptorAddressInfoEXT.SIZE, VkDescriptorAddressInfoEXT.SIZE));
        }
        return arr;
    }

    public void pUniformBuffer(@Nullable VkDescriptorAddressInfoEXT value) {
        pUniformBufferRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment pStorageBufferRaw() {
        return segment.get(LAYOUT$pStorageBuffer, OFFSET$pStorageBuffer);
    }

    public void pStorageBufferRaw(@pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pStorageBuffer, OFFSET$pStorageBuffer, value);
    }

    public @Nullable VkDescriptorAddressInfoEXT pStorageBuffer() {
        MemorySegment s = pStorageBufferRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorAddressInfoEXT(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkDescriptorAddressInfoEXT[] pStorageBuffer(int assumedCount) {
        MemorySegment s = pStorageBufferRaw().reinterpret(assumedCount * VkDescriptorAddressInfoEXT.SIZE);
        VkDescriptorAddressInfoEXT[] arr = new VkDescriptorAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDescriptorAddressInfoEXT(s.asSlice(i * VkDescriptorAddressInfoEXT.SIZE, VkDescriptorAddressInfoEXT.SIZE));
        }
        return arr;
    }

    public void pStorageBuffer(@Nullable VkDescriptorAddressInfoEXT value) {
        pStorageBufferRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @unsigned long accelerationStructure() {
        return segment.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure);
    }

    public void accelerationStructure(@unsigned long value) {
        segment.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value);
    }

    public static VkDescriptorDataEXT allocate(Arena arena) {
        return new VkDescriptorDataEXT(arena.allocate(LAYOUT));
    }

    public static VkDescriptorDataEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorDataEXT[] ret = new VkDescriptorDataEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDescriptorDataEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorDataEXT clone(Arena arena, VkDescriptorDataEXT src) {
        VkDescriptorDataEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorDataEXT[] clone(Arena arena, VkDescriptorDataEXT[] src) {
        VkDescriptorDataEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSampler"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorImageInfo.LAYOUT).withName("pCombinedImageSampler"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorImageInfo.LAYOUT).withName("pInputAttachmentImage"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorImageInfo.LAYOUT).withName("pSampledImage"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorImageInfo.LAYOUT).withName("pStorageImage"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorAddressInfoEXT.LAYOUT).withName("pUniformTexelBuffer"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorAddressInfoEXT.LAYOUT).withName("pStorageTexelBuffer"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorAddressInfoEXT.LAYOUT).withName("pUniformBuffer"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorAddressInfoEXT.LAYOUT).withName("pStorageBuffer"),
        ValueLayout.JAVA_LONG.withName("accelerationStructure")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$pSampler = PathElement.groupElement("pSampler");
    public static final PathElement PATH$pCombinedImageSampler = PathElement.groupElement("pCombinedImageSampler");
    public static final PathElement PATH$pInputAttachmentImage = PathElement.groupElement("pInputAttachmentImage");
    public static final PathElement PATH$pSampledImage = PathElement.groupElement("pSampledImage");
    public static final PathElement PATH$pStorageImage = PathElement.groupElement("pStorageImage");
    public static final PathElement PATH$pUniformTexelBuffer = PathElement.groupElement("pUniformTexelBuffer");
    public static final PathElement PATH$pStorageTexelBuffer = PathElement.groupElement("pStorageTexelBuffer");
    public static final PathElement PATH$pUniformBuffer = PathElement.groupElement("pUniformBuffer");
    public static final PathElement PATH$pStorageBuffer = PathElement.groupElement("pStorageBuffer");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("accelerationStructure");

    public static final AddressLayout LAYOUT$pSampler = (AddressLayout) LAYOUT.select(PATH$pSampler);
    public static final AddressLayout LAYOUT$pCombinedImageSampler = (AddressLayout) LAYOUT.select(PATH$pCombinedImageSampler);
    public static final AddressLayout LAYOUT$pInputAttachmentImage = (AddressLayout) LAYOUT.select(PATH$pInputAttachmentImage);
    public static final AddressLayout LAYOUT$pSampledImage = (AddressLayout) LAYOUT.select(PATH$pSampledImage);
    public static final AddressLayout LAYOUT$pStorageImage = (AddressLayout) LAYOUT.select(PATH$pStorageImage);
    public static final AddressLayout LAYOUT$pUniformTexelBuffer = (AddressLayout) LAYOUT.select(PATH$pUniformTexelBuffer);
    public static final AddressLayout LAYOUT$pStorageTexelBuffer = (AddressLayout) LAYOUT.select(PATH$pStorageTexelBuffer);
    public static final AddressLayout LAYOUT$pUniformBuffer = (AddressLayout) LAYOUT.select(PATH$pUniformBuffer);
    public static final AddressLayout LAYOUT$pStorageBuffer = (AddressLayout) LAYOUT.select(PATH$pStorageBuffer);
    public static final OfLong LAYOUT$accelerationStructure = (OfLong) LAYOUT.select(PATH$accelerationStructure);

    public static final long OFFSET$pSampler = LAYOUT.byteOffset(PATH$pSampler);
    public static final long OFFSET$pCombinedImageSampler = LAYOUT.byteOffset(PATH$pCombinedImageSampler);
    public static final long OFFSET$pInputAttachmentImage = LAYOUT.byteOffset(PATH$pInputAttachmentImage);
    public static final long OFFSET$pSampledImage = LAYOUT.byteOffset(PATH$pSampledImage);
    public static final long OFFSET$pStorageImage = LAYOUT.byteOffset(PATH$pStorageImage);
    public static final long OFFSET$pUniformTexelBuffer = LAYOUT.byteOffset(PATH$pUniformTexelBuffer);
    public static final long OFFSET$pStorageTexelBuffer = LAYOUT.byteOffset(PATH$pStorageTexelBuffer);
    public static final long OFFSET$pUniformBuffer = LAYOUT.byteOffset(PATH$pUniformBuffer);
    public static final long OFFSET$pStorageBuffer = LAYOUT.byteOffset(PATH$pStorageBuffer);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);

    public static final long SIZE$pSampler = LAYOUT$pSampler.byteSize();
    public static final long SIZE$pCombinedImageSampler = LAYOUT$pCombinedImageSampler.byteSize();
    public static final long SIZE$pInputAttachmentImage = LAYOUT$pInputAttachmentImage.byteSize();
    public static final long SIZE$pSampledImage = LAYOUT$pSampledImage.byteSize();
    public static final long SIZE$pStorageImage = LAYOUT$pStorageImage.byteSize();
    public static final long SIZE$pUniformTexelBuffer = LAYOUT$pUniformTexelBuffer.byteSize();
    public static final long SIZE$pStorageTexelBuffer = LAYOUT$pStorageTexelBuffer.byteSize();
    public static final long SIZE$pUniformBuffer = LAYOUT$pUniformBuffer.byteSize();
    public static final long SIZE$pStorageBuffer = LAYOUT$pStorageBuffer.byteSize();
    public static final long SIZE$accelerationStructure = LAYOUT$accelerationStructure.byteSize();
}
