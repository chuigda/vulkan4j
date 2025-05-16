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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryDedicatedRequirements.html"><code>VkMemoryDedicatedRequirements</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkMemoryDedicatedRequirements {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 prefersDedicatedAllocation;
///     VkBool32 requiresDedicatedAllocation;
/// } VkMemoryDedicatedRequirements;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS`
///
/// The {@link VkMemoryDedicatedRequirements#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkMemoryDedicatedRequirements#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryDedicatedRequirements.html"><code>VkMemoryDedicatedRequirements</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkMemoryDedicatedRequirements(@NotNull MemorySegment segment) implements IPointer {
    public static VkMemoryDedicatedRequirements allocate(Arena arena) {
        VkMemoryDedicatedRequirements ret = new VkMemoryDedicatedRequirements(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.MEMORY_DEDICATED_REQUIREMENTS);
        return ret;
    }

    public static VkMemoryDedicatedRequirements[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryDedicatedRequirements[] ret = new VkMemoryDedicatedRequirements[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMemoryDedicatedRequirements(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.MEMORY_DEDICATED_REQUIREMENTS);
        }
        return ret;
    }

    public static VkMemoryDedicatedRequirements clone(Arena arena, VkMemoryDedicatedRequirements src) {
        VkMemoryDedicatedRequirements ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMemoryDedicatedRequirements[] clone(Arena arena, VkMemoryDedicatedRequirements[] src) {
        VkMemoryDedicatedRequirements[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.MEMORY_DEDICATED_REQUIREMENTS);
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

    public @unsigned int prefersDedicatedAllocation() {
        return segment.get(LAYOUT$prefersDedicatedAllocation, OFFSET$prefersDedicatedAllocation);
    }

    public void prefersDedicatedAllocation(@unsigned int value) {
        segment.set(LAYOUT$prefersDedicatedAllocation, OFFSET$prefersDedicatedAllocation, value);
    }

    public @unsigned int requiresDedicatedAllocation() {
        return segment.get(LAYOUT$requiresDedicatedAllocation, OFFSET$requiresDedicatedAllocation);
    }

    public void requiresDedicatedAllocation(@unsigned int value) {
        segment.set(LAYOUT$requiresDedicatedAllocation, OFFSET$requiresDedicatedAllocation, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("prefersDedicatedAllocation"),
        ValueLayout.JAVA_INT.withName("requiresDedicatedAllocation")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$prefersDedicatedAllocation = PathElement.groupElement("PATH$prefersDedicatedAllocation");
    public static final PathElement PATH$requiresDedicatedAllocation = PathElement.groupElement("PATH$requiresDedicatedAllocation");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$prefersDedicatedAllocation = (OfInt) LAYOUT.select(PATH$prefersDedicatedAllocation);
    public static final OfInt LAYOUT$requiresDedicatedAllocation = (OfInt) LAYOUT.select(PATH$requiresDedicatedAllocation);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$prefersDedicatedAllocation = LAYOUT$prefersDedicatedAllocation.byteSize();
    public static final long SIZE$requiresDedicatedAllocation = LAYOUT$requiresDedicatedAllocation.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$prefersDedicatedAllocation = LAYOUT.byteOffset(PATH$prefersDedicatedAllocation);
    public static final long OFFSET$requiresDedicatedAllocation = LAYOUT.byteOffset(PATH$requiresDedicatedAllocation);
}
