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

/// Represents a pointer to a {@code StdVideoEncodeAV1ReferenceInfo} structure in native memory.
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
public record StdVideoEncodeAV1ReferenceInfo(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeAV1ReferenceInfo allocate(Arena arena) {
        return new StdVideoEncodeAV1ReferenceInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeAV1ReferenceInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeAV1ReferenceInfo[] ret = new StdVideoEncodeAV1ReferenceInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeAV1ReferenceInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeAV1ReferenceInfo clone(Arena arena, StdVideoEncodeAV1ReferenceInfo src) {
        StdVideoEncodeAV1ReferenceInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeAV1ReferenceInfo[] clone(Arena arena, StdVideoEncodeAV1ReferenceInfo[] src) {
        StdVideoEncodeAV1ReferenceInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoEncodeAV1ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("RefFrameId"),
        ValueLayout.JAVA_INT.withName("frame_type"),
        ValueLayout.JAVA_BYTE.withName("OrderHint"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeAV1ExtensionHeader.LAYOUT).withName("pExtensionHeader")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$RefFrameId = PathElement.groupElement("PATH$RefFrameId");
    public static final PathElement PATH$frame_type = PathElement.groupElement("PATH$frame_type");
    public static final PathElement PATH$OrderHint = PathElement.groupElement("PATH$OrderHint");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$pExtensionHeader = PathElement.groupElement("PATH$pExtensionHeader");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$RefFrameId = (OfInt) LAYOUT.select(PATH$RefFrameId);
    public static final OfInt LAYOUT$frame_type = (OfInt) LAYOUT.select(PATH$frame_type);
    public static final OfByte LAYOUT$OrderHint = (OfByte) LAYOUT.select(PATH$OrderHint);
    public static final OfByte LAYOUT$reserved1 = (OfByte) LAYOUT.select(PATH$reserved1);
    public static final AddressLayout LAYOUT$pExtensionHeader = (AddressLayout) LAYOUT.select(PATH$pExtensionHeader);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$RefFrameId = LAYOUT$RefFrameId.byteSize();
    public static final long SIZE$frame_type = LAYOUT$frame_type.byteSize();
    public static final long SIZE$OrderHint = LAYOUT$OrderHint.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$pExtensionHeader = LAYOUT$pExtensionHeader.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$RefFrameId = LAYOUT.byteOffset(PATH$RefFrameId);
    public static final long OFFSET$frame_type = LAYOUT.byteOffset(PATH$frame_type);
    public static final long OFFSET$OrderHint = LAYOUT.byteOffset(PATH$OrderHint);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$pExtensionHeader = LAYOUT.byteOffset(PATH$pExtensionHeader);

    public StdVideoEncodeAV1ReferenceInfoFlags flags() {
        return new StdVideoEncodeAV1ReferenceInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoEncodeAV1ReferenceInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned int RefFrameId() {
        return segment.get(LAYOUT$RefFrameId, OFFSET$RefFrameId);
    }

    public void RefFrameId(@unsigned int value) {
        segment.set(LAYOUT$RefFrameId, OFFSET$RefFrameId, value);
    }

    public @enumtype(StdVideoAV1FrameType.class) int frame_type() {
        return segment.get(LAYOUT$frame_type, OFFSET$frame_type);
    }

    public void frame_type(@enumtype(StdVideoAV1FrameType.class) int value) {
        segment.set(LAYOUT$frame_type, OFFSET$frame_type, value);
    }

    public @unsigned byte OrderHint() {
        return segment.get(LAYOUT$OrderHint, OFFSET$OrderHint);
    }

    public void OrderHint(@unsigned byte value) {
        segment.set(LAYOUT$OrderHint, OFFSET$OrderHint, value);
    }

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @pointer(comment="StdVideoEncodeAV1ExtensionHeader*") MemorySegment pExtensionHeaderRaw() {
        return segment.get(LAYOUT$pExtensionHeader, OFFSET$pExtensionHeader);
    }

    public void pExtensionHeaderRaw(@pointer(comment="StdVideoEncodeAV1ExtensionHeader*") MemorySegment value) {
        segment.set(LAYOUT$pExtensionHeader, OFFSET$pExtensionHeader, value);
    }

    public @Nullable StdVideoEncodeAV1ExtensionHeader pExtensionHeader() {
        MemorySegment s = pExtensionHeaderRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoEncodeAV1ExtensionHeader(s);
    }

    public void pExtensionHeader(@Nullable StdVideoEncodeAV1ExtensionHeader value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pExtensionHeaderRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeAV1ExtensionHeader[] pExtensionHeader(int assumedCount) {
        MemorySegment s = pExtensionHeaderRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeAV1ExtensionHeader.SIZE);
        StdVideoEncodeAV1ExtensionHeader[] ret = new StdVideoEncodeAV1ExtensionHeader[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeAV1ExtensionHeader(s.asSlice(i * StdVideoEncodeAV1ExtensionHeader.SIZE, StdVideoEncodeAV1ExtensionHeader.SIZE));
        }
        return ret;
    }

}
