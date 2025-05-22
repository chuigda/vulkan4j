package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCooperativeVectorPropertiesNV.html"><code>VkCooperativeVectorPropertiesNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkCooperativeVectorPropertiesNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkComponentTypeKHR inputType; // @link substring="VkComponentTypeKHR" target="VkComponentTypeKHR" @link substring="inputType" target="#inputType"
///     VkComponentTypeKHR inputInterpretation; // @link substring="VkComponentTypeKHR" target="VkComponentTypeKHR" @link substring="inputInterpretation" target="#inputInterpretation"
///     VkComponentTypeKHR matrixInterpretation; // @link substring="VkComponentTypeKHR" target="VkComponentTypeKHR" @link substring="matrixInterpretation" target="#matrixInterpretation"
///     VkComponentTypeKHR biasInterpretation; // @link substring="VkComponentTypeKHR" target="VkComponentTypeKHR" @link substring="biasInterpretation" target="#biasInterpretation"
///     VkComponentTypeKHR resultType; // @link substring="VkComponentTypeKHR" target="VkComponentTypeKHR" @link substring="resultType" target="#resultType"
///     VkBool32 transpose; // @link substring="transpose" target="#transpose"
/// } VkCooperativeVectorPropertiesNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_COOPERATIVE_VECTOR_PROPERTIES_NV`
///
/// The {@code allocate} ({@link VkCooperativeVectorPropertiesNV#allocate(Arena)}, {@link VkCooperativeVectorPropertiesNV#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkCooperativeVectorPropertiesNV#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCooperativeVectorPropertiesNV.html"><code>VkCooperativeVectorPropertiesNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCooperativeVectorPropertiesNV(@NotNull MemorySegment segment) implements IVkCooperativeVectorPropertiesNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCooperativeVectorPropertiesNV.html"><code>VkCooperativeVectorPropertiesNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkCooperativeVectorPropertiesNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkCooperativeVectorPropertiesNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkCooperativeVectorPropertiesNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkCooperativeVectorPropertiesNV {
        public long size() {
            return segment.byteSize() / VkCooperativeVectorPropertiesNV.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkCooperativeVectorPropertiesNV at(long index) {
            return new VkCooperativeVectorPropertiesNV(segment.asSlice(index * VkCooperativeVectorPropertiesNV.BYTES, VkCooperativeVectorPropertiesNV.BYTES));
        }
        public void write(long index, @NotNull VkCooperativeVectorPropertiesNV value) {
            MemorySegment s = segment.asSlice(index * VkCooperativeVectorPropertiesNV.BYTES, VkCooperativeVectorPropertiesNV.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkCooperativeVectorPropertiesNV allocate(Arena arena) {
        VkCooperativeVectorPropertiesNV ret = new VkCooperativeVectorPropertiesNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.COOPERATIVE_VECTOR_PROPERTIES_NV);
        return ret;
    }

    public static VkCooperativeVectorPropertiesNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCooperativeVectorPropertiesNV.Ptr ret = new VkCooperativeVectorPropertiesNV.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.COOPERATIVE_VECTOR_PROPERTIES_NV);
        }
        return ret;
    }

    public static VkCooperativeVectorPropertiesNV clone(Arena arena, VkCooperativeVectorPropertiesNV src) {
        VkCooperativeVectorPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.COOPERATIVE_VECTOR_PROPERTIES_NV);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkComponentTypeKHR.class) int inputType() {
        return segment.get(LAYOUT$inputType, OFFSET$inputType);
    }

    public void inputType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$inputType, OFFSET$inputType, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int inputInterpretation() {
        return segment.get(LAYOUT$inputInterpretation, OFFSET$inputInterpretation);
    }

    public void inputInterpretation(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$inputInterpretation, OFFSET$inputInterpretation, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int matrixInterpretation() {
        return segment.get(LAYOUT$matrixInterpretation, OFFSET$matrixInterpretation);
    }

    public void matrixInterpretation(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$matrixInterpretation, OFFSET$matrixInterpretation, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int biasInterpretation() {
        return segment.get(LAYOUT$biasInterpretation, OFFSET$biasInterpretation);
    }

    public void biasInterpretation(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$biasInterpretation, OFFSET$biasInterpretation, value);
    }

    public @enumtype(VkComponentTypeKHR.class) int resultType() {
        return segment.get(LAYOUT$resultType, OFFSET$resultType);
    }

    public void resultType(@enumtype(VkComponentTypeKHR.class) int value) {
        segment.set(LAYOUT$resultType, OFFSET$resultType, value);
    }

    public @unsigned int transpose() {
        return segment.get(LAYOUT$transpose, OFFSET$transpose);
    }

    public void transpose(@unsigned int value) {
        segment.set(LAYOUT$transpose, OFFSET$transpose, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("inputType"),
        ValueLayout.JAVA_INT.withName("inputInterpretation"),
        ValueLayout.JAVA_INT.withName("matrixInterpretation"),
        ValueLayout.JAVA_INT.withName("biasInterpretation"),
        ValueLayout.JAVA_INT.withName("resultType"),
        ValueLayout.JAVA_INT.withName("transpose")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$inputType = PathElement.groupElement("inputType");
    public static final PathElement PATH$inputInterpretation = PathElement.groupElement("inputInterpretation");
    public static final PathElement PATH$matrixInterpretation = PathElement.groupElement("matrixInterpretation");
    public static final PathElement PATH$biasInterpretation = PathElement.groupElement("biasInterpretation");
    public static final PathElement PATH$resultType = PathElement.groupElement("resultType");
    public static final PathElement PATH$transpose = PathElement.groupElement("transpose");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$inputType = (OfInt) LAYOUT.select(PATH$inputType);
    public static final OfInt LAYOUT$inputInterpretation = (OfInt) LAYOUT.select(PATH$inputInterpretation);
    public static final OfInt LAYOUT$matrixInterpretation = (OfInt) LAYOUT.select(PATH$matrixInterpretation);
    public static final OfInt LAYOUT$biasInterpretation = (OfInt) LAYOUT.select(PATH$biasInterpretation);
    public static final OfInt LAYOUT$resultType = (OfInt) LAYOUT.select(PATH$resultType);
    public static final OfInt LAYOUT$transpose = (OfInt) LAYOUT.select(PATH$transpose);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$inputType = LAYOUT$inputType.byteSize();
    public static final long SIZE$inputInterpretation = LAYOUT$inputInterpretation.byteSize();
    public static final long SIZE$matrixInterpretation = LAYOUT$matrixInterpretation.byteSize();
    public static final long SIZE$biasInterpretation = LAYOUT$biasInterpretation.byteSize();
    public static final long SIZE$resultType = LAYOUT$resultType.byteSize();
    public static final long SIZE$transpose = LAYOUT$transpose.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$inputType = LAYOUT.byteOffset(PATH$inputType);
    public static final long OFFSET$inputInterpretation = LAYOUT.byteOffset(PATH$inputInterpretation);
    public static final long OFFSET$matrixInterpretation = LAYOUT.byteOffset(PATH$matrixInterpretation);
    public static final long OFFSET$biasInterpretation = LAYOUT.byteOffset(PATH$biasInterpretation);
    public static final long OFFSET$resultType = LAYOUT.byteOffset(PATH$resultType);
    public static final long OFFSET$transpose = LAYOUT.byteOffset(PATH$transpose);
}
