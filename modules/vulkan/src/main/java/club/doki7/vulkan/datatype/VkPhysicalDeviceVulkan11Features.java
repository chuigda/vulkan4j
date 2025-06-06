package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVulkan11Features.html"><code>VkPhysicalDeviceVulkan11Features</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceVulkan11Features {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 storageBuffer16BitAccess; // @link substring="storageBuffer16BitAccess" target="#storageBuffer16BitAccess"
///     VkBool32 uniformAndStorageBuffer16BitAccess; // @link substring="uniformAndStorageBuffer16BitAccess" target="#uniformAndStorageBuffer16BitAccess"
///     VkBool32 storagePushConstant16; // @link substring="storagePushConstant16" target="#storagePushConstant16"
///     VkBool32 storageInputOutput16; // @link substring="storageInputOutput16" target="#storageInputOutput16"
///     VkBool32 multiview; // @link substring="multiview" target="#multiview"
///     VkBool32 multiviewGeometryShader; // @link substring="multiviewGeometryShader" target="#multiviewGeometryShader"
///     VkBool32 multiviewTessellationShader; // @link substring="multiviewTessellationShader" target="#multiviewTessellationShader"
///     VkBool32 variablePointersStorageBuffer; // @link substring="variablePointersStorageBuffer" target="#variablePointersStorageBuffer"
///     VkBool32 variablePointers; // @link substring="variablePointers" target="#variablePointers"
///     VkBool32 protectedMemory; // @link substring="protectedMemory" target="#protectedMemory"
///     VkBool32 samplerYcbcrConversion; // @link substring="samplerYcbcrConversion" target="#samplerYcbcrConversion"
///     VkBool32 shaderDrawParameters; // @link substring="shaderDrawParameters" target="#shaderDrawParameters"
/// } VkPhysicalDeviceVulkan11Features;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_FEATURES`
///
/// The {@code allocate} ({@link VkPhysicalDeviceVulkan11Features#allocate(Arena)}, {@link VkPhysicalDeviceVulkan11Features#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceVulkan11Features#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVulkan11Features.html"><code>VkPhysicalDeviceVulkan11Features</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceVulkan11Features(@NotNull MemorySegment segment) implements IVkPhysicalDeviceVulkan11Features {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVulkan11Features.html"><code>VkPhysicalDeviceVulkan11Features</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceVulkan11Features}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceVulkan11Features to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceVulkan11Features.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceVulkan11Features, Iterable<VkPhysicalDeviceVulkan11Features> {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceVulkan11Features.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceVulkan11Features at(long index) {
            return new VkPhysicalDeviceVulkan11Features(segment.asSlice(index * VkPhysicalDeviceVulkan11Features.BYTES, VkPhysicalDeviceVulkan11Features.BYTES));
        }

        public void write(long index, @NotNull VkPhysicalDeviceVulkan11Features value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceVulkan11Features.BYTES, VkPhysicalDeviceVulkan11Features.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * VkPhysicalDeviceVulkan11Features.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPhysicalDeviceVulkan11Features.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPhysicalDeviceVulkan11Features.BYTES,
                (end - start) * VkPhysicalDeviceVulkan11Features.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPhysicalDeviceVulkan11Features.BYTES));
        }

        public VkPhysicalDeviceVulkan11Features[] toArray() {
            VkPhysicalDeviceVulkan11Features[] ret = new VkPhysicalDeviceVulkan11Features[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VkPhysicalDeviceVulkan11Features> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VkPhysicalDeviceVulkan11Features> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkPhysicalDeviceVulkan11Features.BYTES;
            }

            @Override
            public VkPhysicalDeviceVulkan11Features next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkPhysicalDeviceVulkan11Features ret = new VkPhysicalDeviceVulkan11Features(segment.asSlice(0, VkPhysicalDeviceVulkan11Features.BYTES));
                segment = segment.asSlice(VkPhysicalDeviceVulkan11Features.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkPhysicalDeviceVulkan11Features allocate(Arena arena) {
        VkPhysicalDeviceVulkan11Features ret = new VkPhysicalDeviceVulkan11Features(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_VULKAN_1_1_FEATURES);
        return ret;
    }

    public static VkPhysicalDeviceVulkan11Features.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVulkan11Features.Ptr ret = new VkPhysicalDeviceVulkan11Features.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_VULKAN_1_1_FEATURES);
        }
        return ret;
    }

    public static VkPhysicalDeviceVulkan11Features clone(Arena arena, VkPhysicalDeviceVulkan11Features src) {
        VkPhysicalDeviceVulkan11Features ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_VULKAN_1_1_FEATURES);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkPhysicalDeviceVulkan11Features sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public VkPhysicalDeviceVulkan11Features pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int storageBuffer16BitAccess() {
        return segment.get(LAYOUT$storageBuffer16BitAccess, OFFSET$storageBuffer16BitAccess);
    }

    public VkPhysicalDeviceVulkan11Features storageBuffer16BitAccess(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$storageBuffer16BitAccess, OFFSET$storageBuffer16BitAccess, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int uniformAndStorageBuffer16BitAccess() {
        return segment.get(LAYOUT$uniformAndStorageBuffer16BitAccess, OFFSET$uniformAndStorageBuffer16BitAccess);
    }

    public VkPhysicalDeviceVulkan11Features uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$uniformAndStorageBuffer16BitAccess, OFFSET$uniformAndStorageBuffer16BitAccess, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int storagePushConstant16() {
        return segment.get(LAYOUT$storagePushConstant16, OFFSET$storagePushConstant16);
    }

    public VkPhysicalDeviceVulkan11Features storagePushConstant16(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$storagePushConstant16, OFFSET$storagePushConstant16, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int storageInputOutput16() {
        return segment.get(LAYOUT$storageInputOutput16, OFFSET$storageInputOutput16);
    }

    public VkPhysicalDeviceVulkan11Features storageInputOutput16(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$storageInputOutput16, OFFSET$storageInputOutput16, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int multiview() {
        return segment.get(LAYOUT$multiview, OFFSET$multiview);
    }

    public VkPhysicalDeviceVulkan11Features multiview(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$multiview, OFFSET$multiview, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int multiviewGeometryShader() {
        return segment.get(LAYOUT$multiviewGeometryShader, OFFSET$multiviewGeometryShader);
    }

    public VkPhysicalDeviceVulkan11Features multiviewGeometryShader(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$multiviewGeometryShader, OFFSET$multiviewGeometryShader, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int multiviewTessellationShader() {
        return segment.get(LAYOUT$multiviewTessellationShader, OFFSET$multiviewTessellationShader);
    }

    public VkPhysicalDeviceVulkan11Features multiviewTessellationShader(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$multiviewTessellationShader, OFFSET$multiviewTessellationShader, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int variablePointersStorageBuffer() {
        return segment.get(LAYOUT$variablePointersStorageBuffer, OFFSET$variablePointersStorageBuffer);
    }

    public VkPhysicalDeviceVulkan11Features variablePointersStorageBuffer(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$variablePointersStorageBuffer, OFFSET$variablePointersStorageBuffer, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int variablePointers() {
        return segment.get(LAYOUT$variablePointers, OFFSET$variablePointers);
    }

    public VkPhysicalDeviceVulkan11Features variablePointers(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$variablePointers, OFFSET$variablePointers, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int protectedMemory() {
        return segment.get(LAYOUT$protectedMemory, OFFSET$protectedMemory);
    }

    public VkPhysicalDeviceVulkan11Features protectedMemory(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$protectedMemory, OFFSET$protectedMemory, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int samplerYcbcrConversion() {
        return segment.get(LAYOUT$samplerYcbcrConversion, OFFSET$samplerYcbcrConversion);
    }

    public VkPhysicalDeviceVulkan11Features samplerYcbcrConversion(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$samplerYcbcrConversion, OFFSET$samplerYcbcrConversion, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int shaderDrawParameters() {
        return segment.get(LAYOUT$shaderDrawParameters, OFFSET$shaderDrawParameters);
    }

    public VkPhysicalDeviceVulkan11Features shaderDrawParameters(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$shaderDrawParameters, OFFSET$shaderDrawParameters, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer16BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant16"),
        ValueLayout.JAVA_INT.withName("storageInputOutput16"),
        ValueLayout.JAVA_INT.withName("multiview"),
        ValueLayout.JAVA_INT.withName("multiviewGeometryShader"),
        ValueLayout.JAVA_INT.withName("multiviewTessellationShader"),
        ValueLayout.JAVA_INT.withName("variablePointersStorageBuffer"),
        ValueLayout.JAVA_INT.withName("variablePointers"),
        ValueLayout.JAVA_INT.withName("protectedMemory"),
        ValueLayout.JAVA_INT.withName("samplerYcbcrConversion"),
        ValueLayout.JAVA_INT.withName("shaderDrawParameters")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$storageBuffer16BitAccess = PathElement.groupElement("storageBuffer16BitAccess");
    public static final PathElement PATH$uniformAndStorageBuffer16BitAccess = PathElement.groupElement("uniformAndStorageBuffer16BitAccess");
    public static final PathElement PATH$storagePushConstant16 = PathElement.groupElement("storagePushConstant16");
    public static final PathElement PATH$storageInputOutput16 = PathElement.groupElement("storageInputOutput16");
    public static final PathElement PATH$multiview = PathElement.groupElement("multiview");
    public static final PathElement PATH$multiviewGeometryShader = PathElement.groupElement("multiviewGeometryShader");
    public static final PathElement PATH$multiviewTessellationShader = PathElement.groupElement("multiviewTessellationShader");
    public static final PathElement PATH$variablePointersStorageBuffer = PathElement.groupElement("variablePointersStorageBuffer");
    public static final PathElement PATH$variablePointers = PathElement.groupElement("variablePointers");
    public static final PathElement PATH$protectedMemory = PathElement.groupElement("protectedMemory");
    public static final PathElement PATH$samplerYcbcrConversion = PathElement.groupElement("samplerYcbcrConversion");
    public static final PathElement PATH$shaderDrawParameters = PathElement.groupElement("shaderDrawParameters");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$storageBuffer16BitAccess = (OfInt) LAYOUT.select(PATH$storageBuffer16BitAccess);
    public static final OfInt LAYOUT$uniformAndStorageBuffer16BitAccess = (OfInt) LAYOUT.select(PATH$uniformAndStorageBuffer16BitAccess);
    public static final OfInt LAYOUT$storagePushConstant16 = (OfInt) LAYOUT.select(PATH$storagePushConstant16);
    public static final OfInt LAYOUT$storageInputOutput16 = (OfInt) LAYOUT.select(PATH$storageInputOutput16);
    public static final OfInt LAYOUT$multiview = (OfInt) LAYOUT.select(PATH$multiview);
    public static final OfInt LAYOUT$multiviewGeometryShader = (OfInt) LAYOUT.select(PATH$multiviewGeometryShader);
    public static final OfInt LAYOUT$multiviewTessellationShader = (OfInt) LAYOUT.select(PATH$multiviewTessellationShader);
    public static final OfInt LAYOUT$variablePointersStorageBuffer = (OfInt) LAYOUT.select(PATH$variablePointersStorageBuffer);
    public static final OfInt LAYOUT$variablePointers = (OfInt) LAYOUT.select(PATH$variablePointers);
    public static final OfInt LAYOUT$protectedMemory = (OfInt) LAYOUT.select(PATH$protectedMemory);
    public static final OfInt LAYOUT$samplerYcbcrConversion = (OfInt) LAYOUT.select(PATH$samplerYcbcrConversion);
    public static final OfInt LAYOUT$shaderDrawParameters = (OfInt) LAYOUT.select(PATH$shaderDrawParameters);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$storageBuffer16BitAccess = LAYOUT$storageBuffer16BitAccess.byteSize();
    public static final long SIZE$uniformAndStorageBuffer16BitAccess = LAYOUT$uniformAndStorageBuffer16BitAccess.byteSize();
    public static final long SIZE$storagePushConstant16 = LAYOUT$storagePushConstant16.byteSize();
    public static final long SIZE$storageInputOutput16 = LAYOUT$storageInputOutput16.byteSize();
    public static final long SIZE$multiview = LAYOUT$multiview.byteSize();
    public static final long SIZE$multiviewGeometryShader = LAYOUT$multiviewGeometryShader.byteSize();
    public static final long SIZE$multiviewTessellationShader = LAYOUT$multiviewTessellationShader.byteSize();
    public static final long SIZE$variablePointersStorageBuffer = LAYOUT$variablePointersStorageBuffer.byteSize();
    public static final long SIZE$variablePointers = LAYOUT$variablePointers.byteSize();
    public static final long SIZE$protectedMemory = LAYOUT$protectedMemory.byteSize();
    public static final long SIZE$samplerYcbcrConversion = LAYOUT$samplerYcbcrConversion.byteSize();
    public static final long SIZE$shaderDrawParameters = LAYOUT$shaderDrawParameters.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$storageBuffer16BitAccess = LAYOUT.byteOffset(PATH$storageBuffer16BitAccess);
    public static final long OFFSET$uniformAndStorageBuffer16BitAccess = LAYOUT.byteOffset(PATH$uniformAndStorageBuffer16BitAccess);
    public static final long OFFSET$storagePushConstant16 = LAYOUT.byteOffset(PATH$storagePushConstant16);
    public static final long OFFSET$storageInputOutput16 = LAYOUT.byteOffset(PATH$storageInputOutput16);
    public static final long OFFSET$multiview = LAYOUT.byteOffset(PATH$multiview);
    public static final long OFFSET$multiviewGeometryShader = LAYOUT.byteOffset(PATH$multiviewGeometryShader);
    public static final long OFFSET$multiviewTessellationShader = LAYOUT.byteOffset(PATH$multiviewTessellationShader);
    public static final long OFFSET$variablePointersStorageBuffer = LAYOUT.byteOffset(PATH$variablePointersStorageBuffer);
    public static final long OFFSET$variablePointers = LAYOUT.byteOffset(PATH$variablePointers);
    public static final long OFFSET$protectedMemory = LAYOUT.byteOffset(PATH$protectedMemory);
    public static final long OFFSET$samplerYcbcrConversion = LAYOUT.byteOffset(PATH$samplerYcbcrConversion);
    public static final long OFFSET$shaderDrawParameters = LAYOUT.byteOffset(PATH$shaderDrawParameters);
}
