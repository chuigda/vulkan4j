#include <assert.h>
#include <wchar.h>

#ifdef WIN32
#define EXPORT __declspec(dllexport)
#else
#define EXPORT __attribute__((visibility("default")))
#endif

extern EXPORT void check(wchar_t *wcs) {
    assert(wcscmp(wcs, L"我能吞下玻璃而不伤身体") == 0);
}

extern EXPORT wchar_t *get_wcs() {
    return L"我能吞下玻璃而不伤身体";
}

#ifdef WIN32
#include <Windows.h>
extern EXPORT void use_in_msgbox(wchar_t *wcs) {
    MessageBoxW(NULL, wcs, L"我能吞下玻璃而不伤身体", MB_OK);
}
#endif
