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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkLatencySleepInfoNV.html"><code>VkLatencySleepInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkLatencySleepInfoNV {
///     VkStructureType sType;
///     void const* pNext;
///     VkSemaphore signalSemaphore;
///     uint64_t value;
/// } VkLatencySleepInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV`
///
/// The {@link VkLatencySleepInfoNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkLatencySleepInfoNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkLatencySleepInfoNV.html"><code>VkLatencySleepInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkLatencySleepInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkLatencySleepInfoNV allocate(Arena arena) {
        VkLatencySleepInfoNV ret = new VkLatencySleepInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.LATENCY_SLEEP_INFO_NV);
        return ret;
    }

    public static VkLatencySleepInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkLatencySleepInfoNV[] ret = new VkLatencySleepInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkLatencySleepInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.LATENCY_SLEEP_INFO_NV);
        }
        return ret;
    }

    public static VkLatencySleepInfoNV clone(Arena arena, VkLatencySleepInfoNV src) {
        VkLatencySleepInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkLatencySleepInfoNV[] clone(Arena arena, VkLatencySleepInfoNV[] src) {
        VkLatencySleepInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.LATENCY_SLEEP_INFO_NV);
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

    public @Nullable VkSemaphore signalSemaphore() {
        MemorySegment s = segment.asSlice(OFFSET$signalSemaphore, SIZE$signalSemaphore);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSemaphore(s);
    }

    public void signalSemaphore(@Nullable VkSemaphore value) {
        segment.set(LAYOUT$signalSemaphore, OFFSET$signalSemaphore, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long value() {
        return segment.get(LAYOUT$value, OFFSET$value);
    }

    public void value(@unsigned long value) {
        segment.set(LAYOUT$value, OFFSET$value, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("signalSemaphore"),
        ValueLayout.JAVA_LONG.withName("value")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$signalSemaphore = PathElement.groupElement("PATH$signalSemaphore");
    public static final PathElement PATH$value = PathElement.groupElement("PATH$value");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$signalSemaphore = (AddressLayout) LAYOUT.select(PATH$signalSemaphore);
    public static final OfLong LAYOUT$value = (OfLong) LAYOUT.select(PATH$value);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$signalSemaphore = LAYOUT$signalSemaphore.byteSize();
    public static final long SIZE$value = LAYOUT$value.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$signalSemaphore = LAYOUT.byteOffset(PATH$signalSemaphore);
    public static final long OFFSET$value = LAYOUT.byteOffset(PATH$value);
}
