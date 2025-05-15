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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkLatencySleepModeInfoNV.html"><code>VkLatencySleepModeInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkLatencySleepModeInfoNV {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkBool32 lowLatencyMode;
///     VkBool32 lowLatencyBoost;
///     uint32_t minimumIntervalUs;
/// } VkLatencySleepModeInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_LATENCY_SLEEP_MODE_INFO_NV`
///
/// The {@link VkLatencySleepModeInfoNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkLatencySleepModeInfoNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkLatencySleepModeInfoNV.html"><code>VkLatencySleepModeInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkLatencySleepModeInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkLatencySleepModeInfoNV allocate(Arena arena) {
        VkLatencySleepModeInfoNV ret = new VkLatencySleepModeInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.LATENCY_SLEEP_MODE_INFO_NV);
        return ret;
    }

    public static VkLatencySleepModeInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkLatencySleepModeInfoNV[] ret = new VkLatencySleepModeInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkLatencySleepModeInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.LATENCY_SLEEP_MODE_INFO_NV);
        }
        return ret;
    }

    public static VkLatencySleepModeInfoNV clone(Arena arena, VkLatencySleepModeInfoNV src) {
        VkLatencySleepModeInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkLatencySleepModeInfoNV[] clone(Arena arena, VkLatencySleepModeInfoNV[] src) {
        VkLatencySleepModeInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.LATENCY_SLEEP_MODE_INFO_NV);
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

    public @unsigned int lowLatencyMode() {
        return segment.get(LAYOUT$lowLatencyMode, OFFSET$lowLatencyMode);
    }

    public void lowLatencyMode(@unsigned int value) {
        segment.set(LAYOUT$lowLatencyMode, OFFSET$lowLatencyMode, value);
    }

    public @unsigned int lowLatencyBoost() {
        return segment.get(LAYOUT$lowLatencyBoost, OFFSET$lowLatencyBoost);
    }

    public void lowLatencyBoost(@unsigned int value) {
        segment.set(LAYOUT$lowLatencyBoost, OFFSET$lowLatencyBoost, value);
    }

    public @unsigned int minimumIntervalUs() {
        return segment.get(LAYOUT$minimumIntervalUs, OFFSET$minimumIntervalUs);
    }

    public void minimumIntervalUs(@unsigned int value) {
        segment.set(LAYOUT$minimumIntervalUs, OFFSET$minimumIntervalUs, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lowLatencyMode"),
        ValueLayout.JAVA_INT.withName("lowLatencyBoost"),
        ValueLayout.JAVA_INT.withName("minimumIntervalUs")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$lowLatencyMode = PathElement.groupElement("PATH$lowLatencyMode");
    public static final PathElement PATH$lowLatencyBoost = PathElement.groupElement("PATH$lowLatencyBoost");
    public static final PathElement PATH$minimumIntervalUs = PathElement.groupElement("PATH$minimumIntervalUs");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$lowLatencyMode = (OfInt) LAYOUT.select(PATH$lowLatencyMode);
    public static final OfInt LAYOUT$lowLatencyBoost = (OfInt) LAYOUT.select(PATH$lowLatencyBoost);
    public static final OfInt LAYOUT$minimumIntervalUs = (OfInt) LAYOUT.select(PATH$minimumIntervalUs);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$lowLatencyMode = LAYOUT$lowLatencyMode.byteSize();
    public static final long SIZE$lowLatencyBoost = LAYOUT$lowLatencyBoost.byteSize();
    public static final long SIZE$minimumIntervalUs = LAYOUT$minimumIntervalUs.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$lowLatencyMode = LAYOUT.byteOffset(PATH$lowLatencyMode);
    public static final long OFFSET$lowLatencyBoost = LAYOUT.byteOffset(PATH$lowLatencyBoost);
    public static final long OFFSET$minimumIntervalUs = LAYOUT.byteOffset(PATH$minimumIntervalUs);
}
