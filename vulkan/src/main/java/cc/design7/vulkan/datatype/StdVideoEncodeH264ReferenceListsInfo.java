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

/// Represents a pointer to a {@code StdVideoEncodeH264ReferenceListsInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH264ReferenceListsInfo {
///     StdVideoEncodeH264ReferenceListsInfoFlags flags;
///     uint8_t num_ref_idx_l0_active_minus1;
///     uint8_t num_ref_idx_l1_active_minus1;
///     uint8_t RefPicList0;
///     uint8_t RefPicList1;
///     uint8_t refList0ModOpCount;
///     uint8_t refList1ModOpCount;
///     uint8_t refPicMarkingOpCount;
///     uint8_t reserved1;
///     StdVideoEncodeH264RefListModEntry const* pRefList0ModOperations;
///     StdVideoEncodeH264RefListModEntry const* pRefList1ModOperations;
///     StdVideoEncodeH264RefPicMarkingEntry const* pRefPicMarkingOperations;
/// } StdVideoEncodeH264ReferenceListsInfo;
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
public record StdVideoEncodeH264ReferenceListsInfo(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeH264ReferenceListsInfo allocate(Arena arena) {
        StdVideoEncodeH264ReferenceListsInfo ret = new StdVideoEncodeH264ReferenceListsInfo(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoEncodeH264ReferenceListsInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264ReferenceListsInfo[] ret = new StdVideoEncodeH264ReferenceListsInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264ReferenceListsInfo(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoEncodeH264ReferenceListsInfo clone(Arena arena, StdVideoEncodeH264ReferenceListsInfo src) {
        StdVideoEncodeH264ReferenceListsInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264ReferenceListsInfo[] clone(Arena arena, StdVideoEncodeH264ReferenceListsInfo[] src) {
        StdVideoEncodeH264ReferenceListsInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public StdVideoEncodeH264ReferenceListsInfoFlags flags() {
        return new StdVideoEncodeH264ReferenceListsInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoEncodeH264ReferenceListsInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte num_ref_idx_l0_active_minus1() {
        return segment.get(LAYOUT$num_ref_idx_l0_active_minus1, OFFSET$num_ref_idx_l0_active_minus1);
    }

    public void num_ref_idx_l0_active_minus1(@unsigned byte value) {
        segment.set(LAYOUT$num_ref_idx_l0_active_minus1, OFFSET$num_ref_idx_l0_active_minus1, value);
    }

    public @unsigned byte num_ref_idx_l1_active_minus1() {
        return segment.get(LAYOUT$num_ref_idx_l1_active_minus1, OFFSET$num_ref_idx_l1_active_minus1);
    }

    public void num_ref_idx_l1_active_minus1(@unsigned byte value) {
        segment.set(LAYOUT$num_ref_idx_l1_active_minus1, OFFSET$num_ref_idx_l1_active_minus1, value);
    }

    public @unsigned byte RefPicList0() {
        return segment.get(LAYOUT$RefPicList0, OFFSET$RefPicList0);
    }

    public void RefPicList0(@unsigned byte value) {
        segment.set(LAYOUT$RefPicList0, OFFSET$RefPicList0, value);
    }

    public @unsigned byte RefPicList1() {
        return segment.get(LAYOUT$RefPicList1, OFFSET$RefPicList1);
    }

    public void RefPicList1(@unsigned byte value) {
        segment.set(LAYOUT$RefPicList1, OFFSET$RefPicList1, value);
    }

    public @unsigned byte refList0ModOpCount() {
        return segment.get(LAYOUT$refList0ModOpCount, OFFSET$refList0ModOpCount);
    }

    public void refList0ModOpCount(@unsigned byte value) {
        segment.set(LAYOUT$refList0ModOpCount, OFFSET$refList0ModOpCount, value);
    }

    public @unsigned byte refList1ModOpCount() {
        return segment.get(LAYOUT$refList1ModOpCount, OFFSET$refList1ModOpCount);
    }

    public void refList1ModOpCount(@unsigned byte value) {
        segment.set(LAYOUT$refList1ModOpCount, OFFSET$refList1ModOpCount, value);
    }

    public @unsigned byte refPicMarkingOpCount() {
        return segment.get(LAYOUT$refPicMarkingOpCount, OFFSET$refPicMarkingOpCount);
    }

    public void refPicMarkingOpCount(@unsigned byte value) {
        segment.set(LAYOUT$refPicMarkingOpCount, OFFSET$refPicMarkingOpCount, value);
    }

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @pointer(comment="StdVideoEncodeH264RefListModEntry*") MemorySegment pRefList0ModOperationsRaw() {
        return segment.get(LAYOUT$pRefList0ModOperations, OFFSET$pRefList0ModOperations);
    }

    public void pRefList0ModOperationsRaw(@pointer(comment="StdVideoEncodeH264RefListModEntry*") MemorySegment value) {
        segment.set(LAYOUT$pRefList0ModOperations, OFFSET$pRefList0ModOperations, value);
    }

    public @Nullable StdVideoEncodeH264RefListModEntry pRefList0ModOperations() {
        MemorySegment s = pRefList0ModOperationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoEncodeH264RefListModEntry(s);
    }

    public void pRefList0ModOperations(@Nullable StdVideoEncodeH264RefListModEntry value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRefList0ModOperationsRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeH264RefListModEntry[] pRefList0ModOperations(int assumedCount) {
        MemorySegment s = pRefList0ModOperationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH264RefListModEntry.BYTES);
        StdVideoEncodeH264RefListModEntry[] ret = new StdVideoEncodeH264RefListModEntry[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH264RefListModEntry(s.asSlice(i * StdVideoEncodeH264RefListModEntry.BYTES, StdVideoEncodeH264RefListModEntry.BYTES));
        }
        return ret;
    }

    public @pointer(comment="StdVideoEncodeH264RefListModEntry*") MemorySegment pRefList1ModOperationsRaw() {
        return segment.get(LAYOUT$pRefList1ModOperations, OFFSET$pRefList1ModOperations);
    }

    public void pRefList1ModOperationsRaw(@pointer(comment="StdVideoEncodeH264RefListModEntry*") MemorySegment value) {
        segment.set(LAYOUT$pRefList1ModOperations, OFFSET$pRefList1ModOperations, value);
    }

    public @Nullable StdVideoEncodeH264RefListModEntry pRefList1ModOperations() {
        MemorySegment s = pRefList1ModOperationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoEncodeH264RefListModEntry(s);
    }

    public void pRefList1ModOperations(@Nullable StdVideoEncodeH264RefListModEntry value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRefList1ModOperationsRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeH264RefListModEntry[] pRefList1ModOperations(int assumedCount) {
        MemorySegment s = pRefList1ModOperationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH264RefListModEntry.BYTES);
        StdVideoEncodeH264RefListModEntry[] ret = new StdVideoEncodeH264RefListModEntry[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH264RefListModEntry(s.asSlice(i * StdVideoEncodeH264RefListModEntry.BYTES, StdVideoEncodeH264RefListModEntry.BYTES));
        }
        return ret;
    }

    public @pointer(comment="StdVideoEncodeH264RefPicMarkingEntry*") MemorySegment pRefPicMarkingOperationsRaw() {
        return segment.get(LAYOUT$pRefPicMarkingOperations, OFFSET$pRefPicMarkingOperations);
    }

    public void pRefPicMarkingOperationsRaw(@pointer(comment="StdVideoEncodeH264RefPicMarkingEntry*") MemorySegment value) {
        segment.set(LAYOUT$pRefPicMarkingOperations, OFFSET$pRefPicMarkingOperations, value);
    }

    public @Nullable StdVideoEncodeH264RefPicMarkingEntry pRefPicMarkingOperations() {
        MemorySegment s = pRefPicMarkingOperationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoEncodeH264RefPicMarkingEntry(s);
    }

    public void pRefPicMarkingOperations(@Nullable StdVideoEncodeH264RefPicMarkingEntry value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRefPicMarkingOperationsRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeH264RefPicMarkingEntry[] pRefPicMarkingOperations(int assumedCount) {
        MemorySegment s = pRefPicMarkingOperationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH264RefPicMarkingEntry.BYTES);
        StdVideoEncodeH264RefPicMarkingEntry[] ret = new StdVideoEncodeH264RefPicMarkingEntry[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH264RefPicMarkingEntry(s.asSlice(i * StdVideoEncodeH264RefPicMarkingEntry.BYTES, StdVideoEncodeH264RefPicMarkingEntry.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoEncodeH264ReferenceListsInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l0_active_minus1"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l1_active_minus1"),
        ValueLayout.JAVA_BYTE.withName("RefPicList0"),
        ValueLayout.JAVA_BYTE.withName("RefPicList1"),
        ValueLayout.JAVA_BYTE.withName("refList0ModOpCount"),
        ValueLayout.JAVA_BYTE.withName("refList1ModOpCount"),
        ValueLayout.JAVA_BYTE.withName("refPicMarkingOpCount"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH264RefListModEntry.LAYOUT).withName("pRefList0ModOperations"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH264RefListModEntry.LAYOUT).withName("pRefList1ModOperations"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH264RefPicMarkingEntry.LAYOUT).withName("pRefPicMarkingOperations")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$num_ref_idx_l0_active_minus1 = PathElement.groupElement("PATH$num_ref_idx_l0_active_minus1");
    public static final PathElement PATH$num_ref_idx_l1_active_minus1 = PathElement.groupElement("PATH$num_ref_idx_l1_active_minus1");
    public static final PathElement PATH$RefPicList0 = PathElement.groupElement("PATH$RefPicList0");
    public static final PathElement PATH$RefPicList1 = PathElement.groupElement("PATH$RefPicList1");
    public static final PathElement PATH$refList0ModOpCount = PathElement.groupElement("PATH$refList0ModOpCount");
    public static final PathElement PATH$refList1ModOpCount = PathElement.groupElement("PATH$refList1ModOpCount");
    public static final PathElement PATH$refPicMarkingOpCount = PathElement.groupElement("PATH$refPicMarkingOpCount");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$pRefList0ModOperations = PathElement.groupElement("PATH$pRefList0ModOperations");
    public static final PathElement PATH$pRefList1ModOperations = PathElement.groupElement("PATH$pRefList1ModOperations");
    public static final PathElement PATH$pRefPicMarkingOperations = PathElement.groupElement("PATH$pRefPicMarkingOperations");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfByte LAYOUT$num_ref_idx_l0_active_minus1 = (OfByte) LAYOUT.select(PATH$num_ref_idx_l0_active_minus1);
    public static final OfByte LAYOUT$num_ref_idx_l1_active_minus1 = (OfByte) LAYOUT.select(PATH$num_ref_idx_l1_active_minus1);
    public static final OfByte LAYOUT$RefPicList0 = (OfByte) LAYOUT.select(PATH$RefPicList0);
    public static final OfByte LAYOUT$RefPicList1 = (OfByte) LAYOUT.select(PATH$RefPicList1);
    public static final OfByte LAYOUT$refList0ModOpCount = (OfByte) LAYOUT.select(PATH$refList0ModOpCount);
    public static final OfByte LAYOUT$refList1ModOpCount = (OfByte) LAYOUT.select(PATH$refList1ModOpCount);
    public static final OfByte LAYOUT$refPicMarkingOpCount = (OfByte) LAYOUT.select(PATH$refPicMarkingOpCount);
    public static final OfByte LAYOUT$reserved1 = (OfByte) LAYOUT.select(PATH$reserved1);
    public static final AddressLayout LAYOUT$pRefList0ModOperations = (AddressLayout) LAYOUT.select(PATH$pRefList0ModOperations);
    public static final AddressLayout LAYOUT$pRefList1ModOperations = (AddressLayout) LAYOUT.select(PATH$pRefList1ModOperations);
    public static final AddressLayout LAYOUT$pRefPicMarkingOperations = (AddressLayout) LAYOUT.select(PATH$pRefPicMarkingOperations);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$num_ref_idx_l0_active_minus1 = LAYOUT$num_ref_idx_l0_active_minus1.byteSize();
    public static final long SIZE$num_ref_idx_l1_active_minus1 = LAYOUT$num_ref_idx_l1_active_minus1.byteSize();
    public static final long SIZE$RefPicList0 = LAYOUT$RefPicList0.byteSize();
    public static final long SIZE$RefPicList1 = LAYOUT$RefPicList1.byteSize();
    public static final long SIZE$refList0ModOpCount = LAYOUT$refList0ModOpCount.byteSize();
    public static final long SIZE$refList1ModOpCount = LAYOUT$refList1ModOpCount.byteSize();
    public static final long SIZE$refPicMarkingOpCount = LAYOUT$refPicMarkingOpCount.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$pRefList0ModOperations = LAYOUT$pRefList0ModOperations.byteSize();
    public static final long SIZE$pRefList1ModOperations = LAYOUT$pRefList1ModOperations.byteSize();
    public static final long SIZE$pRefPicMarkingOperations = LAYOUT$pRefPicMarkingOperations.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$num_ref_idx_l0_active_minus1 = LAYOUT.byteOffset(PATH$num_ref_idx_l0_active_minus1);
    public static final long OFFSET$num_ref_idx_l1_active_minus1 = LAYOUT.byteOffset(PATH$num_ref_idx_l1_active_minus1);
    public static final long OFFSET$RefPicList0 = LAYOUT.byteOffset(PATH$RefPicList0);
    public static final long OFFSET$RefPicList1 = LAYOUT.byteOffset(PATH$RefPicList1);
    public static final long OFFSET$refList0ModOpCount = LAYOUT.byteOffset(PATH$refList0ModOpCount);
    public static final long OFFSET$refList1ModOpCount = LAYOUT.byteOffset(PATH$refList1ModOpCount);
    public static final long OFFSET$refPicMarkingOpCount = LAYOUT.byteOffset(PATH$refPicMarkingOpCount);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$pRefList0ModOperations = LAYOUT.byteOffset(PATH$pRefList0ModOperations);
    public static final long OFFSET$pRefList1ModOperations = LAYOUT.byteOffset(PATH$pRefList1ModOperations);
    public static final long OFFSET$pRefPicMarkingOperations = LAYOUT.byteOffset(PATH$pRefPicMarkingOperations);
}
