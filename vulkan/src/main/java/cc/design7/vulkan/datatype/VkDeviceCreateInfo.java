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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceCreateInfo.html"><code>VkDeviceCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceCreateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkDeviceCreateFlags flags; // optional
///     uint32_t queueCreateInfoCount;
///     VkDeviceQueueCreateInfo const* pQueueCreateInfos;
///     uint32_t enabledLayerCount; // optional
///     char const* const* ppEnabledLayerNames;
///     uint32_t enabledExtensionCount; // optional
///     char const* const* ppEnabledExtensionNames;
///     VkPhysicalDeviceFeatures const* pEnabledFeatures; // optional
/// } VkDeviceCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO`
///
/// The {@link VkDeviceCreateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDeviceCreateInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceCreateInfo.html"><code>VkDeviceCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkDeviceCreateInfo allocate(Arena arena) {
        VkDeviceCreateInfo ret = new VkDeviceCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEVICE_CREATE_INFO);
        return ret;
    }

    public static VkDeviceCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceCreateInfo[] ret = new VkDeviceCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEVICE_CREATE_INFO);
        }
        return ret;
    }

    public static VkDeviceCreateInfo clone(Arena arena, VkDeviceCreateInfo src) {
        VkDeviceCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceCreateInfo[] clone(Arena arena, VkDeviceCreateInfo[] src) {
        VkDeviceCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEVICE_CREATE_INFO);
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

    public @enumtype(VkDeviceCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDeviceCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int queueCreateInfoCount() {
        return segment.get(LAYOUT$queueCreateInfoCount, OFFSET$queueCreateInfoCount);
    }

    public void queueCreateInfoCount(@unsigned int value) {
        segment.set(LAYOUT$queueCreateInfoCount, OFFSET$queueCreateInfoCount, value);
    }

    public @pointer(comment="VkDeviceQueueCreateInfo*") MemorySegment pQueueCreateInfosRaw() {
        return segment.get(LAYOUT$pQueueCreateInfos, OFFSET$pQueueCreateInfos);
    }

    public void pQueueCreateInfosRaw(@pointer(comment="VkDeviceQueueCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pQueueCreateInfos, OFFSET$pQueueCreateInfos, value);
    }

    public @Nullable VkDeviceQueueCreateInfo pQueueCreateInfos() {
        MemorySegment s = pQueueCreateInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDeviceQueueCreateInfo(s);
    }

    public void pQueueCreateInfos(@Nullable VkDeviceQueueCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pQueueCreateInfosRaw(s);
    }

    @unsafe public @Nullable VkDeviceQueueCreateInfo[] pQueueCreateInfos(int assumedCount) {
        MemorySegment s = pQueueCreateInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDeviceQueueCreateInfo.BYTES);
        VkDeviceQueueCreateInfo[] ret = new VkDeviceQueueCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDeviceQueueCreateInfo(s.asSlice(i * VkDeviceQueueCreateInfo.BYTES, VkDeviceQueueCreateInfo.BYTES));
        }
        return ret;
    }

    public @unsigned int enabledLayerCount() {
        return segment.get(LAYOUT$enabledLayerCount, OFFSET$enabledLayerCount);
    }

    public void enabledLayerCount(@unsigned int value) {
        segment.set(LAYOUT$enabledLayerCount, OFFSET$enabledLayerCount, value);
    }

    public @pointer(comment="void**") MemorySegment ppEnabledLayerNamesRaw() {
        return segment.get(LAYOUT$ppEnabledLayerNames, OFFSET$ppEnabledLayerNames);
    }

    public void ppEnabledLayerNamesRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppEnabledLayerNames, OFFSET$ppEnabledLayerNames, value);
    }

    /// Note: the returned {@link PointerBuffer} does not have correct {@link PointerBuffer#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerBuffer#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerBuffer ppEnabledLayerNames() {
        MemorySegment s = ppEnabledLayerNamesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerBuffer(s);
    }

    public void ppEnabledLayerNames(@Nullable PointerBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        ppEnabledLayerNamesRaw(s);
    }

    public @unsigned int enabledExtensionCount() {
        return segment.get(LAYOUT$enabledExtensionCount, OFFSET$enabledExtensionCount);
    }

    public void enabledExtensionCount(@unsigned int value) {
        segment.set(LAYOUT$enabledExtensionCount, OFFSET$enabledExtensionCount, value);
    }

    public @pointer(comment="void**") MemorySegment ppEnabledExtensionNamesRaw() {
        return segment.get(LAYOUT$ppEnabledExtensionNames, OFFSET$ppEnabledExtensionNames);
    }

    public void ppEnabledExtensionNamesRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppEnabledExtensionNames, OFFSET$ppEnabledExtensionNames, value);
    }

    /// Note: the returned {@link PointerBuffer} does not have correct {@link PointerBuffer#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerBuffer#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerBuffer ppEnabledExtensionNames() {
        MemorySegment s = ppEnabledExtensionNamesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerBuffer(s);
    }

    public void ppEnabledExtensionNames(@Nullable PointerBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        ppEnabledExtensionNamesRaw(s);
    }

    public @pointer(comment="VkPhysicalDeviceFeatures*") MemorySegment pEnabledFeaturesRaw() {
        return segment.get(LAYOUT$pEnabledFeatures, OFFSET$pEnabledFeatures);
    }

    public void pEnabledFeaturesRaw(@pointer(comment="VkPhysicalDeviceFeatures*") MemorySegment value) {
        segment.set(LAYOUT$pEnabledFeatures, OFFSET$pEnabledFeatures, value);
    }

    public @Nullable VkPhysicalDeviceFeatures pEnabledFeatures() {
        MemorySegment s = pEnabledFeaturesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPhysicalDeviceFeatures(s);
    }

    public void pEnabledFeatures(@Nullable VkPhysicalDeviceFeatures value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pEnabledFeaturesRaw(s);
    }

    @unsafe public @Nullable VkPhysicalDeviceFeatures[] pEnabledFeatures(int assumedCount) {
        MemorySegment s = pEnabledFeaturesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkPhysicalDeviceFeatures.BYTES);
        VkPhysicalDeviceFeatures[] ret = new VkPhysicalDeviceFeatures[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkPhysicalDeviceFeatures(s.asSlice(i * VkPhysicalDeviceFeatures.BYTES, VkPhysicalDeviceFeatures.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queueCreateInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDeviceQueueCreateInfo.LAYOUT).withName("pQueueCreateInfos"),
        ValueLayout.JAVA_INT.withName("enabledLayerCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("ppEnabledLayerNames"),
        ValueLayout.JAVA_INT.withName("enabledExtensionCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)).withName("ppEnabledExtensionNames"),
        ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceFeatures.LAYOUT).withName("pEnabledFeatures")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$queueCreateInfoCount = PathElement.groupElement("PATH$queueCreateInfoCount");
    public static final PathElement PATH$pQueueCreateInfos = PathElement.groupElement("PATH$pQueueCreateInfos");
    public static final PathElement PATH$enabledLayerCount = PathElement.groupElement("PATH$enabledLayerCount");
    public static final PathElement PATH$ppEnabledLayerNames = PathElement.groupElement("PATH$ppEnabledLayerNames");
    public static final PathElement PATH$enabledExtensionCount = PathElement.groupElement("PATH$enabledExtensionCount");
    public static final PathElement PATH$ppEnabledExtensionNames = PathElement.groupElement("PATH$ppEnabledExtensionNames");
    public static final PathElement PATH$pEnabledFeatures = PathElement.groupElement("PATH$pEnabledFeatures");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$queueCreateInfoCount = (OfInt) LAYOUT.select(PATH$queueCreateInfoCount);
    public static final AddressLayout LAYOUT$pQueueCreateInfos = (AddressLayout) LAYOUT.select(PATH$pQueueCreateInfos);
    public static final OfInt LAYOUT$enabledLayerCount = (OfInt) LAYOUT.select(PATH$enabledLayerCount);
    public static final AddressLayout LAYOUT$ppEnabledLayerNames = (AddressLayout) LAYOUT.select(PATH$ppEnabledLayerNames);
    public static final OfInt LAYOUT$enabledExtensionCount = (OfInt) LAYOUT.select(PATH$enabledExtensionCount);
    public static final AddressLayout LAYOUT$ppEnabledExtensionNames = (AddressLayout) LAYOUT.select(PATH$ppEnabledExtensionNames);
    public static final AddressLayout LAYOUT$pEnabledFeatures = (AddressLayout) LAYOUT.select(PATH$pEnabledFeatures);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$queueCreateInfoCount = LAYOUT$queueCreateInfoCount.byteSize();
    public static final long SIZE$pQueueCreateInfos = LAYOUT$pQueueCreateInfos.byteSize();
    public static final long SIZE$enabledLayerCount = LAYOUT$enabledLayerCount.byteSize();
    public static final long SIZE$ppEnabledLayerNames = LAYOUT$ppEnabledLayerNames.byteSize();
    public static final long SIZE$enabledExtensionCount = LAYOUT$enabledExtensionCount.byteSize();
    public static final long SIZE$ppEnabledExtensionNames = LAYOUT$ppEnabledExtensionNames.byteSize();
    public static final long SIZE$pEnabledFeatures = LAYOUT$pEnabledFeatures.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$queueCreateInfoCount = LAYOUT.byteOffset(PATH$queueCreateInfoCount);
    public static final long OFFSET$pQueueCreateInfos = LAYOUT.byteOffset(PATH$pQueueCreateInfos);
    public static final long OFFSET$enabledLayerCount = LAYOUT.byteOffset(PATH$enabledLayerCount);
    public static final long OFFSET$ppEnabledLayerNames = LAYOUT.byteOffset(PATH$ppEnabledLayerNames);
    public static final long OFFSET$enabledExtensionCount = LAYOUT.byteOffset(PATH$enabledExtensionCount);
    public static final long OFFSET$ppEnabledExtensionNames = LAYOUT.byteOffset(PATH$ppEnabledExtensionNames);
    public static final long OFFSET$pEnabledFeatures = LAYOUT.byteOffset(PATH$pEnabledFeatures);
}
