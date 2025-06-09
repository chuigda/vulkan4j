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

/// The structure for all events in SDL.
///
/// The SDL_Event structure is the core of all event handling in SDL. SDL_Event
/// is a union of all event structures used in SDL.
///
/// \since This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_Event {
///     Uint32 type; // @link substring="type" target="#type"
///     SDL_CommonEvent common; // @link substring="SDL_CommonEvent" target="SDL_CommonEvent" @link substring="common" target="#common"
///     SDL_DisplayEvent display; // @link substring="SDL_DisplayEvent" target="SDL_DisplayEvent" @link substring="display" target="#display"
///     SDL_WindowEvent window; // @link substring="SDL_WindowEvent" target="SDL_WindowEvent" @link substring="window" target="#window"
///     SDL_KeyboardDeviceEvent kdevice; // @link substring="SDL_KeyboardDeviceEvent" target="SDL_KeyboardDeviceEvent" @link substring="kdevice" target="#kdevice"
///     SDL_KeyboardEvent key; // @link substring="SDL_KeyboardEvent" target="SDL_KeyboardEvent" @link substring="key" target="#key"
///     SDL_TextEditingEvent edit; // @link substring="SDL_TextEditingEvent" target="SDL_TextEditingEvent" @link substring="edit" target="#edit"
///     SDL_TextEditingCandidatesEvent edit_candidates; // @link substring="SDL_TextEditingCandidatesEvent" target="SDL_TextEditingCandidatesEvent" @link substring="edit_candidates" target="#edit_candidates"
///     SDL_TextInputEvent text; // @link substring="SDL_TextInputEvent" target="SDL_TextInputEvent" @link substring="text" target="#text"
///     SDL_MouseDeviceEvent mdevice; // @link substring="SDL_MouseDeviceEvent" target="SDL_MouseDeviceEvent" @link substring="mdevice" target="#mdevice"
///     SDL_MouseMotionEvent motion; // @link substring="SDL_MouseMotionEvent" target="SDL_MouseMotionEvent" @link substring="motion" target="#motion"
///     SDL_MouseButtonEvent button; // @link substring="SDL_MouseButtonEvent" target="SDL_MouseButtonEvent" @link substring="button" target="#button"
///     SDL_MouseWheelEvent wheel; // @link substring="SDL_MouseWheelEvent" target="SDL_MouseWheelEvent" @link substring="wheel" target="#wheel"
///     SDL_JoyDeviceEvent jdevice; // @link substring="SDL_JoyDeviceEvent" target="SDL_JoyDeviceEvent" @link substring="jdevice" target="#jdevice"
///     SDL_JoyAxisEvent jaxis; // @link substring="SDL_JoyAxisEvent" target="SDL_JoyAxisEvent" @link substring="jaxis" target="#jaxis"
///     SDL_JoyBallEvent jball; // @link substring="SDL_JoyBallEvent" target="SDL_JoyBallEvent" @link substring="jball" target="#jball"
///     SDL_JoyHatEvent jhat; // @link substring="SDL_JoyHatEvent" target="SDL_JoyHatEvent" @link substring="jhat" target="#jhat"
///     SDL_JoyButtonEvent jbutton; // @link substring="SDL_JoyButtonEvent" target="SDL_JoyButtonEvent" @link substring="jbutton" target="#jbutton"
///     SDL_JoyBatteryEvent jbattery; // @link substring="SDL_JoyBatteryEvent" target="SDL_JoyBatteryEvent" @link substring="jbattery" target="#jbattery"
///     SDL_GamepadDeviceEvent gdevice; // @link substring="SDL_GamepadDeviceEvent" target="SDL_GamepadDeviceEvent" @link substring="gdevice" target="#gdevice"
///     SDL_GamepadAxisEvent gaxis; // @link substring="SDL_GamepadAxisEvent" target="SDL_GamepadAxisEvent" @link substring="gaxis" target="#gaxis"
///     SDL_GamepadButtonEvent gbutton; // @link substring="SDL_GamepadButtonEvent" target="SDL_GamepadButtonEvent" @link substring="gbutton" target="#gbutton"
///     SDL_GamepadTouchpadEvent gtouchpad; // @link substring="SDL_GamepadTouchpadEvent" target="SDL_GamepadTouchpadEvent" @link substring="gtouchpad" target="#gtouchpad"
///     SDL_GamepadSensorEvent gsensor; // @link substring="SDL_GamepadSensorEvent" target="SDL_GamepadSensorEvent" @link substring="gsensor" target="#gsensor"
///     SDL_AudioDeviceEvent adevice; // @link substring="SDL_AudioDeviceEvent" target="SDL_AudioDeviceEvent" @link substring="adevice" target="#adevice"
///     SDL_CameraDeviceEvent cdevice; // @link substring="SDL_CameraDeviceEvent" target="SDL_CameraDeviceEvent" @link substring="cdevice" target="#cdevice"
///     SDL_SensorEvent sensor; // @link substring="SDL_SensorEvent" target="SDL_SensorEvent" @link substring="sensor" target="#sensor"
///     SDL_QuitEvent quit; // @link substring="SDL_QuitEvent" target="SDL_QuitEvent" @link substring="quit" target="#quit"
///     SDL_UserEvent user; // @link substring="SDL_UserEvent" target="SDL_UserEvent" @link substring="user" target="#user"
///     SDL_TouchFingerEvent tfinger; // @link substring="SDL_TouchFingerEvent" target="SDL_TouchFingerEvent" @link substring="tfinger" target="#tfinger"
///     SDL_PenProximityEvent pproximity; // @link substring="SDL_PenProximityEvent" target="SDL_PenProximityEvent" @link substring="pproximity" target="#pproximity"
///     SDL_PenTouchEvent ptouch; // @link substring="SDL_PenTouchEvent" target="SDL_PenTouchEvent" @link substring="ptouch" target="#ptouch"
///     SDL_PenMotionEvent pmotion; // @link substring="SDL_PenMotionEvent" target="SDL_PenMotionEvent" @link substring="pmotion" target="#pmotion"
///     SDL_PenButtonEvent pbutton; // @link substring="SDL_PenButtonEvent" target="SDL_PenButtonEvent" @link substring="pbutton" target="#pbutton"
///     SDL_PenAxisEvent paxis; // @link substring="SDL_PenAxisEvent" target="SDL_PenAxisEvent" @link substring="paxis" target="#paxis"
///     SDL_RenderEvent render; // @link substring="SDL_RenderEvent" target="SDL_RenderEvent" @link substring="render" target="#render"
///     SDL_DropEvent drop; // @link substring="SDL_DropEvent" target="SDL_DropEvent" @link substring="drop" target="#drop"
///     SDL_ClipboardEvent clipboard; // @link substring="SDL_ClipboardEvent" target="SDL_ClipboardEvent" @link substring="clipboard" target="#clipboard"
///     Uint8[128] padding; // @link substring="padding" target="#padding"
/// } SDL_Event;
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
public record SDL_Event(@NotNull MemorySegment segment) implements ISDL_Event {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_Event}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_Event to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_Event.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_Event, Iterable<SDL_Event> {
        public long size() {
            return segment.byteSize() / SDL_Event.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_Event at(long index) {
            return new SDL_Event(segment.asSlice(index * SDL_Event.BYTES, SDL_Event.BYTES));
        }

        public void write(long index, @NotNull SDL_Event value) {
            MemorySegment s = segment.asSlice(index * SDL_Event.BYTES, SDL_Event.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_Event.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_Event.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_Event.BYTES,
                (end - start) * SDL_Event.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_Event.BYTES));
        }

        public SDL_Event[] toArray() {
            SDL_Event[] ret = new SDL_Event[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_Event> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_Event> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_Event.BYTES;
            }

            @Override
            public SDL_Event next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_Event ret = new SDL_Event(segment.asSlice(0, SDL_Event.BYTES));
                segment = segment.asSlice(SDL_Event.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_Event allocate(Arena arena) {
        return new SDL_Event(arena.allocate(LAYOUT));
    }

    public static SDL_Event.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_Event.Ptr(segment);
    }

    public static SDL_Event clone(Arena arena, SDL_Event src) {
        SDL_Event ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint32") @Unsigned int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_Event type(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @NotNull SDL_CommonEvent common() {
        return new SDL_CommonEvent(segment.asSlice(OFFSET$common, LAYOUT$common));
    }

    public SDL_Event common(@NotNull SDL_CommonEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$common, SIZE$common);
        return this;
    }

    public SDL_Event common(Consumer<@NotNull SDL_CommonEvent> consumer) {
        consumer.accept(common());
        return this;
    }

    public @NotNull SDL_DisplayEvent display() {
        return new SDL_DisplayEvent(segment.asSlice(OFFSET$display, LAYOUT$display));
    }

    public SDL_Event display(@NotNull SDL_DisplayEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$display, SIZE$display);
        return this;
    }

    public SDL_Event display(Consumer<@NotNull SDL_DisplayEvent> consumer) {
        consumer.accept(display());
        return this;
    }

    public @NotNull SDL_WindowEvent window() {
        return new SDL_WindowEvent(segment.asSlice(OFFSET$window, LAYOUT$window));
    }

    public SDL_Event window(@NotNull SDL_WindowEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$window, SIZE$window);
        return this;
    }

    public SDL_Event window(Consumer<@NotNull SDL_WindowEvent> consumer) {
        consumer.accept(window());
        return this;
    }

    public @NotNull SDL_KeyboardDeviceEvent kdevice() {
        return new SDL_KeyboardDeviceEvent(segment.asSlice(OFFSET$kdevice, LAYOUT$kdevice));
    }

    public SDL_Event kdevice(@NotNull SDL_KeyboardDeviceEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$kdevice, SIZE$kdevice);
        return this;
    }

    public SDL_Event kdevice(Consumer<@NotNull SDL_KeyboardDeviceEvent> consumer) {
        consumer.accept(kdevice());
        return this;
    }

    public @NotNull SDL_KeyboardEvent key() {
        return new SDL_KeyboardEvent(segment.asSlice(OFFSET$key, LAYOUT$key));
    }

    public SDL_Event key(@NotNull SDL_KeyboardEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$key, SIZE$key);
        return this;
    }

    public SDL_Event key(Consumer<@NotNull SDL_KeyboardEvent> consumer) {
        consumer.accept(key());
        return this;
    }

    public @NotNull SDL_TextEditingEvent edit() {
        return new SDL_TextEditingEvent(segment.asSlice(OFFSET$edit, LAYOUT$edit));
    }

    public SDL_Event edit(@NotNull SDL_TextEditingEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$edit, SIZE$edit);
        return this;
    }

    public SDL_Event edit(Consumer<@NotNull SDL_TextEditingEvent> consumer) {
        consumer.accept(edit());
        return this;
    }

    public @NotNull SDL_TextEditingCandidatesEvent edit_candidates() {
        return new SDL_TextEditingCandidatesEvent(segment.asSlice(OFFSET$edit_candidates, LAYOUT$edit_candidates));
    }

    public SDL_Event edit_candidates(@NotNull SDL_TextEditingCandidatesEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$edit_candidates, SIZE$edit_candidates);
        return this;
    }

    public SDL_Event edit_candidates(Consumer<@NotNull SDL_TextEditingCandidatesEvent> consumer) {
        consumer.accept(edit_candidates());
        return this;
    }

    public @NotNull SDL_TextInputEvent text() {
        return new SDL_TextInputEvent(segment.asSlice(OFFSET$text, LAYOUT$text));
    }

    public SDL_Event text(@NotNull SDL_TextInputEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$text, SIZE$text);
        return this;
    }

    public SDL_Event text(Consumer<@NotNull SDL_TextInputEvent> consumer) {
        consumer.accept(text());
        return this;
    }

    public @NotNull SDL_MouseDeviceEvent mdevice() {
        return new SDL_MouseDeviceEvent(segment.asSlice(OFFSET$mdevice, LAYOUT$mdevice));
    }

    public SDL_Event mdevice(@NotNull SDL_MouseDeviceEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$mdevice, SIZE$mdevice);
        return this;
    }

    public SDL_Event mdevice(Consumer<@NotNull SDL_MouseDeviceEvent> consumer) {
        consumer.accept(mdevice());
        return this;
    }

    public @NotNull SDL_MouseMotionEvent motion() {
        return new SDL_MouseMotionEvent(segment.asSlice(OFFSET$motion, LAYOUT$motion));
    }

    public SDL_Event motion(@NotNull SDL_MouseMotionEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$motion, SIZE$motion);
        return this;
    }

    public SDL_Event motion(Consumer<@NotNull SDL_MouseMotionEvent> consumer) {
        consumer.accept(motion());
        return this;
    }

    public @NotNull SDL_MouseButtonEvent button() {
        return new SDL_MouseButtonEvent(segment.asSlice(OFFSET$button, LAYOUT$button));
    }

    public SDL_Event button(@NotNull SDL_MouseButtonEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$button, SIZE$button);
        return this;
    }

    public SDL_Event button(Consumer<@NotNull SDL_MouseButtonEvent> consumer) {
        consumer.accept(button());
        return this;
    }

    public @NotNull SDL_MouseWheelEvent wheel() {
        return new SDL_MouseWheelEvent(segment.asSlice(OFFSET$wheel, LAYOUT$wheel));
    }

    public SDL_Event wheel(@NotNull SDL_MouseWheelEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$wheel, SIZE$wheel);
        return this;
    }

    public SDL_Event wheel(Consumer<@NotNull SDL_MouseWheelEvent> consumer) {
        consumer.accept(wheel());
        return this;
    }

    public @NotNull SDL_JoyDeviceEvent jdevice() {
        return new SDL_JoyDeviceEvent(segment.asSlice(OFFSET$jdevice, LAYOUT$jdevice));
    }

    public SDL_Event jdevice(@NotNull SDL_JoyDeviceEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$jdevice, SIZE$jdevice);
        return this;
    }

    public SDL_Event jdevice(Consumer<@NotNull SDL_JoyDeviceEvent> consumer) {
        consumer.accept(jdevice());
        return this;
    }

    public @NotNull SDL_JoyAxisEvent jaxis() {
        return new SDL_JoyAxisEvent(segment.asSlice(OFFSET$jaxis, LAYOUT$jaxis));
    }

    public SDL_Event jaxis(@NotNull SDL_JoyAxisEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$jaxis, SIZE$jaxis);
        return this;
    }

    public SDL_Event jaxis(Consumer<@NotNull SDL_JoyAxisEvent> consumer) {
        consumer.accept(jaxis());
        return this;
    }

    public @NotNull SDL_JoyBallEvent jball() {
        return new SDL_JoyBallEvent(segment.asSlice(OFFSET$jball, LAYOUT$jball));
    }

    public SDL_Event jball(@NotNull SDL_JoyBallEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$jball, SIZE$jball);
        return this;
    }

    public SDL_Event jball(Consumer<@NotNull SDL_JoyBallEvent> consumer) {
        consumer.accept(jball());
        return this;
    }

    public @NotNull SDL_JoyHatEvent jhat() {
        return new SDL_JoyHatEvent(segment.asSlice(OFFSET$jhat, LAYOUT$jhat));
    }

    public SDL_Event jhat(@NotNull SDL_JoyHatEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$jhat, SIZE$jhat);
        return this;
    }

    public SDL_Event jhat(Consumer<@NotNull SDL_JoyHatEvent> consumer) {
        consumer.accept(jhat());
        return this;
    }

    public @NotNull SDL_JoyButtonEvent jbutton() {
        return new SDL_JoyButtonEvent(segment.asSlice(OFFSET$jbutton, LAYOUT$jbutton));
    }

    public SDL_Event jbutton(@NotNull SDL_JoyButtonEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$jbutton, SIZE$jbutton);
        return this;
    }

    public SDL_Event jbutton(Consumer<@NotNull SDL_JoyButtonEvent> consumer) {
        consumer.accept(jbutton());
        return this;
    }

    public @NotNull SDL_JoyBatteryEvent jbattery() {
        return new SDL_JoyBatteryEvent(segment.asSlice(OFFSET$jbattery, LAYOUT$jbattery));
    }

    public SDL_Event jbattery(@NotNull SDL_JoyBatteryEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$jbattery, SIZE$jbattery);
        return this;
    }

    public SDL_Event jbattery(Consumer<@NotNull SDL_JoyBatteryEvent> consumer) {
        consumer.accept(jbattery());
        return this;
    }

    public @NotNull SDL_GamepadDeviceEvent gdevice() {
        return new SDL_GamepadDeviceEvent(segment.asSlice(OFFSET$gdevice, LAYOUT$gdevice));
    }

    public SDL_Event gdevice(@NotNull SDL_GamepadDeviceEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$gdevice, SIZE$gdevice);
        return this;
    }

    public SDL_Event gdevice(Consumer<@NotNull SDL_GamepadDeviceEvent> consumer) {
        consumer.accept(gdevice());
        return this;
    }

    public @NotNull SDL_GamepadAxisEvent gaxis() {
        return new SDL_GamepadAxisEvent(segment.asSlice(OFFSET$gaxis, LAYOUT$gaxis));
    }

    public SDL_Event gaxis(@NotNull SDL_GamepadAxisEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$gaxis, SIZE$gaxis);
        return this;
    }

    public SDL_Event gaxis(Consumer<@NotNull SDL_GamepadAxisEvent> consumer) {
        consumer.accept(gaxis());
        return this;
    }

    public @NotNull SDL_GamepadButtonEvent gbutton() {
        return new SDL_GamepadButtonEvent(segment.asSlice(OFFSET$gbutton, LAYOUT$gbutton));
    }

    public SDL_Event gbutton(@NotNull SDL_GamepadButtonEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$gbutton, SIZE$gbutton);
        return this;
    }

    public SDL_Event gbutton(Consumer<@NotNull SDL_GamepadButtonEvent> consumer) {
        consumer.accept(gbutton());
        return this;
    }

    public @NotNull SDL_GamepadTouchpadEvent gtouchpad() {
        return new SDL_GamepadTouchpadEvent(segment.asSlice(OFFSET$gtouchpad, LAYOUT$gtouchpad));
    }

    public SDL_Event gtouchpad(@NotNull SDL_GamepadTouchpadEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$gtouchpad, SIZE$gtouchpad);
        return this;
    }

    public SDL_Event gtouchpad(Consumer<@NotNull SDL_GamepadTouchpadEvent> consumer) {
        consumer.accept(gtouchpad());
        return this;
    }

    public @NotNull SDL_GamepadSensorEvent gsensor() {
        return new SDL_GamepadSensorEvent(segment.asSlice(OFFSET$gsensor, LAYOUT$gsensor));
    }

    public SDL_Event gsensor(@NotNull SDL_GamepadSensorEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$gsensor, SIZE$gsensor);
        return this;
    }

    public SDL_Event gsensor(Consumer<@NotNull SDL_GamepadSensorEvent> consumer) {
        consumer.accept(gsensor());
        return this;
    }

    public @NotNull SDL_AudioDeviceEvent adevice() {
        return new SDL_AudioDeviceEvent(segment.asSlice(OFFSET$adevice, LAYOUT$adevice));
    }

    public SDL_Event adevice(@NotNull SDL_AudioDeviceEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$adevice, SIZE$adevice);
        return this;
    }

    public SDL_Event adevice(Consumer<@NotNull SDL_AudioDeviceEvent> consumer) {
        consumer.accept(adevice());
        return this;
    }

    public @NotNull SDL_CameraDeviceEvent cdevice() {
        return new SDL_CameraDeviceEvent(segment.asSlice(OFFSET$cdevice, LAYOUT$cdevice));
    }

    public SDL_Event cdevice(@NotNull SDL_CameraDeviceEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$cdevice, SIZE$cdevice);
        return this;
    }

    public SDL_Event cdevice(Consumer<@NotNull SDL_CameraDeviceEvent> consumer) {
        consumer.accept(cdevice());
        return this;
    }

    public @NotNull SDL_SensorEvent sensor() {
        return new SDL_SensorEvent(segment.asSlice(OFFSET$sensor, LAYOUT$sensor));
    }

    public SDL_Event sensor(@NotNull SDL_SensorEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sensor, SIZE$sensor);
        return this;
    }

    public SDL_Event sensor(Consumer<@NotNull SDL_SensorEvent> consumer) {
        consumer.accept(sensor());
        return this;
    }

    public @NotNull SDL_QuitEvent quit() {
        return new SDL_QuitEvent(segment.asSlice(OFFSET$quit, LAYOUT$quit));
    }

    public SDL_Event quit(@NotNull SDL_QuitEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$quit, SIZE$quit);
        return this;
    }

    public SDL_Event quit(Consumer<@NotNull SDL_QuitEvent> consumer) {
        consumer.accept(quit());
        return this;
    }

    public @NotNull SDL_UserEvent user() {
        return new SDL_UserEvent(segment.asSlice(OFFSET$user, LAYOUT$user));
    }

    public SDL_Event user(@NotNull SDL_UserEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$user, SIZE$user);
        return this;
    }

    public SDL_Event user(Consumer<@NotNull SDL_UserEvent> consumer) {
        consumer.accept(user());
        return this;
    }

    public @NotNull SDL_TouchFingerEvent tfinger() {
        return new SDL_TouchFingerEvent(segment.asSlice(OFFSET$tfinger, LAYOUT$tfinger));
    }

    public SDL_Event tfinger(@NotNull SDL_TouchFingerEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$tfinger, SIZE$tfinger);
        return this;
    }

    public SDL_Event tfinger(Consumer<@NotNull SDL_TouchFingerEvent> consumer) {
        consumer.accept(tfinger());
        return this;
    }

    public @NotNull SDL_PenProximityEvent pproximity() {
        return new SDL_PenProximityEvent(segment.asSlice(OFFSET$pproximity, LAYOUT$pproximity));
    }

    public SDL_Event pproximity(@NotNull SDL_PenProximityEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pproximity, SIZE$pproximity);
        return this;
    }

    public SDL_Event pproximity(Consumer<@NotNull SDL_PenProximityEvent> consumer) {
        consumer.accept(pproximity());
        return this;
    }

    public @NotNull SDL_PenTouchEvent ptouch() {
        return new SDL_PenTouchEvent(segment.asSlice(OFFSET$ptouch, LAYOUT$ptouch));
    }

    public SDL_Event ptouch(@NotNull SDL_PenTouchEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$ptouch, SIZE$ptouch);
        return this;
    }

    public SDL_Event ptouch(Consumer<@NotNull SDL_PenTouchEvent> consumer) {
        consumer.accept(ptouch());
        return this;
    }

    public @NotNull SDL_PenMotionEvent pmotion() {
        return new SDL_PenMotionEvent(segment.asSlice(OFFSET$pmotion, LAYOUT$pmotion));
    }

    public SDL_Event pmotion(@NotNull SDL_PenMotionEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pmotion, SIZE$pmotion);
        return this;
    }

    public SDL_Event pmotion(Consumer<@NotNull SDL_PenMotionEvent> consumer) {
        consumer.accept(pmotion());
        return this;
    }

    public @NotNull SDL_PenButtonEvent pbutton() {
        return new SDL_PenButtonEvent(segment.asSlice(OFFSET$pbutton, LAYOUT$pbutton));
    }

    public SDL_Event pbutton(@NotNull SDL_PenButtonEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pbutton, SIZE$pbutton);
        return this;
    }

    public SDL_Event pbutton(Consumer<@NotNull SDL_PenButtonEvent> consumer) {
        consumer.accept(pbutton());
        return this;
    }

    public @NotNull SDL_PenAxisEvent paxis() {
        return new SDL_PenAxisEvent(segment.asSlice(OFFSET$paxis, LAYOUT$paxis));
    }

    public SDL_Event paxis(@NotNull SDL_PenAxisEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$paxis, SIZE$paxis);
        return this;
    }

    public SDL_Event paxis(Consumer<@NotNull SDL_PenAxisEvent> consumer) {
        consumer.accept(paxis());
        return this;
    }

    public @NotNull SDL_RenderEvent render() {
        return new SDL_RenderEvent(segment.asSlice(OFFSET$render, LAYOUT$render));
    }

    public SDL_Event render(@NotNull SDL_RenderEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$render, SIZE$render);
        return this;
    }

    public SDL_Event render(Consumer<@NotNull SDL_RenderEvent> consumer) {
        consumer.accept(render());
        return this;
    }

    public @NotNull SDL_DropEvent drop() {
        return new SDL_DropEvent(segment.asSlice(OFFSET$drop, LAYOUT$drop));
    }

    public SDL_Event drop(@NotNull SDL_DropEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$drop, SIZE$drop);
        return this;
    }

    public SDL_Event drop(Consumer<@NotNull SDL_DropEvent> consumer) {
        consumer.accept(drop());
        return this;
    }

    public @NotNull SDL_ClipboardEvent clipboard() {
        return new SDL_ClipboardEvent(segment.asSlice(OFFSET$clipboard, LAYOUT$clipboard));
    }

    public SDL_Event clipboard(@NotNull SDL_ClipboardEvent value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$clipboard, SIZE$clipboard);
        return this;
    }

    public SDL_Event clipboard(Consumer<@NotNull SDL_ClipboardEvent> consumer) {
        consumer.accept(clipboard());
        return this;
    }

    public @Pointer(comment="Uint8") @Unsigned BytePtr padding() {
        return new BytePtr(paddingRaw());
    }

    public SDL_Event padding(@Pointer(comment="Uint8") @Unsigned BytePtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$padding, SIZE$padding);
        return this;
    }

    public MemorySegment paddingRaw() {
        return segment.asSlice(OFFSET$padding, SIZE$padding);
    }

    public static final UnionLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("type"),
        SDL_CommonEvent.LAYOUT.withName("common"),
        SDL_DisplayEvent.LAYOUT.withName("display"),
        SDL_WindowEvent.LAYOUT.withName("window"),
        SDL_KeyboardDeviceEvent.LAYOUT.withName("kdevice"),
        SDL_KeyboardEvent.LAYOUT.withName("key"),
        SDL_TextEditingEvent.LAYOUT.withName("edit"),
        SDL_TextEditingCandidatesEvent.LAYOUT.withName("edit_candidates"),
        SDL_TextInputEvent.LAYOUT.withName("text"),
        SDL_MouseDeviceEvent.LAYOUT.withName("mdevice"),
        SDL_MouseMotionEvent.LAYOUT.withName("motion"),
        SDL_MouseButtonEvent.LAYOUT.withName("button"),
        SDL_MouseWheelEvent.LAYOUT.withName("wheel"),
        SDL_JoyDeviceEvent.LAYOUT.withName("jdevice"),
        SDL_JoyAxisEvent.LAYOUT.withName("jaxis"),
        SDL_JoyBallEvent.LAYOUT.withName("jball"),
        SDL_JoyHatEvent.LAYOUT.withName("jhat"),
        SDL_JoyButtonEvent.LAYOUT.withName("jbutton"),
        SDL_JoyBatteryEvent.LAYOUT.withName("jbattery"),
        SDL_GamepadDeviceEvent.LAYOUT.withName("gdevice"),
        SDL_GamepadAxisEvent.LAYOUT.withName("gaxis"),
        SDL_GamepadButtonEvent.LAYOUT.withName("gbutton"),
        SDL_GamepadTouchpadEvent.LAYOUT.withName("gtouchpad"),
        SDL_GamepadSensorEvent.LAYOUT.withName("gsensor"),
        SDL_AudioDeviceEvent.LAYOUT.withName("adevice"),
        SDL_CameraDeviceEvent.LAYOUT.withName("cdevice"),
        SDL_SensorEvent.LAYOUT.withName("sensor"),
        SDL_QuitEvent.LAYOUT.withName("quit"),
        SDL_UserEvent.LAYOUT.withName("user"),
        SDL_TouchFingerEvent.LAYOUT.withName("tfinger"),
        SDL_PenProximityEvent.LAYOUT.withName("pproximity"),
        SDL_PenTouchEvent.LAYOUT.withName("ptouch"),
        SDL_PenMotionEvent.LAYOUT.withName("pmotion"),
        SDL_PenButtonEvent.LAYOUT.withName("pbutton"),
        SDL_PenAxisEvent.LAYOUT.withName("paxis"),
        SDL_RenderEvent.LAYOUT.withName("render"),
        SDL_DropEvent.LAYOUT.withName("drop"),
        SDL_ClipboardEvent.LAYOUT.withName("clipboard"),
        MemoryLayout.sequenceLayout(128, ValueLayout.JAVA_BYTE).withName("padding")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$common = PathElement.groupElement("common");
    public static final PathElement PATH$display = PathElement.groupElement("display");
    public static final PathElement PATH$window = PathElement.groupElement("window");
    public static final PathElement PATH$kdevice = PathElement.groupElement("kdevice");
    public static final PathElement PATH$key = PathElement.groupElement("key");
    public static final PathElement PATH$edit = PathElement.groupElement("edit");
    public static final PathElement PATH$edit_candidates = PathElement.groupElement("edit_candidates");
    public static final PathElement PATH$text = PathElement.groupElement("text");
    public static final PathElement PATH$mdevice = PathElement.groupElement("mdevice");
    public static final PathElement PATH$motion = PathElement.groupElement("motion");
    public static final PathElement PATH$button = PathElement.groupElement("button");
    public static final PathElement PATH$wheel = PathElement.groupElement("wheel");
    public static final PathElement PATH$jdevice = PathElement.groupElement("jdevice");
    public static final PathElement PATH$jaxis = PathElement.groupElement("jaxis");
    public static final PathElement PATH$jball = PathElement.groupElement("jball");
    public static final PathElement PATH$jhat = PathElement.groupElement("jhat");
    public static final PathElement PATH$jbutton = PathElement.groupElement("jbutton");
    public static final PathElement PATH$jbattery = PathElement.groupElement("jbattery");
    public static final PathElement PATH$gdevice = PathElement.groupElement("gdevice");
    public static final PathElement PATH$gaxis = PathElement.groupElement("gaxis");
    public static final PathElement PATH$gbutton = PathElement.groupElement("gbutton");
    public static final PathElement PATH$gtouchpad = PathElement.groupElement("gtouchpad");
    public static final PathElement PATH$gsensor = PathElement.groupElement("gsensor");
    public static final PathElement PATH$adevice = PathElement.groupElement("adevice");
    public static final PathElement PATH$cdevice = PathElement.groupElement("cdevice");
    public static final PathElement PATH$sensor = PathElement.groupElement("sensor");
    public static final PathElement PATH$quit = PathElement.groupElement("quit");
    public static final PathElement PATH$user = PathElement.groupElement("user");
    public static final PathElement PATH$tfinger = PathElement.groupElement("tfinger");
    public static final PathElement PATH$pproximity = PathElement.groupElement("pproximity");
    public static final PathElement PATH$ptouch = PathElement.groupElement("ptouch");
    public static final PathElement PATH$pmotion = PathElement.groupElement("pmotion");
    public static final PathElement PATH$pbutton = PathElement.groupElement("pbutton");
    public static final PathElement PATH$paxis = PathElement.groupElement("paxis");
    public static final PathElement PATH$render = PathElement.groupElement("render");
    public static final PathElement PATH$drop = PathElement.groupElement("drop");
    public static final PathElement PATH$clipboard = PathElement.groupElement("clipboard");
    public static final PathElement PATH$padding = PathElement.groupElement("padding");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final StructLayout LAYOUT$common = (StructLayout) LAYOUT.select(PATH$common);
    public static final StructLayout LAYOUT$display = (StructLayout) LAYOUT.select(PATH$display);
    public static final StructLayout LAYOUT$window = (StructLayout) LAYOUT.select(PATH$window);
    public static final StructLayout LAYOUT$kdevice = (StructLayout) LAYOUT.select(PATH$kdevice);
    public static final StructLayout LAYOUT$key = (StructLayout) LAYOUT.select(PATH$key);
    public static final StructLayout LAYOUT$edit = (StructLayout) LAYOUT.select(PATH$edit);
    public static final StructLayout LAYOUT$edit_candidates = (StructLayout) LAYOUT.select(PATH$edit_candidates);
    public static final StructLayout LAYOUT$text = (StructLayout) LAYOUT.select(PATH$text);
    public static final StructLayout LAYOUT$mdevice = (StructLayout) LAYOUT.select(PATH$mdevice);
    public static final StructLayout LAYOUT$motion = (StructLayout) LAYOUT.select(PATH$motion);
    public static final StructLayout LAYOUT$button = (StructLayout) LAYOUT.select(PATH$button);
    public static final StructLayout LAYOUT$wheel = (StructLayout) LAYOUT.select(PATH$wheel);
    public static final StructLayout LAYOUT$jdevice = (StructLayout) LAYOUT.select(PATH$jdevice);
    public static final StructLayout LAYOUT$jaxis = (StructLayout) LAYOUT.select(PATH$jaxis);
    public static final StructLayout LAYOUT$jball = (StructLayout) LAYOUT.select(PATH$jball);
    public static final StructLayout LAYOUT$jhat = (StructLayout) LAYOUT.select(PATH$jhat);
    public static final StructLayout LAYOUT$jbutton = (StructLayout) LAYOUT.select(PATH$jbutton);
    public static final StructLayout LAYOUT$jbattery = (StructLayout) LAYOUT.select(PATH$jbattery);
    public static final StructLayout LAYOUT$gdevice = (StructLayout) LAYOUT.select(PATH$gdevice);
    public static final StructLayout LAYOUT$gaxis = (StructLayout) LAYOUT.select(PATH$gaxis);
    public static final StructLayout LAYOUT$gbutton = (StructLayout) LAYOUT.select(PATH$gbutton);
    public static final StructLayout LAYOUT$gtouchpad = (StructLayout) LAYOUT.select(PATH$gtouchpad);
    public static final StructLayout LAYOUT$gsensor = (StructLayout) LAYOUT.select(PATH$gsensor);
    public static final StructLayout LAYOUT$adevice = (StructLayout) LAYOUT.select(PATH$adevice);
    public static final StructLayout LAYOUT$cdevice = (StructLayout) LAYOUT.select(PATH$cdevice);
    public static final StructLayout LAYOUT$sensor = (StructLayout) LAYOUT.select(PATH$sensor);
    public static final StructLayout LAYOUT$quit = (StructLayout) LAYOUT.select(PATH$quit);
    public static final StructLayout LAYOUT$user = (StructLayout) LAYOUT.select(PATH$user);
    public static final StructLayout LAYOUT$tfinger = (StructLayout) LAYOUT.select(PATH$tfinger);
    public static final StructLayout LAYOUT$pproximity = (StructLayout) LAYOUT.select(PATH$pproximity);
    public static final StructLayout LAYOUT$ptouch = (StructLayout) LAYOUT.select(PATH$ptouch);
    public static final StructLayout LAYOUT$pmotion = (StructLayout) LAYOUT.select(PATH$pmotion);
    public static final StructLayout LAYOUT$pbutton = (StructLayout) LAYOUT.select(PATH$pbutton);
    public static final StructLayout LAYOUT$paxis = (StructLayout) LAYOUT.select(PATH$paxis);
    public static final StructLayout LAYOUT$render = (StructLayout) LAYOUT.select(PATH$render);
    public static final StructLayout LAYOUT$drop = (StructLayout) LAYOUT.select(PATH$drop);
    public static final StructLayout LAYOUT$clipboard = (StructLayout) LAYOUT.select(PATH$clipboard);
    public static final SequenceLayout LAYOUT$padding = (SequenceLayout) LAYOUT.select(PATH$padding);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$common = LAYOUT$common.byteSize();
    public static final long SIZE$display = LAYOUT$display.byteSize();
    public static final long SIZE$window = LAYOUT$window.byteSize();
    public static final long SIZE$kdevice = LAYOUT$kdevice.byteSize();
    public static final long SIZE$key = LAYOUT$key.byteSize();
    public static final long SIZE$edit = LAYOUT$edit.byteSize();
    public static final long SIZE$edit_candidates = LAYOUT$edit_candidates.byteSize();
    public static final long SIZE$text = LAYOUT$text.byteSize();
    public static final long SIZE$mdevice = LAYOUT$mdevice.byteSize();
    public static final long SIZE$motion = LAYOUT$motion.byteSize();
    public static final long SIZE$button = LAYOUT$button.byteSize();
    public static final long SIZE$wheel = LAYOUT$wheel.byteSize();
    public static final long SIZE$jdevice = LAYOUT$jdevice.byteSize();
    public static final long SIZE$jaxis = LAYOUT$jaxis.byteSize();
    public static final long SIZE$jball = LAYOUT$jball.byteSize();
    public static final long SIZE$jhat = LAYOUT$jhat.byteSize();
    public static final long SIZE$jbutton = LAYOUT$jbutton.byteSize();
    public static final long SIZE$jbattery = LAYOUT$jbattery.byteSize();
    public static final long SIZE$gdevice = LAYOUT$gdevice.byteSize();
    public static final long SIZE$gaxis = LAYOUT$gaxis.byteSize();
    public static final long SIZE$gbutton = LAYOUT$gbutton.byteSize();
    public static final long SIZE$gtouchpad = LAYOUT$gtouchpad.byteSize();
    public static final long SIZE$gsensor = LAYOUT$gsensor.byteSize();
    public static final long SIZE$adevice = LAYOUT$adevice.byteSize();
    public static final long SIZE$cdevice = LAYOUT$cdevice.byteSize();
    public static final long SIZE$sensor = LAYOUT$sensor.byteSize();
    public static final long SIZE$quit = LAYOUT$quit.byteSize();
    public static final long SIZE$user = LAYOUT$user.byteSize();
    public static final long SIZE$tfinger = LAYOUT$tfinger.byteSize();
    public static final long SIZE$pproximity = LAYOUT$pproximity.byteSize();
    public static final long SIZE$ptouch = LAYOUT$ptouch.byteSize();
    public static final long SIZE$pmotion = LAYOUT$pmotion.byteSize();
    public static final long SIZE$pbutton = LAYOUT$pbutton.byteSize();
    public static final long SIZE$paxis = LAYOUT$paxis.byteSize();
    public static final long SIZE$render = LAYOUT$render.byteSize();
    public static final long SIZE$drop = LAYOUT$drop.byteSize();
    public static final long SIZE$clipboard = LAYOUT$clipboard.byteSize();
    public static final long SIZE$padding = LAYOUT$padding.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$common = LAYOUT.byteOffset(PATH$common);
    public static final long OFFSET$display = LAYOUT.byteOffset(PATH$display);
    public static final long OFFSET$window = LAYOUT.byteOffset(PATH$window);
    public static final long OFFSET$kdevice = LAYOUT.byteOffset(PATH$kdevice);
    public static final long OFFSET$key = LAYOUT.byteOffset(PATH$key);
    public static final long OFFSET$edit = LAYOUT.byteOffset(PATH$edit);
    public static final long OFFSET$edit_candidates = LAYOUT.byteOffset(PATH$edit_candidates);
    public static final long OFFSET$text = LAYOUT.byteOffset(PATH$text);
    public static final long OFFSET$mdevice = LAYOUT.byteOffset(PATH$mdevice);
    public static final long OFFSET$motion = LAYOUT.byteOffset(PATH$motion);
    public static final long OFFSET$button = LAYOUT.byteOffset(PATH$button);
    public static final long OFFSET$wheel = LAYOUT.byteOffset(PATH$wheel);
    public static final long OFFSET$jdevice = LAYOUT.byteOffset(PATH$jdevice);
    public static final long OFFSET$jaxis = LAYOUT.byteOffset(PATH$jaxis);
    public static final long OFFSET$jball = LAYOUT.byteOffset(PATH$jball);
    public static final long OFFSET$jhat = LAYOUT.byteOffset(PATH$jhat);
    public static final long OFFSET$jbutton = LAYOUT.byteOffset(PATH$jbutton);
    public static final long OFFSET$jbattery = LAYOUT.byteOffset(PATH$jbattery);
    public static final long OFFSET$gdevice = LAYOUT.byteOffset(PATH$gdevice);
    public static final long OFFSET$gaxis = LAYOUT.byteOffset(PATH$gaxis);
    public static final long OFFSET$gbutton = LAYOUT.byteOffset(PATH$gbutton);
    public static final long OFFSET$gtouchpad = LAYOUT.byteOffset(PATH$gtouchpad);
    public static final long OFFSET$gsensor = LAYOUT.byteOffset(PATH$gsensor);
    public static final long OFFSET$adevice = LAYOUT.byteOffset(PATH$adevice);
    public static final long OFFSET$cdevice = LAYOUT.byteOffset(PATH$cdevice);
    public static final long OFFSET$sensor = LAYOUT.byteOffset(PATH$sensor);
    public static final long OFFSET$quit = LAYOUT.byteOffset(PATH$quit);
    public static final long OFFSET$user = LAYOUT.byteOffset(PATH$user);
    public static final long OFFSET$tfinger = LAYOUT.byteOffset(PATH$tfinger);
    public static final long OFFSET$pproximity = LAYOUT.byteOffset(PATH$pproximity);
    public static final long OFFSET$ptouch = LAYOUT.byteOffset(PATH$ptouch);
    public static final long OFFSET$pmotion = LAYOUT.byteOffset(PATH$pmotion);
    public static final long OFFSET$pbutton = LAYOUT.byteOffset(PATH$pbutton);
    public static final long OFFSET$paxis = LAYOUT.byteOffset(PATH$paxis);
    public static final long OFFSET$render = LAYOUT.byteOffset(PATH$render);
    public static final long OFFSET$drop = LAYOUT.byteOffset(PATH$drop);
    public static final long OFFSET$clipboard = LAYOUT.byteOffset(PATH$clipboard);
    public static final long OFFSET$padding = LAYOUT.byteOffset(PATH$padding);
}
