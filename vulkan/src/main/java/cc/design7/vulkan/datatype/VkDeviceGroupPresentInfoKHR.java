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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceGroupPresentInfoKHR.html">VkDeviceGroupPresentInfoKHR</a>
@ValueBasedCandidate
public record VkDeviceGroupPresentInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$swapchainCount = ValueLayout.JAVA_INT.withName("swapchainCount");
    public static final AddressLayout LAYOUT$pDeviceMasks = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDeviceMasks");
    public static final OfInt LAYOUT$mode = ValueLayout.JAVA_INT.withName("mode");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$swapchainCount, LAYOUT$pDeviceMasks, LAYOUT$mode);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceGroupPresentInfoKHR allocate(Arena arena) {
        return new VkDeviceGroupPresentInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkDeviceGroupPresentInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceGroupPresentInfoKHR[] ret = new VkDeviceGroupPresentInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceGroupPresentInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceGroupPresentInfoKHR clone(Arena arena, VkDeviceGroupPresentInfoKHR src) {
        VkDeviceGroupPresentInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceGroupPresentInfoKHR[] clone(Arena arena, VkDeviceGroupPresentInfoKHR[] src) {
        VkDeviceGroupPresentInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$swapchainCount = PathElement.groupElement("PATH$swapchainCount");
    public static final PathElement PATH$pDeviceMasks = PathElement.groupElement("PATH$pDeviceMasks");
    public static final PathElement PATH$mode = PathElement.groupElement("PATH$mode");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchainCount = LAYOUT$swapchainCount.byteSize();
    public static final long SIZE$pDeviceMasks = LAYOUT$pDeviceMasks.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pDeviceMasks = LAYOUT.byteOffset(PATH$pDeviceMasks);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);

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

    public @unsigned int swapchainCount() {
        return segment.get(LAYOUT$swapchainCount, OFFSET$swapchainCount);
    }

    public void swapchainCount(@unsigned int value) {
        segment.set(LAYOUT$swapchainCount, OFFSET$swapchainCount, value);
    }

    public @pointer(comment="int*") MemorySegment pDeviceMasksRaw() {
        return segment.get(LAYOUT$pDeviceMasks, OFFSET$pDeviceMasks);
    }

    public void pDeviceMasksRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pDeviceMasks, OFFSET$pDeviceMasks, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pDeviceMasks() {
        MemorySegment s = pDeviceMasksRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pDeviceMasks(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDeviceMasksRaw(s);
    }

    public @enumtype(VkDeviceGroupPresentModeFlagsKHR.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkDeviceGroupPresentModeFlagsKHR.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

}
