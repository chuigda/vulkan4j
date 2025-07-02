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

/// Represents a pointer to a {@code WGPUGlobalReport} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUGlobalReport {
///     WGPURegistryReport surfaces; // @link substring="WGPURegistryReport" target="WGPURegistryReport" @link substring="surfaces" target="#surfaces"
///     WGPUHubReport hub; // @link substring="WGPUHubReport" target="WGPUHubReport" @link substring="hub" target="#hub"
/// } WGPUGlobalReport;
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
public record WGPUGlobalReport(@NotNull MemorySegment segment) implements IWGPUGlobalReport {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUGlobalReport}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUGlobalReport to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUGlobalReport.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUGlobalReport, Iterable<WGPUGlobalReport> {
        public long size() {
            return segment.byteSize() / WGPUGlobalReport.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUGlobalReport at(long index) {
            return new WGPUGlobalReport(segment.asSlice(index * WGPUGlobalReport.BYTES, WGPUGlobalReport.BYTES));
        }

        public WGPUGlobalReport.Ptr at(long index, @NotNull Consumer<@NotNull WGPUGlobalReport> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUGlobalReport value) {
            MemorySegment s = segment.asSlice(index * WGPUGlobalReport.BYTES, WGPUGlobalReport.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUGlobalReport.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUGlobalReport.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUGlobalReport.BYTES,
                (end - start) * WGPUGlobalReport.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUGlobalReport.BYTES));
        }

        public WGPUGlobalReport[] toArray() {
            WGPUGlobalReport[] ret = new WGPUGlobalReport[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUGlobalReport> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUGlobalReport> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUGlobalReport.BYTES;
            }

            @Override
            public WGPUGlobalReport next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUGlobalReport ret = new WGPUGlobalReport(segment.asSlice(0, WGPUGlobalReport.BYTES));
                segment = segment.asSlice(WGPUGlobalReport.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUGlobalReport allocate(Arena arena) {
        return new WGPUGlobalReport(arena.allocate(LAYOUT));
    }

    public static WGPUGlobalReport.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUGlobalReport.Ptr(segment);
    }

    public static WGPUGlobalReport clone(Arena arena, WGPUGlobalReport src) {
        WGPUGlobalReport ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPURegistryReport surfaces() {
        return new WGPURegistryReport(segment.asSlice(OFFSET$surfaces, LAYOUT$surfaces));
    }

    public WGPUGlobalReport surfaces(@NotNull WGPURegistryReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$surfaces, SIZE$surfaces);
        return this;
    }

    public WGPUGlobalReport surfaces(Consumer<@NotNull WGPURegistryReport> consumer) {
        consumer.accept(surfaces());
        return this;
    }

    public @NotNull WGPUHubReport hub() {
        return new WGPUHubReport(segment.asSlice(OFFSET$hub, LAYOUT$hub));
    }

    public WGPUGlobalReport hub(@NotNull WGPUHubReport value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$hub, SIZE$hub);
        return this;
    }

    public WGPUGlobalReport hub(Consumer<@NotNull WGPUHubReport> consumer) {
        consumer.accept(hub());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPURegistryReport.LAYOUT.withName("surfaces"),
        WGPUHubReport.LAYOUT.withName("hub")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$surfaces = PathElement.groupElement("surfaces");
    public static final PathElement PATH$hub = PathElement.groupElement("hub");

    public static final StructLayout LAYOUT$surfaces = (StructLayout) LAYOUT.select(PATH$surfaces);
    public static final StructLayout LAYOUT$hub = (StructLayout) LAYOUT.select(PATH$hub);

    public static final long SIZE$surfaces = LAYOUT$surfaces.byteSize();
    public static final long SIZE$hub = LAYOUT$hub.byteSize();

    public static final long OFFSET$surfaces = LAYOUT.byteOffset(PATH$surfaces);
    public static final long OFFSET$hub = LAYOUT.byteOffset(PATH$hub);
}
