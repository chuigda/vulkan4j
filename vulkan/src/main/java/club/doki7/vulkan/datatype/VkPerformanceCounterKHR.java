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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceCounterKHR.html"><code>VkPerformanceCounterKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPerformanceCounterKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPerformanceCounterUnitKHR unit; // @link substring="VkPerformanceCounterUnitKHR" target="VkPerformanceCounterUnitKHR" @link substring="unit" target="#unit"
///     VkPerformanceCounterScopeKHR scope; // @link substring="VkPerformanceCounterScopeKHR" target="VkPerformanceCounterScopeKHR" @link substring="scope" target="#scope"
///     VkPerformanceCounterStorageKHR storage; // @link substring="VkPerformanceCounterStorageKHR" target="VkPerformanceCounterStorageKHR" @link substring="storage" target="#storage"
///     uint8_t uuid; // @link substring="uuid" target="#uuid"
/// } VkPerformanceCounterKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR`
///
/// The {@code allocate} ({@link VkPerformanceCounterKHR#allocate(Arena)}, {@link VkPerformanceCounterKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPerformanceCounterKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceCounterKHR.html"><code>VkPerformanceCounterKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPerformanceCounterKHR(@NotNull MemorySegment segment) implements IVkPerformanceCounterKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceCounterKHR.html"><code>VkPerformanceCounterKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPerformanceCounterKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPerformanceCounterKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPerformanceCounterKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPerformanceCounterKHR {
        public long size() {
            return segment.byteSize() / VkPerformanceCounterKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPerformanceCounterKHR at(long index) {
            return new VkPerformanceCounterKHR(segment.asSlice(index * VkPerformanceCounterKHR.BYTES, VkPerformanceCounterKHR.BYTES));
        }

        public void write(long index, @NotNull VkPerformanceCounterKHR value) {
            MemorySegment s = segment.asSlice(index * VkPerformanceCounterKHR.BYTES, VkPerformanceCounterKHR.BYTES);
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
            return new Ptr(segment.asSlice(index * VkPerformanceCounterKHR.BYTES, VkPerformanceCounterKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPerformanceCounterKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPerformanceCounterKHR.BYTES,
                (end - start) * VkPerformanceCounterKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPerformanceCounterKHR.BYTES));
        }

        public VkPerformanceCounterKHR[] toArray() {
            VkPerformanceCounterKHR[] ret = new VkPerformanceCounterKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkPerformanceCounterKHR allocate(Arena arena) {
        VkPerformanceCounterKHR ret = new VkPerformanceCounterKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PERFORMANCE_COUNTER_KHR);
        return ret;
    }

    public static VkPerformanceCounterKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceCounterKHR.Ptr ret = new VkPerformanceCounterKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.PERFORMANCE_COUNTER_KHR);
        }
        return ret;
    }

    public static VkPerformanceCounterKHR clone(Arena arena, VkPerformanceCounterKHR src) {
        VkPerformanceCounterKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PERFORMANCE_COUNTER_KHR);
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

    public @EnumType(VkPerformanceCounterUnitKHR.class) int unit() {
        return segment.get(LAYOUT$unit, OFFSET$unit);
    }

    public void unit(@EnumType(VkPerformanceCounterUnitKHR.class) int value) {
        segment.set(LAYOUT$unit, OFFSET$unit, value);
    }

    public @EnumType(VkPerformanceCounterScopeKHR.class) int scope() {
        return segment.get(LAYOUT$scope, OFFSET$scope);
    }

    public void scope(@EnumType(VkPerformanceCounterScopeKHR.class) int value) {
        segment.set(LAYOUT$scope, OFFSET$scope, value);
    }

    public @EnumType(VkPerformanceCounterStorageKHR.class) int storage() {
        return segment.get(LAYOUT$storage, OFFSET$storage);
    }

    public void storage(@EnumType(VkPerformanceCounterStorageKHR.class) int value) {
        segment.set(LAYOUT$storage, OFFSET$storage, value);
    }

    public @unsigned byte uuid() {
        return segment.get(LAYOUT$uuid, OFFSET$uuid);
    }

    public void uuid(@unsigned byte value) {
        segment.set(LAYOUT$uuid, OFFSET$uuid, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("unit"),
        ValueLayout.JAVA_INT.withName("scope"),
        ValueLayout.JAVA_INT.withName("storage"),
        ValueLayout.JAVA_BYTE.withName("uuid")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$unit = PathElement.groupElement("unit");
    public static final PathElement PATH$scope = PathElement.groupElement("scope");
    public static final PathElement PATH$storage = PathElement.groupElement("storage");
    public static final PathElement PATH$uuid = PathElement.groupElement("uuid");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$unit = (OfInt) LAYOUT.select(PATH$unit);
    public static final OfInt LAYOUT$scope = (OfInt) LAYOUT.select(PATH$scope);
    public static final OfInt LAYOUT$storage = (OfInt) LAYOUT.select(PATH$storage);
    public static final OfByte LAYOUT$uuid = (OfByte) LAYOUT.select(PATH$uuid);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$unit = LAYOUT$unit.byteSize();
    public static final long SIZE$scope = LAYOUT$scope.byteSize();
    public static final long SIZE$storage = LAYOUT$storage.byteSize();
    public static final long SIZE$uuid = LAYOUT$uuid.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$unit = LAYOUT.byteOffset(PATH$unit);
    public static final long OFFSET$scope = LAYOUT.byteOffset(PATH$scope);
    public static final long OFFSET$storage = LAYOUT.byteOffset(PATH$storage);
    public static final long OFFSET$uuid = LAYOUT.byteOffset(PATH$uuid);
}
