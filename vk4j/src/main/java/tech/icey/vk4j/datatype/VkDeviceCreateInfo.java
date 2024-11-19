package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkDeviceCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceCreateFlags flags;
///     uint32_t queueCreateInfoCount;
///     const VkDeviceQueueCreateInfo* pQueueCreateInfos;
///     uint32_t enabledLayerCount;
///     const char* const* ppEnabledLayerNames;
///     uint32_t enabledExtensionCount;
///     const char* const* ppEnabledExtensionNames;
///     const VkPhysicalDeviceFeatures* pEnabledFeatures;
/// } VkDeviceCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDeviceCreateInfo.html">VkDeviceCreateInfo</a>
public record VkDeviceCreateInfo(MemorySegment segment) implements IPointer {
    public VkDeviceCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceQueueCreateInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkDeviceQueueCreateInfo[] pQueueCreateInfos(int assumedCount) {
        MemorySegment s = pQueueCreateInfosRaw().reinterpret(assumedCount * VkDeviceQueueCreateInfo.SIZE);
        VkDeviceQueueCreateInfo[] arr = new VkDeviceQueueCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDeviceQueueCreateInfo(s.asSlice(i * VkDeviceQueueCreateInfo.SIZE, VkDeviceQueueCreateInfo.SIZE));
        }
        return arr;
    }

    public void pQueueCreateInfos(@Nullable VkDeviceQueueCreateInfo value) {
        pQueueCreateInfosRaw(value == null ? MemorySegment.NULL : value.segment());
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
    /// to user to track the size of the buffer, and use {@link PointerBuffer#reinterpret} to set the
    /// size before actually {@link PointerBuffer#read}ing or {@link PointerBuffer#write}ing the buffer.
    ///
    /// @see PointerBuffer
    public @Nullable PointerBuffer ppEnabledLayerNames() {
        var s = ppEnabledLayerNamesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new PointerBuffer(ppEnabledLayerNamesRaw());
    }

    public void ppEnabledLayerNames(@Nullable PointerBuffer value) {
        ppEnabledLayerNamesRaw(value == null ? MemorySegment.NULL : value.segment());
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
    /// to user to track the size of the buffer, and use {@link PointerBuffer#reinterpret} to set the
    /// size before actually {@link PointerBuffer#read}ing or {@link PointerBuffer#write}ing the buffer.
    ///
    /// @see PointerBuffer
    public @Nullable PointerBuffer ppEnabledExtensionNames() {
        var s = ppEnabledExtensionNamesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new PointerBuffer(ppEnabledExtensionNamesRaw());
    }

    public void ppEnabledExtensionNames(@Nullable PointerBuffer value) {
        ppEnabledExtensionNamesRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="VkPhysicalDeviceFeatures*") MemorySegment pEnabledFeaturesRaw() {
        return segment.get(LAYOUT$pEnabledFeatures, OFFSET$pEnabledFeatures);
    }

    public void pEnabledFeaturesRaw(@pointer(comment="VkPhysicalDeviceFeatures*") MemorySegment value) {
        segment.set(LAYOUT$pEnabledFeatures, OFFSET$pEnabledFeatures, value);
    }

    public @Nullable VkPhysicalDeviceFeatures pEnabledFeatures() {
        MemorySegment s = pEnabledFeaturesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPhysicalDeviceFeatures(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkPhysicalDeviceFeatures[] pEnabledFeatures(int assumedCount) {
        MemorySegment s = pEnabledFeaturesRaw().reinterpret(assumedCount * VkPhysicalDeviceFeatures.SIZE);
        VkPhysicalDeviceFeatures[] arr = new VkPhysicalDeviceFeatures[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPhysicalDeviceFeatures(s.asSlice(i * VkPhysicalDeviceFeatures.SIZE, VkPhysicalDeviceFeatures.SIZE));
        }
        return arr;
    }

    public void pEnabledFeatures(@Nullable VkPhysicalDeviceFeatures value) {
        pEnabledFeaturesRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkDeviceCreateInfo allocate(Arena arena) {
        return new VkDeviceCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkDeviceCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceCreateInfo[] ret = new VkDeviceCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceCreateInfo(segment.asSlice(i * SIZE, SIZE));
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
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
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$queueCreateInfoCount = PathElement.groupElement("queueCreateInfoCount");
    public static final PathElement PATH$pQueueCreateInfos = PathElement.groupElement("pQueueCreateInfos");
    public static final PathElement PATH$enabledLayerCount = PathElement.groupElement("enabledLayerCount");
    public static final PathElement PATH$ppEnabledLayerNames = PathElement.groupElement("ppEnabledLayerNames");
    public static final PathElement PATH$enabledExtensionCount = PathElement.groupElement("enabledExtensionCount");
    public static final PathElement PATH$ppEnabledExtensionNames = PathElement.groupElement("ppEnabledExtensionNames");
    public static final PathElement PATH$pEnabledFeatures = PathElement.groupElement("pEnabledFeatures");

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
}
