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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCopyAccelerationStructureInfoKHR.html"><code>VkCopyAccelerationStructureInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkCopyAccelerationStructureInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkAccelerationStructureKHR src;
///     VkAccelerationStructureKHR dst;
///     VkCopyAccelerationStructureModeKHR mode;
/// } VkCopyAccelerationStructureInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_COPY_ACCELERATION_STRUCTURE_INFO_KHR`
///
/// The {@link VkCopyAccelerationStructureInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkCopyAccelerationStructureInfoKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCopyAccelerationStructureInfoKHR.html"><code>VkCopyAccelerationStructureInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCopyAccelerationStructureInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkCopyAccelerationStructureInfoKHR allocate(Arena arena) {
        VkCopyAccelerationStructureInfoKHR ret = new VkCopyAccelerationStructureInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.COPY_ACCELERATION_STRUCTURE_INFO_KHR);
        return ret;
    }

    public static VkCopyAccelerationStructureInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyAccelerationStructureInfoKHR[] ret = new VkCopyAccelerationStructureInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCopyAccelerationStructureInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.COPY_ACCELERATION_STRUCTURE_INFO_KHR);
        }
        return ret;
    }

    public static VkCopyAccelerationStructureInfoKHR clone(Arena arena, VkCopyAccelerationStructureInfoKHR src) {
        VkCopyAccelerationStructureInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCopyAccelerationStructureInfoKHR[] clone(Arena arena, VkCopyAccelerationStructureInfoKHR[] src) {
        VkCopyAccelerationStructureInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.COPY_ACCELERATION_STRUCTURE_INFO_KHR);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @Nullable VkAccelerationStructureKHR src() {
        MemorySegment s = segment.asSlice(OFFSET$src, SIZE$src);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkAccelerationStructureKHR(s);
    }

    public void src(@Nullable VkAccelerationStructureKHR value) {
        segment.set(LAYOUT$src, OFFSET$src, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkAccelerationStructureKHR dst() {
        MemorySegment s = segment.asSlice(OFFSET$dst, SIZE$dst);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkAccelerationStructureKHR(s);
    }

    public void dst(@Nullable VkAccelerationStructureKHR value) {
        segment.set(LAYOUT$dst, OFFSET$dst, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkCopyAccelerationStructureModeKHR.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkCopyAccelerationStructureModeKHR.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("src"),
        ValueLayout.ADDRESS.withName("dst"),
        ValueLayout.JAVA_INT.withName("mode")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$src = PathElement.groupElement("PATH$src");
    public static final PathElement PATH$dst = PathElement.groupElement("PATH$dst");
    public static final PathElement PATH$mode = PathElement.groupElement("PATH$mode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$src = (AddressLayout) LAYOUT.select(PATH$src);
    public static final AddressLayout LAYOUT$dst = (AddressLayout) LAYOUT.select(PATH$dst);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$src = LAYOUT$src.byteSize();
    public static final long SIZE$dst = LAYOUT$dst.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$src = LAYOUT.byteOffset(PATH$src);
    public static final long OFFSET$dst = LAYOUT.byteOffset(PATH$dst);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
}
