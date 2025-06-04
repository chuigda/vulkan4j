package club.doki7.openal;

import java.lang.foreign.*;
import club.doki7.ffm.NativeLayout;
import club.doki7.openal.datatype.*;

public final class OpenALFunctionTypes {
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

    /// Constructing this class is nonsense so the constructor is made private.
    private OpenALFunctionTypes() {}
}
