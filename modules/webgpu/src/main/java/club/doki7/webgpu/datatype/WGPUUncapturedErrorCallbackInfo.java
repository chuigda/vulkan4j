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

/// Represents a pointer to a {@code WGPUUncapturedErrorCallbackInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUUncapturedErrorCallbackInfo {
///     WGPUChainedStruct const* nextInChain; // optional // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     WGPUCallbackMode mode; // @link substring="WGPUCallbackMode" target="WGPUCallbackMode" @link substring="mode" target="#mode"
///     WGPUUncapturedErrorCallback callback; // optional // @link substring="callback" target="#callback"
///     void* userdata1; // optional // @link substring="userdata1" target="#userdata1"
///     void* userdata2; // optional // @link substring="userdata2" target="#userdata2"
/// } WGPUUncapturedErrorCallbackInfo;
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
public record WGPUUncapturedErrorCallbackInfo(@NotNull MemorySegment segment) implements IWGPUUncapturedErrorCallbackInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUUncapturedErrorCallbackInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUUncapturedErrorCallbackInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUUncapturedErrorCallbackInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUUncapturedErrorCallbackInfo, Iterable<WGPUUncapturedErrorCallbackInfo> {
        public long size() {
            return segment.byteSize() / WGPUUncapturedErrorCallbackInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUUncapturedErrorCallbackInfo at(long index) {
            return new WGPUUncapturedErrorCallbackInfo(segment.asSlice(index * WGPUUncapturedErrorCallbackInfo.BYTES, WGPUUncapturedErrorCallbackInfo.BYTES));
        }

        public WGPUUncapturedErrorCallbackInfo.Ptr at(long index, @NotNull Consumer<@NotNull WGPUUncapturedErrorCallbackInfo> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUUncapturedErrorCallbackInfo value) {
            MemorySegment s = segment.asSlice(index * WGPUUncapturedErrorCallbackInfo.BYTES, WGPUUncapturedErrorCallbackInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUUncapturedErrorCallbackInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUUncapturedErrorCallbackInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUUncapturedErrorCallbackInfo.BYTES,
                (end - start) * WGPUUncapturedErrorCallbackInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUUncapturedErrorCallbackInfo.BYTES));
        }

        public WGPUUncapturedErrorCallbackInfo[] toArray() {
            WGPUUncapturedErrorCallbackInfo[] ret = new WGPUUncapturedErrorCallbackInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUUncapturedErrorCallbackInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUUncapturedErrorCallbackInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUUncapturedErrorCallbackInfo.BYTES;
            }

            @Override
            public WGPUUncapturedErrorCallbackInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUUncapturedErrorCallbackInfo ret = new WGPUUncapturedErrorCallbackInfo(segment.asSlice(0, WGPUUncapturedErrorCallbackInfo.BYTES));
                segment = segment.asSlice(WGPUUncapturedErrorCallbackInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUUncapturedErrorCallbackInfo allocate(Arena arena) {
        return new WGPUUncapturedErrorCallbackInfo(arena.allocate(LAYOUT));
    }

    public static WGPUUncapturedErrorCallbackInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUUncapturedErrorCallbackInfo.Ptr(segment);
    }

    public static WGPUUncapturedErrorCallbackInfo clone(Arena arena, WGPUUncapturedErrorCallbackInfo src) {
        WGPUUncapturedErrorCallbackInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPUUncapturedErrorCallbackInfo nextInChain(@Nullable IWGPUChainedStruct value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextInChainRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUChainedStruct.Ptr nextInChain(int assumedCount) {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUChainedStruct.BYTES);
        return new WGPUChainedStruct.Ptr(s);
    }

    public @Nullable WGPUChainedStruct nextInChain() {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUChainedStruct(s);
    }

    public @Pointer(target=WGPUChainedStruct.class) @NotNull MemorySegment nextInChainRaw() {
        return segment.get(LAYOUT$nextInChain, OFFSET$nextInChain);
    }

    public void nextInChainRaw(@Pointer(target=WGPUChainedStruct.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$nextInChain, OFFSET$nextInChain, value);
    }

    public @EnumType(WGPUCallbackMode.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public WGPUUncapturedErrorCallbackInfo mode(@EnumType(WGPUCallbackMode.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
        return this;
    }

    public @Pointer(comment="WGPUUncapturedErrorCallback") @NotNull MemorySegment callback() {
        return segment.get(LAYOUT$callback, OFFSET$callback);
    }

    public WGPUUncapturedErrorCallbackInfo callback(@Pointer(comment="WGPUUncapturedErrorCallback") @NotNull MemorySegment value) {
        segment.set(LAYOUT$callback, OFFSET$callback, value);
        return this;
    }

    public WGPUUncapturedErrorCallbackInfo callback(@NotNull WGPUUncapturedErrorCallback value) {
        return callback(WGPUUncapturedErrorCallback.ofNative(value));
    }

    public WGPUUncapturedErrorCallbackInfo callback(@NotNull Arena arena, @NotNull WGPUUncapturedErrorCallback value) {
        return callback(WGPUUncapturedErrorCallback.ofNative(arena, value));
    }

    public WGPUUncapturedErrorCallbackInfo callback(@Nullable IPointer pointer) {
        callback(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment userdata1() {
        return segment.get(LAYOUT$userdata1, OFFSET$userdata1);
    }

    public WGPUUncapturedErrorCallbackInfo userdata1(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$userdata1, OFFSET$userdata1, value);
        return this;
    }

    public WGPUUncapturedErrorCallbackInfo userdata1(@Nullable IPointer pointer) {
        userdata1(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment userdata2() {
        return segment.get(LAYOUT$userdata2, OFFSET$userdata2);
    }

    public WGPUUncapturedErrorCallbackInfo userdata2(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$userdata2, OFFSET$userdata2, value);
        return this;
    }

    public WGPUUncapturedErrorCallbackInfo userdata2(@Nullable IPointer pointer) {
        userdata2(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(WGPUChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.ADDRESS.withName("callback"),
        ValueLayout.ADDRESS.withName("userdata1"),
        ValueLayout.ADDRESS.withName("userdata2")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$mode = PathElement.groupElement("mode");
    public static final PathElement PATH$callback = PathElement.groupElement("callback");
    public static final PathElement PATH$userdata1 = PathElement.groupElement("userdata1");
    public static final PathElement PATH$userdata2 = PathElement.groupElement("userdata2");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);
    public static final AddressLayout LAYOUT$callback = (AddressLayout) LAYOUT.select(PATH$callback);
    public static final AddressLayout LAYOUT$userdata1 = (AddressLayout) LAYOUT.select(PATH$userdata1);
    public static final AddressLayout LAYOUT$userdata2 = (AddressLayout) LAYOUT.select(PATH$userdata2);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();
    public static final long SIZE$callback = LAYOUT$callback.byteSize();
    public static final long SIZE$userdata1 = LAYOUT$userdata1.byteSize();
    public static final long SIZE$userdata2 = LAYOUT$userdata2.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
    public static final long OFFSET$callback = LAYOUT.byteOffset(PATH$callback);
    public static final long OFFSET$userdata1 = LAYOUT.byteOffset(PATH$userdata1);
    public static final long OFFSET$userdata2 = LAYOUT.byteOffset(PATH$userdata2);
}
