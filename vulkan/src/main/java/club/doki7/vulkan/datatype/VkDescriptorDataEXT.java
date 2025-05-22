package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorDataEXT.html"><code>VkDescriptorDataEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDescriptorDataEXT {
///     VkSampler const* pSampler; // @link substring="VkSampler" target="VkSampler" @link substring="pSampler" target="#pSampler"
///     VkDescriptorImageInfo const* pCombinedImageSampler; // @link substring="VkDescriptorImageInfo" target="VkDescriptorImageInfo" @link substring="pCombinedImageSampler" target="#pCombinedImageSampler"
///     VkDescriptorImageInfo const* pInputAttachmentImage; // @link substring="VkDescriptorImageInfo" target="VkDescriptorImageInfo" @link substring="pInputAttachmentImage" target="#pInputAttachmentImage"
///     VkDescriptorImageInfo const* pSampledImage; // optional // @link substring="VkDescriptorImageInfo" target="VkDescriptorImageInfo" @link substring="pSampledImage" target="#pSampledImage"
///     VkDescriptorImageInfo const* pStorageImage; // optional // @link substring="VkDescriptorImageInfo" target="VkDescriptorImageInfo" @link substring="pStorageImage" target="#pStorageImage"
///     VkDescriptorAddressInfoEXT const* pUniformTexelBuffer; // optional // @link substring="VkDescriptorAddressInfoEXT" target="VkDescriptorAddressInfoEXT" @link substring="pUniformTexelBuffer" target="#pUniformTexelBuffer"
///     VkDescriptorAddressInfoEXT const* pStorageTexelBuffer; // optional // @link substring="VkDescriptorAddressInfoEXT" target="VkDescriptorAddressInfoEXT" @link substring="pStorageTexelBuffer" target="#pStorageTexelBuffer"
///     VkDescriptorAddressInfoEXT const* pUniformBuffer; // optional // @link substring="VkDescriptorAddressInfoEXT" target="VkDescriptorAddressInfoEXT" @link substring="pUniformBuffer" target="#pUniformBuffer"
///     VkDescriptorAddressInfoEXT const* pStorageBuffer; // optional // @link substring="VkDescriptorAddressInfoEXT" target="VkDescriptorAddressInfoEXT" @link substring="pStorageBuffer" target="#pStorageBuffer"
///     VkDeviceAddress accelerationStructure; // @link substring="accelerationStructure" target="#accelerationStructure"
/// } VkDescriptorDataEXT;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorDataEXT.html"><code>VkDescriptorDataEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorDataEXT(@NotNull MemorySegment segment) implements IVkDescriptorDataEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorDataEXT.html"><code>VkDescriptorDataEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDescriptorDataEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDescriptorDataEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDescriptorDataEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDescriptorDataEXT {
        public long size() {
            return segment.byteSize() / VkDescriptorDataEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDescriptorDataEXT at(long index) {
            return new VkDescriptorDataEXT(segment.asSlice(index * VkDescriptorDataEXT.BYTES, VkDescriptorDataEXT.BYTES));
        }

        public void write(long index, @NotNull VkDescriptorDataEXT value) {
            MemorySegment s = segment.asSlice(index * VkDescriptorDataEXT.BYTES, VkDescriptorDataEXT.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkDescriptorDataEXT.BYTES, VkDescriptorDataEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkDescriptorDataEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkDescriptorDataEXT.BYTES,
                (end - start) * VkDescriptorDataEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkDescriptorDataEXT.BYTES));
        }
    }

    public static VkDescriptorDataEXT allocate(Arena arena) {
        return new VkDescriptorDataEXT(arena.allocate(LAYOUT));
    }

    public static VkDescriptorDataEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorDataEXT.Ptr ret = new VkDescriptorDataEXT.Ptr(segment);
        return ret;
    }

    public static VkDescriptorDataEXT clone(Arena arena, VkDescriptorDataEXT src) {
        VkDescriptorDataEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    /// Note: the returned {@link VkSampler.Ptr} does not have correct {@link VkSampler.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkSampler.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkSampler.Ptr pSampler() {
        MemorySegment s = pSamplerRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSampler.Ptr(s);
    }

    public void pSampler(@Nullable VkSampler.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSamplerRaw(s);
    }

    public @pointer(target=VkSampler.class) MemorySegment pSamplerRaw() {
        return segment.get(LAYOUT$pSampler, OFFSET$pSampler);
    }

    public void pSamplerRaw(@pointer(target=VkSampler.class) MemorySegment value) {
        segment.set(LAYOUT$pSampler, OFFSET$pSampler, value);
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

        s = s.reinterpret(assumedCount * VkDescriptorImageInfo.BYTES);
        VkDescriptorImageInfo[] ret = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.BYTES, VkDescriptorImageInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkDescriptorImageInfo.class) MemorySegment pCombinedImageSamplerRaw() {
        return segment.get(LAYOUT$pCombinedImageSampler, OFFSET$pCombinedImageSampler);
    }

    public void pCombinedImageSamplerRaw(@pointer(target=VkDescriptorImageInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pCombinedImageSampler, OFFSET$pCombinedImageSampler, value);
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

        s = s.reinterpret(assumedCount * VkDescriptorImageInfo.BYTES);
        VkDescriptorImageInfo[] ret = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.BYTES, VkDescriptorImageInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkDescriptorImageInfo.class) MemorySegment pInputAttachmentImageRaw() {
        return segment.get(LAYOUT$pInputAttachmentImage, OFFSET$pInputAttachmentImage);
    }

    public void pInputAttachmentImageRaw(@pointer(target=VkDescriptorImageInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pInputAttachmentImage, OFFSET$pInputAttachmentImage, value);
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

        s = s.reinterpret(assumedCount * VkDescriptorImageInfo.BYTES);
        VkDescriptorImageInfo[] ret = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.BYTES, VkDescriptorImageInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkDescriptorImageInfo.class) MemorySegment pSampledImageRaw() {
        return segment.get(LAYOUT$pSampledImage, OFFSET$pSampledImage);
    }

    public void pSampledImageRaw(@pointer(target=VkDescriptorImageInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pSampledImage, OFFSET$pSampledImage, value);
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

        s = s.reinterpret(assumedCount * VkDescriptorImageInfo.BYTES);
        VkDescriptorImageInfo[] ret = new VkDescriptorImageInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorImageInfo(s.asSlice(i * VkDescriptorImageInfo.BYTES, VkDescriptorImageInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkDescriptorImageInfo.class) MemorySegment pStorageImageRaw() {
        return segment.get(LAYOUT$pStorageImage, OFFSET$pStorageImage);
    }

    public void pStorageImageRaw(@pointer(target=VkDescriptorImageInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pStorageImage, OFFSET$pStorageImage, value);
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

        s = s.reinterpret(assumedCount * VkDescriptorAddressInfoEXT.BYTES);
        VkDescriptorAddressInfoEXT[] ret = new VkDescriptorAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorAddressInfoEXT(s.asSlice(i * VkDescriptorAddressInfoEXT.BYTES, VkDescriptorAddressInfoEXT.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkDescriptorAddressInfoEXT.class) MemorySegment pUniformTexelBufferRaw() {
        return segment.get(LAYOUT$pUniformTexelBuffer, OFFSET$pUniformTexelBuffer);
    }

    public void pUniformTexelBufferRaw(@pointer(target=VkDescriptorAddressInfoEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pUniformTexelBuffer, OFFSET$pUniformTexelBuffer, value);
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

        s = s.reinterpret(assumedCount * VkDescriptorAddressInfoEXT.BYTES);
        VkDescriptorAddressInfoEXT[] ret = new VkDescriptorAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorAddressInfoEXT(s.asSlice(i * VkDescriptorAddressInfoEXT.BYTES, VkDescriptorAddressInfoEXT.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkDescriptorAddressInfoEXT.class) MemorySegment pStorageTexelBufferRaw() {
        return segment.get(LAYOUT$pStorageTexelBuffer, OFFSET$pStorageTexelBuffer);
    }

    public void pStorageTexelBufferRaw(@pointer(target=VkDescriptorAddressInfoEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pStorageTexelBuffer, OFFSET$pStorageTexelBuffer, value);
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

        s = s.reinterpret(assumedCount * VkDescriptorAddressInfoEXT.BYTES);
        VkDescriptorAddressInfoEXT[] ret = new VkDescriptorAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorAddressInfoEXT(s.asSlice(i * VkDescriptorAddressInfoEXT.BYTES, VkDescriptorAddressInfoEXT.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkDescriptorAddressInfoEXT.class) MemorySegment pUniformBufferRaw() {
        return segment.get(LAYOUT$pUniformBuffer, OFFSET$pUniformBuffer);
    }

    public void pUniformBufferRaw(@pointer(target=VkDescriptorAddressInfoEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pUniformBuffer, OFFSET$pUniformBuffer, value);
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

        s = s.reinterpret(assumedCount * VkDescriptorAddressInfoEXT.BYTES);
        VkDescriptorAddressInfoEXT[] ret = new VkDescriptorAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorAddressInfoEXT(s.asSlice(i * VkDescriptorAddressInfoEXT.BYTES, VkDescriptorAddressInfoEXT.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkDescriptorAddressInfoEXT.class) MemorySegment pStorageBufferRaw() {
        return segment.get(LAYOUT$pStorageBuffer, OFFSET$pStorageBuffer);
    }

    public void pStorageBufferRaw(@pointer(target=VkDescriptorAddressInfoEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pStorageBuffer, OFFSET$pStorageBuffer, value);
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
