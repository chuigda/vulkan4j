package club.doki7.babel.extract.openxr

import club.doki7.babel.registry.ArrayType
import club.doki7.babel.registry.IdentifierType
import club.doki7.babel.registry.Member
import club.doki7.babel.registry.Registry
import club.doki7.babel.registry.Structure
import club.doki7.babel.registry.intern

internal fun Registry<OpenXRRegistryExt>.addDependencies() {
    log.info("手动添加类型 LUID")
    val LUID = "LUID".intern()
    structures.put(
        LUID, Structure(
            LUID,
            mutableListOf(
                Member("LowPart", IdentifierType("DWORD"), null, null, null, false, null),
                Member("HighPart", IdentifierType("LONG"), null, null, null, false, null)
            )
        )
    )

    // https://developer-docs.magicleap.cloud/docs/api-ref/api/Files/ml__coordinate__frame__uid_8h/
    // https://developer-docs.magicleap.cloud/docs/api-ref/api/Modules/group___perception/struct_m_l_coordinate_frame_u_i_d/
    log.info("手动添加类型 MLCoordinateFrameUID")
    val MLCoordinateFrameUID = "MLCoordinateFrameUID".intern()
    structures.put(
        MLCoordinateFrameUID, Structure(
            MLCoordinateFrameUID,
            mutableListOf(
                // TODO: I am not sure if "2" is an Identifier
                Member("data", ArrayType(IdentifierType("uint64_t"), "2".intern()), null, null, null, false, null)
            )
        )
    )
}