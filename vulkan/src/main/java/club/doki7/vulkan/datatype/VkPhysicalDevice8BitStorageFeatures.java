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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevice8BitStorageFeatures.html"><code>VkPhysicalDevice8BitStorageFeatures</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDevice8BitStorageFeatures {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 storageBuffer8BitAccess; // @link substring="storageBuffer8BitAccess" target="#storageBuffer8BitAccess"
///     VkBool32 uniformAndStorageBuffer8BitAccess; // @link substring="uniformAndStorageBuffer8BitAccess" target="#uniformAndStorageBuffer8BitAccess"
///     VkBool32 storagePushConstant8; // @link substring="storagePushConstant8" target="#storagePushConstant8"
/// } VkPhysicalDevice8BitStorageFeatures;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES`
///
/// The {@code allocate} ({@link VkPhysicalDevice8BitStorageFeatures#allocate(Arena)}, {@link VkPhysicalDevice8BitStorageFeatures#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDevice8BitStorageFeatures#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevice8BitStorageFeatures.html"><code>VkPhysicalDevice8BitStorageFeatures</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDevice8BitStorageFeatures(@NotNull MemorySegment segment) implements IVkPhysicalDevice8BitStorageFeatures {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevice8BitStorageFeatures.html"><code>VkPhysicalDevice8BitStorageFeatures</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDevice8BitStorageFeatures}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDevice8BitStorageFeatures to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDevice8BitStorageFeatures.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDevice8BitStorageFeatures {
        public long size() {
            return segment.byteSize() / VkPhysicalDevice8BitStorageFeatures.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDevice8BitStorageFeatures at(long index) {
            return new VkPhysicalDevice8BitStorageFeatures(segment.asSlice(index * VkPhysicalDevice8BitStorageFeatures.BYTES, VkPhysicalDevice8BitStorageFeatures.BYTES));
        }

        public void write(long index, @NotNull VkPhysicalDevice8BitStorageFeatures value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDevice8BitStorageFeatures.BYTES, VkPhysicalDevice8BitStorageFeatures.BYTES);
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
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkPhysicalDevice8BitStorageFeatures.BYTES, VkPhysicalDevice8BitStorageFeatures.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPhysicalDevice8BitStorageFeatures.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPhysicalDevice8BitStorageFeatures.BYTES,
                (end - start) * VkPhysicalDevice8BitStorageFeatures.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPhysicalDevice8BitStorageFeatures.BYTES));
        }

        public VkPhysicalDevice8BitStorageFeatures[] toArray() {
            VkPhysicalDevice8BitStorageFeatures[] ret = new VkPhysicalDevice8BitStorageFeatures[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkPhysicalDevice8BitStorageFeatures allocate(Arena arena) {
        VkPhysicalDevice8BitStorageFeatures ret = new VkPhysicalDevice8BitStorageFeatures(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES);
        return ret;
    }

    public static VkPhysicalDevice8BitStorageFeatures.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevice8BitStorageFeatures.Ptr ret = new VkPhysicalDevice8BitStorageFeatures.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES);
        }
        return ret;
    }

    public static VkPhysicalDevice8BitStorageFeatures clone(Arena arena, VkPhysicalDevice8BitStorageFeatures src) {
        VkPhysicalDevice8BitStorageFeatures ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_8BIT_STORAGE_FEATURES);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int storageBuffer8BitAccess() {
        return segment.get(LAYOUT$storageBuffer8BitAccess, OFFSET$storageBuffer8BitAccess);
    }

    public void storageBuffer8BitAccess(@unsigned int value) {
        segment.set(LAYOUT$storageBuffer8BitAccess, OFFSET$storageBuffer8BitAccess, value);
    }

    public @unsigned int uniformAndStorageBuffer8BitAccess() {
        return segment.get(LAYOUT$uniformAndStorageBuffer8BitAccess, OFFSET$uniformAndStorageBuffer8BitAccess);
    }

    public void uniformAndStorageBuffer8BitAccess(@unsigned int value) {
        segment.set(LAYOUT$uniformAndStorageBuffer8BitAccess, OFFSET$uniformAndStorageBuffer8BitAccess, value);
    }

    public @unsigned int storagePushConstant8() {
        return segment.get(LAYOUT$storagePushConstant8, OFFSET$storagePushConstant8);
    }

    public void storagePushConstant8(@unsigned int value) {
        segment.set(LAYOUT$storagePushConstant8, OFFSET$storagePushConstant8, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffer8BitAccess"),
        ValueLayout.JAVA_INT.withName("uniformAndStorageBuffer8BitAccess"),
        ValueLayout.JAVA_INT.withName("storagePushConstant8")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$storageBuffer8BitAccess = PathElement.groupElement("storageBuffer8BitAccess");
    public static final PathElement PATH$uniformAndStorageBuffer8BitAccess = PathElement.groupElement("uniformAndStorageBuffer8BitAccess");
    public static final PathElement PATH$storagePushConstant8 = PathElement.groupElement("storagePushConstant8");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$storageBuffer8BitAccess = (OfInt) LAYOUT.select(PATH$storageBuffer8BitAccess);
    public static final OfInt LAYOUT$uniformAndStorageBuffer8BitAccess = (OfInt) LAYOUT.select(PATH$uniformAndStorageBuffer8BitAccess);
    public static final OfInt LAYOUT$storagePushConstant8 = (OfInt) LAYOUT.select(PATH$storagePushConstant8);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$storageBuffer8BitAccess = LAYOUT$storageBuffer8BitAccess.byteSize();
    public static final long SIZE$uniformAndStorageBuffer8BitAccess = LAYOUT$uniformAndStorageBuffer8BitAccess.byteSize();
    public static final long SIZE$storagePushConstant8 = LAYOUT$storagePushConstant8.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$storageBuffer8BitAccess = LAYOUT.byteOffset(PATH$storageBuffer8BitAccess);
    public static final long OFFSET$uniformAndStorageBuffer8BitAccess = LAYOUT.byteOffset(PATH$uniformAndStorageBuffer8BitAccess);
    public static final long OFFSET$storagePushConstant8 = LAYOUT.byteOffset(PATH$storagePushConstant8);
}
