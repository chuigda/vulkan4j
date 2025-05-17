package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoAV1Segmentation} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1Segmentation {
///     uint8_t FeatureEnabled;
///     int16_t FeatureData;
/// } StdVideoAV1Segmentation;
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
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoAV1Segmentation(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1Segmentation allocate(Arena arena) {
        StdVideoAV1Segmentation ret = new StdVideoAV1Segmentation(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoAV1Segmentation[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1Segmentation[] ret = new StdVideoAV1Segmentation[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1Segmentation(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoAV1Segmentation clone(Arena arena, StdVideoAV1Segmentation src) {
        StdVideoAV1Segmentation ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1Segmentation[] clone(Arena arena, StdVideoAV1Segmentation[] src) {
        StdVideoAV1Segmentation[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned byte FeatureEnabled() {
        return segment.get(LAYOUT$FeatureEnabled, OFFSET$FeatureEnabled);
    }

    public void FeatureEnabled(@unsigned byte value) {
        segment.set(LAYOUT$FeatureEnabled, OFFSET$FeatureEnabled, value);
    }

    public short FeatureData() {
        return segment.get(LAYOUT$FeatureData, OFFSET$FeatureData);
    }

    public void FeatureData(short value) {
        segment.set(LAYOUT$FeatureData, OFFSET$FeatureData, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("FeatureEnabled"),
        ValueLayout.JAVA_SHORT.withName("FeatureData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$FeatureEnabled = PathElement.groupElement("PATH$FeatureEnabled");
    public static final PathElement PATH$FeatureData = PathElement.groupElement("PATH$FeatureData");

    public static final OfByte LAYOUT$FeatureEnabled = (OfByte) LAYOUT.select(PATH$FeatureEnabled);
    public static final OfShort LAYOUT$FeatureData = (OfShort) LAYOUT.select(PATH$FeatureData);

    public static final long SIZE$FeatureEnabled = LAYOUT$FeatureEnabled.byteSize();
    public static final long SIZE$FeatureData = LAYOUT$FeatureData.byteSize();

    public static final long OFFSET$FeatureEnabled = LAYOUT.byteOffset(PATH$FeatureEnabled);
    public static final long OFFSET$FeatureData = LAYOUT.byteOffset(PATH$FeatureData);
}
