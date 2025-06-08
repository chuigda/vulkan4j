package club.doki7.sdl3.datatype;

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
import club.doki7.sdl3.bitmask.*;
import club.doki7.sdl3.handle.*;
import club.doki7.sdl3.enumtype.*;
import static club.doki7.sdl3.SDL3Constants.*;

/// The structure that describes a virtual joystick.
///
/// This structure should be initialized using SDL_INIT_INTERFACE(). All
/// elements of this structure are optional.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_AttachVirtualJoystick
/// \sa SDL_INIT_INTERFACE
/// \sa SDL_VirtualJoystickSensorDesc
/// \sa SDL_VirtualJoystickTouchpadDesc
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_VirtualJoystickDesc {
///     Uint32 version; // @link substring="version" target="#version"
///     Uint16 type; // @link substring="type" target="#type"
///     Uint16 padding; // @link substring="padding" target="#padding"
///     Uint16 vendor_id; // @link substring="vendor_id" target="#vendor_id"
///     Uint16 product_id; // @link substring="product_id" target="#product_id"
///     Uint16 naxes; // @link substring="naxes" target="#naxes"
///     Uint16 nbuttons; // @link substring="nbuttons" target="#nbuttons"
///     Uint16 nballs; // @link substring="nballs" target="#nballs"
///     Uint16 nhats; // @link substring="nhats" target="#nhats"
///     Uint16 ntouchpads; // @link substring="ntouchpads" target="#ntouchpads"
///     Uint16 nsensors; // @link substring="nsensors" target="#nsensors"
///     Uint16[2] padding2; // @link substring="padding2" target="#padding2"
///     Uint32 button_mask; // @link substring="button_mask" target="#button_mask"
///     Uint32 axis_mask; // @link substring="axis_mask" target="#axis_mask"
///     char const* name; // @link substring="name" target="#name"
///     SDL_VirtualJoystickTouchpadDesc const* touchpads; // @link substring="SDL_VirtualJoystickTouchpadDesc" target="SDL_VirtualJoystickTouchpadDesc" @link substring="touchpads" target="#touchpads"
///     SDL_VirtualJoystickSensorDesc const* sensors; // @link substring="SDL_VirtualJoystickSensorDesc" target="SDL_VirtualJoystickSensorDesc" @link substring="sensors" target="#sensors"
///     void* userdata; // @link substring="userdata" target="#userdata"
///     PFN_SDL_VirtualJoystickDesc_Update Update; // optional // @link substring="Update" target="#Update"
///     PFN_SDL_VirtualJoystickDesc_SetPlayerIndex SetPlayerIndex; // optional // @link substring="SetPlayerIndex" target="#SetPlayerIndex"
///     PFN_SDL_VirtualJoystickDesc_Rumble Rumble; // optional // @link substring="Rumble" target="#Rumble"
///     PFN_SDL_VirtualJoystickDesc_RumbleTriggers RumbleTriggers; // optional // @link substring="RumbleTriggers" target="#RumbleTriggers"
///     PFN_SDL_VirtualJoystickDesc_SetLED SetLED; // optional // @link substring="SetLED" target="#SetLED"
///     PFN_SDL_VirtualJoystickDesc_SendEffect SendEffect; // optional // @link substring="SendEffect" target="#SendEffect"
///     PFN_SDL_VirtualJoystickDesc_SetSensorsEnabled SetSensorsEnabled; // optional // @link substring="SetSensorsEnabled" target="#SetSensorsEnabled"
///     PFN_SDL_VirtualJoystickDesc_Cleanup Cleanup; // optional // @link substring="Cleanup" target="#Cleanup"
/// } SDL_VirtualJoystickDesc;
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
public record SDL_VirtualJoystickDesc(@NotNull MemorySegment segment) implements ISDL_VirtualJoystickDesc {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_VirtualJoystickDesc}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_VirtualJoystickDesc to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_VirtualJoystickDesc.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_VirtualJoystickDesc, Iterable<SDL_VirtualJoystickDesc> {
        public long size() {
            return segment.byteSize() / SDL_VirtualJoystickDesc.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_VirtualJoystickDesc at(long index) {
            return new SDL_VirtualJoystickDesc(segment.asSlice(index * SDL_VirtualJoystickDesc.BYTES, SDL_VirtualJoystickDesc.BYTES));
        }

        public void write(long index, @NotNull SDL_VirtualJoystickDesc value) {
            MemorySegment s = segment.asSlice(index * SDL_VirtualJoystickDesc.BYTES, SDL_VirtualJoystickDesc.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_VirtualJoystickDesc.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_VirtualJoystickDesc.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_VirtualJoystickDesc.BYTES,
                (end - start) * SDL_VirtualJoystickDesc.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_VirtualJoystickDesc.BYTES));
        }

        public SDL_VirtualJoystickDesc[] toArray() {
            SDL_VirtualJoystickDesc[] ret = new SDL_VirtualJoystickDesc[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_VirtualJoystickDesc> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_VirtualJoystickDesc> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_VirtualJoystickDesc.BYTES;
            }

            @Override
            public SDL_VirtualJoystickDesc next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_VirtualJoystickDesc ret = new SDL_VirtualJoystickDesc(segment.asSlice(0, SDL_VirtualJoystickDesc.BYTES));
                segment = segment.asSlice(SDL_VirtualJoystickDesc.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_VirtualJoystickDesc allocate(Arena arena) {
        return new SDL_VirtualJoystickDesc(arena.allocate(LAYOUT));
    }

    public static SDL_VirtualJoystickDesc.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_VirtualJoystickDesc.Ptr(segment);
    }

    public static SDL_VirtualJoystickDesc clone(Arena arena, SDL_VirtualJoystickDesc src) {
        SDL_VirtualJoystickDesc ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint32") @Unsigned int version() {
        return segment.get(LAYOUT$version, OFFSET$version);
    }

    public SDL_VirtualJoystickDesc version(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$version, OFFSET$version, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_VirtualJoystickDesc type(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short padding() {
        return segment.get(LAYOUT$padding, OFFSET$padding);
    }

    public SDL_VirtualJoystickDesc padding(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$padding, OFFSET$padding, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short vendor_id() {
        return segment.get(LAYOUT$vendor_id, OFFSET$vendor_id);
    }

    public SDL_VirtualJoystickDesc vendor_id(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$vendor_id, OFFSET$vendor_id, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short product_id() {
        return segment.get(LAYOUT$product_id, OFFSET$product_id);
    }

    public SDL_VirtualJoystickDesc product_id(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$product_id, OFFSET$product_id, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short naxes() {
        return segment.get(LAYOUT$naxes, OFFSET$naxes);
    }

    public SDL_VirtualJoystickDesc naxes(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$naxes, OFFSET$naxes, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short nbuttons() {
        return segment.get(LAYOUT$nbuttons, OFFSET$nbuttons);
    }

    public SDL_VirtualJoystickDesc nbuttons(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$nbuttons, OFFSET$nbuttons, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short nballs() {
        return segment.get(LAYOUT$nballs, OFFSET$nballs);
    }

    public SDL_VirtualJoystickDesc nballs(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$nballs, OFFSET$nballs, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short nhats() {
        return segment.get(LAYOUT$nhats, OFFSET$nhats);
    }

    public SDL_VirtualJoystickDesc nhats(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$nhats, OFFSET$nhats, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short ntouchpads() {
        return segment.get(LAYOUT$ntouchpads, OFFSET$ntouchpads);
    }

    public SDL_VirtualJoystickDesc ntouchpads(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$ntouchpads, OFFSET$ntouchpads, value);
        return this;
    }

    public @NativeType("Uint16") @Unsigned short nsensors() {
        return segment.get(LAYOUT$nsensors, OFFSET$nsensors);
    }

    public SDL_VirtualJoystickDesc nsensors(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$nsensors, OFFSET$nsensors, value);
        return this;
    }

    public @Pointer(comment="Uint16") @Unsigned ShortPtr padding2() {
        return new ShortPtr(padding2Raw());
    }

    public SDL_VirtualJoystickDesc padding2(@Pointer(comment="Uint16") @Unsigned ShortPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$padding2, SIZE$padding2);
        return this;
    }

    public MemorySegment padding2Raw() {
        return segment.asSlice(OFFSET$padding2, SIZE$padding2);
    }

    public @NativeType("Uint32") @Unsigned int button_mask() {
        return segment.get(LAYOUT$button_mask, OFFSET$button_mask);
    }

    public SDL_VirtualJoystickDesc button_mask(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$button_mask, OFFSET$button_mask, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int axis_mask() {
        return segment.get(LAYOUT$axis_mask, OFFSET$axis_mask);
    }

    public SDL_VirtualJoystickDesc axis_mask(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$axis_mask, OFFSET$axis_mask, value);
        return this;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr name() {
        MemorySegment s = nameRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public SDL_VirtualJoystickDesc name(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nameRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") MemorySegment nameRaw() {
        return segment.get(LAYOUT$name, OFFSET$name);
    }

    public void nameRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$name, OFFSET$name, value);
    }

    public SDL_VirtualJoystickDesc touchpads(@Nullable ISDL_VirtualJoystickTouchpadDesc value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        touchpadsRaw(s);
        return this;
    }

    @Unsafe public @Nullable SDL_VirtualJoystickTouchpadDesc.Ptr touchpads(int assumedCount) {
        MemorySegment s = touchpadsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * SDL_VirtualJoystickTouchpadDesc.BYTES);
        return new SDL_VirtualJoystickTouchpadDesc.Ptr(s);
    }

    public @Nullable SDL_VirtualJoystickTouchpadDesc touchpads() {
        MemorySegment s = touchpadsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_VirtualJoystickTouchpadDesc(s);
    }

    public @Pointer(target=SDL_VirtualJoystickTouchpadDesc.class) MemorySegment touchpadsRaw() {
        return segment.get(LAYOUT$touchpads, OFFSET$touchpads);
    }

    public void touchpadsRaw(@Pointer(target=SDL_VirtualJoystickTouchpadDesc.class) MemorySegment value) {
        segment.set(LAYOUT$touchpads, OFFSET$touchpads, value);
    }

    public SDL_VirtualJoystickDesc sensors(@Nullable ISDL_VirtualJoystickSensorDesc value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        sensorsRaw(s);
        return this;
    }

    @Unsafe public @Nullable SDL_VirtualJoystickSensorDesc.Ptr sensors(int assumedCount) {
        MemorySegment s = sensorsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * SDL_VirtualJoystickSensorDesc.BYTES);
        return new SDL_VirtualJoystickSensorDesc.Ptr(s);
    }

    public @Nullable SDL_VirtualJoystickSensorDesc sensors() {
        MemorySegment s = sensorsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_VirtualJoystickSensorDesc(s);
    }

    public @Pointer(target=SDL_VirtualJoystickSensorDesc.class) MemorySegment sensorsRaw() {
        return segment.get(LAYOUT$sensors, OFFSET$sensors);
    }

    public void sensorsRaw(@Pointer(target=SDL_VirtualJoystickSensorDesc.class) MemorySegment value) {
        segment.set(LAYOUT$sensors, OFFSET$sensors, value);
    }

    public @Pointer(comment="void*") MemorySegment userdata() {
        return segment.get(LAYOUT$userdata, OFFSET$userdata);
    }

    public void userdata(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$userdata, OFFSET$userdata, value);
    }

    public SDL_VirtualJoystickDesc userdata(@Nullable IPointer pointer) {
        userdata(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_VirtualJoystickDesc_Update") MemorySegment Update() {
        return segment.get(LAYOUT$Update, OFFSET$Update);
    }

    public void Update(@Pointer(comment="PFN_SDL_VirtualJoystickDesc_Update") MemorySegment value) {
        segment.set(LAYOUT$Update, OFFSET$Update, value);
    }

    public SDL_VirtualJoystickDesc Update(@Nullable IPointer pointer) {
        Update(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_VirtualJoystickDesc_SetPlayerIndex") MemorySegment SetPlayerIndex() {
        return segment.get(LAYOUT$SetPlayerIndex, OFFSET$SetPlayerIndex);
    }

    public void SetPlayerIndex(@Pointer(comment="PFN_SDL_VirtualJoystickDesc_SetPlayerIndex") MemorySegment value) {
        segment.set(LAYOUT$SetPlayerIndex, OFFSET$SetPlayerIndex, value);
    }

    public SDL_VirtualJoystickDesc SetPlayerIndex(@Nullable IPointer pointer) {
        SetPlayerIndex(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_VirtualJoystickDesc_Rumble") MemorySegment Rumble() {
        return segment.get(LAYOUT$Rumble, OFFSET$Rumble);
    }

    public void Rumble(@Pointer(comment="PFN_SDL_VirtualJoystickDesc_Rumble") MemorySegment value) {
        segment.set(LAYOUT$Rumble, OFFSET$Rumble, value);
    }

    public SDL_VirtualJoystickDesc Rumble(@Nullable IPointer pointer) {
        Rumble(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_VirtualJoystickDesc_RumbleTriggers") MemorySegment RumbleTriggers() {
        return segment.get(LAYOUT$RumbleTriggers, OFFSET$RumbleTriggers);
    }

    public void RumbleTriggers(@Pointer(comment="PFN_SDL_VirtualJoystickDesc_RumbleTriggers") MemorySegment value) {
        segment.set(LAYOUT$RumbleTriggers, OFFSET$RumbleTriggers, value);
    }

    public SDL_VirtualJoystickDesc RumbleTriggers(@Nullable IPointer pointer) {
        RumbleTriggers(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_VirtualJoystickDesc_SetLED") MemorySegment SetLED() {
        return segment.get(LAYOUT$SetLED, OFFSET$SetLED);
    }

    public void SetLED(@Pointer(comment="PFN_SDL_VirtualJoystickDesc_SetLED") MemorySegment value) {
        segment.set(LAYOUT$SetLED, OFFSET$SetLED, value);
    }

    public SDL_VirtualJoystickDesc SetLED(@Nullable IPointer pointer) {
        SetLED(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_VirtualJoystickDesc_SendEffect") MemorySegment SendEffect() {
        return segment.get(LAYOUT$SendEffect, OFFSET$SendEffect);
    }

    public void SendEffect(@Pointer(comment="PFN_SDL_VirtualJoystickDesc_SendEffect") MemorySegment value) {
        segment.set(LAYOUT$SendEffect, OFFSET$SendEffect, value);
    }

    public SDL_VirtualJoystickDesc SendEffect(@Nullable IPointer pointer) {
        SendEffect(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_VirtualJoystickDesc_SetSensorsEnabled") MemorySegment SetSensorsEnabled() {
        return segment.get(LAYOUT$SetSensorsEnabled, OFFSET$SetSensorsEnabled);
    }

    public void SetSensorsEnabled(@Pointer(comment="PFN_SDL_VirtualJoystickDesc_SetSensorsEnabled") MemorySegment value) {
        segment.set(LAYOUT$SetSensorsEnabled, OFFSET$SetSensorsEnabled, value);
    }

    public SDL_VirtualJoystickDesc SetSensorsEnabled(@Nullable IPointer pointer) {
        SetSensorsEnabled(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_SDL_VirtualJoystickDesc_Cleanup") MemorySegment Cleanup() {
        return segment.get(LAYOUT$Cleanup, OFFSET$Cleanup);
    }

    public void Cleanup(@Pointer(comment="PFN_SDL_VirtualJoystickDesc_Cleanup") MemorySegment value) {
        segment.set(LAYOUT$Cleanup, OFFSET$Cleanup, value);
    }

    public SDL_VirtualJoystickDesc Cleanup(@Nullable IPointer pointer) {
        Cleanup(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("version"),
        ValueLayout.JAVA_SHORT.withName("type"),
        ValueLayout.JAVA_SHORT.withName("padding"),
        ValueLayout.JAVA_SHORT.withName("vendor_id"),
        ValueLayout.JAVA_SHORT.withName("product_id"),
        ValueLayout.JAVA_SHORT.withName("naxes"),
        ValueLayout.JAVA_SHORT.withName("nbuttons"),
        ValueLayout.JAVA_SHORT.withName("nballs"),
        ValueLayout.JAVA_SHORT.withName("nhats"),
        ValueLayout.JAVA_SHORT.withName("ntouchpads"),
        ValueLayout.JAVA_SHORT.withName("nsensors"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_SHORT).withName("padding2"),
        ValueLayout.JAVA_INT.withName("button_mask"),
        ValueLayout.JAVA_INT.withName("axis_mask"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("name"),
        ValueLayout.ADDRESS.withTargetLayout(SDL_VirtualJoystickTouchpadDesc.LAYOUT).withName("touchpads"),
        ValueLayout.ADDRESS.withTargetLayout(SDL_VirtualJoystickSensorDesc.LAYOUT).withName("sensors"),
        ValueLayout.ADDRESS.withName("userdata"),
        ValueLayout.ADDRESS.withName("Update"),
        ValueLayout.ADDRESS.withName("SetPlayerIndex"),
        ValueLayout.ADDRESS.withName("Rumble"),
        ValueLayout.ADDRESS.withName("RumbleTriggers"),
        ValueLayout.ADDRESS.withName("SetLED"),
        ValueLayout.ADDRESS.withName("SendEffect"),
        ValueLayout.ADDRESS.withName("SetSensorsEnabled"),
        ValueLayout.ADDRESS.withName("Cleanup")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$version = PathElement.groupElement("version");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$padding = PathElement.groupElement("padding");
    public static final PathElement PATH$vendor_id = PathElement.groupElement("vendor_id");
    public static final PathElement PATH$product_id = PathElement.groupElement("product_id");
    public static final PathElement PATH$naxes = PathElement.groupElement("naxes");
    public static final PathElement PATH$nbuttons = PathElement.groupElement("nbuttons");
    public static final PathElement PATH$nballs = PathElement.groupElement("nballs");
    public static final PathElement PATH$nhats = PathElement.groupElement("nhats");
    public static final PathElement PATH$ntouchpads = PathElement.groupElement("ntouchpads");
    public static final PathElement PATH$nsensors = PathElement.groupElement("nsensors");
    public static final PathElement PATH$padding2 = PathElement.groupElement("padding2");
    public static final PathElement PATH$button_mask = PathElement.groupElement("button_mask");
    public static final PathElement PATH$axis_mask = PathElement.groupElement("axis_mask");
    public static final PathElement PATH$name = PathElement.groupElement("name");
    public static final PathElement PATH$touchpads = PathElement.groupElement("touchpads");
    public static final PathElement PATH$sensors = PathElement.groupElement("sensors");
    public static final PathElement PATH$userdata = PathElement.groupElement("userdata");
    public static final PathElement PATH$Update = PathElement.groupElement("Update");
    public static final PathElement PATH$SetPlayerIndex = PathElement.groupElement("SetPlayerIndex");
    public static final PathElement PATH$Rumble = PathElement.groupElement("Rumble");
    public static final PathElement PATH$RumbleTriggers = PathElement.groupElement("RumbleTriggers");
    public static final PathElement PATH$SetLED = PathElement.groupElement("SetLED");
    public static final PathElement PATH$SendEffect = PathElement.groupElement("SendEffect");
    public static final PathElement PATH$SetSensorsEnabled = PathElement.groupElement("SetSensorsEnabled");
    public static final PathElement PATH$Cleanup = PathElement.groupElement("Cleanup");

    public static final OfInt LAYOUT$version = (OfInt) LAYOUT.select(PATH$version);
    public static final OfShort LAYOUT$type = (OfShort) LAYOUT.select(PATH$type);
    public static final OfShort LAYOUT$padding = (OfShort) LAYOUT.select(PATH$padding);
    public static final OfShort LAYOUT$vendor_id = (OfShort) LAYOUT.select(PATH$vendor_id);
    public static final OfShort LAYOUT$product_id = (OfShort) LAYOUT.select(PATH$product_id);
    public static final OfShort LAYOUT$naxes = (OfShort) LAYOUT.select(PATH$naxes);
    public static final OfShort LAYOUT$nbuttons = (OfShort) LAYOUT.select(PATH$nbuttons);
    public static final OfShort LAYOUT$nballs = (OfShort) LAYOUT.select(PATH$nballs);
    public static final OfShort LAYOUT$nhats = (OfShort) LAYOUT.select(PATH$nhats);
    public static final OfShort LAYOUT$ntouchpads = (OfShort) LAYOUT.select(PATH$ntouchpads);
    public static final OfShort LAYOUT$nsensors = (OfShort) LAYOUT.select(PATH$nsensors);
    public static final SequenceLayout LAYOUT$padding2 = (SequenceLayout) LAYOUT.select(PATH$padding2);
    public static final OfInt LAYOUT$button_mask = (OfInt) LAYOUT.select(PATH$button_mask);
    public static final OfInt LAYOUT$axis_mask = (OfInt) LAYOUT.select(PATH$axis_mask);
    public static final AddressLayout LAYOUT$name = (AddressLayout) LAYOUT.select(PATH$name);
    public static final AddressLayout LAYOUT$touchpads = (AddressLayout) LAYOUT.select(PATH$touchpads);
    public static final AddressLayout LAYOUT$sensors = (AddressLayout) LAYOUT.select(PATH$sensors);
    public static final AddressLayout LAYOUT$userdata = (AddressLayout) LAYOUT.select(PATH$userdata);
    public static final AddressLayout LAYOUT$Update = (AddressLayout) LAYOUT.select(PATH$Update);
    public static final AddressLayout LAYOUT$SetPlayerIndex = (AddressLayout) LAYOUT.select(PATH$SetPlayerIndex);
    public static final AddressLayout LAYOUT$Rumble = (AddressLayout) LAYOUT.select(PATH$Rumble);
    public static final AddressLayout LAYOUT$RumbleTriggers = (AddressLayout) LAYOUT.select(PATH$RumbleTriggers);
    public static final AddressLayout LAYOUT$SetLED = (AddressLayout) LAYOUT.select(PATH$SetLED);
    public static final AddressLayout LAYOUT$SendEffect = (AddressLayout) LAYOUT.select(PATH$SendEffect);
    public static final AddressLayout LAYOUT$SetSensorsEnabled = (AddressLayout) LAYOUT.select(PATH$SetSensorsEnabled);
    public static final AddressLayout LAYOUT$Cleanup = (AddressLayout) LAYOUT.select(PATH$Cleanup);

    public static final long SIZE$version = LAYOUT$version.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$padding = LAYOUT$padding.byteSize();
    public static final long SIZE$vendor_id = LAYOUT$vendor_id.byteSize();
    public static final long SIZE$product_id = LAYOUT$product_id.byteSize();
    public static final long SIZE$naxes = LAYOUT$naxes.byteSize();
    public static final long SIZE$nbuttons = LAYOUT$nbuttons.byteSize();
    public static final long SIZE$nballs = LAYOUT$nballs.byteSize();
    public static final long SIZE$nhats = LAYOUT$nhats.byteSize();
    public static final long SIZE$ntouchpads = LAYOUT$ntouchpads.byteSize();
    public static final long SIZE$nsensors = LAYOUT$nsensors.byteSize();
    public static final long SIZE$padding2 = LAYOUT$padding2.byteSize();
    public static final long SIZE$button_mask = LAYOUT$button_mask.byteSize();
    public static final long SIZE$axis_mask = LAYOUT$axis_mask.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();
    public static final long SIZE$touchpads = LAYOUT$touchpads.byteSize();
    public static final long SIZE$sensors = LAYOUT$sensors.byteSize();
    public static final long SIZE$userdata = LAYOUT$userdata.byteSize();
    public static final long SIZE$Update = LAYOUT$Update.byteSize();
    public static final long SIZE$SetPlayerIndex = LAYOUT$SetPlayerIndex.byteSize();
    public static final long SIZE$Rumble = LAYOUT$Rumble.byteSize();
    public static final long SIZE$RumbleTriggers = LAYOUT$RumbleTriggers.byteSize();
    public static final long SIZE$SetLED = LAYOUT$SetLED.byteSize();
    public static final long SIZE$SendEffect = LAYOUT$SendEffect.byteSize();
    public static final long SIZE$SetSensorsEnabled = LAYOUT$SetSensorsEnabled.byteSize();
    public static final long SIZE$Cleanup = LAYOUT$Cleanup.byteSize();

    public static final long OFFSET$version = LAYOUT.byteOffset(PATH$version);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$padding = LAYOUT.byteOffset(PATH$padding);
    public static final long OFFSET$vendor_id = LAYOUT.byteOffset(PATH$vendor_id);
    public static final long OFFSET$product_id = LAYOUT.byteOffset(PATH$product_id);
    public static final long OFFSET$naxes = LAYOUT.byteOffset(PATH$naxes);
    public static final long OFFSET$nbuttons = LAYOUT.byteOffset(PATH$nbuttons);
    public static final long OFFSET$nballs = LAYOUT.byteOffset(PATH$nballs);
    public static final long OFFSET$nhats = LAYOUT.byteOffset(PATH$nhats);
    public static final long OFFSET$ntouchpads = LAYOUT.byteOffset(PATH$ntouchpads);
    public static final long OFFSET$nsensors = LAYOUT.byteOffset(PATH$nsensors);
    public static final long OFFSET$padding2 = LAYOUT.byteOffset(PATH$padding2);
    public static final long OFFSET$button_mask = LAYOUT.byteOffset(PATH$button_mask);
    public static final long OFFSET$axis_mask = LAYOUT.byteOffset(PATH$axis_mask);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$touchpads = LAYOUT.byteOffset(PATH$touchpads);
    public static final long OFFSET$sensors = LAYOUT.byteOffset(PATH$sensors);
    public static final long OFFSET$userdata = LAYOUT.byteOffset(PATH$userdata);
    public static final long OFFSET$Update = LAYOUT.byteOffset(PATH$Update);
    public static final long OFFSET$SetPlayerIndex = LAYOUT.byteOffset(PATH$SetPlayerIndex);
    public static final long OFFSET$Rumble = LAYOUT.byteOffset(PATH$Rumble);
    public static final long OFFSET$RumbleTriggers = LAYOUT.byteOffset(PATH$RumbleTriggers);
    public static final long OFFSET$SetLED = LAYOUT.byteOffset(PATH$SetLED);
    public static final long OFFSET$SendEffect = LAYOUT.byteOffset(PATH$SendEffect);
    public static final long OFFSET$SetSensorsEnabled = LAYOUT.byteOffset(PATH$SetSensorsEnabled);
    public static final long OFFSET$Cleanup = LAYOUT.byteOffset(PATH$Cleanup);
}
