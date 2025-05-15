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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceQueueCreateInfo.html"><code>VkDeviceQueueCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceQueueCreateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkDeviceQueueCreateFlags flags; // optional
///     uint32_t queueFamilyIndex;
///     uint32_t queueCount;
///     float const* pQueuePriorities;
/// } VkDeviceQueueCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO`
///
/// The {@link VkDeviceQueueCreateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDeviceQueueCreateInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceQueueCreateInfo.html"><code>VkDeviceQueueCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceQueueCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkDeviceQueueCreateInfo allocate(Arena arena) {
        VkDeviceQueueCreateInfo ret = new VkDeviceQueueCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEVICE_QUEUE_CREATE_INFO);
        return ret;
    }

    public static VkDeviceQueueCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceQueueCreateInfo[] ret = new VkDeviceQueueCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceQueueCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEVICE_QUEUE_CREATE_INFO);
        }
        return ret;
    }

    public static VkDeviceQueueCreateInfo clone(Arena arena, VkDeviceQueueCreateInfo src) {
        VkDeviceQueueCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceQueueCreateInfo[] clone(Arena arena, VkDeviceQueueCreateInfo[] src) {
        VkDeviceQueueCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEVICE_QUEUE_CREATE_INFO);
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

    public @enumtype(VkDeviceQueueCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDeviceQueueCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int queueFamilyIndex() {
        return segment.get(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex);
    }

    public void queueFamilyIndex(@unsigned int value) {
        segment.set(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex, value);
    }

    public @unsigned int queueCount() {
        return segment.get(LAYOUT$queueCount, OFFSET$queueCount);
    }

    public void queueCount(@unsigned int value) {
        segment.set(LAYOUT$queueCount, OFFSET$queueCount, value);
    }

    public @pointer(comment="float*") MemorySegment pQueuePrioritiesRaw() {
        return segment.get(LAYOUT$pQueuePriorities, OFFSET$pQueuePriorities);
    }

    public void pQueuePrioritiesRaw(@pointer(comment="float*") MemorySegment value) {
        segment.set(LAYOUT$pQueuePriorities, OFFSET$pQueuePriorities, value);
    }

    /// Note: the returned {@link FloatPtr} does not have correct
    /// {@link FloatPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link FloatPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable FloatPtr pQueuePriorities() {
        MemorySegment s = pQueuePrioritiesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new FloatPtr(s);
    }

    public void pQueuePriorities(@Nullable FloatPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pQueuePrioritiesRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("queueCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT).withName("pQueuePriorities")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$queueFamilyIndex = PathElement.groupElement("PATH$queueFamilyIndex");
    public static final PathElement PATH$queueCount = PathElement.groupElement("PATH$queueCount");
    public static final PathElement PATH$pQueuePriorities = PathElement.groupElement("PATH$pQueuePriorities");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$queueFamilyIndex = (OfInt) LAYOUT.select(PATH$queueFamilyIndex);
    public static final OfInt LAYOUT$queueCount = (OfInt) LAYOUT.select(PATH$queueCount);
    public static final AddressLayout LAYOUT$pQueuePriorities = (AddressLayout) LAYOUT.select(PATH$pQueuePriorities);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$queueFamilyIndex = LAYOUT$queueFamilyIndex.byteSize();
    public static final long SIZE$queueCount = LAYOUT$queueCount.byteSize();
    public static final long SIZE$pQueuePriorities = LAYOUT$pQueuePriorities.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$queueFamilyIndex = LAYOUT.byteOffset(PATH$queueFamilyIndex);
    public static final long OFFSET$queueCount = LAYOUT.byteOffset(PATH$queueCount);
    public static final long OFFSET$pQueuePriorities = LAYOUT.byteOffset(PATH$pQueuePriorities);
}
