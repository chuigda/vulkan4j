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

/// Represents a pointer to a {@code FragmentState} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct FragmentState {
///     ShaderModule module; // @link substring="WGPUShaderModule" target="WGPUShaderModule" @link substring="module" target="#module"
///     StringView entryPoint; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="entryPoint" target="#entryPoint"
///     size_t constantCount; // @link substring="constantCount" target="#constantCount"
///     ConstantEntry const* constants; // @link substring="WGPUConstantEntry" target="WGPUConstantEntry" @link substring="constants" target="#constants"
///     size_t targetCount; // @link substring="targetCount" target="#targetCount"
///     ColorTargetState const* targets; // @link substring="WGPUColorTargetState" target="WGPUColorTargetState" @link substring="targets" target="#targets"
/// } FragmentState;
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
public record WGPUFragmentState(@NotNull MemorySegment segment) implements IWGPUFragmentState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUFragmentState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUFragmentState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUFragmentState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUFragmentState, Iterable<WGPUFragmentState> {
        public long size() {
            return segment.byteSize() / WGPUFragmentState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUFragmentState at(long index) {
            return new WGPUFragmentState(segment.asSlice(index * WGPUFragmentState.BYTES, WGPUFragmentState.BYTES));
        }

        public WGPUFragmentState.Ptr at(long index, @NotNull Consumer<@NotNull WGPUFragmentState> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUFragmentState value) {
            MemorySegment s = segment.asSlice(index * WGPUFragmentState.BYTES, WGPUFragmentState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUFragmentState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUFragmentState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUFragmentState.BYTES,
                (end - start) * WGPUFragmentState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUFragmentState.BYTES));
        }

        public WGPUFragmentState[] toArray() {
            WGPUFragmentState[] ret = new WGPUFragmentState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUFragmentState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUFragmentState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUFragmentState.BYTES;
            }

            @Override
            public WGPUFragmentState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUFragmentState ret = new WGPUFragmentState(segment.asSlice(0, WGPUFragmentState.BYTES));
                segment = segment.asSlice(WGPUFragmentState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUFragmentState allocate(Arena arena) {
        return new WGPUFragmentState(arena.allocate(LAYOUT));
    }

    public static WGPUFragmentState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUFragmentState.Ptr(segment);
    }

    public static WGPUFragmentState clone(Arena arena, WGPUFragmentState src) {
        WGPUFragmentState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable WGPUShaderModule module() {
        MemorySegment s = segment.asSlice(OFFSET$module, SIZE$module);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUShaderModule(s);
    }

    public WGPUFragmentState module(@Nullable WGPUShaderModule value) {
        segment.set(LAYOUT$module, OFFSET$module, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull WGPUStringView entryPoint() {
        return new WGPUStringView(segment.asSlice(OFFSET$entryPoint, LAYOUT$entryPoint));
    }

    public WGPUFragmentState entryPoint(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$entryPoint, SIZE$entryPoint);
        return this;
    }

    public WGPUFragmentState entryPoint(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(entryPoint());
        return this;
    }

    public @Unsigned long constantCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$constantCount);
    }

    public WGPUFragmentState constantCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$constantCount, value);
        return this;
    }

    public WGPUFragmentState constants(@Nullable IWGPUConstantEntry value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        constantsRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUConstantEntry.Ptr constants(int assumedCount) {
        MemorySegment s = constantsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUConstantEntry.BYTES);
        return new WGPUConstantEntry.Ptr(s);
    }

    public @Nullable WGPUConstantEntry constants() {
        MemorySegment s = constantsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUConstantEntry(s);
    }

    public @Pointer(target=WGPUConstantEntry.class) @NotNull MemorySegment constantsRaw() {
        return segment.get(LAYOUT$constants, OFFSET$constants);
    }

    public void constantsRaw(@Pointer(target=WGPUConstantEntry.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$constants, OFFSET$constants, value);
    }

    public @Unsigned long targetCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$targetCount);
    }

    public WGPUFragmentState targetCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$targetCount, value);
        return this;
    }

    public WGPUFragmentState targets(@Nullable IWGPUColorTargetState value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        targetsRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUColorTargetState.Ptr targets(int assumedCount) {
        MemorySegment s = targetsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUColorTargetState.BYTES);
        return new WGPUColorTargetState.Ptr(s);
    }

    public @Nullable WGPUColorTargetState targets() {
        MemorySegment s = targetsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUColorTargetState(s);
    }

    public @Pointer(target=WGPUColorTargetState.class) @NotNull MemorySegment targetsRaw() {
        return segment.get(LAYOUT$targets, OFFSET$targets);
    }

    public void targetsRaw(@Pointer(target=WGPUColorTargetState.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$targets, OFFSET$targets, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("module"),
        WGPUStringView.LAYOUT.withName("entryPoint"),
        NativeLayout.C_SIZE_T.withName("constantCount"),
        ValueLayout.ADDRESS.withTargetLayout(WGPUConstantEntry.LAYOUT).withName("constants"),
        NativeLayout.C_SIZE_T.withName("targetCount"),
        ValueLayout.ADDRESS.withTargetLayout(WGPUColorTargetState.LAYOUT).withName("targets")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$module = PathElement.groupElement("module");
    public static final PathElement PATH$entryPoint = PathElement.groupElement("entryPoint");
    public static final PathElement PATH$constantCount = PathElement.groupElement("constantCount");
    public static final PathElement PATH$constants = PathElement.groupElement("constants");
    public static final PathElement PATH$targetCount = PathElement.groupElement("targetCount");
    public static final PathElement PATH$targets = PathElement.groupElement("targets");

    public static final AddressLayout LAYOUT$module = (AddressLayout) LAYOUT.select(PATH$module);
    public static final StructLayout LAYOUT$entryPoint = (StructLayout) LAYOUT.select(PATH$entryPoint);
    public static final AddressLayout LAYOUT$constants = (AddressLayout) LAYOUT.select(PATH$constants);
    public static final AddressLayout LAYOUT$targets = (AddressLayout) LAYOUT.select(PATH$targets);

    public static final long SIZE$module = LAYOUT$module.byteSize();
    public static final long SIZE$entryPoint = LAYOUT$entryPoint.byteSize();
    public static final long SIZE$constantCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$constants = LAYOUT$constants.byteSize();
    public static final long SIZE$targetCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$targets = LAYOUT$targets.byteSize();

    public static final long OFFSET$module = LAYOUT.byteOffset(PATH$module);
    public static final long OFFSET$entryPoint = LAYOUT.byteOffset(PATH$entryPoint);
    public static final long OFFSET$constantCount = LAYOUT.byteOffset(PATH$constantCount);
    public static final long OFFSET$constants = LAYOUT.byteOffset(PATH$constants);
    public static final long OFFSET$targetCount = LAYOUT.byteOffset(PATH$targetCount);
    public static final long OFFSET$targets = LAYOUT.byteOffset(PATH$targets);
}
