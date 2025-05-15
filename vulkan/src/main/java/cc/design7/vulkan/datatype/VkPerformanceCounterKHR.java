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

/// Represents a pointer to a {@code VkPerformanceCounterKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceCounterKHR.html">VkPerformanceCounterKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPerformanceCounterKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkPerformanceCounterKHR {
        sType(VkStructureType.PERFORMANCE_COUNTER_KHR);
    }

    public static VkPerformanceCounterKHR allocate(Arena arena) {
        return new VkPerformanceCounterKHR(arena.allocate(LAYOUT));
    }

    public static VkPerformanceCounterKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceCounterKHR[] ret = new VkPerformanceCounterKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPerformanceCounterKHR(segment.asSlice(i * SIZE, SIZE));
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("unit"),
        ValueLayout.JAVA_INT.withName("scope"),
        ValueLayout.JAVA_INT.withName("storage"),
        ValueLayout.JAVA_BYTE.withName("uuid")
    );
    public static final long SIZE = LAYOUT.byteSize();

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

}
