package club.doki7.webgpu.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.webgpu.bitmask.*;
import club.doki7.webgpu.handle.*;
import club.doki7.webgpu.enumtype.*;
import static club.doki7.webgpu.WGPUConstants.*;
import club.doki7.webgpu.WGPUFunctionTypes.*;

/// Represents a pointer to a {@code WGPURegistryReport} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPURegistryReport {
///     size_t numAllocated; // @link substring="numAllocated" target="#numAllocated"
///     size_t numKeptFromUser; // @link substring="numKeptFromUser" target="#numKeptFromUser"
///     size_t numReleasedFromUser; // @link substring="numReleasedFromUser" target="#numReleasedFromUser"
///     size_t elementSize; // @link substring="elementSize" target="#elementSize"
/// } WGPURegistryReport;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record WGPURegistryReport(@NotNull MemorySegment segment) implements IWGPURegistryReport {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPURegistryReport}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPURegistryReport to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPURegistryReport.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPURegistryReport, Iterable<WGPURegistryReport> {
        public long size() {
            return segment.byteSize() / WGPURegistryReport.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPURegistryReport at(long index) {
            return new WGPURegistryReport(segment.asSlice(index * WGPURegistryReport.BYTES, WGPURegistryReport.BYTES));
        }

        public WGPURegistryReport.Ptr at(long index, @NotNull Consumer<@NotNull WGPURegistryReport> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPURegistryReport value) {
            MemorySegment s = segment.asSlice(index * WGPURegistryReport.BYTES, WGPURegistryReport.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * WGPURegistryReport.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPURegistryReport.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPURegistryReport.BYTES,
                (end - start) * WGPURegistryReport.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPURegistryReport.BYTES));
        }

        public WGPURegistryReport[] toArray() {
            WGPURegistryReport[] ret = new WGPURegistryReport[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPURegistryReport> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPURegistryReport> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPURegistryReport.BYTES;
            }

            @Override
            public WGPURegistryReport next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPURegistryReport ret = new WGPURegistryReport(segment.asSlice(0, WGPURegistryReport.BYTES));
                segment = segment.asSlice(WGPURegistryReport.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPURegistryReport allocate(Arena arena) {
        return new WGPURegistryReport(arena.allocate(LAYOUT));
    }

    public static WGPURegistryReport.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPURegistryReport.Ptr(segment);
    }

    public static WGPURegistryReport clone(Arena arena, WGPURegistryReport src) {
        WGPURegistryReport ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Unsigned long numAllocated() {
        return NativeLayout.readCSizeT(segment, OFFSET$numAllocated);
    }

    public WGPURegistryReport numAllocated(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$numAllocated, value);
        return this;
    }

    public @Unsigned long numKeptFromUser() {
        return NativeLayout.readCSizeT(segment, OFFSET$numKeptFromUser);
    }

    public WGPURegistryReport numKeptFromUser(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$numKeptFromUser, value);
        return this;
    }

    public @Unsigned long numReleasedFromUser() {
        return NativeLayout.readCSizeT(segment, OFFSET$numReleasedFromUser);
    }

    public WGPURegistryReport numReleasedFromUser(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$numReleasedFromUser, value);
        return this;
    }

    public @Unsigned long elementSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$elementSize);
    }

    public WGPURegistryReport elementSize(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$elementSize, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        NativeLayout.C_SIZE_T.withName("numAllocated"),
        NativeLayout.C_SIZE_T.withName("numKeptFromUser"),
        NativeLayout.C_SIZE_T.withName("numReleasedFromUser"),
        NativeLayout.C_SIZE_T.withName("elementSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$numAllocated = PathElement.groupElement("numAllocated");
    public static final PathElement PATH$numKeptFromUser = PathElement.groupElement("numKeptFromUser");
    public static final PathElement PATH$numReleasedFromUser = PathElement.groupElement("numReleasedFromUser");
    public static final PathElement PATH$elementSize = PathElement.groupElement("elementSize");


    public static final long SIZE$numAllocated = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$numKeptFromUser = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$numReleasedFromUser = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$elementSize = NativeLayout.C_SIZE_T.byteSize();

    public static final long OFFSET$numAllocated = LAYOUT.byteOffset(PATH$numAllocated);
    public static final long OFFSET$numKeptFromUser = LAYOUT.byteOffset(PATH$numKeptFromUser);
    public static final long OFFSET$numReleasedFromUser = LAYOUT.byteOffset(PATH$numReleasedFromUser);
    public static final long OFFSET$elementSize = LAYOUT.byteOffset(PATH$elementSize);
}
