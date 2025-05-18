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
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_KHR`
///
/// The {@code allocate} ({@link VkPerformanceCounterKHR#allocate(Arena)}, {@link VkPerformanceCounterKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPerformanceCounterKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceCounterKHR.html"><code>VkPerformanceCounterKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPerformanceCounterKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPerformanceCounterKHR allocate(Arena arena) {
        VkPerformanceCounterKHR ret = new VkPerformanceCounterKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PERFORMANCE_COUNTER_KHR);
        return ret;
    }

    public static VkPerformanceCounterKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceCounterKHR[] ret = new VkPerformanceCounterKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPerformanceCounterKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PERFORMANCE_COUNTER_KHR);
        }
        return ret;
    }

    public static VkPerformanceCounterKHR clone(Arena arena, VkPerformanceCounterKHR src) {
        VkPerformanceCounterKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPerformanceCounterKHR[] clone(Arena arena, VkPerformanceCounterKHR[] src) {
        VkPerformanceCounterKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PERFORMANCE_COUNTER_KHR);
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

    public @enumtype(VkPerformanceCounterUnitKHR.class) int unit() {
        return segment.get(LAYOUT$unit, OFFSET$unit);
    }

    public void unit(@enumtype(VkPerformanceCounterUnitKHR.class) int value) {
        segment.set(LAYOUT$unit, OFFSET$unit, value);
    }

    public @enumtype(VkPerformanceCounterScopeKHR.class) int scope() {
        return segment.get(LAYOUT$scope, OFFSET$scope);
    }

    public void scope(@enumtype(VkPerformanceCounterScopeKHR.class) int value) {
        segment.set(LAYOUT$scope, OFFSET$scope, value);
    }

    public @enumtype(VkPerformanceCounterStorageKHR.class) int storage() {
        return segment.get(LAYOUT$storage, OFFSET$storage);
    }

    public void storage(@enumtype(VkPerformanceCounterStorageKHR.class) int value) {
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

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$unit = PathElement.groupElement("PATH$unit");
    public static final PathElement PATH$scope = PathElement.groupElement("PATH$scope");
    public static final PathElement PATH$storage = PathElement.groupElement("PATH$storage");
    public static final PathElement PATH$uuid = PathElement.groupElement("PATH$uuid");

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
