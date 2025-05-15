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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkStridedDeviceAddressNV.html"><code>VkStridedDeviceAddressNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkStridedDeviceAddressNV {
///     VkDeviceAddress startAddress;
///     VkDeviceSize strideInBytes;
/// } VkStridedDeviceAddressNV;
/// }
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkStridedDeviceAddressNV.html"><code>VkStridedDeviceAddressNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkStridedDeviceAddressNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkStridedDeviceAddressNV allocate(Arena arena) {
        VkStridedDeviceAddressNV ret = new VkStridedDeviceAddressNV(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkStridedDeviceAddressNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkStridedDeviceAddressNV[] ret = new VkStridedDeviceAddressNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkStridedDeviceAddressNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkStridedDeviceAddressNV clone(Arena arena, VkStridedDeviceAddressNV src) {
        VkStridedDeviceAddressNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkStridedDeviceAddressNV[] clone(Arena arena, VkStridedDeviceAddressNV[] src) {
        VkStridedDeviceAddressNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned long startAddress() {
        return segment.get(LAYOUT$startAddress, OFFSET$startAddress);
    }

    public void startAddress(@unsigned long value) {
        segment.set(LAYOUT$startAddress, OFFSET$startAddress, value);
    }

    public @unsigned long strideInBytes() {
        return segment.get(LAYOUT$strideInBytes, OFFSET$strideInBytes);
    }

    public void strideInBytes(@unsigned long value) {
        segment.set(LAYOUT$strideInBytes, OFFSET$strideInBytes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("startAddress"),
        ValueLayout.JAVA_LONG.withName("strideInBytes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$startAddress = PathElement.groupElement("PATH$startAddress");
    public static final PathElement PATH$strideInBytes = PathElement.groupElement("PATH$strideInBytes");

    public static final OfLong LAYOUT$startAddress = (OfLong) LAYOUT.select(PATH$startAddress);
    public static final OfLong LAYOUT$strideInBytes = (OfLong) LAYOUT.select(PATH$strideInBytes);

    public static final long SIZE$startAddress = LAYOUT$startAddress.byteSize();
    public static final long SIZE$strideInBytes = LAYOUT$strideInBytes.byteSize();

    public static final long OFFSET$startAddress = LAYOUT.byteOffset(PATH$startAddress);
    public static final long OFFSET$strideInBytes = LAYOUT.byteOffset(PATH$strideInBytes);
}
