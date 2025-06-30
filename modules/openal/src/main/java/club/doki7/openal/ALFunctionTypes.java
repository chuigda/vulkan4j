package club.doki7.openal;

import java.lang.foreign.*;
import java.lang.invoke.*;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.NativeLayout;
import org.jetbrains.annotations.NotNull;
import club.doki7.openal.handle.*;

public final class ALFunctionTypes {
    public static final FunctionDescriptor ALBUFFERCALLBACKTYPESOFT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor ALCEVENTPROCTYPESOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor ALDEBUGPROCEXT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor ALEVENTPROCSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALAUXILIARYEFFECTSLOTF = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALAUXILIARYEFFECTSLOTFDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALAUXILIARYEFFECTSLOTFV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALAUXILIARYEFFECTSLOTFVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALAUXILIARYEFFECTSLOTI = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALAUXILIARYEFFECTSLOTIDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALAUXILIARYEFFECTSLOTIV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALAUXILIARYEFFECTSLOTIVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALBUFFER3F = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALBUFFER3FDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALBUFFER3I = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALBUFFER3IDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALBUFFERCALLBACKDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALBUFFERCALLBACKSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALBUFFERDATA = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALBUFFERDATADIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALBUFFERDATASTATICDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALBUFFERF = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALBUFFERFDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALBUFFERFV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALBUFFERFVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALBUFFERI = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALBUFFERIDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALBUFFERIV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALBUFFERIVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALBUFFERSAMPLESSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALBUFFERSUBDATADIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALBUFFERSUBSAMPLESSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALCCAPTURECLOSEDEVICE = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALCCAPTUREOPENDEVICE = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALCCAPTURESAMPLES = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALCCAPTURESTART = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALCCAPTURESTOP = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALCCLOSEDEVICE = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALCCREATECONTEXT = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALCDESTROYCONTEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALCDEVICEPAUSESOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALCDEVICERESUMESOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALCEVENTCALLBACKSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALCEVENTCONTROLSOFT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.JAVA_BYTE
    );

    public static final FunctionDescriptor LPALCEVENTISSUPPORTEDSOFT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALCGETCONTEXTSDEVICE = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALCGETCURRENTCONTEXT = FunctionDescriptor.of(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALCGETENUMVALUE = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALCGETERROR = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALCGETINTEGER64VSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor LPALCGETINTEGERV = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALCGETPROCADDRESS = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALCGETPROCADDRESS2 = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALCGETSTRING = FunctionDescriptor.of(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALCGETSTRINGISOFT = FunctionDescriptor.of(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALCISEXTENSIONPRESENT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALCISRENDERFORMATSUPPORTEDSOFT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALCLOOPBACKOPENDEVICESOFT = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALCMAKECONTEXTCURRENT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALCOPENDEVICE = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALCPROCESSCONTEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALCRENDERSAMPLESSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALCREOPENDEVICESOFT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALCRESETDEVICESOFT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALCSUSPENDCONTEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALDEBUGMESSAGECALLBACKDIRECTEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALDEBUGMESSAGECALLBACKEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALDEBUGMESSAGECONTROLDIRECTEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.JAVA_BYTE
    );

    public static final FunctionDescriptor LPALDEBUGMESSAGECONTROLEXT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.JAVA_BYTE
    );

    public static final FunctionDescriptor LPALDEBUGMESSAGEINSERTDIRECTEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALDEBUGMESSAGEINSERTEXT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALDEFERUPDATESDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALDEFERUPDATESSOFT = FunctionDescriptor.ofVoid();

    public static final FunctionDescriptor LPALDELETEAUXILIARYEFFECTSLOTS = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALDELETEAUXILIARYEFFECTSLOTSDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALDELETEBUFFERS = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALDELETEBUFFERSDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALDELETEEFFECTS = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALDELETEEFFECTSDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALDELETEFILTERS = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALDELETEFILTERSDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALDELETESOURCES = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALDELETESOURCESDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALDISABLE = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALDISABLEDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALDISTANCEMODEL = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALDISTANCEMODELDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALDOPPLERFACTOR = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALDOPPLERFACTORDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALDOPPLERVELOCITY = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALEFFECTF = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALEFFECTFDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALEFFECTFV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALEFFECTFVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALEFFECTI = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALEFFECTIDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALEFFECTIV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALEFFECTIVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALENABLE = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALENABLEDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALEVENTCALLBACKDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALEVENTCALLBACKSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALEVENTCONTROLDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.JAVA_BYTE
    );

    public static final FunctionDescriptor LPALEVENTCONTROLSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.JAVA_BYTE
    );

    public static final FunctionDescriptor LPALFILTERF = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALFILTERFDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALFILTERFV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALFILTERFVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALFILTERI = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALFILTERIDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALFILTERIV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALFILTERIVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALFOLDBACKCALLBACK = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGENAUXILIARYEFFECTSLOTS = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGENAUXILIARYEFFECTSLOTSDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGENBUFFERS = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGENBUFFERSDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGENEFFECTS = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGENEFFECTSDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGENFILTERS = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGENFILTERSDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGENSOURCES = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGENSOURCESDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETAUXILIARYEFFECTSLOTF = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETAUXILIARYEFFECTSLOTFDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETAUXILIARYEFFECTSLOTFV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETAUXILIARYEFFECTSLOTFVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETAUXILIARYEFFECTSLOTI = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETAUXILIARYEFFECTSLOTIDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETAUXILIARYEFFECTSLOTIV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETAUXILIARYEFFECTSLOTIVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETBOOLEAN = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETBOOLEANDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETBOOLEANV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALGETBOOLEANVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALGETBUFFER3F = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETBUFFER3FDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETBUFFER3I = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETBUFFER3IDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETBUFFER3PTRDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor LPALGETBUFFER3PTRSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor LPALGETBUFFERF = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETBUFFERFDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETBUFFERFV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETBUFFERFVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETBUFFERI = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETBUFFERIDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETBUFFERIV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETBUFFERIVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETBUFFERPTRDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor LPALGETBUFFERPTRSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor LPALGETBUFFERPTRVDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor LPALGETBUFFERPTRVSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor LPALGETBUFFERSAMPLESSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALGETDEBUGMESSAGELOGDIRECTEXT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALGETDEBUGMESSAGELOGEXT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALGETDOUBLE = FunctionDescriptor.of(
        ValueLayout.JAVA_DOUBLE,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETDOUBLEDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_DOUBLE,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETDOUBLEV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE)
    );

    public static final FunctionDescriptor LPALGETDOUBLEVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE)
    );

    public static final FunctionDescriptor LPALGETEFFECTF = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETEFFECTFDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETEFFECTFV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETEFFECTFVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETEFFECTI = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETEFFECTIDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETEFFECTIV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETEFFECTIVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETENUMVALUE = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALGETENUMVALUEDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALGETERROR = FunctionDescriptor.of(
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETERRORDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALGETFILTERF = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETFILTERFDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETFILTERFV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETFILTERFVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETFILTERI = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETFILTERIDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETFILTERIV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETFILTERIVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETFLOAT = FunctionDescriptor.of(
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETFLOATDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_FLOAT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETFLOATV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETFLOATVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETINTEGER = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETINTEGERDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETINTEGERV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETINTEGERVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETLISTENER3F = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETLISTENER3FDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETLISTENER3I = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETLISTENER3IDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETLISTENERF = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETLISTENERFDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETLISTENERFV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETLISTENERFVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETLISTENERI = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETLISTENERIDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETLISTENERIV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETLISTENERIVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETOBJECTLABELDIRECTEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALGETOBJECTLABELEXT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALGETPOINTERDIRECTEXT = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETPOINTERDIRECTSOFT = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETPOINTEREXT = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETPOINTERSOFT = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETPOINTERVDIRECTEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor LPALGETPOINTERVDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor LPALGETPOINTERVEXT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor LPALGETPOINTERVSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor LPALGETPROCADDRESS = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALGETPROCADDRESSDIRECT = FunctionDescriptor.of(
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALGETSOURCE3DDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE)
    );

    public static final FunctionDescriptor LPALGETSOURCE3DSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE)
    );

    public static final FunctionDescriptor LPALGETSOURCE3F = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETSOURCE3FDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETSOURCE3I = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETSOURCE3I64DIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor LPALGETSOURCE3I64SOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor LPALGETSOURCE3IDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETSOURCEDDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE)
    );

    public static final FunctionDescriptor LPALGETSOURCEDSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE)
    );

    public static final FunctionDescriptor LPALGETSOURCEDVDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE)
    );

    public static final FunctionDescriptor LPALGETSOURCEDVSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE)
    );

    public static final FunctionDescriptor LPALGETSOURCEF = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETSOURCEFDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETSOURCEFV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETSOURCEFVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALGETSOURCEI = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETSOURCEI64DIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor LPALGETSOURCEI64SOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor LPALGETSOURCEI64VDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor LPALGETSOURCEI64VSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor LPALGETSOURCEIDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETSOURCEIV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETSOURCEIVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALGETSTRING = FunctionDescriptor.of(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETSTRINGDIRECT = FunctionDescriptor.of(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETSTRINGIDIRECTSOFT = FunctionDescriptor.of(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALGETSTRINGISOFT = FunctionDescriptor.of(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALISAUXILIARYEFFECTSLOT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALISAUXILIARYEFFECTSLOTDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALISBUFFER = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALISBUFFERDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALISBUFFERFORMATSUPPORTEDSOFT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALISEFFECT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALISEFFECTDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALISENABLED = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALISENABLEDDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALISEXTENSIONPRESENT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALISEXTENSIONPRESENTDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALISFILTER = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALISFILTERDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALISSOURCE = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALISSOURCEDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALLISTENER3F = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALLISTENER3FDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALLISTENER3I = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALLISTENER3IDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALLISTENERF = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALLISTENERFDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALLISTENERFV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALLISTENERFVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALLISTENERI = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALLISTENERIDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALLISTENERIV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALLISTENERIVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALOBJECTLABELDIRECTEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALOBJECTLABELEXT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALPOPDEBUGGROUPDIRECTEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALPOPDEBUGGROUPEXT = FunctionDescriptor.ofVoid();

    public static final FunctionDescriptor LPALPROCESSUPDATESDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALPROCESSUPDATESSOFT = FunctionDescriptor.ofVoid();

    public static final FunctionDescriptor LPALPUSHDEBUGGROUPDIRECTEXT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALPUSHDEBUGGROUPEXT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor LPALREQUESTFOLDBACKSTART = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALREQUESTFOLDBACKSTARTDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALREQUESTFOLDBACKSTOP = FunctionDescriptor.ofVoid();

    public static final FunctionDescriptor LPALREQUESTFOLDBACKSTOPDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor LPALSOURCE3DDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_DOUBLE,
        ValueLayout.JAVA_DOUBLE,
        ValueLayout.JAVA_DOUBLE
    );

    public static final FunctionDescriptor LPALSOURCE3DSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_DOUBLE,
        ValueLayout.JAVA_DOUBLE,
        ValueLayout.JAVA_DOUBLE
    );

    public static final FunctionDescriptor LPALSOURCE3F = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALSOURCE3FDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALSOURCE3I = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALSOURCE3I64DIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_LONG,
        ValueLayout.JAVA_LONG,
        ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor LPALSOURCE3I64SOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_LONG,
        ValueLayout.JAVA_LONG,
        ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor LPALSOURCE3IDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALSOURCEDDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_DOUBLE
    );

    public static final FunctionDescriptor LPALSOURCEDSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_DOUBLE
    );

    public static final FunctionDescriptor LPALSOURCEDVDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE)
    );

    public static final FunctionDescriptor LPALSOURCEDVSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE)
    );

    public static final FunctionDescriptor LPALSOURCEF = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALSOURCEFDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALSOURCEFV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALSOURCEFVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
    );

    public static final FunctionDescriptor LPALSOURCEI = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALSOURCEI64DIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor LPALSOURCEI64SOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor LPALSOURCEI64VDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor LPALSOURCEI64VSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
    );

    public static final FunctionDescriptor LPALSOURCEIDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALSOURCEIV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALSOURCEIVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALSOURCEPAUSE = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALSOURCEPAUSEDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALSOURCEPAUSEV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALSOURCEPAUSEVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALSOURCEPLAY = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALSOURCEPLAYATTIMEDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor LPALSOURCEPLAYATTIMESOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor LPALSOURCEPLAYATTIMEVDIRECTSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor LPALSOURCEPLAYATTIMEVSOFT = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.JAVA_LONG
    );

    public static final FunctionDescriptor LPALSOURCEPLAYDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALSOURCEPLAYV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALSOURCEPLAYVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALSOURCEQUEUEBUFFERS = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALSOURCEQUEUEBUFFERSDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALSOURCEREWIND = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALSOURCEREWINDDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALSOURCEREWINDV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALSOURCEREWINDVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALSOURCESTOP = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALSOURCESTOPDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPALSOURCESTOPV = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALSOURCESTOPVDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALSOURCEUNQUEUEBUFFERS = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALSOURCEUNQUEUEBUFFERSDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPALSPEEDOFSOUND = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPALSPEEDOFSOUNDDIRECT = FunctionDescriptor.ofVoid(
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_FLOAT
    );

    public static final FunctionDescriptor LPEAXGETBUFFERMODEDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor LPEAXGETDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPEAXSETBUFFERMODEDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor LPEAXSETDIRECT = FunctionDescriptor.of(
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor PFNALBUFFERDATASTATICPROC = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor PFNALBUFFERSUBDATASOFTPROC = FunctionDescriptor.ofVoid(
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS,
        ValueLayout.JAVA_INT,
        ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor PFNALCGETTHREADCONTEXTPROC = FunctionDescriptor.of(
        ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor PFNALCSETTHREADCONTEXTPROC = FunctionDescriptor.of(
        ValueLayout.JAVA_BYTE,
        ValueLayout.ADDRESS
    );

    @FunctionalInterface
    public interface ALBUFFERCALLBACKTYPESOFT {
        @NativeType("ALsizei") int invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @NativeType("ALsizei") int p2
        );

        static MethodHandle of(@NotNull ALBUFFERCALLBACKTYPESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ALBUFFERCALLBACKTYPESOFT.class, "invoke", ALBUFFERCALLBACKTYPESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ALBUFFERCALLBACKTYPESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ALBUFFERCALLBACKTYPESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), ALBUFFERCALLBACKTYPESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ALCEVENTPROCTYPESOFT {
        void invoke(
            @NativeType("ALCenum") int p0,
            @NativeType("ALCenum") int p1,
            ALCdevice p2,
            @NativeType("ALCsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ALCEVENTPROCTYPESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ALCEVENTPROCTYPESOFT.class, "invoke", ALCEVENTPROCTYPESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ALCEVENTPROCTYPESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ALCEVENTPROCTYPESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), ALCEVENTPROCTYPESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ALDEBUGPROCEXT {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALenum") int p3,
            @NativeType("ALsizei") int p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5,
            @Pointer(comment="void*") @NotNull MemorySegment p6
        );

        static MethodHandle of(@NotNull ALDEBUGPROCEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ALDEBUGPROCEXT.class, "invoke", ALDEBUGPROCEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ALDEBUGPROCEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ALDEBUGPROCEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), ALDEBUGPROCEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ALEVENTPROCSOFT {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ALEVENTPROCSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ALEVENTPROCSOFT.class, "invoke", ALEVENTPROCSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ALEVENTPROCSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ALEVENTPROCSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), ALEVENTPROCSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALAUXILIARYEFFECTSLOTF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2
        );

        static MethodHandle of(@NotNull LPALAUXILIARYEFFECTSLOTF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALAUXILIARYEFFECTSLOTF.class, "invoke", LPALAUXILIARYEFFECTSLOTF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALAUXILIARYEFFECTSLOTF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALAUXILIARYEFFECTSLOTF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTF, arena);
        }
    }

    @FunctionalInterface
    public interface LPALAUXILIARYEFFECTSLOTFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALfloat") float p3
        );

        static MethodHandle of(@NotNull LPALAUXILIARYEFFECTSLOTFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALAUXILIARYEFFECTSLOTFDIRECT.class, "invoke", LPALAUXILIARYEFFECTSLOTFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALAUXILIARYEFFECTSLOTFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALAUXILIARYEFFECTSLOTFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALAUXILIARYEFFECTSLOTFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALAUXILIARYEFFECTSLOTFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALAUXILIARYEFFECTSLOTFV.class, "invoke", LPALAUXILIARYEFFECTSLOTFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALAUXILIARYEFFECTSLOTFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALAUXILIARYEFFECTSLOTFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTFV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALAUXILIARYEFFECTSLOTFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALAUXILIARYEFFECTSLOTFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALAUXILIARYEFFECTSLOTFVDIRECT.class, "invoke", LPALAUXILIARYEFFECTSLOTFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALAUXILIARYEFFECTSLOTFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALAUXILIARYEFFECTSLOTFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALAUXILIARYEFFECTSLOTI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2
        );

        static MethodHandle of(@NotNull LPALAUXILIARYEFFECTSLOTI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALAUXILIARYEFFECTSLOTI.class, "invoke", LPALAUXILIARYEFFECTSLOTI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALAUXILIARYEFFECTSLOTI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALAUXILIARYEFFECTSLOTI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTI, arena);
        }
    }

    @FunctionalInterface
    public interface LPALAUXILIARYEFFECTSLOTIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint") int p3
        );

        static MethodHandle of(@NotNull LPALAUXILIARYEFFECTSLOTIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALAUXILIARYEFFECTSLOTIDIRECT.class, "invoke", LPALAUXILIARYEFFECTSLOTIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALAUXILIARYEFFECTSLOTIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALAUXILIARYEFFECTSLOTIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALAUXILIARYEFFECTSLOTIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALAUXILIARYEFFECTSLOTIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALAUXILIARYEFFECTSLOTIV.class, "invoke", LPALAUXILIARYEFFECTSLOTIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALAUXILIARYEFFECTSLOTIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALAUXILIARYEFFECTSLOTIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTIV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALAUXILIARYEFFECTSLOTIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALAUXILIARYEFFECTSLOTIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALAUXILIARYEFFECTSLOTIVDIRECT.class, "invoke", LPALAUXILIARYEFFECTSLOTIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALAUXILIARYEFFECTSLOTIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALAUXILIARYEFFECTSLOTIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFER3F {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2,
            @NativeType("ALfloat") float p3,
            @NativeType("ALfloat") float p4
        );

        static MethodHandle of(@NotNull LPALBUFFER3F lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFER3F.class, "invoke", LPALBUFFER3F.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFER3F lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFER3F lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFER3F, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFER3FDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALfloat") float p3,
            @NativeType("ALfloat") float p4,
            @NativeType("ALfloat") float p5
        );

        static MethodHandle of(@NotNull LPALBUFFER3FDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFER3FDIRECT.class, "invoke", LPALBUFFER3FDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFER3FDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFER3FDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFER3FDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFER3I {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2,
            @NativeType("ALint") int p3,
            @NativeType("ALint") int p4
        );

        static MethodHandle of(@NotNull LPALBUFFER3I lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFER3I.class, "invoke", LPALBUFFER3I.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFER3I lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFER3I lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFER3I, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFER3IDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint") int p3,
            @NativeType("ALint") int p4,
            @NativeType("ALint") int p5
        );

        static MethodHandle of(@NotNull LPALBUFFER3IDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFER3IDIRECT.class, "invoke", LPALBUFFER3IDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFER3IDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFER3IDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFER3IDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERCALLBACKDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALsizei") int p3,
            @Pointer(comment="ALBUFFERCALLBACKTYPESOFT") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull LPALBUFFERCALLBACKDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERCALLBACKDIRECTSOFT.class, "invoke", LPALBUFFERCALLBACKDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERCALLBACKDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERCALLBACKDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERCALLBACKDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERCALLBACKSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="ALBUFFERCALLBACKTYPESOFT") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull LPALBUFFERCALLBACKSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERCALLBACKSOFT.class, "invoke", LPALBUFFERCALLBACKSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERCALLBACKSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERCALLBACKSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERCALLBACKSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERDATA {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @NativeType("ALsizei") int p3,
            @NativeType("ALsizei") int p4
        );

        static MethodHandle of(@NotNull LPALBUFFERDATA lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERDATA.class, "invoke", LPALBUFFERDATA.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERDATA lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERDATA lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERDATA, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERDATADIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @NativeType("ALsizei") int p4,
            @NativeType("ALsizei") int p5
        );

        static MethodHandle of(@NotNull LPALBUFFERDATADIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERDATADIRECT.class, "invoke", LPALBUFFERDATADIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERDATADIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERDATADIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERDATADIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERDATASTATICDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @NativeType("ALsizei") int p4,
            @NativeType("ALsizei") int p5
        );

        static MethodHandle of(@NotNull LPALBUFFERDATASTATICDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERDATASTATICDIRECT.class, "invoke", LPALBUFFERDATASTATICDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERDATASTATICDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERDATASTATICDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERDATASTATICDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2
        );

        static MethodHandle of(@NotNull LPALBUFFERF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERF.class, "invoke", LPALBUFFERF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERF, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALfloat") float p3
        );

        static MethodHandle of(@NotNull LPALBUFFERFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERFDIRECT.class, "invoke", LPALBUFFERFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALBUFFERFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERFV.class, "invoke", LPALBUFFERFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERFV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALBUFFERFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERFVDIRECT.class, "invoke", LPALBUFFERFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2
        );

        static MethodHandle of(@NotNull LPALBUFFERI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERI.class, "invoke", LPALBUFFERI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERI, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint") int p3
        );

        static MethodHandle of(@NotNull LPALBUFFERIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERIDIRECT.class, "invoke", LPALBUFFERIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALBUFFERIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERIV.class, "invoke", LPALBUFFERIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERIV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALBUFFERIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERIVDIRECT.class, "invoke", LPALBUFFERIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERSAMPLESSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALsizei") int p3,
            @NativeType("ALenum") int p4,
            @NativeType("ALenum") int p5,
            @Pointer(comment="void*") @NotNull MemorySegment p6
        );

        static MethodHandle of(@NotNull LPALBUFFERSAMPLESSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERSAMPLESSOFT.class, "invoke", LPALBUFFERSAMPLESSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERSAMPLESSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERSAMPLESSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERSAMPLESSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERSUBDATADIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @NativeType("ALsizei") int p4,
            @NativeType("ALsizei") int p5
        );

        static MethodHandle of(@NotNull LPALBUFFERSUBDATADIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERSUBDATADIRECTSOFT.class, "invoke", LPALBUFFERSUBDATADIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERSUBDATADIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERSUBDATADIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERSUBDATADIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALBUFFERSUBSAMPLESSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALsizei") int p1,
            @NativeType("ALsizei") int p2,
            @NativeType("ALenum") int p3,
            @NativeType("ALenum") int p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull LPALBUFFERSUBSAMPLESSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALBUFFERSUBSAMPLESSOFT.class, "invoke", LPALBUFFERSUBSAMPLESSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALBUFFERSUBSAMPLESSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALBUFFERSUBSAMPLESSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERSUBSAMPLESSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCCAPTURECLOSEDEVICE {
        @NativeType("ALCboolean") byte invoke(
            ALCdevice p0
        );

        static MethodHandle of(@NotNull LPALCCAPTURECLOSEDEVICE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCCAPTURECLOSEDEVICE.class, "invoke", LPALCCAPTURECLOSEDEVICE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCCAPTURECLOSEDEVICE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCCAPTURECLOSEDEVICE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCCAPTURECLOSEDEVICE, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCCAPTUREOPENDEVICE {
        ALCdevice invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @NativeType("ALCuint") int p1,
            @NativeType("ALCenum") int p2,
            @NativeType("ALCsizei") int p3
        );

        static MethodHandle of(@NotNull LPALCCAPTUREOPENDEVICE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCCAPTUREOPENDEVICE.class, "invoke", LPALCCAPTUREOPENDEVICE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCCAPTUREOPENDEVICE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCCAPTUREOPENDEVICE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCCAPTUREOPENDEVICE, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCCAPTURESAMPLES {
        void invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @NativeType("ALCsizei") int p2
        );

        static MethodHandle of(@NotNull LPALCCAPTURESAMPLES lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCCAPTURESAMPLES.class, "invoke", LPALCCAPTURESAMPLES.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCCAPTURESAMPLES lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCCAPTURESAMPLES lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCCAPTURESAMPLES, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCCAPTURESTART {
        void invoke(
            ALCdevice p0
        );

        static MethodHandle of(@NotNull LPALCCAPTURESTART lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCCAPTURESTART.class, "invoke", LPALCCAPTURESTART.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCCAPTURESTART lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCCAPTURESTART lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCCAPTURESTART, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCCAPTURESTOP {
        void invoke(
            ALCdevice p0
        );

        static MethodHandle of(@NotNull LPALCCAPTURESTOP lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCCAPTURESTOP.class, "invoke", LPALCCAPTURESTOP.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCCAPTURESTOP lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCCAPTURESTOP lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCCAPTURESTOP, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCCLOSEDEVICE {
        @NativeType("ALCboolean") byte invoke(
            ALCdevice p0
        );

        static MethodHandle of(@NotNull LPALCCLOSEDEVICE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCCLOSEDEVICE.class, "invoke", LPALCCLOSEDEVICE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCCLOSEDEVICE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCCLOSEDEVICE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCCLOSEDEVICE, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCCREATECONTEXT {
        ALCcontext invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALCCREATECONTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCCREATECONTEXT.class, "invoke", LPALCCREATECONTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCCREATECONTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCCREATECONTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCCREATECONTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCDESTROYCONTEXT {
        void invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull LPALCDESTROYCONTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCDESTROYCONTEXT.class, "invoke", LPALCDESTROYCONTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCDESTROYCONTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCDESTROYCONTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCDESTROYCONTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCDEVICEPAUSESOFT {
        void invoke(
            ALCdevice p0
        );

        static MethodHandle of(@NotNull LPALCDEVICEPAUSESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCDEVICEPAUSESOFT.class, "invoke", LPALCDEVICEPAUSESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCDEVICEPAUSESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCDEVICEPAUSESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCDEVICEPAUSESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCDEVICERESUMESOFT {
        void invoke(
            ALCdevice p0
        );

        static MethodHandle of(@NotNull LPALCDEVICERESUMESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCDEVICERESUMESOFT.class, "invoke", LPALCDEVICERESUMESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCDEVICERESUMESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCDEVICERESUMESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCDEVICERESUMESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCEVENTCALLBACKSOFT {
        void invoke(
            @Pointer(comment="ALCEVENTPROCTYPESOFT") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALCEVENTCALLBACKSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCEVENTCALLBACKSOFT.class, "invoke", LPALCEVENTCALLBACKSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCEVENTCALLBACKSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCEVENTCALLBACKSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCEVENTCALLBACKSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCEVENTCONTROLSOFT {
        @NativeType("ALCboolean") byte invoke(
            @NativeType("ALCsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @NativeType("ALCboolean") byte p2
        );

        static MethodHandle of(@NotNull LPALCEVENTCONTROLSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCEVENTCONTROLSOFT.class, "invoke", LPALCEVENTCONTROLSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCEVENTCONTROLSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCEVENTCONTROLSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCEVENTCONTROLSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCEVENTISSUPPORTEDSOFT {
        @NativeType("ALCenum") int invoke(
            @NativeType("ALCenum") int p0,
            @NativeType("ALCenum") int p1
        );

        static MethodHandle of(@NotNull LPALCEVENTISSUPPORTEDSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCEVENTISSUPPORTEDSOFT.class, "invoke", LPALCEVENTISSUPPORTEDSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCEVENTISSUPPORTEDSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCEVENTISSUPPORTEDSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCEVENTISSUPPORTEDSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCGETCONTEXTSDEVICE {
        ALCdevice invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull LPALCGETCONTEXTSDEVICE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCGETCONTEXTSDEVICE.class, "invoke", LPALCGETCONTEXTSDEVICE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCGETCONTEXTSDEVICE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCGETCONTEXTSDEVICE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETCONTEXTSDEVICE, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCGETCURRENTCONTEXT {
        ALCcontext invoke(
        );

        static MethodHandle of(@NotNull LPALCGETCURRENTCONTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCGETCURRENTCONTEXT.class, "invoke", LPALCGETCURRENTCONTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCGETCURRENTCONTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCGETCURRENTCONTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETCURRENTCONTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCGETENUMVALUE {
        @NativeType("ALCenum") int invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALCGETENUMVALUE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCGETENUMVALUE.class, "invoke", LPALCGETENUMVALUE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCGETENUMVALUE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCGETENUMVALUE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETENUMVALUE, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCGETERROR {
        @NativeType("ALCenum") int invoke(
            ALCdevice p0
        );

        static MethodHandle of(@NotNull LPALCGETERROR lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCGETERROR.class, "invoke", LPALCGETERROR.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCGETERROR lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCGETERROR lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETERROR, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCGETINTEGER64VSOFT {
        void invoke(
            ALCdevice p0,
            @NativeType("ALCenum") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALCGETINTEGER64VSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCGETINTEGER64VSOFT.class, "invoke", LPALCGETINTEGER64VSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCGETINTEGER64VSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCGETINTEGER64VSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETINTEGER64VSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCGETINTEGERV {
        void invoke(
            ALCdevice p0,
            @NativeType("ALCenum") int p1,
            @NativeType("ALCsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALCGETINTEGERV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCGETINTEGERV.class, "invoke", LPALCGETINTEGERV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCGETINTEGERV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCGETINTEGERV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETINTEGERV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCGETPROCADDRESS {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALCGETPROCADDRESS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCGETPROCADDRESS.class, "invoke", LPALCGETPROCADDRESS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCGETPROCADDRESS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCGETPROCADDRESS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETPROCADDRESS, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCGETPROCADDRESS2 {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALCGETPROCADDRESS2 lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCGETPROCADDRESS2.class, "invoke", LPALCGETPROCADDRESS2.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCGETPROCADDRESS2 lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCGETPROCADDRESS2 lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETPROCADDRESS2, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCGETSTRING {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCdevice p0,
            @NativeType("ALCenum") int p1
        );

        static MethodHandle of(@NotNull LPALCGETSTRING lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCGETSTRING.class, "invoke", LPALCGETSTRING.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCGETSTRING lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCGETSTRING lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETSTRING, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCGETSTRINGISOFT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCdevice p0,
            @NativeType("ALCenum") int p1,
            @NativeType("ALCsizei") int p2
        );

        static MethodHandle of(@NotNull LPALCGETSTRINGISOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCGETSTRINGISOFT.class, "invoke", LPALCGETSTRINGISOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCGETSTRINGISOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCGETSTRINGISOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETSTRINGISOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCISEXTENSIONPRESENT {
        @NativeType("ALCboolean") byte invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALCISEXTENSIONPRESENT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCISEXTENSIONPRESENT.class, "invoke", LPALCISEXTENSIONPRESENT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCISEXTENSIONPRESENT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCISEXTENSIONPRESENT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCISEXTENSIONPRESENT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCISRENDERFORMATSUPPORTEDSOFT {
        @NativeType("ALCboolean") byte invoke(
            ALCdevice p0,
            @NativeType("ALCsizei") int p1,
            @NativeType("ALCenum") int p2,
            @NativeType("ALCenum") int p3
        );

        static MethodHandle of(@NotNull LPALCISRENDERFORMATSUPPORTEDSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCISRENDERFORMATSUPPORTEDSOFT.class, "invoke", LPALCISRENDERFORMATSUPPORTEDSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCISRENDERFORMATSUPPORTEDSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCISRENDERFORMATSUPPORTEDSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCISRENDERFORMATSUPPORTEDSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCLOOPBACKOPENDEVICESOFT {
        ALCdevice invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0
        );

        static MethodHandle of(@NotNull LPALCLOOPBACKOPENDEVICESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCLOOPBACKOPENDEVICESOFT.class, "invoke", LPALCLOOPBACKOPENDEVICESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCLOOPBACKOPENDEVICESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCLOOPBACKOPENDEVICESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCLOOPBACKOPENDEVICESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCMAKECONTEXTCURRENT {
        @NativeType("ALCboolean") byte invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull LPALCMAKECONTEXTCURRENT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCMAKECONTEXTCURRENT.class, "invoke", LPALCMAKECONTEXTCURRENT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCMAKECONTEXTCURRENT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCMAKECONTEXTCURRENT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCMAKECONTEXTCURRENT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCOPENDEVICE {
        ALCdevice invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0
        );

        static MethodHandle of(@NotNull LPALCOPENDEVICE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCOPENDEVICE.class, "invoke", LPALCOPENDEVICE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCOPENDEVICE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCOPENDEVICE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCOPENDEVICE, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCPROCESSCONTEXT {
        void invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull LPALCPROCESSCONTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCPROCESSCONTEXT.class, "invoke", LPALCPROCESSCONTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCPROCESSCONTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCPROCESSCONTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCPROCESSCONTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCRENDERSAMPLESSOFT {
        void invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @NativeType("ALCsizei") int p2
        );

        static MethodHandle of(@NotNull LPALCRENDERSAMPLESSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCRENDERSAMPLESSOFT.class, "invoke", LPALCRENDERSAMPLESSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCRENDERSAMPLESSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCRENDERSAMPLESSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCRENDERSAMPLESSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCREOPENDEVICESOFT {
        @NativeType("ALCboolean") byte invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALCREOPENDEVICESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCREOPENDEVICESOFT.class, "invoke", LPALCREOPENDEVICESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCREOPENDEVICESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCREOPENDEVICESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCREOPENDEVICESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCRESETDEVICESOFT {
        @NativeType("ALCboolean") byte invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALCRESETDEVICESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCRESETDEVICESOFT.class, "invoke", LPALCRESETDEVICESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCRESETDEVICESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCRESETDEVICESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCRESETDEVICESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALCSUSPENDCONTEXT {
        void invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull LPALCSUSPENDCONTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALCSUSPENDCONTEXT.class, "invoke", LPALCSUSPENDCONTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALCSUSPENDCONTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALCSUSPENDCONTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCSUSPENDCONTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDEBUGMESSAGECALLBACKDIRECTEXT {
        void invoke(
            ALCcontext p0,
            @Pointer(comment="ALDEBUGPROCEXT") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALDEBUGMESSAGECALLBACKDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDEBUGMESSAGECALLBACKDIRECTEXT.class, "invoke", LPALDEBUGMESSAGECALLBACKDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDEBUGMESSAGECALLBACKDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDEBUGMESSAGECALLBACKDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEBUGMESSAGECALLBACKDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDEBUGMESSAGECALLBACKEXT {
        void invoke(
            @Pointer(comment="ALDEBUGPROCEXT") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALDEBUGMESSAGECALLBACKEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDEBUGMESSAGECALLBACKEXT.class, "invoke", LPALDEBUGMESSAGECALLBACKEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDEBUGMESSAGECALLBACKEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDEBUGMESSAGECALLBACKEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEBUGMESSAGECALLBACKEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDEBUGMESSAGECONTROLDIRECTEXT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALenum") int p3,
            @NativeType("ALsizei") int p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5,
            @NativeType("ALboolean") byte p6
        );

        static MethodHandle of(@NotNull LPALDEBUGMESSAGECONTROLDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDEBUGMESSAGECONTROLDIRECTEXT.class, "invoke", LPALDEBUGMESSAGECONTROLDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDEBUGMESSAGECONTROLDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDEBUGMESSAGECONTROLDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEBUGMESSAGECONTROLDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDEBUGMESSAGECONTROLEXT {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @NativeType("ALboolean") byte p5
        );

        static MethodHandle of(@NotNull LPALDEBUGMESSAGECONTROLEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDEBUGMESSAGECONTROLEXT.class, "invoke", LPALDEBUGMESSAGECONTROLEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDEBUGMESSAGECONTROLEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDEBUGMESSAGECONTROLEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEBUGMESSAGECONTROLEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDEBUGMESSAGEINSERTDIRECTEXT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALuint") int p3,
            @NativeType("ALenum") int p4,
            @NativeType("ALsizei") int p5,
            @Pointer(comment="void*") @NotNull MemorySegment p6
        );

        static MethodHandle of(@NotNull LPALDEBUGMESSAGEINSERTDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDEBUGMESSAGEINSERTDIRECTEXT.class, "invoke", LPALDEBUGMESSAGEINSERTDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDEBUGMESSAGEINSERTDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDEBUGMESSAGEINSERTDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEBUGMESSAGEINSERTDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDEBUGMESSAGEINSERTEXT {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALenum") int p3,
            @NativeType("ALsizei") int p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull LPALDEBUGMESSAGEINSERTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDEBUGMESSAGEINSERTEXT.class, "invoke", LPALDEBUGMESSAGEINSERTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDEBUGMESSAGEINSERTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDEBUGMESSAGEINSERTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEBUGMESSAGEINSERTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDEFERUPDATESDIRECTSOFT {
        void invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull LPALDEFERUPDATESDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDEFERUPDATESDIRECTSOFT.class, "invoke", LPALDEFERUPDATESDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDEFERUPDATESDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDEFERUPDATESDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEFERUPDATESDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDEFERUPDATESSOFT {
        void invoke(
        );

        static MethodHandle of(@NotNull LPALDEFERUPDATESSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDEFERUPDATESSOFT.class, "invoke", LPALDEFERUPDATESSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDEFERUPDATESSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDEFERUPDATESSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEFERUPDATESSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDELETEAUXILIARYEFFECTSLOTS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALDELETEAUXILIARYEFFECTSLOTS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDELETEAUXILIARYEFFECTSLOTS.class, "invoke", LPALDELETEAUXILIARYEFFECTSLOTS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDELETEAUXILIARYEFFECTSLOTS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDELETEAUXILIARYEFFECTSLOTS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEAUXILIARYEFFECTSLOTS, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDELETEAUXILIARYEFFECTSLOTSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALDELETEAUXILIARYEFFECTSLOTSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDELETEAUXILIARYEFFECTSLOTSDIRECT.class, "invoke", LPALDELETEAUXILIARYEFFECTSLOTSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDELETEAUXILIARYEFFECTSLOTSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDELETEAUXILIARYEFFECTSLOTSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEAUXILIARYEFFECTSLOTSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDELETEBUFFERS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALDELETEBUFFERS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDELETEBUFFERS.class, "invoke", LPALDELETEBUFFERS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDELETEBUFFERS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDELETEBUFFERS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEBUFFERS, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDELETEBUFFERSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALDELETEBUFFERSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDELETEBUFFERSDIRECT.class, "invoke", LPALDELETEBUFFERSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDELETEBUFFERSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDELETEBUFFERSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEBUFFERSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDELETEEFFECTS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALDELETEEFFECTS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDELETEEFFECTS.class, "invoke", LPALDELETEEFFECTS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDELETEEFFECTS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDELETEEFFECTS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEEFFECTS, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDELETEEFFECTSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALDELETEEFFECTSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDELETEEFFECTSDIRECT.class, "invoke", LPALDELETEEFFECTSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDELETEEFFECTSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDELETEEFFECTSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEEFFECTSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDELETEFILTERS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALDELETEFILTERS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDELETEFILTERS.class, "invoke", LPALDELETEFILTERS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDELETEFILTERS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDELETEFILTERS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEFILTERS, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDELETEFILTERSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALDELETEFILTERSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDELETEFILTERSDIRECT.class, "invoke", LPALDELETEFILTERSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDELETEFILTERSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDELETEFILTERSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEFILTERSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDELETESOURCES {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALDELETESOURCES lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDELETESOURCES.class, "invoke", LPALDELETESOURCES.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDELETESOURCES lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDELETESOURCES lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETESOURCES, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDELETESOURCESDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALDELETESOURCESDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDELETESOURCESDIRECT.class, "invoke", LPALDELETESOURCESDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDELETESOURCESDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDELETESOURCESDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETESOURCESDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDISABLE {
        void invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull LPALDISABLE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDISABLE.class, "invoke", LPALDISABLE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDISABLE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDISABLE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDISABLE, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDISABLEDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull LPALDISABLEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDISABLEDIRECT.class, "invoke", LPALDISABLEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDISABLEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDISABLEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDISABLEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDISTANCEMODEL {
        void invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull LPALDISTANCEMODEL lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDISTANCEMODEL.class, "invoke", LPALDISTANCEMODEL.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDISTANCEMODEL lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDISTANCEMODEL lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDISTANCEMODEL, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDISTANCEMODELDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull LPALDISTANCEMODELDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDISTANCEMODELDIRECT.class, "invoke", LPALDISTANCEMODELDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDISTANCEMODELDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDISTANCEMODELDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDISTANCEMODELDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDOPPLERFACTOR {
        void invoke(
            @NativeType("ALfloat") float p0
        );

        static MethodHandle of(@NotNull LPALDOPPLERFACTOR lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDOPPLERFACTOR.class, "invoke", LPALDOPPLERFACTOR.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDOPPLERFACTOR lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDOPPLERFACTOR lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDOPPLERFACTOR, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDOPPLERFACTORDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALfloat") float p1
        );

        static MethodHandle of(@NotNull LPALDOPPLERFACTORDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDOPPLERFACTORDIRECT.class, "invoke", LPALDOPPLERFACTORDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDOPPLERFACTORDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDOPPLERFACTORDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDOPPLERFACTORDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALDOPPLERVELOCITY {
        void invoke(
            @NativeType("ALfloat") float p0
        );

        static MethodHandle of(@NotNull LPALDOPPLERVELOCITY lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALDOPPLERVELOCITY.class, "invoke", LPALDOPPLERVELOCITY.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALDOPPLERVELOCITY lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALDOPPLERVELOCITY lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDOPPLERVELOCITY, arena);
        }
    }

    @FunctionalInterface
    public interface LPALEFFECTF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2
        );

        static MethodHandle of(@NotNull LPALEFFECTF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALEFFECTF.class, "invoke", LPALEFFECTF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALEFFECTF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALEFFECTF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTF, arena);
        }
    }

    @FunctionalInterface
    public interface LPALEFFECTFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALfloat") float p3
        );

        static MethodHandle of(@NotNull LPALEFFECTFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALEFFECTFDIRECT.class, "invoke", LPALEFFECTFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALEFFECTFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALEFFECTFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALEFFECTFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALEFFECTFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALEFFECTFV.class, "invoke", LPALEFFECTFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALEFFECTFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALEFFECTFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTFV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALEFFECTFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALEFFECTFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALEFFECTFVDIRECT.class, "invoke", LPALEFFECTFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALEFFECTFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALEFFECTFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALEFFECTI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2
        );

        static MethodHandle of(@NotNull LPALEFFECTI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALEFFECTI.class, "invoke", LPALEFFECTI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALEFFECTI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALEFFECTI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTI, arena);
        }
    }

    @FunctionalInterface
    public interface LPALEFFECTIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint") int p3
        );

        static MethodHandle of(@NotNull LPALEFFECTIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALEFFECTIDIRECT.class, "invoke", LPALEFFECTIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALEFFECTIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALEFFECTIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALEFFECTIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALEFFECTIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALEFFECTIV.class, "invoke", LPALEFFECTIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALEFFECTIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALEFFECTIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTIV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALEFFECTIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALEFFECTIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALEFFECTIVDIRECT.class, "invoke", LPALEFFECTIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALEFFECTIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALEFFECTIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALENABLE {
        void invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull LPALENABLE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALENABLE.class, "invoke", LPALENABLE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALENABLE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALENABLE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALENABLE, arena);
        }
    }

    @FunctionalInterface
    public interface LPALENABLEDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull LPALENABLEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALENABLEDIRECT.class, "invoke", LPALENABLEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALENABLEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALENABLEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALENABLEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALEVENTCALLBACKDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @Pointer(comment="ALEVENTPROCSOFT") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALEVENTCALLBACKDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALEVENTCALLBACKDIRECTSOFT.class, "invoke", LPALEVENTCALLBACKDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALEVENTCALLBACKDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALEVENTCALLBACKDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEVENTCALLBACKDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALEVENTCALLBACKSOFT {
        void invoke(
            @Pointer(comment="ALEVENTPROCSOFT") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALEVENTCALLBACKSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALEVENTCALLBACKSOFT.class, "invoke", LPALEVENTCALLBACKSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALEVENTCALLBACKSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALEVENTCALLBACKSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEVENTCALLBACKSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALEVENTCONTROLDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @NativeType("ALboolean") byte p3
        );

        static MethodHandle of(@NotNull LPALEVENTCONTROLDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALEVENTCONTROLDIRECTSOFT.class, "invoke", LPALEVENTCONTROLDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALEVENTCONTROLDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALEVENTCONTROLDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEVENTCONTROLDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALEVENTCONTROLSOFT {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @NativeType("ALboolean") byte p2
        );

        static MethodHandle of(@NotNull LPALEVENTCONTROLSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALEVENTCONTROLSOFT.class, "invoke", LPALEVENTCONTROLSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALEVENTCONTROLSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALEVENTCONTROLSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEVENTCONTROLSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALFILTERF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2
        );

        static MethodHandle of(@NotNull LPALFILTERF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALFILTERF.class, "invoke", LPALFILTERF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALFILTERF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALFILTERF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERF, arena);
        }
    }

    @FunctionalInterface
    public interface LPALFILTERFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALfloat") float p3
        );

        static MethodHandle of(@NotNull LPALFILTERFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALFILTERFDIRECT.class, "invoke", LPALFILTERFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALFILTERFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALFILTERFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALFILTERFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALFILTERFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALFILTERFV.class, "invoke", LPALFILTERFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALFILTERFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALFILTERFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERFV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALFILTERFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALFILTERFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALFILTERFVDIRECT.class, "invoke", LPALFILTERFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALFILTERFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALFILTERFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALFILTERI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2
        );

        static MethodHandle of(@NotNull LPALFILTERI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALFILTERI.class, "invoke", LPALFILTERI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALFILTERI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALFILTERI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERI, arena);
        }
    }

    @FunctionalInterface
    public interface LPALFILTERIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint") int p3
        );

        static MethodHandle of(@NotNull LPALFILTERIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALFILTERIDIRECT.class, "invoke", LPALFILTERIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALFILTERIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALFILTERIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALFILTERIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALFILTERIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALFILTERIV.class, "invoke", LPALFILTERIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALFILTERIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALFILTERIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERIV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALFILTERIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALFILTERIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALFILTERIVDIRECT.class, "invoke", LPALFILTERIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALFILTERIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALFILTERIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALFOLDBACKCALLBACK {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALsizei") int p1
        );

        static MethodHandle of(@NotNull LPALFOLDBACKCALLBACK lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALFOLDBACKCALLBACK.class, "invoke", LPALFOLDBACKCALLBACK.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALFOLDBACKCALLBACK lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALFOLDBACKCALLBACK lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFOLDBACKCALLBACK, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGENAUXILIARYEFFECTSLOTS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGENAUXILIARYEFFECTSLOTS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGENAUXILIARYEFFECTSLOTS.class, "invoke", LPALGENAUXILIARYEFFECTSLOTS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGENAUXILIARYEFFECTSLOTS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGENAUXILIARYEFFECTSLOTS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENAUXILIARYEFFECTSLOTS, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGENAUXILIARYEFFECTSLOTSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGENAUXILIARYEFFECTSLOTSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGENAUXILIARYEFFECTSLOTSDIRECT.class, "invoke", LPALGENAUXILIARYEFFECTSLOTSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGENAUXILIARYEFFECTSLOTSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGENAUXILIARYEFFECTSLOTSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENAUXILIARYEFFECTSLOTSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGENBUFFERS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGENBUFFERS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGENBUFFERS.class, "invoke", LPALGENBUFFERS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGENBUFFERS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGENBUFFERS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENBUFFERS, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGENBUFFERSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGENBUFFERSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGENBUFFERSDIRECT.class, "invoke", LPALGENBUFFERSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGENBUFFERSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGENBUFFERSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENBUFFERSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGENEFFECTS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGENEFFECTS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGENEFFECTS.class, "invoke", LPALGENEFFECTS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGENEFFECTS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGENEFFECTS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENEFFECTS, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGENEFFECTSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGENEFFECTSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGENEFFECTSDIRECT.class, "invoke", LPALGENEFFECTSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGENEFFECTSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGENEFFECTSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENEFFECTSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGENFILTERS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGENFILTERS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGENFILTERS.class, "invoke", LPALGENFILTERS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGENFILTERS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGENFILTERS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENFILTERS, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGENFILTERSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGENFILTERSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGENFILTERSDIRECT.class, "invoke", LPALGENFILTERSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGENFILTERSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGENFILTERSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENFILTERSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGENSOURCES {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGENSOURCES lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGENSOURCES.class, "invoke", LPALGENSOURCES.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGENSOURCES lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGENSOURCES lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENSOURCES, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGENSOURCESDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGENSOURCESDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGENSOURCESDIRECT.class, "invoke", LPALGENSOURCESDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGENSOURCESDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGENSOURCESDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENSOURCESDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETAUXILIARYEFFECTSLOTF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETAUXILIARYEFFECTSLOTF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETAUXILIARYEFFECTSLOTF.class, "invoke", LPALGETAUXILIARYEFFECTSLOTF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETAUXILIARYEFFECTSLOTF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETAUXILIARYEFFECTSLOTF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTF, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETAUXILIARYEFFECTSLOTFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETAUXILIARYEFFECTSLOTFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETAUXILIARYEFFECTSLOTFDIRECT.class, "invoke", LPALGETAUXILIARYEFFECTSLOTFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETAUXILIARYEFFECTSLOTFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETAUXILIARYEFFECTSLOTFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETAUXILIARYEFFECTSLOTFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETAUXILIARYEFFECTSLOTFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETAUXILIARYEFFECTSLOTFV.class, "invoke", LPALGETAUXILIARYEFFECTSLOTFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETAUXILIARYEFFECTSLOTFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETAUXILIARYEFFECTSLOTFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTFV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETAUXILIARYEFFECTSLOTFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETAUXILIARYEFFECTSLOTFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETAUXILIARYEFFECTSLOTFVDIRECT.class, "invoke", LPALGETAUXILIARYEFFECTSLOTFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETAUXILIARYEFFECTSLOTFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETAUXILIARYEFFECTSLOTFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETAUXILIARYEFFECTSLOTI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETAUXILIARYEFFECTSLOTI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETAUXILIARYEFFECTSLOTI.class, "invoke", LPALGETAUXILIARYEFFECTSLOTI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETAUXILIARYEFFECTSLOTI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETAUXILIARYEFFECTSLOTI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTI, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETAUXILIARYEFFECTSLOTIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETAUXILIARYEFFECTSLOTIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETAUXILIARYEFFECTSLOTIDIRECT.class, "invoke", LPALGETAUXILIARYEFFECTSLOTIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETAUXILIARYEFFECTSLOTIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETAUXILIARYEFFECTSLOTIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETAUXILIARYEFFECTSLOTIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETAUXILIARYEFFECTSLOTIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETAUXILIARYEFFECTSLOTIV.class, "invoke", LPALGETAUXILIARYEFFECTSLOTIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETAUXILIARYEFFECTSLOTIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETAUXILIARYEFFECTSLOTIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTIV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETAUXILIARYEFFECTSLOTIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETAUXILIARYEFFECTSLOTIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETAUXILIARYEFFECTSLOTIVDIRECT.class, "invoke", LPALGETAUXILIARYEFFECTSLOTIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETAUXILIARYEFFECTSLOTIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETAUXILIARYEFFECTSLOTIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBOOLEAN {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull LPALGETBOOLEAN lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBOOLEAN.class, "invoke", LPALGETBOOLEAN.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBOOLEAN lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBOOLEAN lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBOOLEAN, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBOOLEANDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull LPALGETBOOLEANDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBOOLEANDIRECT.class, "invoke", LPALGETBOOLEANDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBOOLEANDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBOOLEANDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBOOLEANDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBOOLEANV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGETBOOLEANV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBOOLEANV.class, "invoke", LPALGETBOOLEANV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBOOLEANV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBOOLEANV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBOOLEANV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBOOLEANVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETBOOLEANVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBOOLEANVDIRECT.class, "invoke", LPALGETBOOLEANVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBOOLEANVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBOOLEANVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBOOLEANVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFER3F {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull LPALGETBUFFER3F lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFER3F.class, "invoke", LPALGETBUFFER3F.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFER3F lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFER3F lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFER3F, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFER3FDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull LPALGETBUFFER3FDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFER3FDIRECT.class, "invoke", LPALGETBUFFER3FDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFER3FDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFER3FDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFER3FDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFER3I {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull LPALGETBUFFER3I lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFER3I.class, "invoke", LPALGETBUFFER3I.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFER3I lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFER3I lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFER3I, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFER3IDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull LPALGETBUFFER3IDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFER3IDIRECT.class, "invoke", LPALGETBUFFER3IDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFER3IDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFER3IDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFER3IDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFER3PTRDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull LPALGETBUFFER3PTRDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFER3PTRDIRECTSOFT.class, "invoke", LPALGETBUFFER3PTRDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFER3PTRDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFER3PTRDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFER3PTRDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFER3PTRSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull LPALGETBUFFER3PTRSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFER3PTRSOFT.class, "invoke", LPALGETBUFFER3PTRSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFER3PTRSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFER3PTRSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFER3PTRSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFERF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETBUFFERF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFERF.class, "invoke", LPALGETBUFFERF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFERF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFERF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERF, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFERFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETBUFFERFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFERFDIRECT.class, "invoke", LPALGETBUFFERFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFERFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFERFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFERFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETBUFFERFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFERFV.class, "invoke", LPALGETBUFFERFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFERFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFERFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERFV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFERFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETBUFFERFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFERFVDIRECT.class, "invoke", LPALGETBUFFERFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFERFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFERFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFERI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETBUFFERI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFERI.class, "invoke", LPALGETBUFFERI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFERI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFERI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERI, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFERIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETBUFFERIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFERIDIRECT.class, "invoke", LPALGETBUFFERIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFERIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFERIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFERIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETBUFFERIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFERIV.class, "invoke", LPALGETBUFFERIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFERIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFERIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERIV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFERIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETBUFFERIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFERIVDIRECT.class, "invoke", LPALGETBUFFERIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFERIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFERIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFERPTRDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETBUFFERPTRDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFERPTRDIRECTSOFT.class, "invoke", LPALGETBUFFERPTRDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFERPTRDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFERPTRDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERPTRDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFERPTRSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETBUFFERPTRSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFERPTRSOFT.class, "invoke", LPALGETBUFFERPTRSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFERPTRSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFERPTRSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERPTRSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFERPTRVDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETBUFFERPTRVDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFERPTRVDIRECTSOFT.class, "invoke", LPALGETBUFFERPTRVDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFERPTRVDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFERPTRVDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERPTRVDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFERPTRVSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETBUFFERPTRVSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFERPTRVSOFT.class, "invoke", LPALGETBUFFERPTRVSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFERPTRVSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFERPTRVSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERPTRVSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETBUFFERSAMPLESSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALsizei") int p1,
            @NativeType("ALsizei") int p2,
            @NativeType("ALenum") int p3,
            @NativeType("ALenum") int p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull LPALGETBUFFERSAMPLESSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETBUFFERSAMPLESSOFT.class, "invoke", LPALGETBUFFERSAMPLESSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETBUFFERSAMPLESSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETBUFFERSAMPLESSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERSAMPLESSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETDEBUGMESSAGELOGDIRECTEXT {
        @NativeType("ALuint") int invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5,
            @Pointer(comment="void*") @NotNull MemorySegment p6,
            @Pointer(comment="void*") @NotNull MemorySegment p7,
            @Pointer(comment="void*") @NotNull MemorySegment p8
        );

        static MethodHandle of(@NotNull LPALGETDEBUGMESSAGELOGDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETDEBUGMESSAGELOGDIRECTEXT.class, "invoke", LPALGETDEBUGMESSAGELOGDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETDEBUGMESSAGELOGDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETDEBUGMESSAGELOGDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETDEBUGMESSAGELOGDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETDEBUGMESSAGELOGEXT {
        @NativeType("ALuint") int invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5,
            @Pointer(comment="void*") @NotNull MemorySegment p6,
            @Pointer(comment="void*") @NotNull MemorySegment p7
        );

        static MethodHandle of(@NotNull LPALGETDEBUGMESSAGELOGEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETDEBUGMESSAGELOGEXT.class, "invoke", LPALGETDEBUGMESSAGELOGEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETDEBUGMESSAGELOGEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETDEBUGMESSAGELOGEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETDEBUGMESSAGELOGEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETDOUBLE {
        @NativeType("ALdouble") double invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull LPALGETDOUBLE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETDOUBLE.class, "invoke", LPALGETDOUBLE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETDOUBLE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETDOUBLE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETDOUBLE, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETDOUBLEDIRECT {
        @NativeType("ALdouble") double invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull LPALGETDOUBLEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETDOUBLEDIRECT.class, "invoke", LPALGETDOUBLEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETDOUBLEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETDOUBLEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETDOUBLEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETDOUBLEV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGETDOUBLEV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETDOUBLEV.class, "invoke", LPALGETDOUBLEV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETDOUBLEV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETDOUBLEV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETDOUBLEV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETDOUBLEVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETDOUBLEVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETDOUBLEVDIRECT.class, "invoke", LPALGETDOUBLEVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETDOUBLEVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETDOUBLEVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETDOUBLEVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETEFFECTF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETEFFECTF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETEFFECTF.class, "invoke", LPALGETEFFECTF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETEFFECTF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETEFFECTF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTF, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETEFFECTFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETEFFECTFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETEFFECTFDIRECT.class, "invoke", LPALGETEFFECTFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETEFFECTFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETEFFECTFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETEFFECTFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETEFFECTFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETEFFECTFV.class, "invoke", LPALGETEFFECTFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETEFFECTFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETEFFECTFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTFV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETEFFECTFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETEFFECTFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETEFFECTFVDIRECT.class, "invoke", LPALGETEFFECTFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETEFFECTFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETEFFECTFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETEFFECTI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETEFFECTI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETEFFECTI.class, "invoke", LPALGETEFFECTI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETEFFECTI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETEFFECTI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTI, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETEFFECTIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETEFFECTIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETEFFECTIDIRECT.class, "invoke", LPALGETEFFECTIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETEFFECTIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETEFFECTIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETEFFECTIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETEFFECTIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETEFFECTIV.class, "invoke", LPALGETEFFECTIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETEFFECTIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETEFFECTIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTIV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETEFFECTIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETEFFECTIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETEFFECTIVDIRECT.class, "invoke", LPALGETEFFECTIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETEFFECTIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETEFFECTIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETENUMVALUE {
        @NativeType("ALenum") int invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0
        );

        static MethodHandle of(@NotNull LPALGETENUMVALUE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETENUMVALUE.class, "invoke", LPALGETENUMVALUE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETENUMVALUE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETENUMVALUE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETENUMVALUE, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETENUMVALUEDIRECT {
        @NativeType("ALenum") int invoke(
            ALCcontext p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGETENUMVALUEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETENUMVALUEDIRECT.class, "invoke", LPALGETENUMVALUEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETENUMVALUEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETENUMVALUEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETENUMVALUEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETERROR {
        @NativeType("ALenum") int invoke(
        );

        static MethodHandle of(@NotNull LPALGETERROR lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETERROR.class, "invoke", LPALGETERROR.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETERROR lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETERROR lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETERROR, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETERRORDIRECT {
        @NativeType("ALenum") int invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull LPALGETERRORDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETERRORDIRECT.class, "invoke", LPALGETERRORDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETERRORDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETERRORDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETERRORDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETFILTERF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETFILTERF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETFILTERF.class, "invoke", LPALGETFILTERF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETFILTERF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETFILTERF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERF, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETFILTERFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETFILTERFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETFILTERFDIRECT.class, "invoke", LPALGETFILTERFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETFILTERFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETFILTERFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETFILTERFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETFILTERFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETFILTERFV.class, "invoke", LPALGETFILTERFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETFILTERFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETFILTERFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERFV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETFILTERFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETFILTERFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETFILTERFVDIRECT.class, "invoke", LPALGETFILTERFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETFILTERFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETFILTERFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETFILTERI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETFILTERI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETFILTERI.class, "invoke", LPALGETFILTERI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETFILTERI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETFILTERI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERI, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETFILTERIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETFILTERIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETFILTERIDIRECT.class, "invoke", LPALGETFILTERIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETFILTERIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETFILTERIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETFILTERIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETFILTERIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETFILTERIV.class, "invoke", LPALGETFILTERIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETFILTERIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETFILTERIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERIV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETFILTERIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETFILTERIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETFILTERIVDIRECT.class, "invoke", LPALGETFILTERIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETFILTERIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETFILTERIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETFLOAT {
        @NativeType("ALfloat") float invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull LPALGETFLOAT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETFLOAT.class, "invoke", LPALGETFLOAT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETFLOAT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETFLOAT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFLOAT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETFLOATDIRECT {
        @NativeType("ALfloat") float invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull LPALGETFLOATDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETFLOATDIRECT.class, "invoke", LPALGETFLOATDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETFLOATDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETFLOATDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFLOATDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETFLOATV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGETFLOATV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETFLOATV.class, "invoke", LPALGETFLOATV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETFLOATV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETFLOATV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFLOATV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETFLOATVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETFLOATVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETFLOATVDIRECT.class, "invoke", LPALGETFLOATVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETFLOATVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETFLOATVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFLOATVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETINTEGER {
        @NativeType("ALint") int invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull LPALGETINTEGER lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETINTEGER.class, "invoke", LPALGETINTEGER.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETINTEGER lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETINTEGER lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETINTEGER, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETINTEGERDIRECT {
        @NativeType("ALint") int invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull LPALGETINTEGERDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETINTEGERDIRECT.class, "invoke", LPALGETINTEGERDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETINTEGERDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETINTEGERDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETINTEGERDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETINTEGERV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGETINTEGERV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETINTEGERV.class, "invoke", LPALGETINTEGERV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETINTEGERV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETINTEGERV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETINTEGERV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETINTEGERVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETINTEGERVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETINTEGERVDIRECT.class, "invoke", LPALGETINTEGERVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETINTEGERVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETINTEGERVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETINTEGERVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETLISTENER3F {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETLISTENER3F lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETLISTENER3F.class, "invoke", LPALGETLISTENER3F.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETLISTENER3F lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETLISTENER3F lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENER3F, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETLISTENER3FDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull LPALGETLISTENER3FDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETLISTENER3FDIRECT.class, "invoke", LPALGETLISTENER3FDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETLISTENER3FDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETLISTENER3FDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENER3FDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETLISTENER3I {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETLISTENER3I lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETLISTENER3I.class, "invoke", LPALGETLISTENER3I.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETLISTENER3I lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETLISTENER3I lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENER3I, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETLISTENER3IDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull LPALGETLISTENER3IDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETLISTENER3IDIRECT.class, "invoke", LPALGETLISTENER3IDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETLISTENER3IDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETLISTENER3IDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENER3IDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETLISTENERF {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGETLISTENERF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETLISTENERF.class, "invoke", LPALGETLISTENERF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETLISTENERF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETLISTENERF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERF, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETLISTENERFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETLISTENERFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETLISTENERFDIRECT.class, "invoke", LPALGETLISTENERFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETLISTENERFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETLISTENERFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETLISTENERFV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGETLISTENERFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETLISTENERFV.class, "invoke", LPALGETLISTENERFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETLISTENERFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETLISTENERFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERFV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETLISTENERFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETLISTENERFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETLISTENERFVDIRECT.class, "invoke", LPALGETLISTENERFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETLISTENERFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETLISTENERFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETLISTENERI {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGETLISTENERI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETLISTENERI.class, "invoke", LPALGETLISTENERI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETLISTENERI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETLISTENERI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERI, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETLISTENERIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETLISTENERIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETLISTENERIDIRECT.class, "invoke", LPALGETLISTENERIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETLISTENERIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETLISTENERIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETLISTENERIV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGETLISTENERIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETLISTENERIV.class, "invoke", LPALGETLISTENERIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETLISTENERIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETLISTENERIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERIV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETLISTENERIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETLISTENERIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETLISTENERIVDIRECT.class, "invoke", LPALGETLISTENERIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETLISTENERIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETLISTENERIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETOBJECTLABELDIRECTEXT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull LPALGETOBJECTLABELDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETOBJECTLABELDIRECTEXT.class, "invoke", LPALGETOBJECTLABELDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETOBJECTLABELDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETOBJECTLABELDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETOBJECTLABELDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETOBJECTLABELEXT {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull LPALGETOBJECTLABELEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETOBJECTLABELEXT.class, "invoke", LPALGETOBJECTLABELEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETOBJECTLABELEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETOBJECTLABELEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETOBJECTLABELEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETPOINTERDIRECTEXT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull LPALGETPOINTERDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETPOINTERDIRECTEXT.class, "invoke", LPALGETPOINTERDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETPOINTERDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETPOINTERDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTERDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETPOINTERDIRECTSOFT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull LPALGETPOINTERDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETPOINTERDIRECTSOFT.class, "invoke", LPALGETPOINTERDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETPOINTERDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETPOINTERDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTERDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETPOINTEREXT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull LPALGETPOINTEREXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETPOINTEREXT.class, "invoke", LPALGETPOINTEREXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETPOINTEREXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETPOINTEREXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTEREXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETPOINTERSOFT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull LPALGETPOINTERSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETPOINTERSOFT.class, "invoke", LPALGETPOINTERSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETPOINTERSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETPOINTERSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTERSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETPOINTERVDIRECTEXT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETPOINTERVDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETPOINTERVDIRECTEXT.class, "invoke", LPALGETPOINTERVDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETPOINTERVDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETPOINTERVDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTERVDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETPOINTERVDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETPOINTERVDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETPOINTERVDIRECTSOFT.class, "invoke", LPALGETPOINTERVDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETPOINTERVDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETPOINTERVDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTERVDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETPOINTERVEXT {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGETPOINTERVEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETPOINTERVEXT.class, "invoke", LPALGETPOINTERVEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETPOINTERVEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETPOINTERVEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTERVEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETPOINTERVSOFT {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGETPOINTERVSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETPOINTERVSOFT.class, "invoke", LPALGETPOINTERVSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETPOINTERVSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETPOINTERVSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTERVSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETPROCADDRESS {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0
        );

        static MethodHandle of(@NotNull LPALGETPROCADDRESS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETPROCADDRESS.class, "invoke", LPALGETPROCADDRESS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETPROCADDRESS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETPROCADDRESS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPROCADDRESS, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETPROCADDRESSDIRECT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCcontext p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALGETPROCADDRESSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETPROCADDRESSDIRECT.class, "invoke", LPALGETPROCADDRESSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETPROCADDRESSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETPROCADDRESSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPROCADDRESSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCE3DDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull LPALGETSOURCE3DDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCE3DDIRECTSOFT.class, "invoke", LPALGETSOURCE3DDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCE3DDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCE3DDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3DDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCE3DSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull LPALGETSOURCE3DSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCE3DSOFT.class, "invoke", LPALGETSOURCE3DSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCE3DSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCE3DSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3DSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCE3F {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull LPALGETSOURCE3F lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCE3F.class, "invoke", LPALGETSOURCE3F.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCE3F lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCE3F lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3F, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCE3FDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull LPALGETSOURCE3FDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCE3FDIRECT.class, "invoke", LPALGETSOURCE3FDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCE3FDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCE3FDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3FDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCE3I {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull LPALGETSOURCE3I lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCE3I.class, "invoke", LPALGETSOURCE3I.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCE3I lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCE3I lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3I, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCE3I64DIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull LPALGETSOURCE3I64DIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCE3I64DIRECTSOFT.class, "invoke", LPALGETSOURCE3I64DIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCE3I64DIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCE3I64DIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3I64DIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCE3I64SOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull LPALGETSOURCE3I64SOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCE3I64SOFT.class, "invoke", LPALGETSOURCE3I64SOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCE3I64SOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCE3I64SOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3I64SOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCE3IDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull LPALGETSOURCE3IDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCE3IDIRECT.class, "invoke", LPALGETSOURCE3IDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCE3IDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCE3IDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3IDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEDDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETSOURCEDDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEDDIRECTSOFT.class, "invoke", LPALGETSOURCEDDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEDDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEDDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEDDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEDSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETSOURCEDSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEDSOFT.class, "invoke", LPALGETSOURCEDSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEDSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEDSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEDSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEDVDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETSOURCEDVDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEDVDIRECTSOFT.class, "invoke", LPALGETSOURCEDVDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEDVDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEDVDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEDVDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEDVSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETSOURCEDVSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEDVSOFT.class, "invoke", LPALGETSOURCEDVSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEDVSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEDVSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEDVSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETSOURCEF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEF.class, "invoke", LPALGETSOURCEF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEF, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETSOURCEFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEFDIRECT.class, "invoke", LPALGETSOURCEFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETSOURCEFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEFV.class, "invoke", LPALGETSOURCEFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEFV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETSOURCEFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEFVDIRECT.class, "invoke", LPALGETSOURCEFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETSOURCEI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEI.class, "invoke", LPALGETSOURCEI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEI, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEI64DIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETSOURCEI64DIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEI64DIRECTSOFT.class, "invoke", LPALGETSOURCEI64DIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEI64DIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEI64DIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEI64DIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEI64SOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETSOURCEI64SOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEI64SOFT.class, "invoke", LPALGETSOURCEI64SOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEI64SOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEI64SOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEI64SOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEI64VDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETSOURCEI64VDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEI64VDIRECTSOFT.class, "invoke", LPALGETSOURCEI64VDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEI64VDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEI64VDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEI64VDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEI64VSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETSOURCEI64VSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEI64VSOFT.class, "invoke", LPALGETSOURCEI64VSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEI64VSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEI64VSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEI64VSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETSOURCEIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEIDIRECT.class, "invoke", LPALGETSOURCEIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALGETSOURCEIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEIV.class, "invoke", LPALGETSOURCEIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEIV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSOURCEIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALGETSOURCEIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSOURCEIVDIRECT.class, "invoke", LPALGETSOURCEIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSOURCEIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSOURCEIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSTRING {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull LPALGETSTRING lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSTRING.class, "invoke", LPALGETSTRING.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSTRING lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSTRING lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSTRING, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSTRINGDIRECT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull LPALGETSTRINGDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSTRINGDIRECT.class, "invoke", LPALGETSTRINGDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSTRINGDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSTRINGDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSTRINGDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSTRINGIDIRECTSOFT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALsizei") int p2
        );

        static MethodHandle of(@NotNull LPALGETSTRINGIDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSTRINGIDIRECTSOFT.class, "invoke", LPALGETSTRINGIDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSTRINGIDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSTRINGIDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSTRINGIDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALGETSTRINGISOFT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALsizei") int p1
        );

        static MethodHandle of(@NotNull LPALGETSTRINGISOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALGETSTRINGISOFT.class, "invoke", LPALGETSTRINGISOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALGETSTRINGISOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALGETSTRINGISOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSTRINGISOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISAUXILIARYEFFECTSLOT {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull LPALISAUXILIARYEFFECTSLOT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISAUXILIARYEFFECTSLOT.class, "invoke", LPALISAUXILIARYEFFECTSLOT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISAUXILIARYEFFECTSLOT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISAUXILIARYEFFECTSLOT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISAUXILIARYEFFECTSLOT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISAUXILIARYEFFECTSLOTDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull LPALISAUXILIARYEFFECTSLOTDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISAUXILIARYEFFECTSLOTDIRECT.class, "invoke", LPALISAUXILIARYEFFECTSLOTDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISAUXILIARYEFFECTSLOTDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISAUXILIARYEFFECTSLOTDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISAUXILIARYEFFECTSLOTDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISBUFFER {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull LPALISBUFFER lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISBUFFER.class, "invoke", LPALISBUFFER.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISBUFFER lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISBUFFER lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISBUFFER, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISBUFFERDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull LPALISBUFFERDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISBUFFERDIRECT.class, "invoke", LPALISBUFFERDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISBUFFERDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISBUFFERDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISBUFFERDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISBUFFERFORMATSUPPORTEDSOFT {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull LPALISBUFFERFORMATSUPPORTEDSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISBUFFERFORMATSUPPORTEDSOFT.class, "invoke", LPALISBUFFERFORMATSUPPORTEDSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISBUFFERFORMATSUPPORTEDSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISBUFFERFORMATSUPPORTEDSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISBUFFERFORMATSUPPORTEDSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISEFFECT {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull LPALISEFFECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISEFFECT.class, "invoke", LPALISEFFECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISEFFECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISEFFECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISEFFECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISEFFECTDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull LPALISEFFECTDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISEFFECTDIRECT.class, "invoke", LPALISEFFECTDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISEFFECTDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISEFFECTDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISEFFECTDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISENABLED {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull LPALISENABLED lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISENABLED.class, "invoke", LPALISENABLED.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISENABLED lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISENABLED lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISENABLED, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISENABLEDDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull LPALISENABLEDDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISENABLEDDIRECT.class, "invoke", LPALISENABLEDDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISENABLEDDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISENABLEDDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISENABLEDDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISEXTENSIONPRESENT {
        @NativeType("ALboolean") byte invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0
        );

        static MethodHandle of(@NotNull LPALISEXTENSIONPRESENT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISEXTENSIONPRESENT.class, "invoke", LPALISEXTENSIONPRESENT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISEXTENSIONPRESENT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISEXTENSIONPRESENT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISEXTENSIONPRESENT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISEXTENSIONPRESENTDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALISEXTENSIONPRESENTDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISEXTENSIONPRESENTDIRECT.class, "invoke", LPALISEXTENSIONPRESENTDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISEXTENSIONPRESENTDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISEXTENSIONPRESENTDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISEXTENSIONPRESENTDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISFILTER {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull LPALISFILTER lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISFILTER.class, "invoke", LPALISFILTER.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISFILTER lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISFILTER lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISFILTER, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISFILTERDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull LPALISFILTERDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISFILTERDIRECT.class, "invoke", LPALISFILTERDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISFILTERDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISFILTERDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISFILTERDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISSOURCE {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull LPALISSOURCE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISSOURCE.class, "invoke", LPALISSOURCE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISSOURCE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISSOURCE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISSOURCE, arena);
        }
    }

    @FunctionalInterface
    public interface LPALISSOURCEDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull LPALISSOURCEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALISSOURCEDIRECT.class, "invoke", LPALISSOURCEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALISSOURCEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALISSOURCEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISSOURCEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALLISTENER3F {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALfloat") float p1,
            @NativeType("ALfloat") float p2,
            @NativeType("ALfloat") float p3
        );

        static MethodHandle of(@NotNull LPALLISTENER3F lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALLISTENER3F.class, "invoke", LPALLISTENER3F.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALLISTENER3F lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALLISTENER3F lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENER3F, arena);
        }
    }

    @FunctionalInterface
    public interface LPALLISTENER3FDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2,
            @NativeType("ALfloat") float p3,
            @NativeType("ALfloat") float p4
        );

        static MethodHandle of(@NotNull LPALLISTENER3FDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALLISTENER3FDIRECT.class, "invoke", LPALLISTENER3FDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALLISTENER3FDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALLISTENER3FDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENER3FDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALLISTENER3I {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALint") int p1,
            @NativeType("ALint") int p2,
            @NativeType("ALint") int p3
        );

        static MethodHandle of(@NotNull LPALLISTENER3I lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALLISTENER3I.class, "invoke", LPALLISTENER3I.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALLISTENER3I lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALLISTENER3I lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENER3I, arena);
        }
    }

    @FunctionalInterface
    public interface LPALLISTENER3IDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2,
            @NativeType("ALint") int p3,
            @NativeType("ALint") int p4
        );

        static MethodHandle of(@NotNull LPALLISTENER3IDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALLISTENER3IDIRECT.class, "invoke", LPALLISTENER3IDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALLISTENER3IDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALLISTENER3IDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENER3IDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALLISTENERF {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALfloat") float p1
        );

        static MethodHandle of(@NotNull LPALLISTENERF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALLISTENERF.class, "invoke", LPALLISTENERF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALLISTENERF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALLISTENERF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERF, arena);
        }
    }

    @FunctionalInterface
    public interface LPALLISTENERFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2
        );

        static MethodHandle of(@NotNull LPALLISTENERFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALLISTENERFDIRECT.class, "invoke", LPALLISTENERFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALLISTENERFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALLISTENERFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALLISTENERFV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALLISTENERFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALLISTENERFV.class, "invoke", LPALLISTENERFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALLISTENERFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALLISTENERFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERFV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALLISTENERFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALLISTENERFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALLISTENERFVDIRECT.class, "invoke", LPALLISTENERFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALLISTENERFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALLISTENERFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALLISTENERI {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALint") int p1
        );

        static MethodHandle of(@NotNull LPALLISTENERI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALLISTENERI.class, "invoke", LPALLISTENERI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALLISTENERI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALLISTENERI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERI, arena);
        }
    }

    @FunctionalInterface
    public interface LPALLISTENERIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2
        );

        static MethodHandle of(@NotNull LPALLISTENERIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALLISTENERIDIRECT.class, "invoke", LPALLISTENERIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALLISTENERIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALLISTENERIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALLISTENERIV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALLISTENERIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALLISTENERIV.class, "invoke", LPALLISTENERIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALLISTENERIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALLISTENERIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERIV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALLISTENERIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALLISTENERIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALLISTENERIVDIRECT.class, "invoke", LPALLISTENERIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALLISTENERIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALLISTENERIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALOBJECTLABELDIRECTEXT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull LPALOBJECTLABELDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALOBJECTLABELDIRECTEXT.class, "invoke", LPALOBJECTLABELDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALOBJECTLABELDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALOBJECTLABELDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALOBJECTLABELDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALOBJECTLABELEXT {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALOBJECTLABELEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALOBJECTLABELEXT.class, "invoke", LPALOBJECTLABELEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALOBJECTLABELEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALOBJECTLABELEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALOBJECTLABELEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALPOPDEBUGGROUPDIRECTEXT {
        void invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull LPALPOPDEBUGGROUPDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALPOPDEBUGGROUPDIRECTEXT.class, "invoke", LPALPOPDEBUGGROUPDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALPOPDEBUGGROUPDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALPOPDEBUGGROUPDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALPOPDEBUGGROUPDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALPOPDEBUGGROUPEXT {
        void invoke(
        );

        static MethodHandle of(@NotNull LPALPOPDEBUGGROUPEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALPOPDEBUGGROUPEXT.class, "invoke", LPALPOPDEBUGGROUPEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALPOPDEBUGGROUPEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALPOPDEBUGGROUPEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALPOPDEBUGGROUPEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALPROCESSUPDATESDIRECTSOFT {
        void invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull LPALPROCESSUPDATESDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALPROCESSUPDATESDIRECTSOFT.class, "invoke", LPALPROCESSUPDATESDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALPROCESSUPDATESDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALPROCESSUPDATESDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALPROCESSUPDATESDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALPROCESSUPDATESSOFT {
        void invoke(
        );

        static MethodHandle of(@NotNull LPALPROCESSUPDATESSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALPROCESSUPDATESSOFT.class, "invoke", LPALPROCESSUPDATESSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALPROCESSUPDATESSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALPROCESSUPDATESSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALPROCESSUPDATESSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALPUSHDEBUGGROUPDIRECTEXT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull LPALPUSHDEBUGGROUPDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALPUSHDEBUGGROUPDIRECTEXT.class, "invoke", LPALPUSHDEBUGGROUPDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALPUSHDEBUGGROUPDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALPUSHDEBUGGROUPDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALPUSHDEBUGGROUPDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALPUSHDEBUGGROUPEXT {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALPUSHDEBUGGROUPEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALPUSHDEBUGGROUPEXT.class, "invoke", LPALPUSHDEBUGGROUPEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALPUSHDEBUGGROUPEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALPUSHDEBUGGROUPEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALPUSHDEBUGGROUPEXT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALREQUESTFOLDBACKSTART {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALsizei") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="LPALFOLDBACKCALLBACK") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull LPALREQUESTFOLDBACKSTART lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALREQUESTFOLDBACKSTART.class, "invoke", LPALREQUESTFOLDBACKSTART.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALREQUESTFOLDBACKSTART lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALREQUESTFOLDBACKSTART lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALREQUESTFOLDBACKSTART, arena);
        }
    }

    @FunctionalInterface
    public interface LPALREQUESTFOLDBACKSTARTDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALsizei") int p2,
            @NativeType("ALsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="LPALFOLDBACKCALLBACK") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull LPALREQUESTFOLDBACKSTARTDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALREQUESTFOLDBACKSTARTDIRECT.class, "invoke", LPALREQUESTFOLDBACKSTARTDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALREQUESTFOLDBACKSTARTDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALREQUESTFOLDBACKSTARTDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALREQUESTFOLDBACKSTARTDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALREQUESTFOLDBACKSTOP {
        void invoke(
        );

        static MethodHandle of(@NotNull LPALREQUESTFOLDBACKSTOP lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALREQUESTFOLDBACKSTOP.class, "invoke", LPALREQUESTFOLDBACKSTOP.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALREQUESTFOLDBACKSTOP lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALREQUESTFOLDBACKSTOP lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALREQUESTFOLDBACKSTOP, arena);
        }
    }

    @FunctionalInterface
    public interface LPALREQUESTFOLDBACKSTOPDIRECT {
        void invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull LPALREQUESTFOLDBACKSTOPDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALREQUESTFOLDBACKSTOPDIRECT.class, "invoke", LPALREQUESTFOLDBACKSTOPDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALREQUESTFOLDBACKSTOPDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALREQUESTFOLDBACKSTOPDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALREQUESTFOLDBACKSTOPDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCE3DDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALdouble") double p3,
            @NativeType("ALdouble") double p4,
            @NativeType("ALdouble") double p5
        );

        static MethodHandle of(@NotNull LPALSOURCE3DDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCE3DDIRECTSOFT.class, "invoke", LPALSOURCE3DDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCE3DDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCE3DDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3DDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCE3DSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALdouble") double p2,
            @NativeType("ALdouble") double p3,
            @NativeType("ALdouble") double p4
        );

        static MethodHandle of(@NotNull LPALSOURCE3DSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCE3DSOFT.class, "invoke", LPALSOURCE3DSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCE3DSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCE3DSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3DSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCE3F {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2,
            @NativeType("ALfloat") float p3,
            @NativeType("ALfloat") float p4
        );

        static MethodHandle of(@NotNull LPALSOURCE3F lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCE3F.class, "invoke", LPALSOURCE3F.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCE3F lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCE3F lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3F, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCE3FDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALfloat") float p3,
            @NativeType("ALfloat") float p4,
            @NativeType("ALfloat") float p5
        );

        static MethodHandle of(@NotNull LPALSOURCE3FDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCE3FDIRECT.class, "invoke", LPALSOURCE3FDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCE3FDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCE3FDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3FDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCE3I {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2,
            @NativeType("ALint") int p3,
            @NativeType("ALint") int p4
        );

        static MethodHandle of(@NotNull LPALSOURCE3I lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCE3I.class, "invoke", LPALSOURCE3I.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCE3I lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCE3I lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3I, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCE3I64DIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint64SOFT") long p3,
            @NativeType("ALint64SOFT") long p4,
            @NativeType("ALint64SOFT") long p5
        );

        static MethodHandle of(@NotNull LPALSOURCE3I64DIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCE3I64DIRECTSOFT.class, "invoke", LPALSOURCE3I64DIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCE3I64DIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCE3I64DIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3I64DIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCE3I64SOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint64SOFT") long p2,
            @NativeType("ALint64SOFT") long p3,
            @NativeType("ALint64SOFT") long p4
        );

        static MethodHandle of(@NotNull LPALSOURCE3I64SOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCE3I64SOFT.class, "invoke", LPALSOURCE3I64SOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCE3I64SOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCE3I64SOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3I64SOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCE3IDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint") int p3,
            @NativeType("ALint") int p4,
            @NativeType("ALint") int p5
        );

        static MethodHandle of(@NotNull LPALSOURCE3IDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCE3IDIRECT.class, "invoke", LPALSOURCE3IDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCE3IDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCE3IDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3IDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEDDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALdouble") double p3
        );

        static MethodHandle of(@NotNull LPALSOURCEDDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEDDIRECTSOFT.class, "invoke", LPALSOURCEDDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEDDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEDDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEDDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEDSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALdouble") double p2
        );

        static MethodHandle of(@NotNull LPALSOURCEDSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEDSOFT.class, "invoke", LPALSOURCEDSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEDSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEDSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEDSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEDVDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALSOURCEDVDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEDVDIRECTSOFT.class, "invoke", LPALSOURCEDVDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEDVDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEDVDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEDVDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEDVSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALSOURCEDVSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEDVSOFT.class, "invoke", LPALSOURCEDVSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEDVSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEDVSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEDVSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2
        );

        static MethodHandle of(@NotNull LPALSOURCEF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEF.class, "invoke", LPALSOURCEF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEF, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALfloat") float p3
        );

        static MethodHandle of(@NotNull LPALSOURCEFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEFDIRECT.class, "invoke", LPALSOURCEFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALSOURCEFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEFV.class, "invoke", LPALSOURCEFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEFV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALSOURCEFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEFVDIRECT.class, "invoke", LPALSOURCEFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2
        );

        static MethodHandle of(@NotNull LPALSOURCEI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEI.class, "invoke", LPALSOURCEI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEI, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEI64DIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint64SOFT") long p3
        );

        static MethodHandle of(@NotNull LPALSOURCEI64DIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEI64DIRECTSOFT.class, "invoke", LPALSOURCEI64DIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEI64DIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEI64DIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEI64DIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEI64SOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint64SOFT") long p2
        );

        static MethodHandle of(@NotNull LPALSOURCEI64SOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEI64SOFT.class, "invoke", LPALSOURCEI64SOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEI64SOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEI64SOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEI64SOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEI64VDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALSOURCEI64VDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEI64VDIRECTSOFT.class, "invoke", LPALSOURCEI64VDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEI64VDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEI64VDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEI64VDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEI64VSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALSOURCEI64VSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEI64VSOFT.class, "invoke", LPALSOURCEI64VSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEI64VSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEI64VSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEI64VSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint") int p3
        );

        static MethodHandle of(@NotNull LPALSOURCEIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEIDIRECT.class, "invoke", LPALSOURCEIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALSOURCEIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEIV.class, "invoke", LPALSOURCEIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEIV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALSOURCEIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEIVDIRECT.class, "invoke", LPALSOURCEIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEPAUSE {
        void invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull LPALSOURCEPAUSE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEPAUSE.class, "invoke", LPALSOURCEPAUSE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEPAUSE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEPAUSE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPAUSE, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEPAUSEDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull LPALSOURCEPAUSEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEPAUSEDIRECT.class, "invoke", LPALSOURCEPAUSEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEPAUSEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEPAUSEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPAUSEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEPAUSEV {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALSOURCEPAUSEV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEPAUSEV.class, "invoke", LPALSOURCEPAUSEV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEPAUSEV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEPAUSEV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPAUSEV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEPAUSEVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALSOURCEPAUSEVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEPAUSEVDIRECT.class, "invoke", LPALSOURCEPAUSEVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEPAUSEVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEPAUSEVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPAUSEVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEPLAY {
        void invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull LPALSOURCEPLAY lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEPLAY.class, "invoke", LPALSOURCEPLAY.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEPLAY lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEPLAY lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAY, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEPLAYATTIMEDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALint64SOFT") long p2
        );

        static MethodHandle of(@NotNull LPALSOURCEPLAYATTIMEDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEPLAYATTIMEDIRECTSOFT.class, "invoke", LPALSOURCEPLAYATTIMEDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEPLAYATTIMEDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEPLAYATTIMEDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAYATTIMEDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEPLAYATTIMESOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALint64SOFT") long p1
        );

        static MethodHandle of(@NotNull LPALSOURCEPLAYATTIMESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEPLAYATTIMESOFT.class, "invoke", LPALSOURCEPLAYATTIMESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEPLAYATTIMESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEPLAYATTIMESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAYATTIMESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEPLAYATTIMEVDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @NativeType("ALint64SOFT") long p3
        );

        static MethodHandle of(@NotNull LPALSOURCEPLAYATTIMEVDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEPLAYATTIMEVDIRECTSOFT.class, "invoke", LPALSOURCEPLAYATTIMEVDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEPLAYATTIMEVDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEPLAYATTIMEVDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAYATTIMEVDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEPLAYATTIMEVSOFT {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @NativeType("ALint64SOFT") long p2
        );

        static MethodHandle of(@NotNull LPALSOURCEPLAYATTIMEVSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEPLAYATTIMEVSOFT.class, "invoke", LPALSOURCEPLAYATTIMEVSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEPLAYATTIMEVSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEPLAYATTIMEVSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAYATTIMEVSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEPLAYDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull LPALSOURCEPLAYDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEPLAYDIRECT.class, "invoke", LPALSOURCEPLAYDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEPLAYDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEPLAYDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAYDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEPLAYV {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALSOURCEPLAYV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEPLAYV.class, "invoke", LPALSOURCEPLAYV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEPLAYV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEPLAYV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAYV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEPLAYVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALSOURCEPLAYVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEPLAYVDIRECT.class, "invoke", LPALSOURCEPLAYVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEPLAYVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEPLAYVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAYVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEQUEUEBUFFERS {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALSOURCEQUEUEBUFFERS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEQUEUEBUFFERS.class, "invoke", LPALSOURCEQUEUEBUFFERS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEQUEUEBUFFERS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEQUEUEBUFFERS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEQUEUEBUFFERS, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEQUEUEBUFFERSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALSOURCEQUEUEBUFFERSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEQUEUEBUFFERSDIRECT.class, "invoke", LPALSOURCEQUEUEBUFFERSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEQUEUEBUFFERSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEQUEUEBUFFERSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEQUEUEBUFFERSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEREWIND {
        void invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull LPALSOURCEREWIND lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEREWIND.class, "invoke", LPALSOURCEREWIND.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEREWIND lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEREWIND lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEREWIND, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEREWINDDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull LPALSOURCEREWINDDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEREWINDDIRECT.class, "invoke", LPALSOURCEREWINDDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEREWINDDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEREWINDDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEREWINDDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEREWINDV {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALSOURCEREWINDV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEREWINDV.class, "invoke", LPALSOURCEREWINDV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEREWINDV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEREWINDV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEREWINDV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEREWINDVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALSOURCEREWINDVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEREWINDVDIRECT.class, "invoke", LPALSOURCEREWINDVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEREWINDVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEREWINDVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEREWINDVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCESTOP {
        void invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull LPALSOURCESTOP lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCESTOP.class, "invoke", LPALSOURCESTOP.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCESTOP lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCESTOP lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCESTOP, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCESTOPDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull LPALSOURCESTOPDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCESTOPDIRECT.class, "invoke", LPALSOURCESTOPDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCESTOPDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCESTOPDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCESTOPDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCESTOPV {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull LPALSOURCESTOPV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCESTOPV.class, "invoke", LPALSOURCESTOPV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCESTOPV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCESTOPV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCESTOPV, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCESTOPVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALSOURCESTOPVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCESTOPVDIRECT.class, "invoke", LPALSOURCESTOPVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCESTOPVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCESTOPVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCESTOPVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEUNQUEUEBUFFERS {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPALSOURCEUNQUEUEBUFFERS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEUNQUEUEBUFFERS.class, "invoke", LPALSOURCEUNQUEUEBUFFERS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEUNQUEUEBUFFERS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEUNQUEUEBUFFERS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEUNQUEUEBUFFERS, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSOURCEUNQUEUEBUFFERSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull LPALSOURCEUNQUEUEBUFFERSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSOURCEUNQUEUEBUFFERSDIRECT.class, "invoke", LPALSOURCEUNQUEUEBUFFERSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSOURCEUNQUEUEBUFFERSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSOURCEUNQUEUEBUFFERSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEUNQUEUEBUFFERSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSPEEDOFSOUND {
        void invoke(
            @NativeType("ALfloat") float p0
        );

        static MethodHandle of(@NotNull LPALSPEEDOFSOUND lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSPEEDOFSOUND.class, "invoke", LPALSPEEDOFSOUND.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSPEEDOFSOUND lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSPEEDOFSOUND lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSPEEDOFSOUND, arena);
        }
    }

    @FunctionalInterface
    public interface LPALSPEEDOFSOUNDDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALfloat") float p1
        );

        static MethodHandle of(@NotNull LPALSPEEDOFSOUNDDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPALSPEEDOFSOUNDDIRECT.class, "invoke", LPALSPEEDOFSOUNDDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPALSPEEDOFSOUNDDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPALSPEEDOFSOUNDDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSPEEDOFSOUNDDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPEAXGETBUFFERMODEDIRECT {
        @NativeType("ALenum") int invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull LPEAXGETBUFFERMODEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPEAXGETBUFFERMODEDIRECT.class, "invoke", LPEAXGETBUFFERMODEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPEAXGETBUFFERMODEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPEAXGETBUFFERMODEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPEAXGETBUFFERMODEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPEAXGETDIRECT {
        @NativeType("ALenum") int invoke(
            ALCcontext p0,
            _GUID p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALuint") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @NativeType("ALuint") int p5
        );

        static MethodHandle of(@NotNull LPEAXGETDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPEAXGETDIRECT.class, "invoke", LPEAXGETDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPEAXGETDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPEAXGETDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPEAXGETDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPEAXSETBUFFERMODEDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @NativeType("ALint") int p3
        );

        static MethodHandle of(@NotNull LPEAXSETBUFFERMODEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPEAXSETBUFFERMODEDIRECT.class, "invoke", LPEAXSETBUFFERMODEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPEAXSETBUFFERMODEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPEAXSETBUFFERMODEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPEAXSETBUFFERMODEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface LPEAXSETDIRECT {
        @NativeType("ALenum") int invoke(
            ALCcontext p0,
            _GUID p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALuint") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @NativeType("ALuint") int p5
        );

        static MethodHandle of(@NotNull LPEAXSETDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(LPEAXSETDIRECT.class, "invoke", LPEAXSETDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull LPEAXSETDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull LPEAXSETDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPEAXSETDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface PFNALBUFFERDATASTATICPROC {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @NativeType("ALsizei") int p3,
            @NativeType("ALsizei") int p4
        );

        static MethodHandle of(@NotNull PFNALBUFFERDATASTATICPROC lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFNALBUFFERDATASTATICPROC.class, "invoke", PFNALBUFFERDATASTATICPROC.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFNALBUFFERDATASTATICPROC lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFNALBUFFERDATASTATICPROC lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFNALBUFFERDATASTATICPROC, arena);
        }
    }

    @FunctionalInterface
    public interface PFNALBUFFERSUBDATASOFTPROC {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @NativeType("ALsizei") int p3,
            @NativeType("ALsizei") int p4
        );

        static MethodHandle of(@NotNull PFNALBUFFERSUBDATASOFTPROC lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFNALBUFFERSUBDATASOFTPROC.class, "invoke", PFNALBUFFERSUBDATASOFTPROC.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFNALBUFFERSUBDATASOFTPROC lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFNALBUFFERSUBDATASOFTPROC lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFNALBUFFERSUBDATASOFTPROC, arena);
        }
    }

    @FunctionalInterface
    public interface PFNALCGETTHREADCONTEXTPROC {
        ALCcontext invoke(
        );

        static MethodHandle of(@NotNull PFNALCGETTHREADCONTEXTPROC lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFNALCGETTHREADCONTEXTPROC.class, "invoke", PFNALCGETTHREADCONTEXTPROC.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFNALCGETTHREADCONTEXTPROC lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFNALCGETTHREADCONTEXTPROC lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFNALCGETTHREADCONTEXTPROC, arena);
        }
    }

    @FunctionalInterface
    public interface PFNALCSETTHREADCONTEXTPROC {
        @NativeType("ALCboolean") byte invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull PFNALCSETTHREADCONTEXTPROC lambda) {
            try {
                return MethodHandles.lookup().findVirtual(PFNALCSETTHREADCONTEXTPROC.class, "invoke", PFNALCSETTHREADCONTEXTPROC.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull PFNALCSETTHREADCONTEXTPROC lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull PFNALCSETTHREADCONTEXTPROC lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFNALCSETTHREADCONTEXTPROC, arena);
        }
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ALFunctionTypes() {}
}
