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
    public interface IALBUFFERCALLBACKTYPESOFT {
        @NativeType("ALsizei") int invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @NativeType("ALsizei") int p2
        );

        static MethodHandle of(@NotNull IALBUFFERCALLBACKTYPESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IALBUFFERCALLBACKTYPESOFT.class, "invoke", ALBUFFERCALLBACKTYPESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IALBUFFERCALLBACKTYPESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IALBUFFERCALLBACKTYPESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), ALBUFFERCALLBACKTYPESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface IALCEVENTPROCTYPESOFT {
        void invoke(
            @NativeType("ALCenum") int p0,
            @NativeType("ALCenum") int p1,
            ALCdevice p2,
            @NativeType("ALCsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull IALCEVENTPROCTYPESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IALCEVENTPROCTYPESOFT.class, "invoke", ALCEVENTPROCTYPESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IALCEVENTPROCTYPESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IALCEVENTPROCTYPESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), ALCEVENTPROCTYPESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface IALDEBUGPROCEXT {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALenum") int p3,
            @NativeType("ALsizei") int p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5,
            @Pointer(comment="void*") @NotNull MemorySegment p6
        );

        static MethodHandle of(@NotNull IALDEBUGPROCEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IALDEBUGPROCEXT.class, "invoke", ALDEBUGPROCEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IALDEBUGPROCEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IALDEBUGPROCEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), ALDEBUGPROCEXT, arena);
        }
    }

    @FunctionalInterface
    public interface IALEVENTPROCSOFT {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull IALEVENTPROCSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IALEVENTPROCSOFT.class, "invoke", ALEVENTPROCSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IALEVENTPROCSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IALEVENTPROCSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), ALEVENTPROCSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALAUXILIARYEFFECTSLOTF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2
        );

        static MethodHandle of(@NotNull ILPALAUXILIARYEFFECTSLOTF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALAUXILIARYEFFECTSLOTF.class, "invoke", LPALAUXILIARYEFFECTSLOTF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALAUXILIARYEFFECTSLOTF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALAUXILIARYEFFECTSLOTF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTF, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALAUXILIARYEFFECTSLOTFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALfloat") float p3
        );

        static MethodHandle of(@NotNull ILPALAUXILIARYEFFECTSLOTFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALAUXILIARYEFFECTSLOTFDIRECT.class, "invoke", LPALAUXILIARYEFFECTSLOTFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALAUXILIARYEFFECTSLOTFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALAUXILIARYEFFECTSLOTFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALAUXILIARYEFFECTSLOTFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALAUXILIARYEFFECTSLOTFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALAUXILIARYEFFECTSLOTFV.class, "invoke", LPALAUXILIARYEFFECTSLOTFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALAUXILIARYEFFECTSLOTFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALAUXILIARYEFFECTSLOTFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTFV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALAUXILIARYEFFECTSLOTFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALAUXILIARYEFFECTSLOTFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALAUXILIARYEFFECTSLOTFVDIRECT.class, "invoke", LPALAUXILIARYEFFECTSLOTFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALAUXILIARYEFFECTSLOTFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALAUXILIARYEFFECTSLOTFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALAUXILIARYEFFECTSLOTI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2
        );

        static MethodHandle of(@NotNull ILPALAUXILIARYEFFECTSLOTI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALAUXILIARYEFFECTSLOTI.class, "invoke", LPALAUXILIARYEFFECTSLOTI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALAUXILIARYEFFECTSLOTI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALAUXILIARYEFFECTSLOTI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTI, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALAUXILIARYEFFECTSLOTIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint") int p3
        );

        static MethodHandle of(@NotNull ILPALAUXILIARYEFFECTSLOTIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALAUXILIARYEFFECTSLOTIDIRECT.class, "invoke", LPALAUXILIARYEFFECTSLOTIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALAUXILIARYEFFECTSLOTIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALAUXILIARYEFFECTSLOTIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALAUXILIARYEFFECTSLOTIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALAUXILIARYEFFECTSLOTIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALAUXILIARYEFFECTSLOTIV.class, "invoke", LPALAUXILIARYEFFECTSLOTIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALAUXILIARYEFFECTSLOTIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALAUXILIARYEFFECTSLOTIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTIV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALAUXILIARYEFFECTSLOTIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALAUXILIARYEFFECTSLOTIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALAUXILIARYEFFECTSLOTIVDIRECT.class, "invoke", LPALAUXILIARYEFFECTSLOTIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALAUXILIARYEFFECTSLOTIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALAUXILIARYEFFECTSLOTIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALAUXILIARYEFFECTSLOTIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFER3F {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2,
            @NativeType("ALfloat") float p3,
            @NativeType("ALfloat") float p4
        );

        static MethodHandle of(@NotNull ILPALBUFFER3F lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFER3F.class, "invoke", LPALBUFFER3F.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFER3F lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFER3F lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFER3F, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFER3FDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALfloat") float p3,
            @NativeType("ALfloat") float p4,
            @NativeType("ALfloat") float p5
        );

        static MethodHandle of(@NotNull ILPALBUFFER3FDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFER3FDIRECT.class, "invoke", LPALBUFFER3FDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFER3FDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFER3FDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFER3FDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFER3I {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2,
            @NativeType("ALint") int p3,
            @NativeType("ALint") int p4
        );

        static MethodHandle of(@NotNull ILPALBUFFER3I lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFER3I.class, "invoke", LPALBUFFER3I.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFER3I lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFER3I lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFER3I, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFER3IDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint") int p3,
            @NativeType("ALint") int p4,
            @NativeType("ALint") int p5
        );

        static MethodHandle of(@NotNull ILPALBUFFER3IDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFER3IDIRECT.class, "invoke", LPALBUFFER3IDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFER3IDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFER3IDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFER3IDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERCALLBACKDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALsizei") int p3,
            @Pointer(comment="ALBUFFERCALLBACKTYPESOFT") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ILPALBUFFERCALLBACKDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERCALLBACKDIRECTSOFT.class, "invoke", LPALBUFFERCALLBACKDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERCALLBACKDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERCALLBACKDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERCALLBACKDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERCALLBACKSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="ALBUFFERCALLBACKTYPESOFT") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull ILPALBUFFERCALLBACKSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERCALLBACKSOFT.class, "invoke", LPALBUFFERCALLBACKSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERCALLBACKSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERCALLBACKSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERCALLBACKSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERDATA {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @NativeType("ALsizei") int p3,
            @NativeType("ALsizei") int p4
        );

        static MethodHandle of(@NotNull ILPALBUFFERDATA lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERDATA.class, "invoke", LPALBUFFERDATA.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERDATA lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERDATA lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERDATA, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERDATADIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @NativeType("ALsizei") int p4,
            @NativeType("ALsizei") int p5
        );

        static MethodHandle of(@NotNull ILPALBUFFERDATADIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERDATADIRECT.class, "invoke", LPALBUFFERDATADIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERDATADIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERDATADIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERDATADIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERDATASTATICDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @NativeType("ALsizei") int p4,
            @NativeType("ALsizei") int p5
        );

        static MethodHandle of(@NotNull ILPALBUFFERDATASTATICDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERDATASTATICDIRECT.class, "invoke", LPALBUFFERDATASTATICDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERDATASTATICDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERDATASTATICDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERDATASTATICDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2
        );

        static MethodHandle of(@NotNull ILPALBUFFERF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERF.class, "invoke", LPALBUFFERF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERF, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALfloat") float p3
        );

        static MethodHandle of(@NotNull ILPALBUFFERFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERFDIRECT.class, "invoke", LPALBUFFERFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALBUFFERFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERFV.class, "invoke", LPALBUFFERFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERFV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALBUFFERFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERFVDIRECT.class, "invoke", LPALBUFFERFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2
        );

        static MethodHandle of(@NotNull ILPALBUFFERI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERI.class, "invoke", LPALBUFFERI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERI, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint") int p3
        );

        static MethodHandle of(@NotNull ILPALBUFFERIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERIDIRECT.class, "invoke", LPALBUFFERIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALBUFFERIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERIV.class, "invoke", LPALBUFFERIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERIV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALBUFFERIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERIVDIRECT.class, "invoke", LPALBUFFERIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERSAMPLESSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALsizei") int p3,
            @NativeType("ALenum") int p4,
            @NativeType("ALenum") int p5,
            @Pointer(comment="void*") @NotNull MemorySegment p6
        );

        static MethodHandle of(@NotNull ILPALBUFFERSAMPLESSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERSAMPLESSOFT.class, "invoke", LPALBUFFERSAMPLESSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERSAMPLESSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERSAMPLESSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERSAMPLESSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERSUBDATADIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @NativeType("ALsizei") int p4,
            @NativeType("ALsizei") int p5
        );

        static MethodHandle of(@NotNull ILPALBUFFERSUBDATADIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERSUBDATADIRECTSOFT.class, "invoke", LPALBUFFERSUBDATADIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERSUBDATADIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERSUBDATADIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERSUBDATADIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALBUFFERSUBSAMPLESSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALsizei") int p1,
            @NativeType("ALsizei") int p2,
            @NativeType("ALenum") int p3,
            @NativeType("ALenum") int p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ILPALBUFFERSUBSAMPLESSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALBUFFERSUBSAMPLESSOFT.class, "invoke", LPALBUFFERSUBSAMPLESSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALBUFFERSUBSAMPLESSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALBUFFERSUBSAMPLESSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALBUFFERSUBSAMPLESSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCCAPTURECLOSEDEVICE {
        @NativeType("ALCboolean") byte invoke(
            ALCdevice p0
        );

        static MethodHandle of(@NotNull ILPALCCAPTURECLOSEDEVICE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCCAPTURECLOSEDEVICE.class, "invoke", LPALCCAPTURECLOSEDEVICE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCCAPTURECLOSEDEVICE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCCAPTURECLOSEDEVICE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCCAPTURECLOSEDEVICE, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCCAPTUREOPENDEVICE {
        ALCdevice invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0,
            @NativeType("ALCuint") int p1,
            @NativeType("ALCenum") int p2,
            @NativeType("ALCsizei") int p3
        );

        static MethodHandle of(@NotNull ILPALCCAPTUREOPENDEVICE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCCAPTUREOPENDEVICE.class, "invoke", LPALCCAPTUREOPENDEVICE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCCAPTUREOPENDEVICE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCCAPTUREOPENDEVICE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCCAPTUREOPENDEVICE, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCCAPTURESAMPLES {
        void invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @NativeType("ALCsizei") int p2
        );

        static MethodHandle of(@NotNull ILPALCCAPTURESAMPLES lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCCAPTURESAMPLES.class, "invoke", LPALCCAPTURESAMPLES.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCCAPTURESAMPLES lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCCAPTURESAMPLES lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCCAPTURESAMPLES, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCCAPTURESTART {
        void invoke(
            ALCdevice p0
        );

        static MethodHandle of(@NotNull ILPALCCAPTURESTART lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCCAPTURESTART.class, "invoke", LPALCCAPTURESTART.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCCAPTURESTART lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCCAPTURESTART lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCCAPTURESTART, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCCAPTURESTOP {
        void invoke(
            ALCdevice p0
        );

        static MethodHandle of(@NotNull ILPALCCAPTURESTOP lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCCAPTURESTOP.class, "invoke", LPALCCAPTURESTOP.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCCAPTURESTOP lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCCAPTURESTOP lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCCAPTURESTOP, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCCLOSEDEVICE {
        @NativeType("ALCboolean") byte invoke(
            ALCdevice p0
        );

        static MethodHandle of(@NotNull ILPALCCLOSEDEVICE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCCLOSEDEVICE.class, "invoke", LPALCCLOSEDEVICE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCCLOSEDEVICE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCCLOSEDEVICE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCCLOSEDEVICE, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCCREATECONTEXT {
        ALCcontext invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALCCREATECONTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCCREATECONTEXT.class, "invoke", LPALCCREATECONTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCCREATECONTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCCREATECONTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCCREATECONTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCDESTROYCONTEXT {
        void invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull ILPALCDESTROYCONTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCDESTROYCONTEXT.class, "invoke", LPALCDESTROYCONTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCDESTROYCONTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCDESTROYCONTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCDESTROYCONTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCDEVICEPAUSESOFT {
        void invoke(
            ALCdevice p0
        );

        static MethodHandle of(@NotNull ILPALCDEVICEPAUSESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCDEVICEPAUSESOFT.class, "invoke", LPALCDEVICEPAUSESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCDEVICEPAUSESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCDEVICEPAUSESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCDEVICEPAUSESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCDEVICERESUMESOFT {
        void invoke(
            ALCdevice p0
        );

        static MethodHandle of(@NotNull ILPALCDEVICERESUMESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCDEVICERESUMESOFT.class, "invoke", LPALCDEVICERESUMESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCDEVICERESUMESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCDEVICERESUMESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCDEVICERESUMESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCEVENTCALLBACKSOFT {
        void invoke(
            @Pointer(comment="ALCEVENTPROCTYPESOFT") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALCEVENTCALLBACKSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCEVENTCALLBACKSOFT.class, "invoke", LPALCEVENTCALLBACKSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCEVENTCALLBACKSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCEVENTCALLBACKSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCEVENTCALLBACKSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCEVENTCONTROLSOFT {
        @NativeType("ALCboolean") byte invoke(
            @NativeType("ALCsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @NativeType("ALCboolean") byte p2
        );

        static MethodHandle of(@NotNull ILPALCEVENTCONTROLSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCEVENTCONTROLSOFT.class, "invoke", LPALCEVENTCONTROLSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCEVENTCONTROLSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCEVENTCONTROLSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCEVENTCONTROLSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCEVENTISSUPPORTEDSOFT {
        @NativeType("ALCenum") int invoke(
            @NativeType("ALCenum") int p0,
            @NativeType("ALCenum") int p1
        );

        static MethodHandle of(@NotNull ILPALCEVENTISSUPPORTEDSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCEVENTISSUPPORTEDSOFT.class, "invoke", LPALCEVENTISSUPPORTEDSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCEVENTISSUPPORTEDSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCEVENTISSUPPORTEDSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCEVENTISSUPPORTEDSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCGETCONTEXTSDEVICE {
        ALCdevice invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull ILPALCGETCONTEXTSDEVICE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCGETCONTEXTSDEVICE.class, "invoke", LPALCGETCONTEXTSDEVICE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCGETCONTEXTSDEVICE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCGETCONTEXTSDEVICE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETCONTEXTSDEVICE, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCGETCURRENTCONTEXT {
        ALCcontext invoke(
        );

        static MethodHandle of(@NotNull ILPALCGETCURRENTCONTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCGETCURRENTCONTEXT.class, "invoke", LPALCGETCURRENTCONTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCGETCURRENTCONTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCGETCURRENTCONTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETCURRENTCONTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCGETENUMVALUE {
        @NativeType("ALCenum") int invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALCGETENUMVALUE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCGETENUMVALUE.class, "invoke", LPALCGETENUMVALUE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCGETENUMVALUE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCGETENUMVALUE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETENUMVALUE, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCGETERROR {
        @NativeType("ALCenum") int invoke(
            ALCdevice p0
        );

        static MethodHandle of(@NotNull ILPALCGETERROR lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCGETERROR.class, "invoke", LPALCGETERROR.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCGETERROR lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCGETERROR lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETERROR, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCGETINTEGER64VSOFT {
        void invoke(
            ALCdevice p0,
            @NativeType("ALCenum") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALCGETINTEGER64VSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCGETINTEGER64VSOFT.class, "invoke", LPALCGETINTEGER64VSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCGETINTEGER64VSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCGETINTEGER64VSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETINTEGER64VSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCGETINTEGERV {
        void invoke(
            ALCdevice p0,
            @NativeType("ALCenum") int p1,
            @NativeType("ALCsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALCGETINTEGERV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCGETINTEGERV.class, "invoke", LPALCGETINTEGERV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCGETINTEGERV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCGETINTEGERV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETINTEGERV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCGETPROCADDRESS {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALCGETPROCADDRESS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCGETPROCADDRESS.class, "invoke", LPALCGETPROCADDRESS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCGETPROCADDRESS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCGETPROCADDRESS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETPROCADDRESS, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCGETPROCADDRESS2 {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALCGETPROCADDRESS2 lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCGETPROCADDRESS2.class, "invoke", LPALCGETPROCADDRESS2.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCGETPROCADDRESS2 lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCGETPROCADDRESS2 lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETPROCADDRESS2, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCGETSTRING {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCdevice p0,
            @NativeType("ALCenum") int p1
        );

        static MethodHandle of(@NotNull ILPALCGETSTRING lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCGETSTRING.class, "invoke", LPALCGETSTRING.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCGETSTRING lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCGETSTRING lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETSTRING, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCGETSTRINGISOFT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCdevice p0,
            @NativeType("ALCenum") int p1,
            @NativeType("ALCsizei") int p2
        );

        static MethodHandle of(@NotNull ILPALCGETSTRINGISOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCGETSTRINGISOFT.class, "invoke", LPALCGETSTRINGISOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCGETSTRINGISOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCGETSTRINGISOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCGETSTRINGISOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCISEXTENSIONPRESENT {
        @NativeType("ALCboolean") byte invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALCISEXTENSIONPRESENT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCISEXTENSIONPRESENT.class, "invoke", LPALCISEXTENSIONPRESENT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCISEXTENSIONPRESENT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCISEXTENSIONPRESENT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCISEXTENSIONPRESENT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCISRENDERFORMATSUPPORTEDSOFT {
        @NativeType("ALCboolean") byte invoke(
            ALCdevice p0,
            @NativeType("ALCsizei") int p1,
            @NativeType("ALCenum") int p2,
            @NativeType("ALCenum") int p3
        );

        static MethodHandle of(@NotNull ILPALCISRENDERFORMATSUPPORTEDSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCISRENDERFORMATSUPPORTEDSOFT.class, "invoke", LPALCISRENDERFORMATSUPPORTEDSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCISRENDERFORMATSUPPORTEDSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCISRENDERFORMATSUPPORTEDSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCISRENDERFORMATSUPPORTEDSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCLOOPBACKOPENDEVICESOFT {
        ALCdevice invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0
        );

        static MethodHandle of(@NotNull ILPALCLOOPBACKOPENDEVICESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCLOOPBACKOPENDEVICESOFT.class, "invoke", LPALCLOOPBACKOPENDEVICESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCLOOPBACKOPENDEVICESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCLOOPBACKOPENDEVICESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCLOOPBACKOPENDEVICESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCMAKECONTEXTCURRENT {
        @NativeType("ALCboolean") byte invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull ILPALCMAKECONTEXTCURRENT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCMAKECONTEXTCURRENT.class, "invoke", LPALCMAKECONTEXTCURRENT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCMAKECONTEXTCURRENT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCMAKECONTEXTCURRENT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCMAKECONTEXTCURRENT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCOPENDEVICE {
        ALCdevice invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0
        );

        static MethodHandle of(@NotNull ILPALCOPENDEVICE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCOPENDEVICE.class, "invoke", LPALCOPENDEVICE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCOPENDEVICE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCOPENDEVICE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCOPENDEVICE, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCPROCESSCONTEXT {
        void invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull ILPALCPROCESSCONTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCPROCESSCONTEXT.class, "invoke", LPALCPROCESSCONTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCPROCESSCONTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCPROCESSCONTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCPROCESSCONTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCRENDERSAMPLESSOFT {
        void invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @NativeType("ALCsizei") int p2
        );

        static MethodHandle of(@NotNull ILPALCRENDERSAMPLESSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCRENDERSAMPLESSOFT.class, "invoke", LPALCRENDERSAMPLESSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCRENDERSAMPLESSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCRENDERSAMPLESSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCRENDERSAMPLESSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCREOPENDEVICESOFT {
        @NativeType("ALCboolean") byte invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALCREOPENDEVICESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCREOPENDEVICESOFT.class, "invoke", LPALCREOPENDEVICESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCREOPENDEVICESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCREOPENDEVICESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCREOPENDEVICESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCRESETDEVICESOFT {
        @NativeType("ALCboolean") byte invoke(
            ALCdevice p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALCRESETDEVICESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCRESETDEVICESOFT.class, "invoke", LPALCRESETDEVICESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCRESETDEVICESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCRESETDEVICESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCRESETDEVICESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALCSUSPENDCONTEXT {
        void invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull ILPALCSUSPENDCONTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALCSUSPENDCONTEXT.class, "invoke", LPALCSUSPENDCONTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALCSUSPENDCONTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALCSUSPENDCONTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALCSUSPENDCONTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDEBUGMESSAGECALLBACKDIRECTEXT {
        void invoke(
            ALCcontext p0,
            @Pointer(comment="ALDEBUGPROCEXT") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALDEBUGMESSAGECALLBACKDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDEBUGMESSAGECALLBACKDIRECTEXT.class, "invoke", LPALDEBUGMESSAGECALLBACKDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDEBUGMESSAGECALLBACKDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDEBUGMESSAGECALLBACKDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEBUGMESSAGECALLBACKDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDEBUGMESSAGECALLBACKEXT {
        void invoke(
            @Pointer(comment="ALDEBUGPROCEXT") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALDEBUGMESSAGECALLBACKEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDEBUGMESSAGECALLBACKEXT.class, "invoke", LPALDEBUGMESSAGECALLBACKEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDEBUGMESSAGECALLBACKEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDEBUGMESSAGECALLBACKEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEBUGMESSAGECALLBACKEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDEBUGMESSAGECONTROLDIRECTEXT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALenum") int p3,
            @NativeType("ALsizei") int p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5,
            @NativeType("ALboolean") byte p6
        );

        static MethodHandle of(@NotNull ILPALDEBUGMESSAGECONTROLDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDEBUGMESSAGECONTROLDIRECTEXT.class, "invoke", LPALDEBUGMESSAGECONTROLDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDEBUGMESSAGECONTROLDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDEBUGMESSAGECONTROLDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEBUGMESSAGECONTROLDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDEBUGMESSAGECONTROLEXT {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @NativeType("ALboolean") byte p5
        );

        static MethodHandle of(@NotNull ILPALDEBUGMESSAGECONTROLEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDEBUGMESSAGECONTROLEXT.class, "invoke", LPALDEBUGMESSAGECONTROLEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDEBUGMESSAGECONTROLEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDEBUGMESSAGECONTROLEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEBUGMESSAGECONTROLEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDEBUGMESSAGEINSERTDIRECTEXT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALuint") int p3,
            @NativeType("ALenum") int p4,
            @NativeType("ALsizei") int p5,
            @Pointer(comment="void*") @NotNull MemorySegment p6
        );

        static MethodHandle of(@NotNull ILPALDEBUGMESSAGEINSERTDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDEBUGMESSAGEINSERTDIRECTEXT.class, "invoke", LPALDEBUGMESSAGEINSERTDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDEBUGMESSAGEINSERTDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDEBUGMESSAGEINSERTDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEBUGMESSAGEINSERTDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDEBUGMESSAGEINSERTEXT {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALenum") int p3,
            @NativeType("ALsizei") int p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ILPALDEBUGMESSAGEINSERTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDEBUGMESSAGEINSERTEXT.class, "invoke", LPALDEBUGMESSAGEINSERTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDEBUGMESSAGEINSERTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDEBUGMESSAGEINSERTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEBUGMESSAGEINSERTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDEFERUPDATESDIRECTSOFT {
        void invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull ILPALDEFERUPDATESDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDEFERUPDATESDIRECTSOFT.class, "invoke", LPALDEFERUPDATESDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDEFERUPDATESDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDEFERUPDATESDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEFERUPDATESDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDEFERUPDATESSOFT {
        void invoke(
        );

        static MethodHandle of(@NotNull ILPALDEFERUPDATESSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDEFERUPDATESSOFT.class, "invoke", LPALDEFERUPDATESSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDEFERUPDATESSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDEFERUPDATESSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDEFERUPDATESSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDELETEAUXILIARYEFFECTSLOTS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALDELETEAUXILIARYEFFECTSLOTS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDELETEAUXILIARYEFFECTSLOTS.class, "invoke", LPALDELETEAUXILIARYEFFECTSLOTS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDELETEAUXILIARYEFFECTSLOTS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDELETEAUXILIARYEFFECTSLOTS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEAUXILIARYEFFECTSLOTS, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDELETEAUXILIARYEFFECTSLOTSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALDELETEAUXILIARYEFFECTSLOTSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDELETEAUXILIARYEFFECTSLOTSDIRECT.class, "invoke", LPALDELETEAUXILIARYEFFECTSLOTSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDELETEAUXILIARYEFFECTSLOTSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDELETEAUXILIARYEFFECTSLOTSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEAUXILIARYEFFECTSLOTSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDELETEBUFFERS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALDELETEBUFFERS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDELETEBUFFERS.class, "invoke", LPALDELETEBUFFERS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDELETEBUFFERS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDELETEBUFFERS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEBUFFERS, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDELETEBUFFERSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALDELETEBUFFERSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDELETEBUFFERSDIRECT.class, "invoke", LPALDELETEBUFFERSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDELETEBUFFERSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDELETEBUFFERSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEBUFFERSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDELETEEFFECTS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALDELETEEFFECTS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDELETEEFFECTS.class, "invoke", LPALDELETEEFFECTS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDELETEEFFECTS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDELETEEFFECTS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEEFFECTS, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDELETEEFFECTSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALDELETEEFFECTSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDELETEEFFECTSDIRECT.class, "invoke", LPALDELETEEFFECTSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDELETEEFFECTSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDELETEEFFECTSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEEFFECTSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDELETEFILTERS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALDELETEFILTERS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDELETEFILTERS.class, "invoke", LPALDELETEFILTERS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDELETEFILTERS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDELETEFILTERS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEFILTERS, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDELETEFILTERSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALDELETEFILTERSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDELETEFILTERSDIRECT.class, "invoke", LPALDELETEFILTERSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDELETEFILTERSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDELETEFILTERSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETEFILTERSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDELETESOURCES {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALDELETESOURCES lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDELETESOURCES.class, "invoke", LPALDELETESOURCES.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDELETESOURCES lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDELETESOURCES lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETESOURCES, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDELETESOURCESDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALDELETESOURCESDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDELETESOURCESDIRECT.class, "invoke", LPALDELETESOURCESDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDELETESOURCESDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDELETESOURCESDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDELETESOURCESDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDISABLE {
        void invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull ILPALDISABLE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDISABLE.class, "invoke", LPALDISABLE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDISABLE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDISABLE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDISABLE, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDISABLEDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull ILPALDISABLEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDISABLEDIRECT.class, "invoke", LPALDISABLEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDISABLEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDISABLEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDISABLEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDISTANCEMODEL {
        void invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull ILPALDISTANCEMODEL lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDISTANCEMODEL.class, "invoke", LPALDISTANCEMODEL.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDISTANCEMODEL lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDISTANCEMODEL lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDISTANCEMODEL, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDISTANCEMODELDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull ILPALDISTANCEMODELDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDISTANCEMODELDIRECT.class, "invoke", LPALDISTANCEMODELDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDISTANCEMODELDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDISTANCEMODELDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDISTANCEMODELDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDOPPLERFACTOR {
        void invoke(
            @NativeType("ALfloat") float p0
        );

        static MethodHandle of(@NotNull ILPALDOPPLERFACTOR lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDOPPLERFACTOR.class, "invoke", LPALDOPPLERFACTOR.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDOPPLERFACTOR lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDOPPLERFACTOR lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDOPPLERFACTOR, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDOPPLERFACTORDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALfloat") float p1
        );

        static MethodHandle of(@NotNull ILPALDOPPLERFACTORDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDOPPLERFACTORDIRECT.class, "invoke", LPALDOPPLERFACTORDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDOPPLERFACTORDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDOPPLERFACTORDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDOPPLERFACTORDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALDOPPLERVELOCITY {
        void invoke(
            @NativeType("ALfloat") float p0
        );

        static MethodHandle of(@NotNull ILPALDOPPLERVELOCITY lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALDOPPLERVELOCITY.class, "invoke", LPALDOPPLERVELOCITY.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALDOPPLERVELOCITY lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALDOPPLERVELOCITY lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALDOPPLERVELOCITY, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALEFFECTF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2
        );

        static MethodHandle of(@NotNull ILPALEFFECTF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALEFFECTF.class, "invoke", LPALEFFECTF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALEFFECTF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALEFFECTF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTF, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALEFFECTFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALfloat") float p3
        );

        static MethodHandle of(@NotNull ILPALEFFECTFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALEFFECTFDIRECT.class, "invoke", LPALEFFECTFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALEFFECTFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALEFFECTFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALEFFECTFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALEFFECTFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALEFFECTFV.class, "invoke", LPALEFFECTFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALEFFECTFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALEFFECTFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTFV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALEFFECTFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALEFFECTFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALEFFECTFVDIRECT.class, "invoke", LPALEFFECTFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALEFFECTFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALEFFECTFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALEFFECTI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2
        );

        static MethodHandle of(@NotNull ILPALEFFECTI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALEFFECTI.class, "invoke", LPALEFFECTI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALEFFECTI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALEFFECTI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTI, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALEFFECTIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint") int p3
        );

        static MethodHandle of(@NotNull ILPALEFFECTIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALEFFECTIDIRECT.class, "invoke", LPALEFFECTIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALEFFECTIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALEFFECTIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALEFFECTIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALEFFECTIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALEFFECTIV.class, "invoke", LPALEFFECTIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALEFFECTIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALEFFECTIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTIV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALEFFECTIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALEFFECTIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALEFFECTIVDIRECT.class, "invoke", LPALEFFECTIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALEFFECTIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALEFFECTIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEFFECTIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALENABLE {
        void invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull ILPALENABLE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALENABLE.class, "invoke", LPALENABLE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALENABLE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALENABLE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALENABLE, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALENABLEDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull ILPALENABLEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALENABLEDIRECT.class, "invoke", LPALENABLEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALENABLEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALENABLEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALENABLEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALEVENTCALLBACKDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @Pointer(comment="ALEVENTPROCSOFT") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALEVENTCALLBACKDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALEVENTCALLBACKDIRECTSOFT.class, "invoke", LPALEVENTCALLBACKDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALEVENTCALLBACKDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALEVENTCALLBACKDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEVENTCALLBACKDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALEVENTCALLBACKSOFT {
        void invoke(
            @Pointer(comment="ALEVENTPROCSOFT") @NotNull MemorySegment p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALEVENTCALLBACKSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALEVENTCALLBACKSOFT.class, "invoke", LPALEVENTCALLBACKSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALEVENTCALLBACKSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALEVENTCALLBACKSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEVENTCALLBACKSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALEVENTCONTROLDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @NativeType("ALboolean") byte p3
        );

        static MethodHandle of(@NotNull ILPALEVENTCONTROLDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALEVENTCONTROLDIRECTSOFT.class, "invoke", LPALEVENTCONTROLDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALEVENTCONTROLDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALEVENTCONTROLDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEVENTCONTROLDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALEVENTCONTROLSOFT {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @NativeType("ALboolean") byte p2
        );

        static MethodHandle of(@NotNull ILPALEVENTCONTROLSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALEVENTCONTROLSOFT.class, "invoke", LPALEVENTCONTROLSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALEVENTCONTROLSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALEVENTCONTROLSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALEVENTCONTROLSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALFILTERF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2
        );

        static MethodHandle of(@NotNull ILPALFILTERF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALFILTERF.class, "invoke", LPALFILTERF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALFILTERF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALFILTERF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERF, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALFILTERFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALfloat") float p3
        );

        static MethodHandle of(@NotNull ILPALFILTERFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALFILTERFDIRECT.class, "invoke", LPALFILTERFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALFILTERFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALFILTERFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALFILTERFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALFILTERFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALFILTERFV.class, "invoke", LPALFILTERFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALFILTERFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALFILTERFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERFV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALFILTERFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALFILTERFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALFILTERFVDIRECT.class, "invoke", LPALFILTERFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALFILTERFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALFILTERFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALFILTERI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2
        );

        static MethodHandle of(@NotNull ILPALFILTERI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALFILTERI.class, "invoke", LPALFILTERI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALFILTERI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALFILTERI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERI, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALFILTERIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint") int p3
        );

        static MethodHandle of(@NotNull ILPALFILTERIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALFILTERIDIRECT.class, "invoke", LPALFILTERIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALFILTERIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALFILTERIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALFILTERIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALFILTERIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALFILTERIV.class, "invoke", LPALFILTERIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALFILTERIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALFILTERIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERIV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALFILTERIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALFILTERIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALFILTERIVDIRECT.class, "invoke", LPALFILTERIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALFILTERIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALFILTERIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFILTERIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALFOLDBACKCALLBACK {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALsizei") int p1
        );

        static MethodHandle of(@NotNull ILPALFOLDBACKCALLBACK lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALFOLDBACKCALLBACK.class, "invoke", LPALFOLDBACKCALLBACK.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALFOLDBACKCALLBACK lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALFOLDBACKCALLBACK lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALFOLDBACKCALLBACK, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGENAUXILIARYEFFECTSLOTS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGENAUXILIARYEFFECTSLOTS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGENAUXILIARYEFFECTSLOTS.class, "invoke", LPALGENAUXILIARYEFFECTSLOTS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGENAUXILIARYEFFECTSLOTS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGENAUXILIARYEFFECTSLOTS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENAUXILIARYEFFECTSLOTS, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGENAUXILIARYEFFECTSLOTSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGENAUXILIARYEFFECTSLOTSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGENAUXILIARYEFFECTSLOTSDIRECT.class, "invoke", LPALGENAUXILIARYEFFECTSLOTSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGENAUXILIARYEFFECTSLOTSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGENAUXILIARYEFFECTSLOTSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENAUXILIARYEFFECTSLOTSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGENBUFFERS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGENBUFFERS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGENBUFFERS.class, "invoke", LPALGENBUFFERS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGENBUFFERS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGENBUFFERS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENBUFFERS, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGENBUFFERSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGENBUFFERSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGENBUFFERSDIRECT.class, "invoke", LPALGENBUFFERSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGENBUFFERSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGENBUFFERSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENBUFFERSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGENEFFECTS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGENEFFECTS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGENEFFECTS.class, "invoke", LPALGENEFFECTS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGENEFFECTS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGENEFFECTS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENEFFECTS, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGENEFFECTSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGENEFFECTSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGENEFFECTSDIRECT.class, "invoke", LPALGENEFFECTSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGENEFFECTSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGENEFFECTSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENEFFECTSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGENFILTERS {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGENFILTERS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGENFILTERS.class, "invoke", LPALGENFILTERS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGENFILTERS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGENFILTERS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENFILTERS, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGENFILTERSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGENFILTERSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGENFILTERSDIRECT.class, "invoke", LPALGENFILTERSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGENFILTERSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGENFILTERSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENFILTERSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGENSOURCES {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGENSOURCES lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGENSOURCES.class, "invoke", LPALGENSOURCES.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGENSOURCES lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGENSOURCES lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENSOURCES, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGENSOURCESDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGENSOURCESDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGENSOURCESDIRECT.class, "invoke", LPALGENSOURCESDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGENSOURCESDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGENSOURCESDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGENSOURCESDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETAUXILIARYEFFECTSLOTF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETAUXILIARYEFFECTSLOTF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETAUXILIARYEFFECTSLOTF.class, "invoke", LPALGETAUXILIARYEFFECTSLOTF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETAUXILIARYEFFECTSLOTF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETAUXILIARYEFFECTSLOTF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTF, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETAUXILIARYEFFECTSLOTFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETAUXILIARYEFFECTSLOTFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETAUXILIARYEFFECTSLOTFDIRECT.class, "invoke", LPALGETAUXILIARYEFFECTSLOTFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETAUXILIARYEFFECTSLOTFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETAUXILIARYEFFECTSLOTFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETAUXILIARYEFFECTSLOTFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETAUXILIARYEFFECTSLOTFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETAUXILIARYEFFECTSLOTFV.class, "invoke", LPALGETAUXILIARYEFFECTSLOTFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETAUXILIARYEFFECTSLOTFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETAUXILIARYEFFECTSLOTFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTFV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETAUXILIARYEFFECTSLOTFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETAUXILIARYEFFECTSLOTFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETAUXILIARYEFFECTSLOTFVDIRECT.class, "invoke", LPALGETAUXILIARYEFFECTSLOTFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETAUXILIARYEFFECTSLOTFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETAUXILIARYEFFECTSLOTFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETAUXILIARYEFFECTSLOTI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETAUXILIARYEFFECTSLOTI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETAUXILIARYEFFECTSLOTI.class, "invoke", LPALGETAUXILIARYEFFECTSLOTI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETAUXILIARYEFFECTSLOTI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETAUXILIARYEFFECTSLOTI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTI, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETAUXILIARYEFFECTSLOTIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETAUXILIARYEFFECTSLOTIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETAUXILIARYEFFECTSLOTIDIRECT.class, "invoke", LPALGETAUXILIARYEFFECTSLOTIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETAUXILIARYEFFECTSLOTIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETAUXILIARYEFFECTSLOTIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETAUXILIARYEFFECTSLOTIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETAUXILIARYEFFECTSLOTIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETAUXILIARYEFFECTSLOTIV.class, "invoke", LPALGETAUXILIARYEFFECTSLOTIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETAUXILIARYEFFECTSLOTIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETAUXILIARYEFFECTSLOTIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTIV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETAUXILIARYEFFECTSLOTIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETAUXILIARYEFFECTSLOTIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETAUXILIARYEFFECTSLOTIVDIRECT.class, "invoke", LPALGETAUXILIARYEFFECTSLOTIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETAUXILIARYEFFECTSLOTIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETAUXILIARYEFFECTSLOTIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETAUXILIARYEFFECTSLOTIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBOOLEAN {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull ILPALGETBOOLEAN lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBOOLEAN.class, "invoke", LPALGETBOOLEAN.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBOOLEAN lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBOOLEAN lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBOOLEAN, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBOOLEANDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull ILPALGETBOOLEANDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBOOLEANDIRECT.class, "invoke", LPALGETBOOLEANDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBOOLEANDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBOOLEANDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBOOLEANDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBOOLEANV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGETBOOLEANV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBOOLEANV.class, "invoke", LPALGETBOOLEANV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBOOLEANV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBOOLEANV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBOOLEANV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBOOLEANVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETBOOLEANVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBOOLEANVDIRECT.class, "invoke", LPALGETBOOLEANVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBOOLEANVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBOOLEANVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBOOLEANVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFER3F {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull ILPALGETBUFFER3F lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFER3F.class, "invoke", LPALGETBUFFER3F.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFER3F lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFER3F lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFER3F, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFER3FDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ILPALGETBUFFER3FDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFER3FDIRECT.class, "invoke", LPALGETBUFFER3FDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFER3FDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFER3FDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFER3FDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFER3I {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull ILPALGETBUFFER3I lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFER3I.class, "invoke", LPALGETBUFFER3I.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFER3I lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFER3I lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFER3I, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFER3IDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ILPALGETBUFFER3IDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFER3IDIRECT.class, "invoke", LPALGETBUFFER3IDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFER3IDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFER3IDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFER3IDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFER3PTRDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ILPALGETBUFFER3PTRDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFER3PTRDIRECTSOFT.class, "invoke", LPALGETBUFFER3PTRDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFER3PTRDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFER3PTRDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFER3PTRDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFER3PTRSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull ILPALGETBUFFER3PTRSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFER3PTRSOFT.class, "invoke", LPALGETBUFFER3PTRSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFER3PTRSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFER3PTRSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFER3PTRSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFERF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETBUFFERF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFERF.class, "invoke", LPALGETBUFFERF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFERF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFERF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERF, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFERFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETBUFFERFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFERFDIRECT.class, "invoke", LPALGETBUFFERFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFERFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFERFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFERFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETBUFFERFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFERFV.class, "invoke", LPALGETBUFFERFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFERFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFERFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERFV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFERFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETBUFFERFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFERFVDIRECT.class, "invoke", LPALGETBUFFERFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFERFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFERFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFERI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETBUFFERI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFERI.class, "invoke", LPALGETBUFFERI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFERI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFERI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERI, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFERIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETBUFFERIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFERIDIRECT.class, "invoke", LPALGETBUFFERIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFERIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFERIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFERIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETBUFFERIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFERIV.class, "invoke", LPALGETBUFFERIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFERIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFERIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERIV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFERIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETBUFFERIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFERIVDIRECT.class, "invoke", LPALGETBUFFERIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFERIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFERIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFERPTRDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETBUFFERPTRDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFERPTRDIRECTSOFT.class, "invoke", LPALGETBUFFERPTRDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFERPTRDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFERPTRDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERPTRDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFERPTRSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETBUFFERPTRSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFERPTRSOFT.class, "invoke", LPALGETBUFFERPTRSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFERPTRSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFERPTRSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERPTRSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFERPTRVDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETBUFFERPTRVDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFERPTRVDIRECTSOFT.class, "invoke", LPALGETBUFFERPTRVDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFERPTRVDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFERPTRVDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERPTRVDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFERPTRVSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETBUFFERPTRVSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFERPTRVSOFT.class, "invoke", LPALGETBUFFERPTRVSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFERPTRVSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFERPTRVSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERPTRVSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETBUFFERSAMPLESSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALsizei") int p1,
            @NativeType("ALsizei") int p2,
            @NativeType("ALenum") int p3,
            @NativeType("ALenum") int p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ILPALGETBUFFERSAMPLESSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETBUFFERSAMPLESSOFT.class, "invoke", LPALGETBUFFERSAMPLESSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETBUFFERSAMPLESSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETBUFFERSAMPLESSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETBUFFERSAMPLESSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETDEBUGMESSAGELOGDIRECTEXT {
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

        static MethodHandle of(@NotNull ILPALGETDEBUGMESSAGELOGDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETDEBUGMESSAGELOGDIRECTEXT.class, "invoke", LPALGETDEBUGMESSAGELOGDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETDEBUGMESSAGELOGDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETDEBUGMESSAGELOGDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETDEBUGMESSAGELOGDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETDEBUGMESSAGELOGEXT {
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

        static MethodHandle of(@NotNull ILPALGETDEBUGMESSAGELOGEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETDEBUGMESSAGELOGEXT.class, "invoke", LPALGETDEBUGMESSAGELOGEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETDEBUGMESSAGELOGEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETDEBUGMESSAGELOGEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETDEBUGMESSAGELOGEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETDOUBLE {
        @NativeType("ALdouble") double invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull ILPALGETDOUBLE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETDOUBLE.class, "invoke", LPALGETDOUBLE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETDOUBLE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETDOUBLE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETDOUBLE, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETDOUBLEDIRECT {
        @NativeType("ALdouble") double invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull ILPALGETDOUBLEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETDOUBLEDIRECT.class, "invoke", LPALGETDOUBLEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETDOUBLEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETDOUBLEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETDOUBLEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETDOUBLEV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGETDOUBLEV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETDOUBLEV.class, "invoke", LPALGETDOUBLEV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETDOUBLEV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETDOUBLEV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETDOUBLEV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETDOUBLEVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETDOUBLEVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETDOUBLEVDIRECT.class, "invoke", LPALGETDOUBLEVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETDOUBLEVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETDOUBLEVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETDOUBLEVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETEFFECTF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETEFFECTF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETEFFECTF.class, "invoke", LPALGETEFFECTF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETEFFECTF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETEFFECTF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTF, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETEFFECTFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETEFFECTFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETEFFECTFDIRECT.class, "invoke", LPALGETEFFECTFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETEFFECTFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETEFFECTFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETEFFECTFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETEFFECTFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETEFFECTFV.class, "invoke", LPALGETEFFECTFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETEFFECTFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETEFFECTFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTFV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETEFFECTFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETEFFECTFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETEFFECTFVDIRECT.class, "invoke", LPALGETEFFECTFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETEFFECTFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETEFFECTFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETEFFECTI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETEFFECTI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETEFFECTI.class, "invoke", LPALGETEFFECTI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETEFFECTI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETEFFECTI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTI, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETEFFECTIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETEFFECTIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETEFFECTIDIRECT.class, "invoke", LPALGETEFFECTIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETEFFECTIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETEFFECTIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETEFFECTIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETEFFECTIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETEFFECTIV.class, "invoke", LPALGETEFFECTIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETEFFECTIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETEFFECTIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTIV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETEFFECTIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETEFFECTIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETEFFECTIVDIRECT.class, "invoke", LPALGETEFFECTIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETEFFECTIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETEFFECTIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETEFFECTIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETENUMVALUE {
        @NativeType("ALenum") int invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0
        );

        static MethodHandle of(@NotNull ILPALGETENUMVALUE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETENUMVALUE.class, "invoke", LPALGETENUMVALUE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETENUMVALUE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETENUMVALUE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETENUMVALUE, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETENUMVALUEDIRECT {
        @NativeType("ALenum") int invoke(
            ALCcontext p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGETENUMVALUEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETENUMVALUEDIRECT.class, "invoke", LPALGETENUMVALUEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETENUMVALUEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETENUMVALUEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETENUMVALUEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETERROR {
        @NativeType("ALenum") int invoke(
        );

        static MethodHandle of(@NotNull ILPALGETERROR lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETERROR.class, "invoke", LPALGETERROR.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETERROR lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETERROR lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETERROR, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETERRORDIRECT {
        @NativeType("ALenum") int invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull ILPALGETERRORDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETERRORDIRECT.class, "invoke", LPALGETERRORDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETERRORDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETERRORDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETERRORDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETFILTERF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETFILTERF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETFILTERF.class, "invoke", LPALGETFILTERF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETFILTERF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETFILTERF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERF, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETFILTERFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETFILTERFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETFILTERFDIRECT.class, "invoke", LPALGETFILTERFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETFILTERFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETFILTERFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETFILTERFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETFILTERFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETFILTERFV.class, "invoke", LPALGETFILTERFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETFILTERFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETFILTERFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERFV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETFILTERFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETFILTERFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETFILTERFVDIRECT.class, "invoke", LPALGETFILTERFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETFILTERFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETFILTERFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETFILTERI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETFILTERI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETFILTERI.class, "invoke", LPALGETFILTERI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETFILTERI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETFILTERI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERI, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETFILTERIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETFILTERIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETFILTERIDIRECT.class, "invoke", LPALGETFILTERIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETFILTERIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETFILTERIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETFILTERIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETFILTERIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETFILTERIV.class, "invoke", LPALGETFILTERIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETFILTERIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETFILTERIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERIV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETFILTERIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETFILTERIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETFILTERIVDIRECT.class, "invoke", LPALGETFILTERIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETFILTERIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETFILTERIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFILTERIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETFLOAT {
        @NativeType("ALfloat") float invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull ILPALGETFLOAT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETFLOAT.class, "invoke", LPALGETFLOAT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETFLOAT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETFLOAT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFLOAT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETFLOATDIRECT {
        @NativeType("ALfloat") float invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull ILPALGETFLOATDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETFLOATDIRECT.class, "invoke", LPALGETFLOATDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETFLOATDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETFLOATDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFLOATDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETFLOATV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGETFLOATV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETFLOATV.class, "invoke", LPALGETFLOATV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETFLOATV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETFLOATV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFLOATV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETFLOATVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETFLOATVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETFLOATVDIRECT.class, "invoke", LPALGETFLOATVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETFLOATVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETFLOATVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETFLOATVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETINTEGER {
        @NativeType("ALint") int invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull ILPALGETINTEGER lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETINTEGER.class, "invoke", LPALGETINTEGER.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETINTEGER lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETINTEGER lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETINTEGER, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETINTEGERDIRECT {
        @NativeType("ALint") int invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull ILPALGETINTEGERDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETINTEGERDIRECT.class, "invoke", LPALGETINTEGERDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETINTEGERDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETINTEGERDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETINTEGERDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETINTEGERV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGETINTEGERV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETINTEGERV.class, "invoke", LPALGETINTEGERV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETINTEGERV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETINTEGERV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETINTEGERV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETINTEGERVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETINTEGERVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETINTEGERVDIRECT.class, "invoke", LPALGETINTEGERVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETINTEGERVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETINTEGERVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETINTEGERVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETLISTENER3F {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETLISTENER3F lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETLISTENER3F.class, "invoke", LPALGETLISTENER3F.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETLISTENER3F lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETLISTENER3F lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENER3F, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETLISTENER3FDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull ILPALGETLISTENER3FDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETLISTENER3FDIRECT.class, "invoke", LPALGETLISTENER3FDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETLISTENER3FDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETLISTENER3FDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENER3FDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETLISTENER3I {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETLISTENER3I lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETLISTENER3I.class, "invoke", LPALGETLISTENER3I.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETLISTENER3I lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETLISTENER3I lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENER3I, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETLISTENER3IDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull ILPALGETLISTENER3IDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETLISTENER3IDIRECT.class, "invoke", LPALGETLISTENER3IDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETLISTENER3IDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETLISTENER3IDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENER3IDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETLISTENERF {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGETLISTENERF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETLISTENERF.class, "invoke", LPALGETLISTENERF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETLISTENERF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETLISTENERF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERF, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETLISTENERFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETLISTENERFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETLISTENERFDIRECT.class, "invoke", LPALGETLISTENERFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETLISTENERFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETLISTENERFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETLISTENERFV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGETLISTENERFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETLISTENERFV.class, "invoke", LPALGETLISTENERFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETLISTENERFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETLISTENERFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERFV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETLISTENERFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETLISTENERFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETLISTENERFVDIRECT.class, "invoke", LPALGETLISTENERFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETLISTENERFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETLISTENERFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETLISTENERI {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGETLISTENERI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETLISTENERI.class, "invoke", LPALGETLISTENERI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETLISTENERI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETLISTENERI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERI, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETLISTENERIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETLISTENERIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETLISTENERIDIRECT.class, "invoke", LPALGETLISTENERIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETLISTENERIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETLISTENERIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETLISTENERIV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGETLISTENERIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETLISTENERIV.class, "invoke", LPALGETLISTENERIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETLISTENERIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETLISTENERIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERIV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETLISTENERIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETLISTENERIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETLISTENERIVDIRECT.class, "invoke", LPALGETLISTENERIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETLISTENERIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETLISTENERIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETLISTENERIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETOBJECTLABELDIRECTEXT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ILPALGETOBJECTLABELDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETOBJECTLABELDIRECTEXT.class, "invoke", LPALGETOBJECTLABELDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETOBJECTLABELDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETOBJECTLABELDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETOBJECTLABELDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETOBJECTLABELEXT {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull ILPALGETOBJECTLABELEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETOBJECTLABELEXT.class, "invoke", LPALGETOBJECTLABELEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETOBJECTLABELEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETOBJECTLABELEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETOBJECTLABELEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETPOINTERDIRECTEXT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull ILPALGETPOINTERDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETPOINTERDIRECTEXT.class, "invoke", LPALGETPOINTERDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETPOINTERDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETPOINTERDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTERDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETPOINTERDIRECTSOFT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull ILPALGETPOINTERDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETPOINTERDIRECTSOFT.class, "invoke", LPALGETPOINTERDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETPOINTERDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETPOINTERDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTERDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETPOINTEREXT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull ILPALGETPOINTEREXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETPOINTEREXT.class, "invoke", LPALGETPOINTEREXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETPOINTEREXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETPOINTEREXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTEREXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETPOINTERSOFT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull ILPALGETPOINTERSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETPOINTERSOFT.class, "invoke", LPALGETPOINTERSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETPOINTERSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETPOINTERSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTERSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETPOINTERVDIRECTEXT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETPOINTERVDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETPOINTERVDIRECTEXT.class, "invoke", LPALGETPOINTERVDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETPOINTERVDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETPOINTERVDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTERVDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETPOINTERVDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETPOINTERVDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETPOINTERVDIRECTSOFT.class, "invoke", LPALGETPOINTERVDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETPOINTERVDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETPOINTERVDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTERVDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETPOINTERVEXT {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGETPOINTERVEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETPOINTERVEXT.class, "invoke", LPALGETPOINTERVEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETPOINTERVEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETPOINTERVEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTERVEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETPOINTERVSOFT {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGETPOINTERVSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETPOINTERVSOFT.class, "invoke", LPALGETPOINTERVSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETPOINTERVSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETPOINTERVSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPOINTERVSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETPROCADDRESS {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0
        );

        static MethodHandle of(@NotNull ILPALGETPROCADDRESS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETPROCADDRESS.class, "invoke", LPALGETPROCADDRESS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETPROCADDRESS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETPROCADDRESS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPROCADDRESS, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETPROCADDRESSDIRECT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCcontext p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALGETPROCADDRESSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETPROCADDRESSDIRECT.class, "invoke", LPALGETPROCADDRESSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETPROCADDRESSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETPROCADDRESSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETPROCADDRESSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCE3DDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ILPALGETSOURCE3DDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCE3DDIRECTSOFT.class, "invoke", LPALGETSOURCE3DDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCE3DDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCE3DDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3DDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCE3DSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull ILPALGETSOURCE3DSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCE3DSOFT.class, "invoke", LPALGETSOURCE3DSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCE3DSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCE3DSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3DSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCE3F {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull ILPALGETSOURCE3F lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCE3F.class, "invoke", LPALGETSOURCE3F.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCE3F lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCE3F lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3F, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCE3FDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ILPALGETSOURCE3FDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCE3FDIRECT.class, "invoke", LPALGETSOURCE3FDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCE3FDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCE3FDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3FDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCE3I {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull ILPALGETSOURCE3I lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCE3I.class, "invoke", LPALGETSOURCE3I.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCE3I lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCE3I lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3I, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCE3I64DIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ILPALGETSOURCE3I64DIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCE3I64DIRECTSOFT.class, "invoke", LPALGETSOURCE3I64DIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCE3I64DIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCE3I64DIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3I64DIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCE3I64SOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull ILPALGETSOURCE3I64SOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCE3I64SOFT.class, "invoke", LPALGETSOURCE3I64SOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCE3I64SOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCE3I64SOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3I64SOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCE3IDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="void*") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ILPALGETSOURCE3IDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCE3IDIRECT.class, "invoke", LPALGETSOURCE3IDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCE3IDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCE3IDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCE3IDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEDDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEDDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEDDIRECTSOFT.class, "invoke", LPALGETSOURCEDDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEDDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEDDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEDDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEDSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEDSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEDSOFT.class, "invoke", LPALGETSOURCEDSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEDSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEDSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEDSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEDVDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEDVDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEDVDIRECTSOFT.class, "invoke", LPALGETSOURCEDVDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEDVDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEDVDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEDVDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEDVSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEDVSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEDVSOFT.class, "invoke", LPALGETSOURCEDVSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEDVSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEDVSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEDVSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEF.class, "invoke", LPALGETSOURCEF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEF, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEFDIRECT.class, "invoke", LPALGETSOURCEFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEFV.class, "invoke", LPALGETSOURCEFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEFV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEFVDIRECT.class, "invoke", LPALGETSOURCEFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEI.class, "invoke", LPALGETSOURCEI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEI, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEI64DIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEI64DIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEI64DIRECTSOFT.class, "invoke", LPALGETSOURCEI64DIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEI64DIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEI64DIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEI64DIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEI64SOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEI64SOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEI64SOFT.class, "invoke", LPALGETSOURCEI64SOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEI64SOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEI64SOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEI64SOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEI64VDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEI64VDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEI64VDIRECTSOFT.class, "invoke", LPALGETSOURCEI64VDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEI64VDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEI64VDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEI64VDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEI64VSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEI64VSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEI64VSOFT.class, "invoke", LPALGETSOURCEI64VSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEI64VSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEI64VSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEI64VSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEIDIRECT.class, "invoke", LPALGETSOURCEIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEIV.class, "invoke", LPALGETSOURCEIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEIV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSOURCEIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALGETSOURCEIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSOURCEIVDIRECT.class, "invoke", LPALGETSOURCEIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSOURCEIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSOURCEIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSOURCEIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSTRING {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull ILPALGETSTRING lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSTRING.class, "invoke", LPALGETSTRING.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSTRING lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSTRING lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSTRING, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSTRINGDIRECT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull ILPALGETSTRINGDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSTRINGDIRECT.class, "invoke", LPALGETSTRINGDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSTRINGDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSTRINGDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSTRINGDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSTRINGIDIRECTSOFT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALsizei") int p2
        );

        static MethodHandle of(@NotNull ILPALGETSTRINGIDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSTRINGIDIRECTSOFT.class, "invoke", LPALGETSTRINGIDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSTRINGIDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSTRINGIDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSTRINGIDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALGETSTRINGISOFT {
        @Pointer(comment="void*") @NotNull MemorySegment invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALsizei") int p1
        );

        static MethodHandle of(@NotNull ILPALGETSTRINGISOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALGETSTRINGISOFT.class, "invoke", LPALGETSTRINGISOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALGETSTRINGISOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALGETSTRINGISOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALGETSTRINGISOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISAUXILIARYEFFECTSLOT {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull ILPALISAUXILIARYEFFECTSLOT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISAUXILIARYEFFECTSLOT.class, "invoke", LPALISAUXILIARYEFFECTSLOT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISAUXILIARYEFFECTSLOT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISAUXILIARYEFFECTSLOT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISAUXILIARYEFFECTSLOT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISAUXILIARYEFFECTSLOTDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull ILPALISAUXILIARYEFFECTSLOTDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISAUXILIARYEFFECTSLOTDIRECT.class, "invoke", LPALISAUXILIARYEFFECTSLOTDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISAUXILIARYEFFECTSLOTDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISAUXILIARYEFFECTSLOTDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISAUXILIARYEFFECTSLOTDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISBUFFER {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull ILPALISBUFFER lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISBUFFER.class, "invoke", LPALISBUFFER.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISBUFFER lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISBUFFER lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISBUFFER, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISBUFFERDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull ILPALISBUFFERDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISBUFFERDIRECT.class, "invoke", LPALISBUFFERDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISBUFFERDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISBUFFERDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISBUFFERDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISBUFFERFORMATSUPPORTEDSOFT {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull ILPALISBUFFERFORMATSUPPORTEDSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISBUFFERFORMATSUPPORTEDSOFT.class, "invoke", LPALISBUFFERFORMATSUPPORTEDSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISBUFFERFORMATSUPPORTEDSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISBUFFERFORMATSUPPORTEDSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISBUFFERFORMATSUPPORTEDSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISEFFECT {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull ILPALISEFFECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISEFFECT.class, "invoke", LPALISEFFECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISEFFECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISEFFECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISEFFECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISEFFECTDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull ILPALISEFFECTDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISEFFECTDIRECT.class, "invoke", LPALISEFFECTDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISEFFECTDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISEFFECTDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISEFFECTDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISENABLED {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALenum") int p0
        );

        static MethodHandle of(@NotNull ILPALISENABLED lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISENABLED.class, "invoke", LPALISENABLED.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISENABLED lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISENABLED lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISENABLED, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISENABLEDDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1
        );

        static MethodHandle of(@NotNull ILPALISENABLEDDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISENABLEDDIRECT.class, "invoke", LPALISENABLEDDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISENABLEDDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISENABLEDDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISENABLEDDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISEXTENSIONPRESENT {
        @NativeType("ALboolean") byte invoke(
            @Pointer(comment="void*") @NotNull MemorySegment p0
        );

        static MethodHandle of(@NotNull ILPALISEXTENSIONPRESENT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISEXTENSIONPRESENT.class, "invoke", LPALISEXTENSIONPRESENT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISEXTENSIONPRESENT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISEXTENSIONPRESENT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISEXTENSIONPRESENT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISEXTENSIONPRESENTDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALISEXTENSIONPRESENTDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISEXTENSIONPRESENTDIRECT.class, "invoke", LPALISEXTENSIONPRESENTDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISEXTENSIONPRESENTDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISEXTENSIONPRESENTDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISEXTENSIONPRESENTDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISFILTER {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull ILPALISFILTER lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISFILTER.class, "invoke", LPALISFILTER.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISFILTER lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISFILTER lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISFILTER, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISFILTERDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull ILPALISFILTERDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISFILTERDIRECT.class, "invoke", LPALISFILTERDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISFILTERDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISFILTERDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISFILTERDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISSOURCE {
        @NativeType("ALboolean") byte invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull ILPALISSOURCE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISSOURCE.class, "invoke", LPALISSOURCE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISSOURCE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISSOURCE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISSOURCE, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALISSOURCEDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull ILPALISSOURCEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALISSOURCEDIRECT.class, "invoke", LPALISSOURCEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALISSOURCEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALISSOURCEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALISSOURCEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALLISTENER3F {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALfloat") float p1,
            @NativeType("ALfloat") float p2,
            @NativeType("ALfloat") float p3
        );

        static MethodHandle of(@NotNull ILPALLISTENER3F lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALLISTENER3F.class, "invoke", LPALLISTENER3F.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALLISTENER3F lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALLISTENER3F lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENER3F, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALLISTENER3FDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2,
            @NativeType("ALfloat") float p3,
            @NativeType("ALfloat") float p4
        );

        static MethodHandle of(@NotNull ILPALLISTENER3FDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALLISTENER3FDIRECT.class, "invoke", LPALLISTENER3FDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALLISTENER3FDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALLISTENER3FDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENER3FDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALLISTENER3I {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALint") int p1,
            @NativeType("ALint") int p2,
            @NativeType("ALint") int p3
        );

        static MethodHandle of(@NotNull ILPALLISTENER3I lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALLISTENER3I.class, "invoke", LPALLISTENER3I.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALLISTENER3I lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALLISTENER3I lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENER3I, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALLISTENER3IDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2,
            @NativeType("ALint") int p3,
            @NativeType("ALint") int p4
        );

        static MethodHandle of(@NotNull ILPALLISTENER3IDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALLISTENER3IDIRECT.class, "invoke", LPALLISTENER3IDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALLISTENER3IDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALLISTENER3IDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENER3IDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALLISTENERF {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALfloat") float p1
        );

        static MethodHandle of(@NotNull ILPALLISTENERF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALLISTENERF.class, "invoke", LPALLISTENERF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALLISTENERF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALLISTENERF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERF, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALLISTENERFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2
        );

        static MethodHandle of(@NotNull ILPALLISTENERFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALLISTENERFDIRECT.class, "invoke", LPALLISTENERFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALLISTENERFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALLISTENERFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALLISTENERFV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALLISTENERFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALLISTENERFV.class, "invoke", LPALLISTENERFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALLISTENERFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALLISTENERFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERFV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALLISTENERFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALLISTENERFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALLISTENERFVDIRECT.class, "invoke", LPALLISTENERFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALLISTENERFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALLISTENERFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALLISTENERI {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALint") int p1
        );

        static MethodHandle of(@NotNull ILPALLISTENERI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALLISTENERI.class, "invoke", LPALLISTENERI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALLISTENERI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALLISTENERI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERI, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALLISTENERIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2
        );

        static MethodHandle of(@NotNull ILPALLISTENERIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALLISTENERIDIRECT.class, "invoke", LPALLISTENERIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALLISTENERIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALLISTENERIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALLISTENERIV {
        void invoke(
            @NativeType("ALenum") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALLISTENERIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALLISTENERIV.class, "invoke", LPALLISTENERIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALLISTENERIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALLISTENERIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERIV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALLISTENERIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALLISTENERIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALLISTENERIVDIRECT.class, "invoke", LPALLISTENERIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALLISTENERIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALLISTENERIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALLISTENERIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALOBJECTLABELDIRECTEXT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull ILPALOBJECTLABELDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALOBJECTLABELDIRECTEXT.class, "invoke", LPALOBJECTLABELDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALOBJECTLABELDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALOBJECTLABELDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALOBJECTLABELDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALOBJECTLABELEXT {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALOBJECTLABELEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALOBJECTLABELEXT.class, "invoke", LPALOBJECTLABELEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALOBJECTLABELEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALOBJECTLABELEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALOBJECTLABELEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALPOPDEBUGGROUPDIRECTEXT {
        void invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull ILPALPOPDEBUGGROUPDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALPOPDEBUGGROUPDIRECTEXT.class, "invoke", LPALPOPDEBUGGROUPDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALPOPDEBUGGROUPDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALPOPDEBUGGROUPDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALPOPDEBUGGROUPDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALPOPDEBUGGROUPEXT {
        void invoke(
        );

        static MethodHandle of(@NotNull ILPALPOPDEBUGGROUPEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALPOPDEBUGGROUPEXT.class, "invoke", LPALPOPDEBUGGROUPEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALPOPDEBUGGROUPEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALPOPDEBUGGROUPEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALPOPDEBUGGROUPEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALPROCESSUPDATESDIRECTSOFT {
        void invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull ILPALPROCESSUPDATESDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALPROCESSUPDATESDIRECTSOFT.class, "invoke", LPALPROCESSUPDATESDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALPROCESSUPDATESDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALPROCESSUPDATESDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALPROCESSUPDATESDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALPROCESSUPDATESSOFT {
        void invoke(
        );

        static MethodHandle of(@NotNull ILPALPROCESSUPDATESSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALPROCESSUPDATESSOFT.class, "invoke", LPALPROCESSUPDATESSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALPROCESSUPDATESSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALPROCESSUPDATESSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALPROCESSUPDATESSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALPUSHDEBUGGROUPDIRECTEXT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull ILPALPUSHDEBUGGROUPDIRECTEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALPUSHDEBUGGROUPDIRECTEXT.class, "invoke", LPALPUSHDEBUGGROUPDIRECTEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALPUSHDEBUGGROUPDIRECTEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALPUSHDEBUGGROUPDIRECTEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALPUSHDEBUGGROUPDIRECTEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALPUSHDEBUGGROUPEXT {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALPUSHDEBUGGROUPEXT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALPUSHDEBUGGROUPEXT.class, "invoke", LPALPUSHDEBUGGROUPEXT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALPUSHDEBUGGROUPEXT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALPUSHDEBUGGROUPEXT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALPUSHDEBUGGROUPEXT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALREQUESTFOLDBACKSTART {
        void invoke(
            @NativeType("ALenum") int p0,
            @NativeType("ALsizei") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3,
            @Pointer(comment="LPALFOLDBACKCALLBACK") @NotNull MemorySegment p4
        );

        static MethodHandle of(@NotNull ILPALREQUESTFOLDBACKSTART lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALREQUESTFOLDBACKSTART.class, "invoke", LPALREQUESTFOLDBACKSTART.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALREQUESTFOLDBACKSTART lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALREQUESTFOLDBACKSTART lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALREQUESTFOLDBACKSTART, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALREQUESTFOLDBACKSTARTDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALsizei") int p2,
            @NativeType("ALsizei") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @Pointer(comment="LPALFOLDBACKCALLBACK") @NotNull MemorySegment p5
        );

        static MethodHandle of(@NotNull ILPALREQUESTFOLDBACKSTARTDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALREQUESTFOLDBACKSTARTDIRECT.class, "invoke", LPALREQUESTFOLDBACKSTARTDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALREQUESTFOLDBACKSTARTDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALREQUESTFOLDBACKSTARTDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALREQUESTFOLDBACKSTARTDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALREQUESTFOLDBACKSTOP {
        void invoke(
        );

        static MethodHandle of(@NotNull ILPALREQUESTFOLDBACKSTOP lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALREQUESTFOLDBACKSTOP.class, "invoke", LPALREQUESTFOLDBACKSTOP.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALREQUESTFOLDBACKSTOP lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALREQUESTFOLDBACKSTOP lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALREQUESTFOLDBACKSTOP, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALREQUESTFOLDBACKSTOPDIRECT {
        void invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull ILPALREQUESTFOLDBACKSTOPDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALREQUESTFOLDBACKSTOPDIRECT.class, "invoke", LPALREQUESTFOLDBACKSTOPDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALREQUESTFOLDBACKSTOPDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALREQUESTFOLDBACKSTOPDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALREQUESTFOLDBACKSTOPDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCE3DDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALdouble") double p3,
            @NativeType("ALdouble") double p4,
            @NativeType("ALdouble") double p5
        );

        static MethodHandle of(@NotNull ILPALSOURCE3DDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCE3DDIRECTSOFT.class, "invoke", LPALSOURCE3DDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCE3DDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCE3DDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3DDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCE3DSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALdouble") double p2,
            @NativeType("ALdouble") double p3,
            @NativeType("ALdouble") double p4
        );

        static MethodHandle of(@NotNull ILPALSOURCE3DSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCE3DSOFT.class, "invoke", LPALSOURCE3DSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCE3DSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCE3DSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3DSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCE3F {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2,
            @NativeType("ALfloat") float p3,
            @NativeType("ALfloat") float p4
        );

        static MethodHandle of(@NotNull ILPALSOURCE3F lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCE3F.class, "invoke", LPALSOURCE3F.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCE3F lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCE3F lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3F, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCE3FDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALfloat") float p3,
            @NativeType("ALfloat") float p4,
            @NativeType("ALfloat") float p5
        );

        static MethodHandle of(@NotNull ILPALSOURCE3FDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCE3FDIRECT.class, "invoke", LPALSOURCE3FDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCE3FDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCE3FDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3FDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCE3I {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2,
            @NativeType("ALint") int p3,
            @NativeType("ALint") int p4
        );

        static MethodHandle of(@NotNull ILPALSOURCE3I lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCE3I.class, "invoke", LPALSOURCE3I.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCE3I lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCE3I lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3I, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCE3I64DIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint64SOFT") long p3,
            @NativeType("ALint64SOFT") long p4,
            @NativeType("ALint64SOFT") long p5
        );

        static MethodHandle of(@NotNull ILPALSOURCE3I64DIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCE3I64DIRECTSOFT.class, "invoke", LPALSOURCE3I64DIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCE3I64DIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCE3I64DIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3I64DIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCE3I64SOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint64SOFT") long p2,
            @NativeType("ALint64SOFT") long p3,
            @NativeType("ALint64SOFT") long p4
        );

        static MethodHandle of(@NotNull ILPALSOURCE3I64SOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCE3I64SOFT.class, "invoke", LPALSOURCE3I64SOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCE3I64SOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCE3I64SOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3I64SOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCE3IDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint") int p3,
            @NativeType("ALint") int p4,
            @NativeType("ALint") int p5
        );

        static MethodHandle of(@NotNull ILPALSOURCE3IDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCE3IDIRECT.class, "invoke", LPALSOURCE3IDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCE3IDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCE3IDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCE3IDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEDDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALdouble") double p3
        );

        static MethodHandle of(@NotNull ILPALSOURCEDDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEDDIRECTSOFT.class, "invoke", LPALSOURCEDDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEDDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEDDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEDDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEDSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALdouble") double p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEDSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEDSOFT.class, "invoke", LPALSOURCEDSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEDSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEDSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEDSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEDVDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALSOURCEDVDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEDVDIRECTSOFT.class, "invoke", LPALSOURCEDVDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEDVDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEDVDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEDVDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEDVSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEDVSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEDVSOFT.class, "invoke", LPALSOURCEDVSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEDVSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEDVSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEDVSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEF {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALfloat") float p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEF lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEF.class, "invoke", LPALSOURCEF.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEF lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEF lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEF, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEFDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALfloat") float p3
        );

        static MethodHandle of(@NotNull ILPALSOURCEFDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEFDIRECT.class, "invoke", LPALSOURCEFDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEFDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEFDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEFDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEFV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEFV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEFV.class, "invoke", LPALSOURCEFV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEFV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEFV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEFV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEFVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALSOURCEFVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEFVDIRECT.class, "invoke", LPALSOURCEFVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEFVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEFVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEFVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEI {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint") int p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEI lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEI.class, "invoke", LPALSOURCEI.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEI lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEI lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEI, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEI64DIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint64SOFT") long p3
        );

        static MethodHandle of(@NotNull ILPALSOURCEI64DIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEI64DIRECTSOFT.class, "invoke", LPALSOURCEI64DIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEI64DIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEI64DIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEI64DIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEI64SOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @NativeType("ALint64SOFT") long p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEI64SOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEI64SOFT.class, "invoke", LPALSOURCEI64SOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEI64SOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEI64SOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEI64SOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEI64VDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALSOURCEI64VDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEI64VDIRECTSOFT.class, "invoke", LPALSOURCEI64VDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEI64VDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEI64VDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEI64VDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEI64VSOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEI64VSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEI64VSOFT.class, "invoke", LPALSOURCEI64VSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEI64VSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEI64VSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEI64VSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEIDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @NativeType("ALint") int p3
        );

        static MethodHandle of(@NotNull ILPALSOURCEIDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEIDIRECT.class, "invoke", LPALSOURCEIDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEIDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEIDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEIDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEIV {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEIV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEIV.class, "invoke", LPALSOURCEIV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEIV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEIV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEIV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEIVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALenum") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALSOURCEIVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEIVDIRECT.class, "invoke", LPALSOURCEIVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEIVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEIVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEIVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEPAUSE {
        void invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull ILPALSOURCEPAUSE lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEPAUSE.class, "invoke", LPALSOURCEPAUSE.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEPAUSE lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEPAUSE lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPAUSE, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEPAUSEDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull ILPALSOURCEPAUSEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEPAUSEDIRECT.class, "invoke", LPALSOURCEPAUSEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEPAUSEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEPAUSEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPAUSEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEPAUSEV {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALSOURCEPAUSEV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEPAUSEV.class, "invoke", LPALSOURCEPAUSEV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEPAUSEV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEPAUSEV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPAUSEV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEPAUSEVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEPAUSEVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEPAUSEVDIRECT.class, "invoke", LPALSOURCEPAUSEVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEPAUSEVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEPAUSEVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPAUSEVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEPLAY {
        void invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull ILPALSOURCEPLAY lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEPLAY.class, "invoke", LPALSOURCEPLAY.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEPLAY lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEPLAY lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAY, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEPLAYATTIMEDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALint64SOFT") long p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEPLAYATTIMEDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEPLAYATTIMEDIRECTSOFT.class, "invoke", LPALSOURCEPLAYATTIMEDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEPLAYATTIMEDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEPLAYATTIMEDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAYATTIMEDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEPLAYATTIMESOFT {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALint64SOFT") long p1
        );

        static MethodHandle of(@NotNull ILPALSOURCEPLAYATTIMESOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEPLAYATTIMESOFT.class, "invoke", LPALSOURCEPLAYATTIMESOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEPLAYATTIMESOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEPLAYATTIMESOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAYATTIMESOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEPLAYATTIMEVDIRECTSOFT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @NativeType("ALint64SOFT") long p3
        );

        static MethodHandle of(@NotNull ILPALSOURCEPLAYATTIMEVDIRECTSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEPLAYATTIMEVDIRECTSOFT.class, "invoke", LPALSOURCEPLAYATTIMEVDIRECTSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEPLAYATTIMEVDIRECTSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEPLAYATTIMEVDIRECTSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAYATTIMEVDIRECTSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEPLAYATTIMEVSOFT {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1,
            @NativeType("ALint64SOFT") long p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEPLAYATTIMEVSOFT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEPLAYATTIMEVSOFT.class, "invoke", LPALSOURCEPLAYATTIMEVSOFT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEPLAYATTIMEVSOFT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEPLAYATTIMEVSOFT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAYATTIMEVSOFT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEPLAYDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull ILPALSOURCEPLAYDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEPLAYDIRECT.class, "invoke", LPALSOURCEPLAYDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEPLAYDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEPLAYDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAYDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEPLAYV {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALSOURCEPLAYV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEPLAYV.class, "invoke", LPALSOURCEPLAYV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEPLAYV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEPLAYV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAYV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEPLAYVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEPLAYVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEPLAYVDIRECT.class, "invoke", LPALSOURCEPLAYVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEPLAYVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEPLAYVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEPLAYVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEQUEUEBUFFERS {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEQUEUEBUFFERS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEQUEUEBUFFERS.class, "invoke", LPALSOURCEQUEUEBUFFERS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEQUEUEBUFFERS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEQUEUEBUFFERS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEQUEUEBUFFERS, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEQUEUEBUFFERSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALSOURCEQUEUEBUFFERSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEQUEUEBUFFERSDIRECT.class, "invoke", LPALSOURCEQUEUEBUFFERSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEQUEUEBUFFERSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEQUEUEBUFFERSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEQUEUEBUFFERSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEREWIND {
        void invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull ILPALSOURCEREWIND lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEREWIND.class, "invoke", LPALSOURCEREWIND.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEREWIND lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEREWIND lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEREWIND, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEREWINDDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull ILPALSOURCEREWINDDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEREWINDDIRECT.class, "invoke", LPALSOURCEREWINDDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEREWINDDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEREWINDDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEREWINDDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEREWINDV {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALSOURCEREWINDV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEREWINDV.class, "invoke", LPALSOURCEREWINDV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEREWINDV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEREWINDV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEREWINDV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEREWINDVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEREWINDVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEREWINDVDIRECT.class, "invoke", LPALSOURCEREWINDVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEREWINDVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEREWINDVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEREWINDVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCESTOP {
        void invoke(
            @NativeType("ALuint") int p0
        );

        static MethodHandle of(@NotNull ILPALSOURCESTOP lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCESTOP.class, "invoke", LPALSOURCESTOP.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCESTOP lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCESTOP lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCESTOP, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCESTOPDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1
        );

        static MethodHandle of(@NotNull ILPALSOURCESTOPDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCESTOPDIRECT.class, "invoke", LPALSOURCESTOPDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCESTOPDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCESTOPDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCESTOPDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCESTOPV {
        void invoke(
            @NativeType("ALsizei") int p0,
            @Pointer(comment="void*") @NotNull MemorySegment p1
        );

        static MethodHandle of(@NotNull ILPALSOURCESTOPV lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCESTOPV.class, "invoke", LPALSOURCESTOPV.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCESTOPV lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCESTOPV lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCESTOPV, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCESTOPVDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALSOURCESTOPVDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCESTOPVDIRECT.class, "invoke", LPALSOURCESTOPVDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCESTOPVDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCESTOPVDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCESTOPVDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEUNQUEUEBUFFERS {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPALSOURCEUNQUEUEBUFFERS lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEUNQUEUEBUFFERS.class, "invoke", LPALSOURCEUNQUEUEBUFFERS.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEUNQUEUEBUFFERS lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEUNQUEUEBUFFERS lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEUNQUEUEBUFFERS, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSOURCEUNQUEUEBUFFERSDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @NativeType("ALsizei") int p2,
            @Pointer(comment="void*") @NotNull MemorySegment p3
        );

        static MethodHandle of(@NotNull ILPALSOURCEUNQUEUEBUFFERSDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSOURCEUNQUEUEBUFFERSDIRECT.class, "invoke", LPALSOURCEUNQUEUEBUFFERSDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSOURCEUNQUEUEBUFFERSDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSOURCEUNQUEUEBUFFERSDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSOURCEUNQUEUEBUFFERSDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSPEEDOFSOUND {
        void invoke(
            @NativeType("ALfloat") float p0
        );

        static MethodHandle of(@NotNull ILPALSPEEDOFSOUND lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSPEEDOFSOUND.class, "invoke", LPALSPEEDOFSOUND.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSPEEDOFSOUND lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSPEEDOFSOUND lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSPEEDOFSOUND, arena);
        }
    }

    @FunctionalInterface
    public interface ILPALSPEEDOFSOUNDDIRECT {
        void invoke(
            ALCcontext p0,
            @NativeType("ALfloat") float p1
        );

        static MethodHandle of(@NotNull ILPALSPEEDOFSOUNDDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPALSPEEDOFSOUNDDIRECT.class, "invoke", LPALSPEEDOFSOUNDDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPALSPEEDOFSOUNDDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPALSPEEDOFSOUNDDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPALSPEEDOFSOUNDDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPEAXGETBUFFERMODEDIRECT {
        @NativeType("ALenum") int invoke(
            ALCcontext p0,
            @NativeType("ALuint") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2
        );

        static MethodHandle of(@NotNull ILPEAXGETBUFFERMODEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPEAXGETBUFFERMODEDIRECT.class, "invoke", LPEAXGETBUFFERMODEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPEAXGETBUFFERMODEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPEAXGETBUFFERMODEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPEAXGETBUFFERMODEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPEAXGETDIRECT {
        @NativeType("ALenum") int invoke(
            ALCcontext p0,
            _GUID p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALuint") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @NativeType("ALuint") int p5
        );

        static MethodHandle of(@NotNull ILPEAXGETDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPEAXGETDIRECT.class, "invoke", LPEAXGETDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPEAXGETDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPEAXGETDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPEAXGETDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPEAXSETBUFFERMODEDIRECT {
        @NativeType("ALboolean") byte invoke(
            ALCcontext p0,
            @NativeType("ALsizei") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @NativeType("ALint") int p3
        );

        static MethodHandle of(@NotNull ILPEAXSETBUFFERMODEDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPEAXSETBUFFERMODEDIRECT.class, "invoke", LPEAXSETBUFFERMODEDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPEAXSETBUFFERMODEDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPEAXSETBUFFERMODEDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPEAXSETBUFFERMODEDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface ILPEAXSETDIRECT {
        @NativeType("ALenum") int invoke(
            ALCcontext p0,
            _GUID p1,
            @NativeType("ALuint") int p2,
            @NativeType("ALuint") int p3,
            @Pointer(comment="void*") @NotNull MemorySegment p4,
            @NativeType("ALuint") int p5
        );

        static MethodHandle of(@NotNull ILPEAXSETDIRECT lambda) {
            try {
                return MethodHandles.lookup().findVirtual(ILPEAXSETDIRECT.class, "invoke", LPEAXSETDIRECT.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull ILPEAXSETDIRECT lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull ILPEAXSETDIRECT lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), LPEAXSETDIRECT, arena);
        }
    }

    @FunctionalInterface
    public interface IPFNALBUFFERDATASTATICPROC {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @NativeType("ALsizei") int p3,
            @NativeType("ALsizei") int p4
        );

        static MethodHandle of(@NotNull IPFNALBUFFERDATASTATICPROC lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IPFNALBUFFERDATASTATICPROC.class, "invoke", PFNALBUFFERDATASTATICPROC.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IPFNALBUFFERDATASTATICPROC lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IPFNALBUFFERDATASTATICPROC lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFNALBUFFERDATASTATICPROC, arena);
        }
    }

    @FunctionalInterface
    public interface IPFNALBUFFERSUBDATASOFTPROC {
        void invoke(
            @NativeType("ALuint") int p0,
            @NativeType("ALenum") int p1,
            @Pointer(comment="void*") @NotNull MemorySegment p2,
            @NativeType("ALsizei") int p3,
            @NativeType("ALsizei") int p4
        );

        static MethodHandle of(@NotNull IPFNALBUFFERSUBDATASOFTPROC lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IPFNALBUFFERSUBDATASOFTPROC.class, "invoke", PFNALBUFFERSUBDATASOFTPROC.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IPFNALBUFFERSUBDATASOFTPROC lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IPFNALBUFFERSUBDATASOFTPROC lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFNALBUFFERSUBDATASOFTPROC, arena);
        }
    }

    @FunctionalInterface
    public interface IPFNALCGETTHREADCONTEXTPROC {
        ALCcontext invoke(
        );

        static MethodHandle of(@NotNull IPFNALCGETTHREADCONTEXTPROC lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IPFNALCGETTHREADCONTEXTPROC.class, "invoke", PFNALCGETTHREADCONTEXTPROC.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IPFNALCGETTHREADCONTEXTPROC lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IPFNALCGETTHREADCONTEXTPROC lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFNALCGETTHREADCONTEXTPROC, arena);
        }
    }

    @FunctionalInterface
    public interface IPFNALCSETTHREADCONTEXTPROC {
        @NativeType("ALCboolean") byte invoke(
            ALCcontext p0
        );

        static MethodHandle of(@NotNull IPFNALCSETTHREADCONTEXTPROC lambda) {
            try {
                return MethodHandles.lookup().findVirtual(IPFNALCSETTHREADCONTEXTPROC.class, "invoke", PFNALCSETTHREADCONTEXTPROC.toMethodType()).bindTo(lambda);
            }
            catch (NoSuchMethodException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        static MemorySegment ofNative(@NotNull IPFNALCSETTHREADCONTEXTPROC lambda) {
            return ofNative(Arena.global(), lambda);
        }

        static MemorySegment ofNative(@NotNull Arena arena, @NotNull IPFNALCSETTHREADCONTEXTPROC lambda) {
            return Linker.nativeLinker().upcallStub(of(lambda), PFNALCSETTHREADCONTEXTPROC, arena);
        }
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ALFunctionTypes() {}
}
