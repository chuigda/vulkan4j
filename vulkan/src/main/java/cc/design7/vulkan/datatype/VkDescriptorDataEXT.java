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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorDataEXT.html"><code>VkDescriptorDataEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDescriptorDataEXT {
///     VkSampler const* pSampler;
///     VkDescriptorImageInfo const* pCombinedImageSampler;
///     VkDescriptorImageInfo const* pInputAttachmentImage;
///     VkDescriptorImageInfo const* pSampledImage;
///     VkDescriptorImageInfo const* pStorageImage;
///     VkDescriptorAddressInfoEXT const* pUniformTexelBuffer;
///     VkDescriptorAddressInfoEXT const* pStorageTexelBuffer;
///     VkDescriptorAddressInfoEXT const* pUniformBuffer;
///     VkDescriptorAddressInfoEXT const* pStorageBuffer;
///     VkDeviceAddress accelerationStructure;
/// } VkDescriptorDataEXT;
/// }
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorDataEXT.html"><code>VkDescriptorDataEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorDataEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDescriptorDataEXT allocate(Arena arena) {
        VkDescriptorDataEXT ret = new VkDescriptorDataEXT(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkDescriptorDataEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorDataEXT[] ret = new VkDescriptorDataEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorDataEXT(segment.asSlice(i * BYTES, BYTES));
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @pointer(comment="VkSampler*") MemorySegment pSamplerRaw() {
        return segment.get(LAYOUT$pSampler, OFFSET$pSampler);
    }

    public void pSamplerRaw(@pointer(comment="VkSampler*") MemorySegment value) {
        segment.set(LAYOUT$pSampler, OFFSET$pSampler, value);
    }

    /// Note: the returned {@link VkSampler.Buffer} does not have correct {@link VkSampler.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkSampler.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkSampler.Buffer pSampler() {
        MemorySegment s = pSamplerRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSampler.Buffer(s);
    }


    public @pointer(comment="VkDescriptorImageInfo*") MemorySegment pCombinedImageSamplerRaw() {
        return segment.get(LAYOUT$pCombinedImageSampler, OFFSET$pCombinedImageSampler);
    }

    public void pCombinedImageSamplerRaw(@pointer(comment="VkDescriptorImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pCombinedImageSampler, OFFSET$pCombinedImageSampler, value);
    }

    public @Nullable VkDescriptorImageInfo pCombinedImageSampler() {
        MemorySegment s = pCombinedImageSamplerRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    public void pCombinedImageSampler(@Nullable VkDescriptorImageInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCombinedImageSamplerRaw(s);
    }

    @unsafe public @Nullable VkDescriptorImageInfo[] pCombinedImageSampler(int assumedCount) {
        MemorySegment s = pCombinedImageSamplerRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorImageInfo.SIZE);
        VkDescriptorImageInfo[] ret = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.SIZE, VkDescriptorImageInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkDescriptorImageInfo*") MemorySegment pInputAttachmentImageRaw() {
        return segment.get(LAYOUT$pInputAttachmentImage, OFFSET$pInputAttachmentImage);
    }

    public void pInputAttachmentImageRaw(@pointer(comment="VkDescriptorImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pInputAttachmentImage, OFFSET$pInputAttachmentImage, value);
    }

    public @Nullable VkDescriptorImageInfo pInputAttachmentImage() {
        MemorySegment s = pInputAttachmentImageRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    public void pInputAttachmentImage(@Nullable VkDescriptorImageInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pInputAttachmentImageRaw(s);
    }

    @unsafe public @Nullable VkDescriptorImageInfo[] pInputAttachmentImage(int assumedCount) {
        MemorySegment s = pInputAttachmentImageRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorImageInfo.SIZE);
        VkDescriptorImageInfo[] ret = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.SIZE, VkDescriptorImageInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkDescriptorImageInfo*") MemorySegment pSampledImageRaw() {
        return segment.get(LAYOUT$pSampledImage, OFFSET$pSampledImage);
    }

    public void pSampledImageRaw(@pointer(comment="VkDescriptorImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pSampledImage, OFFSET$pSampledImage, value);
    }

    public @Nullable VkDescriptorImageInfo pSampledImage() {
        MemorySegment s = pSampledImageRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    public void pSampledImage(@Nullable VkDescriptorImageInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSampledImageRaw(s);
    }

    @unsafe public @Nullable VkDescriptorImageInfo[] pSampledImage(int assumedCount) {
        MemorySegment s = pSampledImageRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorImageInfo.SIZE);
        VkDescriptorImageInfo[] ret = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.SIZE, VkDescriptorImageInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkDescriptorImageInfo*") MemorySegment pStorageImageRaw() {
        return segment.get(LAYOUT$pStorageImage, OFFSET$pStorageImage);
    }

    public void pStorageImageRaw(@pointer(comment="VkDescriptorImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStorageImage, OFFSET$pStorageImage, value);
    }

    public @Nullable VkDescriptorImageInfo pStorageImage() {
        MemorySegment s = pStorageImageRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    public void pStorageImage(@Nullable VkDescriptorImageInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStorageImageRaw(s);
    }

    @unsafe public @Nullable VkDescriptorImageInfo[] pStorageImage(int assumedCount) {
        MemorySegment s = pStorageImageRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorImageInfo.SIZE);
        VkDescriptorImageInfo[] ret = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.SIZE, VkDescriptorImageInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment pUniformTexelBufferRaw() {
        return segment.get(LAYOUT$pUniformTexelBuffer, OFFSET$pUniformTexelBuffer);
    }

    public void pUniformTexelBufferRaw(@pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pUniformTexelBuffer, OFFSET$pUniformTexelBuffer, value);
    }

    public @Nullable VkDescriptorAddressInfoEXT pUniformTexelBuffer() {
        MemorySegment s = pUniformTexelBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorAddressInfoEXT(s);
    }

    public void pUniformTexelBuffer(@Nullable VkDescriptorAddressInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pUniformTexelBufferRaw(s);
    }

    @unsafe public @Nullable VkDescriptorAddressInfoEXT[] pUniformTexelBuffer(int assumedCount) {
        MemorySegment s = pUniformTexelBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorAddressInfoEXT.SIZE);
        VkDescriptorAddressInfoEXT[] ret = new VkDescriptorAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorAddressInfoEXT(s.asSlice(i * VkDescriptorAddressInfoEXT.SIZE, VkDescriptorAddressInfoEXT.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment pStorageTexelBufferRaw() {
        return segment.get(LAYOUT$pStorageTexelBuffer, OFFSET$pStorageTexelBuffer);
    }

    public void pStorageTexelBufferRaw(@pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pStorageTexelBuffer, OFFSET$pStorageTexelBuffer, value);
    }

    public @Nullable VkDescriptorAddressInfoEXT pStorageTexelBuffer() {
        MemorySegment s = pStorageTexelBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorAddressInfoEXT(s);
    }

    public void pStorageTexelBuffer(@Nullable VkDescriptorAddressInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStorageTexelBufferRaw(s);
    }

    @unsafe public @Nullable VkDescriptorAddressInfoEXT[] pStorageTexelBuffer(int assumedCount) {
        MemorySegment s = pStorageTexelBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorAddressInfoEXT.SIZE);
        VkDescriptorAddressInfoEXT[] ret = new VkDescriptorAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorAddressInfoEXT(s.asSlice(i * VkDescriptorAddressInfoEXT.SIZE, VkDescriptorAddressInfoEXT.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment pUniformBufferRaw() {
        return segment.get(LAYOUT$pUniformBuffer, OFFSET$pUniformBuffer);
    }

    public void pUniformBufferRaw(@pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pUniformBuffer, OFFSET$pUniformBuffer, value);
    }

    public @Nullable VkDescriptorAddressInfoEXT pUniformBuffer() {
        MemorySegment s = pUniformBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorAddressInfoEXT(s);
    }

    public void pUniformBuffer(@Nullable VkDescriptorAddressInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pUniformBufferRaw(s);
    }

    @unsafe public @Nullable VkDescriptorAddressInfoEXT[] pUniformBuffer(int assumedCount) {
        MemorySegment s = pUniformBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorAddressInfoEXT.SIZE);
        VkDescriptorAddressInfoEXT[] ret = new VkDescriptorAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorAddressInfoEXT(s.asSlice(i * VkDescriptorAddressInfoEXT.SIZE, VkDescriptorAddressInfoEXT.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment pStorageBufferRaw() {
        return segment.get(LAYOUT$pStorageBuffer, OFFSET$pStorageBuffer);
    }

    public void pStorageBufferRaw(@pointer(comment="VkDescriptorAddressInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pStorageBuffer, OFFSET$pStorageBuffer, value);
    }

    public @Nullable VkDescriptorAddressInfoEXT pStorageBuffer() {
        MemorySegment s = pStorageBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorAddressInfoEXT(s);
    }

    public void pStorageBuffer(@Nullable VkDescriptorAddressInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStorageBufferRaw(s);
    }

    @unsafe public @Nullable VkDescriptorAddressInfoEXT[] pStorageBuffer(int assumedCount) {
        MemorySegment s = pStorageBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorAddressInfoEXT.SIZE);
        VkDescriptorAddressInfoEXT[] ret = new VkDescriptorAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorAddressInfoEXT(s.asSlice(i * VkDescriptorAddressInfoEXT.SIZE, VkDescriptorAddressInfoEXT.SIZE));
        }
        return ret;
    }

    public @unsigned long accelerationStructure() {
        return segment.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure);
    }

    public void accelerationStructure(@unsigned long value) {
        segment.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value);
    }

    public static final UnionLayout LAYOUT = NativeLayout.unionLayout(
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
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$pSampler = PathElement.groupElement("PATH$pSampler");
    public static final PathElement PATH$pCombinedImageSampler = PathElement.groupElement("PATH$pCombinedImageSampler");
    public static final PathElement PATH$pInputAttachmentImage = PathElement.groupElement("PATH$pInputAttachmentImage");
    public static final PathElement PATH$pSampledImage = PathElement.groupElement("PATH$pSampledImage");
    public static final PathElement PATH$pStorageImage = PathElement.groupElement("PATH$pStorageImage");
    public static final PathElement PATH$pUniformTexelBuffer = PathElement.groupElement("PATH$pUniformTexelBuffer");
    public static final PathElement PATH$pStorageTexelBuffer = PathElement.groupElement("PATH$pStorageTexelBuffer");
    public static final PathElement PATH$pUniformBuffer = PathElement.groupElement("PATH$pUniformBuffer");
    public static final PathElement PATH$pStorageBuffer = PathElement.groupElement("PATH$pStorageBuffer");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("PATH$accelerationStructure");

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
}
