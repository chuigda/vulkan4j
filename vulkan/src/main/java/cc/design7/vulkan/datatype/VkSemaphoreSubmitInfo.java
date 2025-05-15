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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSemaphoreSubmitInfo.html"><code>VkSemaphoreSubmitInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSemaphoreSubmitInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkSemaphore semaphore;
///     uint64_t value;
///     VkPipelineStageFlags2 stageMask; // optional
///     uint32_t deviceIndex;
/// } VkSemaphoreSubmitInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SEMAPHORE_SUBMIT_INFO`
///
/// The {@link VkSemaphoreSubmitInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkSemaphoreSubmitInfo#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSemaphoreSubmitInfo.html"><code>VkSemaphoreSubmitInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSemaphoreSubmitInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkSemaphoreSubmitInfo allocate(Arena arena) {
        VkSemaphoreSubmitInfo ret = new VkSemaphoreSubmitInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SEMAPHORE_SUBMIT_INFO);
        return ret;
    }

    public static VkSemaphoreSubmitInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSemaphoreSubmitInfo[] ret = new VkSemaphoreSubmitInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSemaphoreSubmitInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SEMAPHORE_SUBMIT_INFO);
        }
        return ret;
    }

    public static VkSemaphoreSubmitInfo clone(Arena arena, VkSemaphoreSubmitInfo src) {
        VkSemaphoreSubmitInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSemaphoreSubmitInfo[] clone(Arena arena, VkSemaphoreSubmitInfo[] src) {
        VkSemaphoreSubmitInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SEMAPHORE_SUBMIT_INFO);
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

    public @Nullable VkSemaphore semaphore() {
        MemorySegment s = segment.asSlice(OFFSET$semaphore, SIZE$semaphore);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSemaphore(s);
    }

    public void semaphore(@Nullable VkSemaphore value) {
        segment.set(LAYOUT$semaphore, OFFSET$semaphore, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long value() {
        return segment.get(LAYOUT$value, OFFSET$value);
    }

    public void value(@unsigned long value) {
        segment.set(LAYOUT$value, OFFSET$value, value);
    }

    public @enumtype(VkPipelineStageFlags2.class) long stageMask() {
        return segment.get(LAYOUT$stageMask, OFFSET$stageMask);
    }

    public void stageMask(@enumtype(VkPipelineStageFlags2.class) long value) {
        segment.set(LAYOUT$stageMask, OFFSET$stageMask, value);
    }

    public @unsigned int deviceIndex() {
        return segment.get(LAYOUT$deviceIndex, OFFSET$deviceIndex);
    }

    public void deviceIndex(@unsigned int value) {
        segment.set(LAYOUT$deviceIndex, OFFSET$deviceIndex, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.JAVA_LONG.withName("value"),
        ValueLayout.JAVA_LONG.withName("stageMask"),
        ValueLayout.JAVA_INT.withName("deviceIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$semaphore = PathElement.groupElement("PATH$semaphore");
    public static final PathElement PATH$value = PathElement.groupElement("PATH$value");
    public static final PathElement PATH$stageMask = PathElement.groupElement("PATH$stageMask");
    public static final PathElement PATH$deviceIndex = PathElement.groupElement("PATH$deviceIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$semaphore = (AddressLayout) LAYOUT.select(PATH$semaphore);
    public static final OfLong LAYOUT$value = (OfLong) LAYOUT.select(PATH$value);
    public static final OfLong LAYOUT$stageMask = (OfLong) LAYOUT.select(PATH$stageMask);
    public static final OfInt LAYOUT$deviceIndex = (OfInt) LAYOUT.select(PATH$deviceIndex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$semaphore = LAYOUT$semaphore.byteSize();
    public static final long SIZE$value = LAYOUT$value.byteSize();
    public static final long SIZE$stageMask = LAYOUT$stageMask.byteSize();
    public static final long SIZE$deviceIndex = LAYOUT$deviceIndex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$semaphore = LAYOUT.byteOffset(PATH$semaphore);
    public static final long OFFSET$value = LAYOUT.byteOffset(PATH$value);
    public static final long OFFSET$stageMask = LAYOUT.byteOffset(PATH$stageMask);
    public static final long OFFSET$deviceIndex = LAYOUT.byteOffset(PATH$deviceIndex);
}
