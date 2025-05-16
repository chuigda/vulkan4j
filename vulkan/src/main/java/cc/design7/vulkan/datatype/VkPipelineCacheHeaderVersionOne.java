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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCacheHeaderVersionOne.html"><code>VkPipelineCacheHeaderVersionOne</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineCacheHeaderVersionOne {
///     uint32_t headerSize;
///     VkPipelineCacheHeaderVersion headerVersion;
///     uint32_t vendorID;
///     uint32_t deviceID;
///     uint8_t pipelineCacheUUID;
/// } VkPipelineCacheHeaderVersionOne;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCacheHeaderVersionOne.html"><code>VkPipelineCacheHeaderVersionOne</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineCacheHeaderVersionOne(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineCacheHeaderVersionOne allocate(Arena arena) {
        VkPipelineCacheHeaderVersionOne ret = new VkPipelineCacheHeaderVersionOne(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkPipelineCacheHeaderVersionOne[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineCacheHeaderVersionOne[] ret = new VkPipelineCacheHeaderVersionOne[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineCacheHeaderVersionOne(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPipelineCacheHeaderVersionOne clone(Arena arena, VkPipelineCacheHeaderVersionOne src) {
        VkPipelineCacheHeaderVersionOne ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineCacheHeaderVersionOne[] clone(Arena arena, VkPipelineCacheHeaderVersionOne[] src) {
        VkPipelineCacheHeaderVersionOne[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int headerSize() {
        return segment.get(LAYOUT$headerSize, OFFSET$headerSize);
    }

    public void headerSize(@unsigned int value) {
        segment.set(LAYOUT$headerSize, OFFSET$headerSize, value);
    }

    public @enumtype(VkPipelineCacheHeaderVersion.class) int headerVersion() {
        return segment.get(LAYOUT$headerVersion, OFFSET$headerVersion);
    }

    public void headerVersion(@enumtype(VkPipelineCacheHeaderVersion.class) int value) {
        segment.set(LAYOUT$headerVersion, OFFSET$headerVersion, value);
    }

    public @unsigned int vendorID() {
        return segment.get(LAYOUT$vendorID, OFFSET$vendorID);
    }

    public void vendorID(@unsigned int value) {
        segment.set(LAYOUT$vendorID, OFFSET$vendorID, value);
    }

    public @unsigned int deviceID() {
        return segment.get(LAYOUT$deviceID, OFFSET$deviceID);
    }

    public void deviceID(@unsigned int value) {
        segment.set(LAYOUT$deviceID, OFFSET$deviceID, value);
    }

    public @unsigned byte pipelineCacheUUID() {
        return segment.get(LAYOUT$pipelineCacheUUID, OFFSET$pipelineCacheUUID);
    }

    public void pipelineCacheUUID(@unsigned byte value) {
        segment.set(LAYOUT$pipelineCacheUUID, OFFSET$pipelineCacheUUID, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("headerSize"),
        ValueLayout.JAVA_INT.withName("headerVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        ValueLayout.JAVA_BYTE.withName("pipelineCacheUUID")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$headerSize = PathElement.groupElement("PATH$headerSize");
    public static final PathElement PATH$headerVersion = PathElement.groupElement("PATH$headerVersion");
    public static final PathElement PATH$vendorID = PathElement.groupElement("PATH$vendorID");
    public static final PathElement PATH$deviceID = PathElement.groupElement("PATH$deviceID");
    public static final PathElement PATH$pipelineCacheUUID = PathElement.groupElement("PATH$pipelineCacheUUID");

    public static final OfInt LAYOUT$headerSize = (OfInt) LAYOUT.select(PATH$headerSize);
    public static final OfInt LAYOUT$headerVersion = (OfInt) LAYOUT.select(PATH$headerVersion);
    public static final OfInt LAYOUT$vendorID = (OfInt) LAYOUT.select(PATH$vendorID);
    public static final OfInt LAYOUT$deviceID = (OfInt) LAYOUT.select(PATH$deviceID);
    public static final OfByte LAYOUT$pipelineCacheUUID = (OfByte) LAYOUT.select(PATH$pipelineCacheUUID);

    public static final long SIZE$headerSize = LAYOUT$headerSize.byteSize();
    public static final long SIZE$headerVersion = LAYOUT$headerVersion.byteSize();
    public static final long SIZE$vendorID = LAYOUT$vendorID.byteSize();
    public static final long SIZE$deviceID = LAYOUT$deviceID.byteSize();
    public static final long SIZE$pipelineCacheUUID = LAYOUT$pipelineCacheUUID.byteSize();

    public static final long OFFSET$headerSize = LAYOUT.byteOffset(PATH$headerSize);
    public static final long OFFSET$headerVersion = LAYOUT.byteOffset(PATH$headerVersion);
    public static final long OFFSET$vendorID = LAYOUT.byteOffset(PATH$vendorID);
    public static final long OFFSET$deviceID = LAYOUT.byteOffset(PATH$deviceID);
    public static final long OFFSET$pipelineCacheUUID = LAYOUT.byteOffset(PATH$pipelineCacheUUID);
}
