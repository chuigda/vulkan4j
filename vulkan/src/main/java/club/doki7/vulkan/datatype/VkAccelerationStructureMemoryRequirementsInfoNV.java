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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMemoryRequirementsInfoNV.html"><code>VkAccelerationStructureMemoryRequirementsInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureMemoryRequirementsInfoNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkAccelerationStructureMemoryRequirementsTypeNV type; // @link substring="VkAccelerationStructureMemoryRequirementsTypeNV" target="VkAccelerationStructureMemoryRequirementsTypeNV" @link substring="type" target="#type"
///     VkAccelerationStructureNV accelerationStructure; // @link substring="VkAccelerationStructureNV" target="VkAccelerationStructureNV" @link substring="accelerationStructure" target="#accelerationStructure"
/// } VkAccelerationStructureMemoryRequirementsInfoNV;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV`
///
/// The {@code allocate} ({@link VkAccelerationStructureMemoryRequirementsInfoNV#allocate(Arena)}, {@link VkAccelerationStructureMemoryRequirementsInfoNV#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkAccelerationStructureMemoryRequirementsInfoNV#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMemoryRequirementsInfoNV.html"><code>VkAccelerationStructureMemoryRequirementsInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureMemoryRequirementsInfoNV(@NotNull MemorySegment segment) implements IVkAccelerationStructureMemoryRequirementsInfoNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureMemoryRequirementsInfoNV.html"><code>VkAccelerationStructureMemoryRequirementsInfoNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkAccelerationStructureMemoryRequirementsInfoNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkAccelerationStructureMemoryRequirementsInfoNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkAccelerationStructureMemoryRequirementsInfoNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkAccelerationStructureMemoryRequirementsInfoNV {
        public long size() {
            return segment.byteSize() / VkAccelerationStructureMemoryRequirementsInfoNV.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkAccelerationStructureMemoryRequirementsInfoNV at(long index) {
            return new VkAccelerationStructureMemoryRequirementsInfoNV(segment.asSlice(index * VkAccelerationStructureMemoryRequirementsInfoNV.BYTES, VkAccelerationStructureMemoryRequirementsInfoNV.BYTES));
        }

        public void write(long index, @NotNull VkAccelerationStructureMemoryRequirementsInfoNV value) {
            MemorySegment s = segment.asSlice(index * VkAccelerationStructureMemoryRequirementsInfoNV.BYTES, VkAccelerationStructureMemoryRequirementsInfoNV.BYTES);
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
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkAccelerationStructureMemoryRequirementsInfoNV.BYTES, VkAccelerationStructureMemoryRequirementsInfoNV.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkAccelerationStructureMemoryRequirementsInfoNV.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkAccelerationStructureMemoryRequirementsInfoNV.BYTES,
                (end - start) * VkAccelerationStructureMemoryRequirementsInfoNV.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkAccelerationStructureMemoryRequirementsInfoNV.BYTES));
        }

        public VkAccelerationStructureMemoryRequirementsInfoNV[] toArray() {
            VkAccelerationStructureMemoryRequirementsInfoNV[] ret = new VkAccelerationStructureMemoryRequirementsInfoNV[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV allocate(Arena arena) {
        VkAccelerationStructureMemoryRequirementsInfoNV ret = new VkAccelerationStructureMemoryRequirementsInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV);
        return ret;
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureMemoryRequirementsInfoNV.Ptr ret = new VkAccelerationStructureMemoryRequirementsInfoNV.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV);
        }
        return ret;
    }

    public static VkAccelerationStructureMemoryRequirementsInfoNV clone(Arena arena, VkAccelerationStructureMemoryRequirementsInfoNV src) {
        VkAccelerationStructureMemoryRequirementsInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV);
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

    public @EnumType(VkAccelerationStructureMemoryRequirementsTypeNV.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@EnumType(VkAccelerationStructureMemoryRequirementsTypeNV.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @Nullable VkAccelerationStructureNV accelerationStructure() {
        MemorySegment s = segment.asSlice(OFFSET$accelerationStructure, SIZE$accelerationStructure);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkAccelerationStructureNV(s);
    }

    public void accelerationStructure(@Nullable VkAccelerationStructureNV value) {
        segment.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value != null ? value.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("accelerationStructure")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("accelerationStructure");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$accelerationStructure = (AddressLayout) LAYOUT.select(PATH$accelerationStructure);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$accelerationStructure = LAYOUT$accelerationStructure.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);
}
